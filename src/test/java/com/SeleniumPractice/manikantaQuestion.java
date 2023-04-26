package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class manikantaQuestion {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	 // Find the search box element and enter the search query
    WebElement searchBox = driver.findElement(By.name("search_query"));
    searchBox.sendKeys("Natu Natu RRR telugu");
    searchBox.submit();
    
    // Find the search button element and click it
    WebElement searchButton = driver.findElement(By.cssSelector("button#search-icon-legacy"));
    searchButton.click();
    
    // Find the first video in the search results and click it
    WebElement firstVideo = driver.findElement(By.cssSelector("a#video-title"));
    firstVideo.click();
    
    // Wait for the search button to become visible
    WebDriverWait wait = new WebDriverWait(driver, null);
    WebElement searchButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#search-icon-legacy")));
    
    // Close the browser window
    driver.quit();
	}
}
