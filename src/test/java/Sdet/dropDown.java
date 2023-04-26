package Sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	public static void main(String[] args) {

		// what is the drop-down, how to handle it, what are the different methods available 
		// what are the different tags and attributes available in the drop-down 

		// three different method are available
		/*
		 * selectByVisibleText()
		 * selectByValue()
		 * selectByindex()
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountryId = driver.findElement(By.id("input-country"));
		
		// we will not directly used for select method
		// should create the select class instance 
		Select drpCountry = new Select(drpCountryId);
		
//		// 1
//		drpCountry.selectByVisibleText("Denmark");
//		
//		// 2
//		drpCountry.selectByValue("11");
//		
//		//3 -- note** HTML start from the Zero "0" -- first tag option it will count Zero  
//		drpCountry.selectByIndex(10);
		
		// selecting option from drop-down without using index
		
		//all the form of web element(list of web element collection)
		List<WebElement> allOption = drpCountry.getOptions();
		
		// using for loop
		for(WebElement option : allOption) 
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
		
		
		
	}
}