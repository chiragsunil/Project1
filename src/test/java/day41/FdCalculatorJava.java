package day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FdCalculatorJava {
    public static void main(String[] args) throws InterruptedException {

       /* WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator");
        driver.manage().window().maximize();

        String filePath = System.getProperty("User dir")+"//testdata//caldata.xlsx";

        int row = ExcelUtils.getRowCount(filePath,"sheet1");

        for (int i =1;i<=row;row++){
            //1 Read data from Excel
            String pric = ExcelUtils.getCellData(filePath,"sheet1",i,0);
            String rateOfInterest = ExcelUtils.getCellData(filePath,"sheet1",i,1);
            String per1 = ExcelUtils.getCellData(filePath,"sheet1",i,2);
            String per2 = ExcelUtils.getCellData(filePath,"sheet1",i,3);
            String fre = ExcelUtils.getCellData(filePath,"sheet1",i,4);
            String exp_mvalue = ExcelUtils.getCellData(filePath,"sheet1",i,5);

            //2)pass data in to application
            driver.findElement(By.xpath("")).sendKeys(pric);
            driver.findElement(By.xpath("")).sendKeys(rateOfInterest);
            driver.findElement(By.xpath("")).sendKeys(per1);

            Select perdrp = new Select(driver.findElement(By.xpath("")));
            perdrp.selectByVisibleText(per2);

            Select fredrp = new Select(driver.findElement(By.xpath("")));
            fredrp.selectByVisibleText(fre);

            //validation
            String act_mvalue = driver.findElement(By.xpath("")).getText();//clicked on calculate
            if(Double.parseDouble(exp_mvalue)== Double.parseDouble(act_mvalue)){
                System.out.println("Test passed");
                ExcelUtils.setCellData(filepath,"sheet1",i,7,"passed");
                ExcelUtils.fillGreencolor(filePath,"sheet1",i,7);
            }else {

                System.out.println("Test failed");
                ExcelUtils.setCellData(filepath,"sheet1",i,7,"Failed");
                ExcelUtils.fillRedcolor(filePath,"sheet1",i,7);

            }
            Thread.sleep(5000);
            driver.findElement(By.xpath("")).click();//clicked on clear button

        }//ending for loop

        driver.quit();
*/

    }
}
