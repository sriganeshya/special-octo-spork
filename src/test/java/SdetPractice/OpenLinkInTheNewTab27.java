package SdetPractice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInTheNewTab27 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		// open link in a new tab
		// using key board actions
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
	}

}
