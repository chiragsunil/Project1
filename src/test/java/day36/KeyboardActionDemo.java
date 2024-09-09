package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActionDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");

        Actions act = new Actions(driver);

        //Command+A (Select the text)
        act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();

        //Command+C (copy the text into clipboard)
        act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();



        //tab - Shift to the 2nd box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();


        //Command+V paste the text
        act.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();




        //Command+


    }
}
