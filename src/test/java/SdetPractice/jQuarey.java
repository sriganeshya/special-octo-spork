package SdetPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQuarey {
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);

		//sleep time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Searchable-Combobox-Plugin-with-jQuery-multilist/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/a/span")).click();

		jqueryDropDown(driver,"all");


	}
	public static void jqueryDropDown(WebDriver driver, String... value) {

		List <WebElement> jdd = driver.findElements(By.xpath("//div[@id='multi']//div/ul/li/a[@value>=1]"));
		{
			if (!value[0].equalsIgnoreCase("all"))
			{
				for(WebElement item : jdd)
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
				for(WebElement item: jdd)
				{
					item.click();
				}
			}
		}
	}////div[@id='multi']//div/ul/li/a[@value>=1]
}
