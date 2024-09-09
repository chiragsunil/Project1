package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize(); // This command will maximise the browser window

        // Locator name use
        //driver.findElement(By.name("search")).sendKeys("Mac");//This will return web element ans]d sendkeys perfoam action

        //id and displaylogo
        //boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logoDisplayStatus);

        // Linktext & partialLinkText
        //driver.findElement(By.linkText("Tablets")).click(); // prefer to use
        //driver.findElement(By.partialLinkText("Tab")).click(); // we prefers partialtext if unique

        // className
        // we use list collection not se collection because list allows duplicates that's why findelements return type is List
       //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        //System.out.println("Total number of header Links : -"+headerLinks.size());

        //TagName
        //List<WebElement> links =driver.findElements(By.tagName("a"));
        //System.out.println("Total number of links :-"+links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total Number of images :-"+images.size());
    }
}

