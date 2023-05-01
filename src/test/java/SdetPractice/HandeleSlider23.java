package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandeleSlider23 {
	/*
	How To Handle Slider?
 	How To Find Location & Size of the Web Element?
	What is the Difference Between Actions & Action?
	What is the Difference Between build() & perform()?
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		// first add chrome extension 
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("location f the min slider " +min_slider.getLocation());
		// using get location method
		System.out.println("Height & with of the element " + min_slider.getSize());
		// getsize method used for damnation of the element
		
		Actions action =new Actions(driver);
		
		// syntax = action.dragAndDropBy(source, xOffseet, yOffset)
		
		action.dragAndDropBy(min_slider, 100, 0).perform(); //object only in no y-axes so 0
		
		System.out.println("location f the min slider " +min_slider.getLocation());
		System.out.println("Height & with of the element " + min_slider.getSize());

		//then move the the object another side
		
		WebElement right_sider = driver.findElement(By.xpath("//span[2]"));
		// Actions action2 = new Actions(driver); - no need to use again
		action.dragAndDropBy(right_sider, -100 ,0).perform();
		
		// what to get size and location use top method
	
	}

}
