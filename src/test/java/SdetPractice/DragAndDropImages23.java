package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropImages23 {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			driver.manage().window().maximize();
			
			// image in frames so directly instantiate
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
			
			// identify the element
			WebElement items1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement items2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
			
			// identify the target 
			WebElement trach = driver.findElement(By.xpath("//div[@id='trash']"));
			
			// now mouse action
			Actions act=new Actions(driver);
			act.dragAndDrop(items1, trach).perform();
			act.dragAndDrop(items2, trach).perform();

			
	}
}
