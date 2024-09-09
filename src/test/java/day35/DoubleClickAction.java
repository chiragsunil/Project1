package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

        driver.manage().window().maximize();

        //switch to frame
        driver.switchTo().frame("iframeResult");

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

       WebElement button =  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

       box1.clear();
       box1.sendKeys("welcome");

       //double click action on button
        Actions act = new Actions(driver);

        act.doubleClick(button).perform();

        //validation : box2 should contains "Welcome"
        String text = box2.getAttribute("value");
        if(text.equals("welcome")){
            System.out.println("Text Copied");
        }else{
            System.out.println("test on copied properly");
        }


    }
}
