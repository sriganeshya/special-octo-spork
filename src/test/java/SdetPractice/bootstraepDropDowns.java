package SdetPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstraepDropDowns {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
//		driver.get("https://automationexercise.com/products");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
//		WebElement search = driver.findElement(By.xpath("//input[@id='search_product']"));
//		search.sendKeys("saree");
//		driver.findElement(By.xpath("//button[@id='submit_search']")).click();
////		search.sendKeys(Keys.ENTER);
//		
//		List < WebElement > brands = driver.findElements(By.xpath("//div[@class='brands-name']/ul/li"));
//		for(WebElement brand : brands) {
//	    System.out.println(brand.getText());
//		}
		
		driver.findElement(By.xpath("//div[@class='dropdown']/a[@class='btn-primary dropdown-toggle btn-block']")).click();
		List <WebElement> loan = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		selectOptionFrom(loan,"FASTag");
		System.out.println(loan.size());
	}

		public static void selectOptionFrom (List <WebElement> loan, String value) {
		for (WebElement loans: loan) {
			if (loans.getText().equals(value)) {
				loans.click();
				break;
				
			}
			
		}
	}

}


