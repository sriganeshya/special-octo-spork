package Sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element_Element {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		// findElement() --> Return the single WebElemnet
		
		// Scenario 1
		WebElement searchBox =driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		// send a keys 
		searchBox.sendKeys("xyz");
		
		
		// scenario 2
		// on a footer  of page we have a multiple web elements
		WebElement ele = driver.findElement(By.xpath("//body/div[6]/div[4]/div[1]//a"));
		
		// print text of that webElement
		System.out.println(ele.getText());
		
		// scenario 3
		// WebElement not present through error --no search element exception
		WebElement searchBox1 = driver.findElement(By.xpath("//button[contains(text(),'login')]"));
		
	// so .findElement() is print only single element even though locater pointing the multiple web
		// elements
		
		//findMultiple() --> returns multiple web elements
		//1
		List <WebElement> links = driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
		System.out.println("number of element captured" +links.size());
		
		// print web elements
		for(WebElement list : links) {
			System.out.println(list.getText());
		}
		
		//2
		//even using return type will be List<WebElement>
		List<WebElement> logo = driver.findElements(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
		System.out.println(logo.size());
		
		// 3
		// locater not macing any of the web page than it writers the "0"
		List <WebElement> elements = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
		System.out.println(elements.size());
	}
}
