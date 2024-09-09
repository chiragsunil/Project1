package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        //Approach 1
        Set<String> windowIds = driver.getWindowHandles();

        for (String winId:windowIds){
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);
            //if(title.equals("OrangeHRM")){ // child window will open and parent window will close
            if (title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title")){
            driver.close();
                //break;
            }
        }

    }
}
