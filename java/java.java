import java.net.*; 
import java.io.*; 
import java.util.Scanner; 

public class ProxyTest 
{ 
   public static void main(String[] args) throws Exception 
   { 
      InetSocketAddress proxyAddress = new InetSocketAddress("gate.smartproxy.io", 7000); // Set proxy IP/port. 
      Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress); 
      URL url = new URL("http://ipinfo.io/ip"); //enter target URL 
      Authenticator authenticator = new Authenticator() { 
         public PasswordAuthentication getPasswordAuthentication() { 
            return (new PasswordAuthentication("username","password".toCharArray())); //enter credentials 
         } 
      }; 


      Authenticator.setDefault(authenticator); 
   URLConnection urlConnection = url.openConnection(proxy); 


//Scanner to view output 

Scanner scanner = new Scanner(urlConnection.getInputStream()); 
   System.out.println(scanner.next()); 
   scanner.close(); 

   } 
}
