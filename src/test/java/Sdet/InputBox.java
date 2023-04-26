package Sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox {
      public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		// 
		WebElement emailInputBox = driver.findElement(By.xpath("//input[@id='Email']"));
		// clear the value present in element email input box
		emailInputBox.clear();
		
		// enter send keys
		emailInputBox.sendKeys("xman@gmail.com");
		
		// I want to capture text from input box
		//emailInputBox.getAttribute("value");
		System.out.println("Ruselt from getAttribute() method:" +emailInputBox.getAttribute("value"));
		
		// some time getText method, getAttribute method
		
		// get method is used to print inner text of the element - we can used any element
		System.out.println("Ruselt from getText() method:" + emailInputBox.getText());
		
		// Login button 
	    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		System.out.println(loginButton.getText());
		
		System.out.println(loginButton.getAttribute("class"));
		System.out.println(loginButton.getAttribute("type"));
		
		// Captured Title off the web page 
		String Title = driver.findElement(By.xpath("//h1[contains(text(),'Admin area demo')]")).getText();
		System.out.println(Title);
		
		// *************** what is difference **************
		//getText() is written the inner text of the element
		//whereas getAttribute fetches the text contained by an attribute in HTML document
		
		driver.quit();
	}
}
