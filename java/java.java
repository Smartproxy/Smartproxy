package org.example;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Base64;

public class Main implements Runnable {
    public static final String USERNAME = "SP_user";
    public static final String PASSWORD = "SP_pass";

    public void run() {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("gate.smartproxy.com", 7000));
            URL url = new URL("http://ip.smartproxy.com/json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);

            // Encode credentials for Proxy-Authorization
            String encodedCredentials = Base64.getEncoder().encodeToString((USERNAME + ":" + PASSWORD).getBytes());
            connection.setRequestProperty("Proxy-Authorization", "Basic " + encodedCredentials);

            connection.setRequestMethod("GET");

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println(response.toString());

        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        new Thread(new Main()).start();
    }
}
