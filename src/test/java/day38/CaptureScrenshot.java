package day38;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScrenshot {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //full page screenshot
        /*TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"//screeenshot//fullpage.png");
        source.renameTo(target); //copy source to target
         */
        //capture the screenshot of specific section
        WebElement featureproduct = driver.findElement(By.xpath("//strong[normalize-space()='Popular:']"));
        File sourceFile = featureproduct.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"//screeenshot//featureproduct.png");
        sourceFile.renameTo(targetfile);//copy source file to target file

        driver.quit();


    }
}
