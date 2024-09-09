package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        //2 Open url https://demo.opencart.com/
        driver.get("https://demo.opencart.com/");

        //3 Validate the title should be "Your store"
        String act_title = driver.getTitle();

        if(act_title.equals("Your Store")){
            System.out.println("Test Passed");
        }else{
            System.out.println("test failed");
        }
    }
}
