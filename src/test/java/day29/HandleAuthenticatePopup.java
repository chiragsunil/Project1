package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatePopup {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //Syntax
        //"https://admin:admin@the-the-internet.herokuapp.com/basic_auth"
          driver.get("https://admin:admin@the-the-internet.herokuapp.com/basic_auth");
    }
}
