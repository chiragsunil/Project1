package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrapDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//open drop down options

        //1)select the single option
        //driver.findElement(By.xpath("//input[@value='Java']")).click();

        //2)Capture all the options and find out size
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options:-"+options.size());

        /*for (WebElement opt : options){
            System.out.println(opt.getText());
        }*/

        //Select multiple options
        for(WebElement opt:options){
            String option = opt.getText();
            if(option.equals("java") || option.equals("Python") || option.equals("Mysql")){
                opt.click();
            }
        }
    }
}
