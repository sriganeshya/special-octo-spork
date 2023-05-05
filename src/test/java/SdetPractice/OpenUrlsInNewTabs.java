package SdetPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrlsInNewTabs {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/");
//		driver.switchTo().newWindow(WindowType.TAB); // is a metho
//		driver.get("https://demo.opencart.com/");
		
		// if you want to open new tab
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW); // is a metho
		driver.get("https://demo.opencart.com/");

		
	}

}
