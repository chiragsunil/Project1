package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));

        //these are all belong to Select class object's
        Select drpcountry = new Select(drpcountryEle);

        //select option from the dropdown
        //drpcountry.selectByVisibleText("France");
        //drpcountry.selectByValue("Japan");
        //drpcountry.selectByIndex(2);

        // Capture the options from the dropdown ((return all the options from the dropdown as a webElement )
        List<WebElement> options = drpcountry.getOptions();
        System.out.println("Number of option in a drop down " + options.size());

        //printing the options
        /*for (int i =0;i < options.size();i++){
            System.out.println(options.get(i).getText());
        }*/

        //enhance for loop
        for (WebElement op:options){
            System.out.println(op.getText());
        }

        //Bootstrap dropdown
    }
}
