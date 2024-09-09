package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

        driver.manage().window().maximize();

        //single file upload- TEST 1.text
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("PATH OF THE FILE");

        /*if (driver.findElement(By.xpath("//li[normalize-space()='No Files Selected']//li")).getText().equals("sunil automation")){
            System.out.println("file is sucessfully uploaded");

        }else{
            System.out.println("file uploaded");
        }*/

        //Multiple uploaded
        String file1= "";
        String file2= "";

        driver.findElement(By.xpath("")).sendKeys(file1+"/n"+file2);


    }
}
