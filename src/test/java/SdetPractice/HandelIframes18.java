package SdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelIframes18 {
	/*
	 *  1) What is the difference between frame and iframe?
		2) How To Handle iframes in WebDriver?
		3) How To Switch between multiple iFrames?
		4) How To Work with Inner iFrames?
	 */
	public static void main(String[] args) throws InterruptedException {	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-tree.html");
//	driver.manage().window().maximize();
//	
	/*
	 * driver. switchTo() .frame(name of the frame/id of the frame)
       driver. switchTo( ) . frame (WebE1ement)
	   driver. switchTo() . frame(0) -- index
	
	   driver.switchTo().defaultContent();
	   driver.switchTo().parentFrame();
	 */
//	
//	//1st frame
//	driver.switchTo().frame("packageListFrame"); // name of the frame
//	driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
//	//only implemented the first frame 
//	//so
//	driver.switchTo().defaultContent(); //this method is used to performing action in the same page
//	Thread.sleep(3000);
//	
//	//2nd frame
//	driver.switchTo().frame("packageFrame"); // name of the frame
//	driver.findElement(By.xpath("//span[normalize-space()='Alert']")).click();
//	Thread.sleep(3000);
//	
//	//3rd frame
//	driver.switchTo().frame("classFrame"); // name of the frame
//	driver.findElement(By.xpath("//a[normalize-space()='accept']")).click();
////	driver.switchTo().defaultContent(); // don't use last one. Why because go back to the main page
//	
	
	
//	// how to handle inner iframe
//	driver.get("https://demo.automationtesting.in/Frames.html");
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
//	
//	WebElement outerIframe =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//	driver.switchTo().frame(outerIframe); // inner the method
//	
//	WebElement innerframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
//	driver.switchTo().frame(innerframe);
//	
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");// directly send value
	
	// outer frame text and inner frame text
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult"); // switch to outer iframe
	driver.switchTo().frame(0); // switch to inner iframe
	
	System.out.println("Text present inside the inner frame" +driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText() );
	
	driver.switchTo().parentFrame(); // go to parent frame - use this method
	String parent = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
	// String variable method used for only getText() method
	System.out.println("text present in parent frame" + parent);
	
	driver.quit();
	}
}








