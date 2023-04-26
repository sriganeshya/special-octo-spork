package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBox {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize(); // winndow ni max chestundi
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.name("q"));
		if(search.isDisplayed()) {	
			if(search.isEnabled()) {
				search.sendKeys("lokesh");
				String enterText = search.getAttribute("input");
				System.out.println(enterText);
				Thread.sleep(3000);
				search.sendKeys(" gangula");
				Thread.sleep(3000);
				search.clear(); // text ni clear cheyali ante .clear function vaadali
				// lokesh taruavata gangula print avvakudadu ante clear ni mundu petali 
				//appudu lokesh mundu print aee thruvata clear avutundi
					
				}
			
			else {
				System.out.println("is not enabled");
			}
		}
		else{
			System.out.println("search text box not displayed");
		}
		driver.quit();// browser quite avutundi
	}
		
}

