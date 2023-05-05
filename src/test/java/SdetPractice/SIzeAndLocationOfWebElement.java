package SdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SIzeAndLocationOfWebElement {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
		
		// location of webElement - 1st method
		System.out.println("Location(X,Y): "+logo.getLocation());
		// if you want only x location 
		System.out.println("Element x locartion: "+ logo.getLocation().getX());
		// if you want only y location
		System.out.println("Element y location: " + logo.getLocation().getY());
		
		// location of webElement - 2nd method
		System.out.println("Location(x): " +logo.getRect().getX());
		// getRect method used for rectangular object
		System.out.println("location(y): "+ logo.getRect().getY());
		
		// Size of the Element - 1st method
		System.out.println("Size(Width, Height):" +logo.getSize());
		System.out.println("Size(Width): "+ logo.getSize().getWidth());
		System.out.println("Size(Height): " + logo.getSize().getHeight());
		
		
		//Method 2
		System.out.println("Size(Width): "+logo.getRect().getDimension().getWidth());
		System.out.println("Size(Width): "+logo.getRect().getDimension().getHeight());

	}
}
