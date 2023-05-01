package SdetPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewDatePicker22 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dob")).click();
		
		Select mounth_drop = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        mounth_drop.selectByVisibleText("Oct"); // select class is used to dropDrop down
		
		Select year_drop = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year_drop.selectByVisibleText("2023"); // select class is used to dropDrop down
        Thread.sleep(5000);
        
        String date= "15";
        
        List <WebElement> dt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
        
        for(WebElement ele : dt)
        {
        	String alldate = ele.getText();
        	if(alldate.equals(date))
        	{
        		ele.click();
        		break;
        	}
        } 		//driver.quit();	
	}
}
