package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {
    public static void main(String[] args)


        throws InterruptedException {
            WebDriver driver = new ChromeDriver();

        //FluentWaitDeclaration
            Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchMethodException.class);


            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            driver.manage().window().maximize();

        WebElement textUserName = mywait.until(new Function<WebDriver, WebElement>() {
        public WebElement apply(WebDriver driver){
            return driver.findElement(By.xpath("//input[@placeholder='Username']"));
        }
            });

        textUserName.sendKeys("Admin");
    }
}
