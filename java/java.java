// I compiled the code using Maven with: mvn clean compile
// Then ran it with: exec:java -Dexec.mainClass="example.Example"
package example;

import java.io.*;
import java.util.Random;
import org.apache.http.HttpHost;
import org.apache.http.auth.*;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

class Client {
    public static final String username = "SP_user";
    public static final String password = "SP_pass";
    public static final int port = 7000;
    public CloseableHttpClient client;

    public Client(String country) {
        HttpHost proxy = new HttpHost("gate.smartproxy.com", port);
        CredentialsProvider cred_provider = new BasicCredentialsProvider();
        cred_provider.setCredentials(new AuthScope(proxy),
            new UsernamePasswordCredentials(username, password));
        client = HttpClients.custom()
            .setConnectionManager(new BasicHttpClientConnectionManager())
            .setProxy(proxy)
            .setDefaultCredentialsProvider(cred_provider)
            .build();
    }

    public String request(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        CloseableHttpResponse response = client.execute(request);
        try {
            return EntityUtils.toString(response.getEntity());
        } finally { response.close(); }
    }

    public void close() throws IOException { client.close(); }
}

public class Example {
    public static void main(String[] args) throws IOException {
        System.out.println("Performing request(s)");
        Client client = new Client(null);
        try {
            System.out.println(client.request("https://ip.smartproxy.com"));
        } finally { client.close(); }
    }
}
