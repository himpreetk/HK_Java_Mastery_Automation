package packageJavaFileHandling;


import java.io.*;
import java.util.Properties;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.List;

public class JavaFileHandling {
    public static void main(String[] args) {
        // Reading a text file
        readTextFile("testdata.txt");
        
        // Reading a CSV file
        readCSVFile("testdata.csv");
        
        // Reading an Excel file
        readExcelFile("testdata.xlsx");
        
        // Reading a properties file
        readPropertiesFile("config.properties");
    }

    // Method to read a text file
    public static void readTextFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\raman\\eclipse-workspace\\testerr\\E_Java-File-Handling\\Resources\\testdata.txt"))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Text File Line: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading text file: " + e.getMessage());
        }
    }

    // Method to read a CSV file
    public static void readCSVFile(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\raman\\eclipse-workspace\\testerr\\E_Java-File-Handling\\Resources\\testdata.csv"))) 
        {
            List<String[]> rows = reader.readAll();
            for (String[] row : rows) {
                System.out.println("CSV Row: " + String.join(", ", row));
            }
        } catch (IOException | CsvException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

    // Method to read an Excel file
    public static void readExcelFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(new File("C:\\Users\\raman\\eclipse-workspace\\testerr\\E_Java-File-Handling\\Resources\\testdata.xlsx"));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + " | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading Excel file: " + e.getMessage());
        }
    }

    // Method to read a properties file
    public static void readPropertiesFile(String filePath) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\raman\\eclipse-workspace\\testerr\\E_Java-File-Handling\\Resources\\config.properties")) {
            Properties properties = new Properties();
            properties.load(fis);
            System.out.println("Property Value: " + properties.getProperty("url"));
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}
