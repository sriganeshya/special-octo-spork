package Sdet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuaeryPliginDropdowns {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//Wait tag - newly introduced selenium 4
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
    
    // Using the selectChoiceValues method
    //selectChoiceValues(driver,"choice1");
    
    // can use multiple values
    selectChoiceValues(driver,"choice 2","choice 2 3","choice 3");
    
    // can select the all the choices - use all the choices 
    //selectChoiceValues(driver,"all");selectChoiceValues(driver,"choice1 2","choice2 3","choice3");
   
}
       
	

// con't access the selectChoiceValues without creating this method
 // in this method we can use (WebDriver,String value[]) - what is the problem is we can use multiple parameters
 // so i can use (String... value) method
private static void selectChoiceValues(WebDriver driver, String... value) {
	// string... it can hold multiple values
	List <WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
	//now using cavity condition & equalsIgnoreaCase
	if (!value[0].equalsIgnoreCase("all"))
	{
		for(WebElement item :choicelist)
		{
			String text = item.getText();
			
			for(String val :value)
			{
				if(text.equals(val))
				{
					item.click();
					break;
				}
			}
		}
	}
	else
	{
		for(WebElement item:choicelist)
		{
			item.click();
		}
	}
}
}
