package TestNG1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class testNG_rowofthecell extends basicTest
{
	
	  @Test(priority=1, description="Capturing First Column City Names from the WebTable")
	    public void capturingFirstColumnCityNames() throws IOException {

	        // Define Excel file path
	    	FileInputStream citynames = new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\dataandtime.xlsx");

	        // Create a new Workbook
	       XSSFWorkbook  workbook = new XSSFWorkbook();
	        // Create a Sheet named "City Names"
	        XSSFSheet sheet = workbook.createSheet("City Names");

	        // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	       
	        
	        String xpathExpressionPart1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	        String xpathExpressionPart2 = "]/td[1]";

	        for (int rowIndex = 1; rowIndex <= 36; rowIndex++) {
	            By cityNameProperty = By.xpath(xpathExpressionPart1 + rowIndex + xpathExpressionPart2);
	            WebElement cityNameElement = driver.findElement(cityNameProperty);
	            String cityNameText = cityNameElement.getText();

	            // Create a new Row
	            Row row = sheet.createRow(rowIndex - 1);
	            // Create a new Cell and set the city name as its value
	            org.apache.poi.ss.usermodel.Cell cell = row.createCell(0);
	            cell.setCellValue(cityNameText);
	        }
	 
	        // Write the Workbook to the file
	        try (FileOutputStream fileOut = new FileOutputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\dataandtime.xlsx")) {
	            workbook.write(fileOut);
	        

	        // Close the Workbook to release resources
	        workbook.close();
	    }
	}
		
	}
	
	
	
	
	


