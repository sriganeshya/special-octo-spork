package SdetPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDatePicker22 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// what the date you want to enter
		String year = "2023";
		String mounth = "july";
		String date = "10"; // Compare the value into application value
		
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click(); // open the date picker
		Thread.sleep(3000);
	    
		// keep on clicking arrow mark till get expected result
		while(true)
		{
			String mouthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			// split them into two parts So there is a split method in java
			String arr[] = mouthYear.split(" "); //("") - what bases you split - only space so - mouthYear.split(" ");
			String moun = arr[0]; // getting values placed in arr
			String year1 = arr[1]; // getting values placed in arr
			
			//compare these values to expected values
			if(moun.equalsIgnoreCase(mounth) && year1.equalsIgnoreCase(year))
					break;
			else
				driver.findElement(By.xpath("//td[@class='next']")).click();	
		}
		 // then go to the date picker
		List <WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody//td"));
		
		for(WebElement ele: alldates)// enhanced for loop
		{
			String dt = ele.getText();
			if(dt.equals(date)) // date came from stating string variable
			{
				ele.click();
				break;
			}
		}
	}
}
