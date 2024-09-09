package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //isDisplayed
        //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //System.out.println(logo.isDisplayed());

        //isEnabled()
         //boolean status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
        //System.out.println("Enabled Status:-"+ status);

        //isSelected()
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before SELECTING");
        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //false

        System.out.println("After SELECTING");
        male.click();
        System.out.println(male.isSelected()); // true
        System.out.println(female.isSelected()); //false

        boolean check = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
        System.out.println(check); //true

    }
}
