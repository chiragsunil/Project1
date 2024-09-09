package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCase {
    public static void main(String[] args) {
        //Launch browser (chrome)
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get("https://demo.opencart.com/");

        String act_titile = driver.getTitle();  //validate title should be "Your Store"

        if (act_titile.equals("Your Store")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        //driver.quit();


    }
}
