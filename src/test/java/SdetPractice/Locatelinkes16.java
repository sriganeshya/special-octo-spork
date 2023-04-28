package SdetPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatelinkes16   {
	public static void main(String[] args) {
/*
1) How To Locate links in Selenium WebDriver?
2) What is the difference between LinkText() and PartialLinkText()?
3) How to capture all the links from Web Page?
4) What is Broken link? How to check broken links?
*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		// get link test of particular element
//		driver.findElement(By.linkText("Today's Deals")).click();
//		
//		// use partial link text
//		driver.findElement(By.xpath("Deals")).click(); // no need full link text
		
//		// How to capture all the he links
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links" +links.size());
		
//		//get all links(print)
//		//normal for loop
//		for(int i=0;i<links.size();i++) 
//		{
//			// i need to get name of the link
//			System.out.println(links.get(i).getText());// links.get(i) = is get only one like then get the Text
//			System.out.println(links.get(i).getAttribute("href")); // i need a value of href
//		}
		
		//for each loop
		for(WebElement link : links)
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
		// How to handle broken links
	}
}
