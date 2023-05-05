package SdetPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShortOfWebPage26 {
	/*
	How to capture Screenshot of Full Page?
	How to capture Screenshot of Section of Page?
	How to capture Screenshot of Element on a Page?
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE); // use this class and method
//		File trg = new File(".\\SdetPractice.Screenshorts\\homepae.png");
//		FileUtils.copyFile(src, trg);
//		
//		driver.close();
		
		// How to capture specific section of the page
		
//		driver.get("https://demo.nopcommerce.com/");
//		
//		WebElement selection = driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
//		// Using WebElement class insert into driver class method
//		File src = selection.getScreenshotAs(OutputType.FILE); // use this class and method
//		File trg = new File(".\\screenshorts\\homepae.png");
//		FileUtils.copyFile(src, trg);
//		
//		Thread.sleep(5000);
//		
//		driver.close();
//		
		
		// specific WebElement		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement selection = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src = selection.getScreenshotAs(OutputType.FILE); // use this class and method
		File trg = new File(".\\screenshorts\\homepae.png");
		FileUtils.copyFile(src, trg);
		
		Thread.sleep(5000);
		
		driver.close();
	

		
	} 
}
