package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTeablePagenation21 {
	public static void main(String[] args) throws InterruptedException {
/*		How To Handle Dynamic Web
		Table with Pagination in
		Selenium?
*/
		//rows and column are not fixed those are auto update
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear(); // WebEelement not directly support clear method
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear(); // WebEelement not directly support clear method
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		
		// sales --> orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		/*
		 text= Showing 1 to 20 of 8511 (426 Pages)
		 
         text. indexOf( " ( " ) -- get the first index of the open bracket
         text. indexOf( " Pages " ) -- get the last index 
         text. substring(text . indexOf( " ( " )+1 , text . indexOf( "Pages " ) -1) -- combined 2
		 */                           //index is starting index-is starting 0 so +1       
		                              // there is one more space is available so -1
		// in this between this 2 number is there
		
		
		//text.substring(text.indexOf("(")+1,text.indexOf("pages")-1);
		// this is number format converted into integer format 
        int totalPages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
                // valueof take to the first one
        //or
        // int totalPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1).trim());
       
        System.out.println("print total number of pages = "+totalPages);
		
        // then go to each page and count the total number of rows
        // hear you should focused on html code span tag, <a> tag
        // using looping statement
        
        for(int p = 1; p <= totalPages; p++) 
        {
            WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
            System.out.println("Active page: " + activePage.getText()); 
            activePage.click();
            
            
        	
        	int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
        	System.out.println("number of rows: "+ rows);
        	
        	String pageNo = Integer.toString(p+1);
        	driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+pageNo+"']")).click();
        	// "//ul[@class='pagination']/li/a[text()='2']" in this xpath p value not directly because p = int type
        	// xpath is string type - xpath convert to string type so before that creating one class converted to int to string 
        	// Initialize p+1 = every time increase the value
        }   
	}	
}