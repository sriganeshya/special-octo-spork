package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronizationProblem19 {
/*
 *  1) What is Synchronization problem in
    Automation?
    2) What are the different types of waits
    available in Selenium WebDriver?
    
    Implicit Wait - driver.manage().windows().implicitlyWait(time); // using all elements in the page
    // using only once / maxim time 10 seconds
     * 
    Explicit Wait - driver.manage().windows().implicitlyWait(time); // element specific
    WebDriverWait wait = new WebDriverWait(driver,5);	
	WebE1ement element = wait.until (ExpectedConditions.visibi1ityOfE1ementLocated(By.1inkText("Facebook")));
	element. click();
   
    Fluent Wait - 
 */	
	public static void main(String[] args)  {	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();

	
	WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));	

	
//	//implicitelyWait()
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN); // using keyboard action after entering the text
//	
//	driver.findElement(By.xpath("driver.findElement(By.id(\"APjFqb\")).sendKeys(\"Selenium\");")).click();
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));	
	WebElement element = mywait.until (ExpectedConditions.visibi1ityOfE1ementLocated(By.xpath("Facebook")));
	element. click();
	}
}
