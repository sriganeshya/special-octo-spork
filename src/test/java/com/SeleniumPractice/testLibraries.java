package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testLibraries {
	
	public static void main(String[] args) throws InterruptedException {
		
//	WebDriverManager.chromedriver().setup(); // it was the general syntax.
//	// if you download proxy server server syntax like this
//	WebDriverManager.chromedriver().proxy("testhost:8080").setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://bonigarcia.dev/webdrivermanager/");
	
	// locate web driver
	WebDriverManager.chromedriver().setup();
	WebDriver lokesh = new ChromeDriver();
	lokesh.get("https://www.google.co.in/");
	Thread.sleep(3000); // element ni through cheyamani adugutundi
	// element ni find out cheyali ante --> 
	//driver.findElement(By.id("user_email")); // by anedi calls yokka referance 
	// ekkada plural ni vadatam ledu ante locater lo single element ni estundi
	//driver.findElements ani vadali
	highlight(lokesh, lokesh.findElement(By.className("gLFyf")));
	Thread.sleep(3000);
	// now web element identified. i need identified the element, what we need 1. driver insistence 
	//                                                                    2. web element insistence
	highlight(lokesh, lokesh.findElement(By.id("gws-output-pages-elements-homepage_additional_languages__als")));
	// you can use all by element like this
	}

	public static void highlight(WebDriver lokesh, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) lokesh;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
}
