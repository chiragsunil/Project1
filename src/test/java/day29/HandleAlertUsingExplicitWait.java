package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Handle Alert without using switchTo().alert()
//by using explicit wait
public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicit Wait

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Thread.sleep(5000);

        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); // capture alert


        //driver.switchTo().alert();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

    }
}
