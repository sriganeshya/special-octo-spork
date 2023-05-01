package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionVsActions24 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement prime = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
		
		Actions action =new Actions(driver); // hear you con't store any thing
//		action.moveToElement(prime).perform();
		
		Action action1  = action.moveToElement(prime).build();
		action1.perform(); // it is interface
	}
	

}
