package naukrilogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("chirag.joshi.dev@gmail.com");

        driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Think@cash89");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();



    }
}
