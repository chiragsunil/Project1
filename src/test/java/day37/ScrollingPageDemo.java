package day37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {
    public static <javaSriptExecutor> void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.com/flags-of-the-world.html");

        driver.manage().window().maximize();

        javaSriptExecutor js = (javaSriptExecutor) driver;

        //1 scroll down page bt pixel number
        //js.executeSript("window.scrollBy(0,3000)","");
       // System.out.println(js.executeSript("return window.pageYoffset;"));

        //2 Scroll the page till element is visible
        //js.executeScript("w")





    }
}
