package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsVsAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);

        act.contextClick(button).perform();//create+complete
        //Right click action

        Action myAction = act.contextClick(button).build(); // Building/creating an action and storing in to variable
        myAction.perform();// we are performing/completing action

    }
}
