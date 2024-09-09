package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
  1)constructor==>purpuse==>It will initiate the driver
  2) Locators:-List of Locators(X-PATH,ID)
  3)Actions methods
   */
public class LogInPage {
     WebDriver driver;
     LogInPage(WebDriver driver){
         this.driver =driver;
     }

     //Locators
     By txt_username_loc= By.xpath("//input[@placeholder='Username']");
    By txt_password_loc= By.xpath("//input[@placeholder='Password']");
    By txt_login_loc= By.xpath("//button[normalize-space()='Login']");

    //Actions method
    public void setUserName(String user){
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassword(String pwd){
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(txt_login_loc).click();
    }


}
