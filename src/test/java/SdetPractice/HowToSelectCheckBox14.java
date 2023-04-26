package SdetPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToSelectCheckBox14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		List <WebElement> days =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		System.out.println("Total no of check Boxes"+ days.size());

//		for(int i=0;i<days.size();i++) {
//			days.get(i).click();
//		}
//		driver.navigate().refresh();
//		Thread.sleep(2000);

//		for(WebElement day : days){
//			day.click();
//		}
//		driver.navigate().refresh();
//		Thread.sleep(2000);

//		for(WebElement day : days) {
//			String checkbox = day.getAttribute("id");
//			if( checkbox.equals("monday") || checkbox.equals("sunday")) {
//				day.click();
//			}
//		}
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
//		int day = days.size();
//		for(int i=day-2; i<day; i++) {
//			days.get(i).click();
//		}
		
//		int day = days.size();
//		for(int i=0; i<day; i++) {
//			if(i<1) {
//				days.get(i).click();				
//			}
//		}
	}

}
