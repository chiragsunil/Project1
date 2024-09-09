package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        //Relative X-path with single attribute
         //driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");

         // X-path multiple attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).sendKeys("T-shirts");

        //X-path with AND operator
        //driver.findElement(By.xpath("//input[@placeholder='Search store'and @id='small-searchterms']")).sendKeys("Tshirts");

        //or
        //driver.findElement(By.xpath("//input[@placeholder='xyz'or @id='small-searchterms']")).sendKeys("T-shirts");

        // xpath with text() [smjh m nhi aya]
        //driver.findElement(By.xpath("//[text()='Macbook']")).click();

        /*boolean statusDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Featured products']")).isDisplayed();
        System.out.println(statusDisplayed);

        String textdriver = driver.findElement(By.xpath("//strong[normalize-space()='Featured products']")).getText();
        System.out.println(textdriver);
         */

        // X-path with contains
        //driver.findElement(By.xpath("//input[contains(@placeholder ,'Sea')]")).sendKeys("T-SHirts");

        //X-path Start with
        //driver.findElement(By.xpath("//input[starts-with(@placeholder ,'Sea')]")).sendKeys("T-shirt");

        //Chaning X-path
        //boolean imageStatus=driver.findElement(By.xpath("//div[@id='logo' ]/a/img")).isDisplayed();
        //System.out.println(imageStatus);





    }
}
