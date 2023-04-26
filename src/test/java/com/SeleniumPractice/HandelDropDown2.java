package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDropDown2 {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		// Navigate to Google homepage
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("hyr tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		
		// Navigate to YouTube homepage
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		
		// Search for "new telugu songs" on YouTube
		driver.findElement(By.id("search")).sendKeys("new telugu songs");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button#search-icon-legacy")).click(); // or use By.xpath("//button[@id='search-icon-legacy']")
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("new telugu songs");
		Thread.sleep(3000);
		driver.findElement(By.id("search")).submit();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#thumbnail")).click(); // or use By.xpath("//a[@id='thumbnail']")
		Thread.sleep(3000);
		
		// refresh the page	
		driver.navigate().refresh();
		
		// back to the page
		driver.navigate().back();
		
		//forward the page
		driver.navigate().forward();
		
		driver.quit();
	}
}
