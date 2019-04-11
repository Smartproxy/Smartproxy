package chromeScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

	public static void main(String[] args) {
		
		String ProxyServer = "gate.smartproxy.com";
		int ProxyPort = 7000;
		
		String sHttpProxy = ProxyServer + ":" + ProxyPort;
		
		Proxy proxy = new Proxy();
		
		proxy.setHttpProxy(sHttpProxy);
		
		ChromeDriverService service = new ChromeDriverService.Builder()
		                            .usingDriverExecutable(new File("PATH TO WEBDRIVER"))
		                            .usingAnyFreePort()
		                            .build();
		ChromeOptions options = new ChromeOptions();
		
		options.setCapability("proxy", proxy);
		
		options.merge(options);    
		
		WebDriver driver=new ChromeDriver(service, options);
		driver.get("http://ip.smartproxy.com/");
	    WebElement body = driver.findElement(By.tagName("body"));
	    String bodyText = body.getText();
		System.out.println(bodyText);
	}

}
