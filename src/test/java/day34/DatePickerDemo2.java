package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

public class DatePickerDemo2 {

    //UserDefined Method for converting moth from String --->Month
    static Month currentMonth(String month ){
        HashMap<Object,Month> monthMap = new HashMap<>();

        monthMap.put("january",Month.JANUARY);
        monthMap.put("February",Month.FEBRUARY);
        monthMap.put("march",Month.MARCH);
        monthMap.put("April",Month.APRIL);
        monthMap.put("May",Month.MAY);
        monthMap.put("june",Month.JUNE);
        monthMap.put("july",Month.JULY);
        monthMap.put("August",Month.AUGUST);
        monthMap.put("September",Month.SEPTEMBER);
        monthMap.put("October",Month.OCTOBER);
        monthMap.put("November",Month.NOVEMBER);
        monthMap.put("December",Month.DECEMBER);

        Month vmonth = monthMap.get(month);
        if(vmonth == null){
            System.out.println("Invalid Month");
        }

        return vmonth;

    }
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String requiredYear ="2019";
        String requiredDate = "21";
        String requiredMonth = "September";

        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        //select year
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);

        //logic to count the months
        //expected month < april (current month)       past logic
        //expected month > april       future logic

        //select a month
       /* while(true){
        String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

        //covert  requiredmonth and displaymonth in to Moth Objects
        Month expectedMonth = currentMonth(requiredMonth);
        Month currentMonth = convertMonth(DisplayMonth);

        //compare
        int result = expectedMonth.compareTo(currentMonth())



         if (result < 0 ){
             driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
         } else if (result > 0) {

             driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
         }else{
             break;
         }*/
    }
}
