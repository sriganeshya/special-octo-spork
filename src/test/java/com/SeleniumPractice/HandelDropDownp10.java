package com.SeleniumPractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDropDownp10 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		List<WebElement> courseNameDropdownOption = courseNameDropdown.getOptions();
		for (WebElement option : courseNameDropdownOption) {
			System.out.println(option.getText());
		}
		courseNameDropdown.selectByIndex(1); //java
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("net"); //Dot net
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Javascript"); //java script
		Thread.sleep(3000);
		
	    String selectedText = courseNameDropdown.getFirstSelectedOption().getText(); // this is the method
	    System.out.println("selected visible text - " + selectedText); 
	    
	    driver.quit();
	    }
	

}
