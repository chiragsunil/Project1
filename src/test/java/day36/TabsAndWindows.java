package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/");

        //SELENIUM 4
        //driver.switchTo().newWindow(WindowType.TAB); // OPEN NEW TAB
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://orangehrm.com/");
    }
}
