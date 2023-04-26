package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandileAlerts {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * there are three types of alerts 
		 * 1. alert box - display simple massage ( like pop up)
		 * 2. confirm box - positive option and negative option
		 * 3. prompt box - enter text on text field
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// To get HYR tutorial page
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
		// Alert Box
		driver.findElement(By.id("alertBox")).click();
		
		// Handle the elect if should enter the alert
		System.out.println(driver.switchTo().alert().getText());
		
		// click to OK button in alert
		driver.switchTo().alert().accept();
		
		// print text of the elect box
		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(3000);
		//---------------------------------------------------------
		
		// Confirmation box
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// if you what to click the negative action use dismiss():
		// syntax driver.swithTo(). alter().dismiss():
		
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
// ------------------------------------------------------------------
		
		// prompt box 
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
	    driver.findElement(By.id("promptBox")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());
		// enter the text use send keys
		driver.switchTo().alert(). sendKeys("lokesh");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		
		driver.quit();
	}

}
