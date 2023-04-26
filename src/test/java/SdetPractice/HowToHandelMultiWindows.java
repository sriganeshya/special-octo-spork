package SdetPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandelMultiWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set <String> windowIDs = driver.getWindowHandles();
		
//		Iterator <String> id = windowIDs.iterator();
//		
//		String perantWindowID = id.next();
//		String childWindowID = id.next();
//		
//		System.out.println("print parent window ID" +perantWindowID);
//		System.out.println("print child Window Id" +childWindowID);
		
		List<String> windowsIDlist = new ArrayList(windowIDs);
		
//		String perantWindowID = windowsIDlist.get(0);
//		String childWindowID = windowsIDlist.get(1);
//		
//		System.out.println("print parent window ID" +perantWindowID);
//		System.out.println("print child Window Id" +childWindowID);
//		
//		driver.switchTo().window(perantWindowID);
//		System.out.println("perent window title " + driver.getTitle());
//		driver.switchTo().window(childWindowID);
//		System.out.println("child window title " + driver.getTitle());
		
		for(String windID : windowsIDlist) {
			String title = driver.switchTo().window(windID).getTitle();
			if(title.equals("OrangeHRM")) {
			//System.out.println(title);
				driver.close();
		    }
		}
//		driver.close();
//		Thread.sleep(3000);
//		
//		driver.quit();
	}

}
