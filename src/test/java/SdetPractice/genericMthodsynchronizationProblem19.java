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

public class genericMthodsynchronizationProblem19 {
	public static void main(String[] args)
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));	
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN); // using keyboard action after entering the text

//		WebElement element = mywait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
//		element. click();	
		
		// in a generic method don't want t write all this. simply write as a
		By eleLocatior = By.xpath("//h3[normalize-space()='Selenium']"); // write locater with By class instance
		waitForE1ementPresent(driver, eleLocatior, 10).click(); // write 3 arguments in side the method - (driver, eleLocatior, 10)
		// driver form driver instance, locator from By class instance, int timeout form seconds
	}
	
	public static WebElement waitForE1ementPresent(WebDriver driver, By locator, int timeout)
	// this method take 3 arguments/parameters
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until ( ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	} 
}
