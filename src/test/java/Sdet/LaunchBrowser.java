package Sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {
	public static void main(String[] args) {
		// driver locations
		// every driver browser available 
		/* 
		 * Chrome - chromedriver.exe |
		 * Firefox - geckodriver.exe |download there own web sites browser
		 * edge - edgedriver.exe     |
		 */
		// chrome driver
		//System.setProperty("webdriver.GecoDriver.driver","C:\\webdrivers\\chromedriver_win32.zip\\chromedriver.exe");
	
		//wedriver is a interface - this particular interface implemented by different class
		//we have chrome driver class , gecodriver class, edge browser class
		//ChromeDriver driver = new ChromeDriver();
		// those objects implemented wed driver interface
	    // get method
		//driver1.get("https://www.nopcommerce.com/en");
		
		// same way we can call as a other driver object
		
		// another way to get or use API -- DownLoad .jar files
		//*********** WebDriverManager ***************
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		//driver.quit();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		
		//driver1.quit();
		
		driver1.get("https://www.nopcommerce.com/en"); // open browser URL
		
		//how to captured the title of the web page - to perform certain validations
		System.out.println(driver1.getTitle());
		
		// i what to get current URL 
		System.out.println(driver1.getCurrentUrl());
		
		// page source - validate particular page source code -- html
		System.out.println(driver1.getPageSource());
	}

}
