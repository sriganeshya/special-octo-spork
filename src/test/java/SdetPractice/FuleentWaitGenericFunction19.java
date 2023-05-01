package SdetPractice;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FuleentWaitGenericFunction19 {

    /*
     * // Waiting 30 seconds for an element to be present on the page, checking
           // for its presence once every 5 seconds.
           Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebE1ement foo = wait.until(new Function<WebDriver,WebE1ement>() {
            public WebE1ement apply(WebDriver driver) {
                return driver.findE1ement(By.id("foo"));
            }       
        });
     */

    public static void main(String[] args) {    
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN); // using keyboard action after entering the text
        
        By elementLoc = By.xpath("//h3[normalize-space()='Selenium']");
        WaitForElementWithFluentWait(driver, elementLoc).click();
    }

    public static WebElement WaitForElementWithFluentWait(WebDriver driver, final By locator) {

        // this is called as a declaration
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        // Usage of fluent Wait    
        WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }       
        });

        return element;
    }
}
