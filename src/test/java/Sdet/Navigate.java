package Sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	/*
	 * navigate().back()
	 * navigate().forward()
	 * navigate().refresh()
	 * navigate().to()
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.in/"); 
		
		// go back to privies page
		driver.navigate().back();
		
		// go forward
		driver.navigate().forward();
		
		// present page refresh
		driver.navigate().refresh();
		
		// navigate.to - similar to the get command
		driver.navigate().to("https://www.flipkart.com/");
		
		// what is the difference between get(); method and navigate().to(" ");	
		// see the class on youtube get implemented remoteInterface class navigate().to(); 
		// remort interface class but implemented by sub navigation interface class or inner interface of the web driver
		driver.quit();
	}
}
