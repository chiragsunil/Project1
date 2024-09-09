package day42;

    /*
    1)open Application
    2)Test logo presence
    3)login
    4)close
     */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmTest {
    WebDriver driver;
    @Test(priority = 1)
    void openapp(){
        new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void testLogo(){
boolean  status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(status);

    }

    @Test(priority = 3)
    void testLogin(){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

    }

    @Test(priority = 4)
    void closeUp(){
      driver.quit();
    }


}
