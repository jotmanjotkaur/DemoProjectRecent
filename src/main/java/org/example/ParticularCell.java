package org.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ParticularCell {

        public static void main(String[] args)
        {
            ParticularCell rc=new ParticularCell();

            String Output=rc.ParticularCell(2, 3);

            System.out.println(Output);

        }
        //method  for reading a cell
        public String ParticularCell(int vRow, int vColumn)
        {
            String value=null;          //variable for storing the cell value
            Workbook wb=null;           //initialize Workbook null
            try
            {

                FileInputStream file=new FileInputStream("F://ReadingDataFromExcel1(Selenium).xlsx");

                wb=new XSSFWorkbook(file);
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch(IOException e1)
            {
                e1.printStackTrace();
            }
            Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index
            Row row=sheet.getRow(vRow); //returns the logical row
            Cell cell=row.getCell(vColumn); //getting the cell representing the given column
            value=cell.getStringCellValue();    //getting cell value
            return value;               //returns the cell value
        }

}
