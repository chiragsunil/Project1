package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorDemo {
    public static <javascriptExecutor> void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();


        WebElement input =  driver.findElement(By.xpath("(//input[@id='name'])[1]"));

       /* //passing the text into inputbox - alternate of sendKeys()
        javascriptExecutor js = (javascriptExecutor) driver;//javaScriptExecutor js = driver;
        js.executeScript("argument[0].setAttribute('value'.'john')",input);

        //CLICKING ON ELEMENT - ALTERNATE OF CLICK ()
        WebElement radioButton = driver.findElement(By.xpath("input[@id='male']"));
        js.executeScript("argument[0].click()",radioButton);
      */
    }
}
