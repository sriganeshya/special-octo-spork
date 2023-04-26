package com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleWindowsMultipleTabes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		// single open window

		// window handle // windowHandels
		// parent window handle
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("prinent window handel - " +parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
		// why use set of string - unique , why not use list of string - duplicates
		// window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// using for each loop
		for (String windowHandle : windowHandles) { // windowHandles unique address

			// switch to another window
			driver.switchTo().window(windowHandle);
			System.out.println(windowHandle + driver.getTitle());
			// to build handles
			
		}
		driver.quit();
	}
	
}