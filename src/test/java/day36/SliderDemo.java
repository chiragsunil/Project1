package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //Min slider
        WebElement min_Slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Default location of Minimum slider"+min_Slider.getLocation());//(58,249) = (x,y)
        act.dragAndDropBy(min_Slider,100,249).perform();
        System.out.println("Location of the min slider after moving:"+min_Slider.getLocation());//157,249


        //MaxSlider
        WebElement max_Slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Default location of Minimum slider"+max_Slider.getLocation());//(876,249) = (x,y)
        act.dragAndDropBy(max_Slider,-10,249).perform();
        System.out.println("Location of the min slider after moving:"+max_Slider.getLocation());//778,249



    }
}
