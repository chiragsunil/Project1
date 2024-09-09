package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        //This is a single Shadow dom
        //String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
       // Thread.sleep(5000);

        //Handle Shadow DOM Element
        SearchContext shadow = driver .findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(5000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
        //driver.findElement(By.cssSelector("#input")).sendKeys("welcome");
    }
}
