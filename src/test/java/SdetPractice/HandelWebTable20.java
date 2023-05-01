package SdetPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelWebTable20 {
		public static void main(String[] args) {
			/*
			1 How many rows in table
			2 How many columns in a table
			3 Retrieve the specific row/column data
			4 Retrieve all the data from the table
			5 Print Release Date, VersionNo of Java Language of Selenium
			 */
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			 driver.get("https://cosmocode.io/automation-practice-webtable/");
			 driver.manage().window().maximize();
			 
			 //find number of rows in a table
			 int column = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")).size();
			 // find Elements is only support for size method, findElement does N't
			 System.out.println("total numb of column "+column);
			 
			 // find number of column in a table
			 int rows  = driver.findElements(By.xpath("//table[@id='countries']/tbody//td[@style='width: 116.667px;']")).size();
			 System.out.println("total numb of rows " + rows);
			 
			 //Retrieve the specific row and column
			 String singleslied = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr[2]/td[2]")).getText();
			 System.out.println(singleslied);
			 
//			 // Retrieve all the data from the table
//			  // so just write the two for loop
//			 // outer for loop representation of the increment of rows
//			 // inner for loop representation of the increment of column
//			 
//			 System.out.println("data form the table.................");
//			 for(int r = 1; r <=rows; r++) // note: r value should 1
//			 {
//				 for(int c = 1; c <=column ;c++)
//				 {
//					 // modify the xpath convent to loop "+r+" "+c+"
//					 String data = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+r+"]/td["+c+"]")).getText();
//					 System.out.print(data + "    "); // this is the way of print every row supported
//				 }
//				 System.out.println(); // after print first row then move to the next line
//			 }
			 
			 
				// Print Release Date, VersionNo of Java Language of Selenium
			 for(int r = 1; r <= rows; r++) 
			 {
				 String value = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+r+"]/td[2]")).getText();
				 
				 if(value.equals("Algeria"))
				 {
					 String country = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+r+"]/td[3]")).getText();
					 String capital = driver.findElement(By.xpath("//table[@id='countries']/tbody//tr["+r+"]/td[4]")).getText();
					 System.out.println(value+"  "+ country+"  "+ capital) ;
				 }
			 }
		}
}
