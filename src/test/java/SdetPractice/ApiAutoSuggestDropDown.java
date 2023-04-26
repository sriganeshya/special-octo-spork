package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApiAutoSuggestDropDown {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.twoplugs.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='toggle-nav']/following-sibling::ul/li[2]/a")).click();
	WebElement location = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	location.clear();
	location.sendKeys("America");
	
	String text;
	
	do {
		location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		text = location.getAttribute("value");
		Thread.sleep(3000);
		
		if(text.equals("American Samoa")) {
			location.sendKeys(Keys.ENTER);
			break;
		}
	}while(!text.isEmpty());
	}
}
