package exelTestingsingledata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ecxelsingledata {

	public static void main(String[] args) throws IOException {
		FileInputStream excelTestDataFile = new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\singleBook1.xlsx");

		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		// Identify the Sheet(a particular Sheet in which we have our Test Data) in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identify the Row(a particular Row) in the Sheet
		Row sheetOfaRow=testDataSheet.getRow(0);

		// Identify the Row of Cell in the Row
		Cell rowOfACell=sheetOfaRow.getCell(0);

		// get the test data from the Row of a Cell
		String excelFileTestData=rowOfACell.getStringCellValue();

		System.out.println(excelFileTestData);

		
		
		
	}

}
