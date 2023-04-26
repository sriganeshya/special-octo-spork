package SdetPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jqueryDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='container']/div/div/div")).click();
		selectchoicevalues(driver, "all");
		
		driver.findElement(By.xpath("//div[@id='comboTree233206InputWrapper']/input")).click();
		//selectchoicevalues(driver, "all");
		
		driver.findElement(By.xpath("//div[@id='comboTree160539InputWrapper']/input")).click();
		//selectchoicevalues(driver, "all");

	}
	public static void selectchoicevalues(WebDriver driver, String... value) {
		List <WebElement> chioceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item : chioceList) {
				String text = item.getText();

				for(String val : value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}
		else {
			try {
			for(WebElement select : chioceList) {
				 select.click();
			}
			}
			catch(Exception e) {
				
			}
		}
	}
}
