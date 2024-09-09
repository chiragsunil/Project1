package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitwaitDemo {

    public static void main(String[] args)
         throws InterruptedException {
            WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //Declaration


            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            driver.manage().window().maximize();

            WebElement txtUserName = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            txtUserName.sendKeys("Admin");

            WebElement txtUserpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
            txtUserpassword.sendKeys("admin123");

            WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            loginButton.click();
            //driver.close();
    }
}
