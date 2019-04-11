import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Example {

	public static void main(String[] args) {
		
		String ProxyServer = "gate.smartproxy.com";
		int ProxyPort = 7000;
		
		String sHttpProxy = ProxyServer + ":" + ProxyPort;
		
		Proxy proxy = new Proxy();
		
		proxy.setHttpProxy(sHttpProxy);

		GeckoDriverService service =new GeckoDriverService.Builder()
								  .usingDriverExecutable(new File("PATH TO WEBDRIVER"))
								  .usingAnyFreePort()
								  .usingAnyFreePort()
								  .build();
		FirefoxOptions options = new FirefoxOptions();
		
		options.setCapability("proxy", proxy);
		
		options.merge(options);    
		
		WebDriver driver=new FirefoxDriver(service, options);
		driver.get("http://ip.smartproxy.com/");
	    WebElement body = driver.findElement(By.tagName("body"));
	    String bodyText = body.getText();
		System.out.println(bodyText);

	}

}
