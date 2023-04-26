//package SdetPractice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class NewOne {
//	private static WebDriver driver;
//	public static void main(String[] args) {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		chapter1();
//		driver.quit();		
//	}
//
//	@SuppressWarnings("unused")
//	private static void highlight(WebElement findElement) {
//	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	    jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow')", findElement);
//	}
//
//public static void chapter1(){
//	driver.get("https://examples.bootstrap-table.com/");
//	driver.findElement(By.xpath("//td[@style='text-align: center; vertical-align: middle; ']"));
//	
//}
//}

package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewOne {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chapter1();
		//driver.quit(); // close the browser after the test is finished
	}

	@SuppressWarnings("unused")
	private static void highlight(WebElement findElement) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow')", findElement);
	}

	public static void chapter1() throws InterruptedException {
		driver.get("https://examples.bootstrap-table.com/");
		// Find an element and perform actions on it, for example:
		WebElement firstRow = driver.findElement(By.xpath("(//tbody/tr/td)[3]"));
		highlight(firstRow);
		

		// ...
	}
}
