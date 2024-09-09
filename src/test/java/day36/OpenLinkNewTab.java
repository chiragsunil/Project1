package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkNewTab {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");

        driver.manage().window().maximize();

      WebElement register =  driver.findElement(By.xpath("//input[@id='usernameField']"));

      register.click();

        Actions act = new Actions(driver);

        //COMMAND+register
        act.keyDown(Keys.COMMAND).click(register).keyUp(Keys.COMMAND).perform();

        //Switching to registeration page
        List<String> ids = new ArrayList<>(driver.getWindowHandles());

        //registration
        driver.switchTo().window(ids.get(1));//switch to registration page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sunil joshi");

        //home page
        driver.switchTo().window(ids.get(0));// switch to home page
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("arya");



    }
}
