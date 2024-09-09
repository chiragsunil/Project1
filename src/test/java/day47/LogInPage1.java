package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogInPage1 {

    WebDriver driver;
    LogInPage1(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    //Locators
    @FindBy (xpath="//input[@placeholder='Username']")
    WebElement txt_username;
    @FindBy (xpath="//input[@placeholder='Password']")
    WebElement txt_password_loc;
    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement txt_login_loc;

    @FindBy(tagName = "a")
    List<WebElement> links;

    //Actions method
    public void setUserName(String user){
        txt_username.sendKeys(user);
    }

    public void setPassword(String pwd){
        txt_password_loc.sendKeys(pwd);
    }

    public void clickLogin(){
        txt_login_loc.click();
    }


}
