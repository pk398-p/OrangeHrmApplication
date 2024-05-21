package TestNG1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class timeandDate_rows extends basicTest
{
	
	@Test
	public void capturingCompleWebTableData() throws IOException
	{
		
		FileInputStream testDataFile = new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\dataandtime.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// to goto every Row of all its Corresponding Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableDataText=webTableData.getText();
	
	Row row = testDataSheet.createRow(rowOfCellIndex);
	Cell cell = row.createCell(rowOfCellIndex);
	cell.setCellValue(webTableDataText);
	
	
	System.out.print(webTableDataText+" | ");
	}
	System.out.println();
	}

		FileOutputStream  TestResults=new FileOutputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\dataandtime.xlsx");
		workBook.write(TestResults);
	}

	}

