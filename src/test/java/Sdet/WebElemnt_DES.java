package Sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElemnt_DES {
	public static void main(String[] args) throws InterruptedException {


		//in this practice how to check WebElement is Displayed, Enabled and Selected
		/*
		 * states of web element
		 * 3 Conditional commands
		 * .isDisplayed()
		 * .isEnabled()
		 * .isSelected()
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Ffeatures");
		
		// i like to store variable
		// Whitening type of the element is webElement 
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='Username']"));
		
		// >isDisplyed , >isEnabled used for all web pages
		// To check this particular element displayed or not
		System.out.println("Display status" +" " +searchElement.isDisplayed()); //true
		
		// To check this element Enabled or not
		System.out.println("Enable status" + "  "+  searchElement.isEnabled()); // true
		
		//driver.quit();
		
		// .isSelcted method used for check box, radio button, dropdown
		// To tested whether selected or not -- like radio button
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    Thread.sleep(3000);
		WebElement HTML =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		WebElement CSS = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		WebElement JAVA = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		// select the radio button 
		HTML.click(); // select radio button
		System.out.println(HTML.isSelected()); // true
		System.out.println(CSS.isSelected()); // false
		
		HTML.clear();
		System.out.println(HTML.isSelected()); // false
		System.out.println(CSS.isSelected()); // true
		
		// do same other also
		
	}
}
