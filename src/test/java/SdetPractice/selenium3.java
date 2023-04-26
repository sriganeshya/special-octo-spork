package SdetPractice;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Sdet.WebElemnt_DES;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium3 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		//		System.out.println(driver.getTitle());
		//		System.out.print(driver.getCurrentUrl());
		//		System.out.println(driver.getPageSource());

		//		WebElement search = driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
		//		System.out.println("is displayed  " +search.isDisplayed());
		//		System.out.println("is Enable  " +search.isEnabled());
		//		
		//		driver.switchTo().frame(0);
		//		WebElement sunday =driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
		//		sunday.click();
		//		Thread.sleep(3000);
		//		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_0\"]"));
		//		System.out.println("working fine  " +checkbox.isSelected());
		//		Thread.sleep(5000);
		//		sunday.click();
		//		
		//		driver.navigate().to("https://www.google.com/");
		//		driver.navigate().back();
		//		driver.navigate().forward();
		//		driver.navigate().back();
		//		driver.navigate().refresh();

		//		WebElement ele = driver.findElement(By.xpath("//div[@id=\"Text1\"]/div/div[1]"));
		//		System.out.println(ele.getText());
		//		System.out.println(ele.getSize());
		//		
		//		 driver.switchTo().frame(0);
		//		 WebElement firstname = driver.findElement(By.xpath("//div/label[text()='First Name']/following-sibling::input"));
		//	     firstname.click();
		//         firstname.sendKeys("Lokesh");
		//         String typedtext = firstname.getAttribute("value");
		//         System.out.println(typedtext);
		
//	    WebElement dropDown = driver.findElement(By.xpath("//select[@id='speed']"));
//	    Select dropDown1 = new Select(dropDown);
//	    List <WebElement> allOption = dropDown1.getOptions();
//	    for(WebElement option:allOption) {
//	    	if(option.getText().equals("Medium")) {
//	    		option.click();
//	    		break;
//	    	}
//	    }
	    
	    // Lengthy approach
//	    Select dropDown2 = new Select(driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='files']")));
//	    Select dropDown3 = new Select(driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='number']")));
//	    Select dropDown4 = new Select(driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='products']")));
//	    Select dropDown5 = new Select(driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='animals']")));
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='speed']"));
		selectOpctionsFromDropDown(dropDown1,"Medium");

	    WebElement dropDown2 = driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='files']"));
	    selectOpctionsFromDropDown(dropDown2,"DOC file");
	    
	    WebElement dropDown3 = driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='number']"));
	    selectOpctionsFromDropDown(dropDown3,"3");
	    
	    WebElement dropDown4 = driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='products']"));
	    selectOpctionsFromDropDown(dropDown4,"Iphone");
	    
	    WebElement dropDown5 = driver.findElement(By.xpath("//div[@class='widget-content']//select[@name='animals']"));
	    selectOpctionsFromDropDown(dropDown5,"Avatar");
	    
//	    dropDown1.selectByVisibleText("Medium");

//		driver.quit();
	}
    public static void selectOpctionsFromDropDown(WebElement rls, String value) {
    	Select rls1 = new Select(rls);
    	
    	List <WebElement> allOptions = rls1.getOptions();
    	for(WebElement options: allOptions) {
    		if(options.getText().equals(value)) {
    			options.click();
    			break;
    		}
    	}
    }

}
