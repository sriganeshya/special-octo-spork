package SdetPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAutoSuggestionOpction {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	List <WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	System.out.println("size" +options.size());
	
	for(WebElement option : options) {
		if(option.getText().contains("selenium download")) {
			option.click();
			break;
		}
		
	}
	}
}
