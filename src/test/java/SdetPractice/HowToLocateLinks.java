package SdetPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToLocateLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click(); //Live posting
		WebElement needs = driver.findElement(By.name("category_id"));
		Select drpselect = new Select(needs); // does not support List class // check link s in select class or not 
		// insert into webelement variable in select class
		
		List <WebElement> options = drpselect.getOptions(); // .getOptions() method get all the options
		// this code use after click all. Why because with out click don't get all options
		
		//then creating two array list 
		ArrayList originalList = new ArrayList();
		ArrayList TempList = new ArrayList();
		
		for(WebElement option : options) // all options stored in to WebElement option
		{
			originalList.add(option.getText()); // using .add method to store all the text values into original list
			TempList.add(option.getText()); // using .add method to store all the text values into TempList list
		}
		
		System.out.println(originalList); //before sorting print originalList
		System.out.println(TempList); // before sorting print Templist
		
		Collections.sort(TempList); //Collections.sort(); is a method used to all collections are in sort data
		
		System.out.println(originalList); //After sorting print originalList
		System.out.println(TempList); // After sorting print Templist
		
		// then we have to compare two list
		if(originalList.equals(TempList)) // compare both list
		{
			System.out.println("DropDown sorted..");
		}
		else 
		{
			System.out.println("DropDown unsorted..");
		}
		
		driver.close();

	}
}

