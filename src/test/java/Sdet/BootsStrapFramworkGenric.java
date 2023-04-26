 package Sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public abstract class BootsStrapFramworkGenric {

	//Generic WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");

		//Handle account
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();

		// Creating X-path for drop-down elements
		// then create a WebElement instance
		List <WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));

		// print product type size
		System.out.println("Number of option" +productTypes.size());
		selectOpctionFromDropDown(productTypes,"Accounts");

//		for (WebElement ptype : productTypes)
//		{
//			if (ptype.getText().equals("Accounts"))
//			{
//				ptype.click();
//				break;
//			}
//		}

		// Code for product Element
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]")).click();


		List <WebElement> product = driver.findElements(By.xpath("//ul[@class = 'dropdown2 dropdown-menu' ]//li"));
		//print size of element
		System.out.println("Nmuber of opction" +product.size());
		selectOpctionFromDropDown2(product,"Current Accounts");

//		for (WebElement pro : product)
//		{
//			if (pro.getText().equals("Current Accounts"))
//			{
//				pro.click();
//				break;
//			}
//		}
//
//		// driver.quit();

	}
	public static void selectOpctionFromDropDown(List<WebElement> options, String value) 
	{
		for (WebElement option : options)
		{
			if (option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
	public static void selectOpctionFromDropDown2(List<WebElement> options, String value) 
	{
		for (WebElement option : options)
		{
			if (option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
}


