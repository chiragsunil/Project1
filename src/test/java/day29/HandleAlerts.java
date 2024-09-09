package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1)Normal alert with Ok buttoon

        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Thread.sleep(5000);
        //driver.switchTo().alert();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();*/

        //2 Confirmation alert - Ok & Cancel
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        driver.switchTo().alert().accept();// close alert using Ok button
        driver.switchTo().alert().dismiss();// close alert using cancel button

         */

        //3) prompt alert input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        Alert prmpt = driver.switchTo().alert();
        prmpt.sendKeys("welcome");
        prmpt.accept();
    }
}
