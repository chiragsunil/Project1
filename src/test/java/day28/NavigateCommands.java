package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        //driver.get("https://demo.nopcommerce.com/"); Accept url only in String Format

        //driver.navigate().to("https://demo.nopcommerce.com/");

        //URL myUrl = new URL("https://demo.nopcommerce.com/");
        //driver.navigate().to(myUrl);

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
