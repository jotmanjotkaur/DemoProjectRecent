package Auto1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadDataExcel2 {
    public static void main(String args[]) throws IOException, IOException {

        FileInputStream fis = new FileInputStream("F://ReadingDataFromExcel1(Selenium).xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis); // XSSFWorkbook for .xlsx file
      //  XSSFSheet sheet = workbook.getSheetAt("Sheet1"); // open sheet 1
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        Iterator<Row> rowIterator = sheet.iterator();

        // Traversing over each row of XLSX file
        while (rowIterator.hasNext())
        {
            Row row = rowIterator.next();

            if(row.getRowNum()!=0) // skip title row
            {
                Iterator  cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {

                    Cell cell = (Cell) cellIterator.next();

                    System.out.print(cell.getStringCellValue() + "\t");
                }

            }
        }
    }
}

