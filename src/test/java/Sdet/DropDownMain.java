package Sdet;
   import java.util.List;

import org.openqa.selenium.By;
// how to select the multiple drop downs 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMain {
	
	// we can't able to access with out creating this
    static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cyclos.org/contact/");
		
//		Select allCompany = new Select(driver.findElement(By.id("business-type")));
//		allCompany.selectByVisibleText("Non-profit");
//		
//	    Select type = new Select(driver.findElement(By.id("question-type")));
//	    type.selectByVisibleText("Commercial & Sales");
//	    
//	    Select License = new Select(driver.findElement(By.id("license")));
//	    License.selectByVisibleText("Small (S): 300 < users < 2 000");
		
		//approach 2
		Select allCompany = new Select(driver.findElement(By.id("business-type")));
		selectOptionFromDropDown(allCompany,"Non-profit");
		
	    Select type = new Select(driver.findElement(By.id("question-type")));
	    selectOptionFromDropDown(type,"Commercial & Sales");
	    
	    Select License = new Select(driver.findElement(By.id("license")));
	    selectOptionFromDropDown(License,"Small (S): 300 < users < 2 000");
	    
	   
	    }	
	public static void selectOptionFromDropDown(Select drp, String value) 
	{
	    List<WebElement> alloptions = drp.getOptions();
	    for (WebElement option : alloptions) {
	        if(option.getText().equals(value)) {
	            option.click();
	            break;
	        }
	    }
	}
}