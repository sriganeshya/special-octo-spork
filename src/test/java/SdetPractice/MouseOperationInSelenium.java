package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationInSelenium {
	/*
	How To Perform Mouse Operations in Selenium WebDriver?
	How to Perform Right click Action?
	How to Perform Double click Action?
	How to Perform Drag and Drop Action?
	How to Perform Mouse Hover Action?
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		
		// right click action
		WebElement button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver); // creating action class
		act.contextClick(button).perform(); // performing click action using this method
		// act.contextClick(button).build().perform(); -- some people using this 
		// build method will creating action then perform method complete the action
		// performing action internally having a build action
		
		
		
		
		
		
	}
}
