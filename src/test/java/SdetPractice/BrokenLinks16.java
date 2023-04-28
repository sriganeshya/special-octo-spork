package SdetPractice;


import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks16 {
		public static void main(String[] args) throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
	
			List <WebElement> links = driver.findElements(By.tagName("a"));
			
			int brokenLinks = 0;
			//for that you have to verify broken link or not
			for(WebElement element : links)
			{
				String url = element.getAttribute("href");
				// first check is there any url or not
				if(url == null || url.isEmpty())
				{
					System.out.println("this url is emty");
					continue; // is a method continue the next loop
				}
							
				URL link = new URL(url);// string URL converted in URL Link // URL. net package
				
				try {
					HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();// is method open connection
					httpconn.connect(); // .connect() is method connect though 
					if(httpconn.getResponseCode()>=400) // getResponceCode is a method 
					{
						System.out.println(httpconn.getResponseCode()+ "is " + "  broken Link");
						brokenLinks++; // initializing brokenLink into int data type = 0 - before for loop
					}
					
					else
					{
						System.out.println(httpconn.getResponseCode()+ "is " + " normal link");
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
			System.out.println("Number of broken links" + brokenLinks);
		}
}
