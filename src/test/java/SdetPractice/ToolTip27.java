package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip27 {
	/*
	How to capture tooltip of the Web Element?
	How to open a link in new tab?
	How to open URL's in a multiple tabs & Windows?
	How to capture Size & Location of the WebElement?
	 */
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/tooltip/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0); // in the frame
	
	WebElement input = driver.findElement(By.xpath("//input[@id='age']"));	
	String toolTip = input.getAttribute("title");
	System.out.println(toolTip);
	

}
}
