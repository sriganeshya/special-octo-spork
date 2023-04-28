package SdetPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripAlerts17 {
		/*	1) How To Handle Java Script Alerts?
			2) How To Handle Authentication Popup?
			3) How To Handle Permission based Pop-ups? */
  // those alerts comes from browser windows
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(); // this process is call instantiating
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		// First code is close the populated window
//		driver.findElement(By.linkText("Click for JS Alert"));
//		driver.switchTo().alert().accept(); // it is a selenium method
//		//----------------------
//		//till here with will return the alert box object - 
//		//Switches to the currently active modal dialog for this particular driver instance.
//		// we can perform multi operation but i will perform sing operation
		
//		// let us see another type of alert
//		// Alert window with OK & cancel button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"))click();
;//		driver.switchTo().alert().accept(); 
//		driver.switchTo().alert().dismiss(); // dismiss is method used to cancel button
		
//		//some time alert window have a text and input box 
//		//alert window with input box, capture text form the alert
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(3000);
//		
//		Alert alertwindow = driver.switchTo().alert(); // using alert method
//		System.out.println("The messege displyed form alert " + alertwindow.getText());
//		
//		alertwindow.sendKeys("Welcome");// enter text
//		
//		alertwindow.accept(); // click OK button
//     ---------------------------------------------------------------------

//       // Authentication PopUP
//		//driver.get("https://the-internet.herokuapp.com/basic_auth");
//	// syntax
//		//https://admin:admin@the-internet.herokuapp.com/javascript_alerts"
//		//http://user name : password @ URL
//
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		// Permission notifications PopUp
		// ever browser have a different class
		// before the web - driver - manager class creation chromeOption class 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");// creating one method
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options); // inside the method add options
		
		driver.get("https://www.redbus.in/railways"); 

	}
}
