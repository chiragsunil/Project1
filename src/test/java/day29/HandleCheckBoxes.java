package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        //1) select specific checkBox
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) select all the check boxes
        List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@class=form-check-input and @type=checkbox]"));

        /*for (int i = 0; i < checkBoxes.size();i++){
            checkBoxes.get(i).click();
        }*/

        /*for (WebElement checkbox : checkBoxes){
            checkbox.click();
        }*/

        //3) select last 3 checkBoxes
        // total number of checkBoxes -(minus) how many checkBoxes want to select = starting index
        //7-3 = 4(starting index)
        /*for (int i = 4; i < checkBoxes.size();i++){
            checkBoxes.get(i).click();
        }*/

        //4) select first 3 checkBoxes
        for (int i = 0; i < 3;i++){
            checkBoxes.get(i).click();
        }

        //5) unselected checkBoxes if they are selected
        for (int i = 0; i < 3;i++){
            checkBoxes.get(i).click();
        }
        Thread.sleep(5000);

        for (int i = 0; i < 3;i++){
            if(checkBoxes.get(i).isSelected()){
                checkBoxes.get(i).click();
            }

        }
    }
}
