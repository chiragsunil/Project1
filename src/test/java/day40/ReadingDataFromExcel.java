package day40;

//Excel1 file ===> Workbook ===> sheets ===>rows ===> cells
//Reading the data from excel sheet

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingDataFromExcel {

    public static void main(String[] args) throws FileNotFoundException {



        /*USE FOR READING
        FileInputStream file = new FileInputStream("Excel file location paste here");//System.getproperty("user dir") for dynamic

        XSSFWoorkbook workbook = new XSSFWORKBOOK(file);

        XSSFSheet sheet =workbook.getSheet("Sheet name");

        int totalRow = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1),getCellNum();

        System.out.println("Number of rows"+totalRow);
        System.out.println("Number of columns"+totalCells);

        for(int r = 0;r<=totalRow;r++){
            XSSFRow currentRow = sheet.getRow(r);

            for(int c = 0;c <=totalCells;c++){
                XSSFCell cell =currentRow.getCell(c);
                System.out.println(cell.toString()+"\t");

            }
            System.out.println();
        }

        workbook.close(); //attach workbook to the file
        file.close();

*/
    }
}
