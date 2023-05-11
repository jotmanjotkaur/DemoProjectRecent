package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadingDataFromExcel {
    //  public static void main(String[] args) throws IOException {

    //     private final DataFormatter formatter= new DataFormatter();

    //     FileInputStream file=new FileInputStream("F://ReadingDataFromExcel1(Selenium).xlsx");

    //    XSSFWorkbook workbook = new XSSFWorkbook(file);

    //  XSSFSheet sheet = workbook.getSheet("Sheet1"); // providing sheet name
/*
      int rowcount =  sheet.getLastRowNum(); //returns the row count
     int colcount = sheet.getRow(0).getLastCellNum(); //returns( column / cell count

     for( int i=0; i<rowcount;i++ )

     {
         XSSFRow currentrow = sheet.getRow(i); //focussed on current row
            for (int j = 0; j < colcount; j++) {
             String value = currentrow.getCell(j).toString();
                System.out.println(value);
            }

            System.out.println();

        }

   */
  /*  private final DataFormatter formatter = new DataFormatter();

    public List<String> getValuesForColumn(int colIndex) throws InvalidFormatException, IOException {


        List <String> values =new ArrayList<>();
        FileInputStream file = new FileInputStream("F://ReadingDataFromExcel1(Selenium).xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1"); // providing sheet name

        int colIndex = getColIndex(sheet, "Name");
        for (int rowno = 1; rowno < sheet.getPhysicalNumberOfRows(); rowno++) {
            Row row = sheet.getRow(rowno);
            if (row != null) {
                Cell cell = row.getCell(colIndex);
                if (cell != null) {
                    String value = formatter.formatCellValue(cell);
                    values.add(value);
                }

            }


        }
        return values;

    }


    public int getColIndex(Sheet sheet , String colName){

        int index =-1;
        Row row = sheet.getRow(0);
        for (int cellIndex = 0; cellIndex < sheet.getLastCellNum(); cellIndex++) {

            Cell cell = row.getCell(cellIndex);
            if (cell != null) {
                String value = formatter.formatCellValue(cell);
                if (cellValue.equals(colName)) {

                    index =cellIndex;
                  return index;
                }

            }

        }
        return index;

    }
}

   */
}


