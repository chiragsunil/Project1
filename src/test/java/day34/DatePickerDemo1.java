package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo1 {
    static void selectMonthAndYear(WebDriver driver,String month,String year) {
        //Select month and year
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //Actual month
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//Actual year

            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }

        static void selectDate(WebDriver driver,String date ){
            //select date
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
            for(WebElement dt : allDates){
                if(dt.getText().equals(date)){
                    dt.click();
                    break;
                }
            }

        }


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //switch to frame
        driver.switchTo().frame(0);


        //1)Method using sendkeys()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");

        //2 Mehtod2:(Expected data) using date picker
        String date = "24";
        String month = "August";
        String year = "2026";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));//open date picker

         selectMonthAndYear(driver,month,year);
         selectDate(driver,date);


    }
}
