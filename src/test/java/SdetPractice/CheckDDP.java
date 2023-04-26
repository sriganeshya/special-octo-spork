package SdetPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDDP {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='toggle-nav']/following-sibling::ul/li[2]/a")).click();
		
		WebElement drpElement = driver.findElement(By.name("category_id"));
		Select allOption = new Select(drpElement);
		
		List<WebElement> options = allOption.getOptions();
		
		ArrayList origianllist = new ArrayList();
		ArrayList templist = new ArrayList();
		
		for (WebElement option : options) {
			origianllist.add(option.getText());
			templist.add(option.getText());		
		}
		
		System.out.println("original list" +origianllist);
		System.out.println("templist" +templist);
		
		Collections.sort(templist);
		System.out.println("original list" +origianllist);
		System.out.println("templist after sorting" +templist);
		
		if (templist.equals(origianllist)) {
			System.out.println("templist equals origianllist");			
		}
		else 
		{
			System.out.println("templist not equals origianllist");
		}
	}

}
