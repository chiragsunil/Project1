package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        //1)find the total number of rows in table
        //int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        int rows = driver.findElements(By.tagName("tr")).size();
        System.out.println("Number of rows"+rows);//7

        //2) find the total number of columns in table
        //int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        int cols = driver.findElements(By.tagName("th")).size();
        System.out.println("Number of columnsis:"+cols);

        //3read data from specific row and column (ex: 5th row and 1st column)
        String bookName= driver.findElement(By.xpath("//table[@name='Bookname']//tr[5]//td[1]")).getText();
        System.out.println(bookName);

        //4 read data from all the rows and columns

        for (int r = 2;r <= rows;r++){
            for (int c=1;c<=cols;c++){
              String value =  driver.findElement(By.xpath("//table[@name='Bookname']//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(value);
            }
        }


    }
}
