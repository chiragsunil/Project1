package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get :- open the URL on browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        //getTitle:- return the title of the page
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl()); // "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

        // source page
        System.out.println(driver.getPageSource());

        String windowId = driver.getWindowHandle();
        System.out.println("Window ID" + windowId);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser Window
        Set<String> WindowsIds = driver.getWindowHandles();

        System.out.println(windowId);
    }
}
