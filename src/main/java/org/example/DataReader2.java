package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReader2 {
    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("F://ReadingDataFromExcel1(Selenium).xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Credentials");
        XSSFRow row = sheet.getRow(0);

        int col_num = -1;

        for(int i=0; i < row.getLastCellNum(); i++)
        {
            if(row.getCell(i).getStringCellValue().trim().equals("UserName"))
                col_num = i;
        }

        row = sheet.getRow(1);
        XSSFCell cell = row.getCell(col_num);

        String value = cell.getStringCellValue();
        System.out.println("Value of the Excel Cell is - "+ value);
    }
}



