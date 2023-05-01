package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformKeybadActions25 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.get("https://the-internet.herokuapp.com/key_presses");
//		driver.manage().window().maximize();
//		
//		Actions action =new Actions(driver);
//		action.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
//		
//		action.sendKeys(Keys.ALT).perform();
//		Thread.sleep(3000);
//
//		action.sendKeys(Keys.ARROW_RIGHT).perform();
//		Thread.sleep(3000);
//
//		action.sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(3000);
//		
//		action.sendKeys(Keys.CLEAR).perform();
		
		//now how to handle multiple combination of key board send keys
		// copy the text and past the text 
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement right =driver.findElement(By.id("inputText1"));
		WebElement left = driver.findElement(By.id("inputText2"));
		
		right.sendKeys("Welcome to text");
		Actions act = new Actions(driver);
		
		// control + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//control + c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// tab key
		act.sendKeys(Keys.TAB);
		act.perform();
		
		// control + V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// compare to both text
		if(right.getAttribute("value").equals(left.getAttribute("value")))
			System.out.println("text copied");
		else
			System.out.println("text not copied");
		
	}
}
