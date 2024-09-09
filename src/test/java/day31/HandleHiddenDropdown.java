package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleHiddenDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://opensource-demo.orangehrmlive.com/web/index.php");

        driver.manage().window().maximize();

        //Login Steps
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //Clicking on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        //Click on dropdown
        driver.findElement(By.xpath("//div[7]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

        Thread.sleep(5000);
        //Select single option
        //driver.findElement(By.xpath("//span[normalize-space()='Quality Assurance']")).click();

        //count number of option
        List<WebElement> count= driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Number of options"+count.size());

        for(WebElement op : count){
            System.out.println(op.getText());
        }
    }
}
