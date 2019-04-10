using System; 
using System.Net; 

public class Example 
{ 
   public static void Main() 
   { 
      var client = new WebClient(); 
      client.Proxy = new WebProxy("gate.smartproxy.com:7000"); 
      client.Proxy.Credentials = new NetworkCredential("customer-username", "password"); 
      Console.WriteLine(client.DownloadString("https://ipinfo.io")); 
   } 
}
