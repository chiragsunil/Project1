package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/admin/index.php");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

        driver.findElements(By.xpath("//button[normalize-space()='Login']"));

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//a[@class='parent']")).click();// customers main menu
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); //customers submenu

       String text =  driver.findElement(By.xpath("//div[contains(text(),'pages')-1]")).getText();

    }
}
