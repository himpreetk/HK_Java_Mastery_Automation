//Data-driven Testing - ExcelReader.java

package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
 public static String getData(String filePath, int row, int col) throws IOException {
     FileInputStream fis = new FileInputStream("C:\\Users\\raman\\eclipse-workspace\\testerr\\J_Java-Advanced-Selenium\\resources\\Testdata.xlsx");
     Workbook workbook = new XSSFWorkbook(fis);
     Sheet sheet = workbook.getSheetAt(0);
     Row dataRow = sheet.getRow(row);
     Cell cell = dataRow.getCell(col);
     workbook.close();
     return cell.getStringCellValue();
 }
}
