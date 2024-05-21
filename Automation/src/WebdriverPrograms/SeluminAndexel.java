package WebdriverPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeluminAndexel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// Expected Title should be - OrangeHRM


		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);


		String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
		System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);

		if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}

		System.out.println();
		// Expected Url Address shold have - orangehrm-4.2.0.1


		String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

		String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);

		if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
		}

		System.out.println();

		// Expected LogIN Page TEXT - LOGIN Panel

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);

		// id="logInPanelHeading"
		By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

		String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

		System.out.println(" The Acutal Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

		if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
		}

		System.out.println();

		// getting the Test Data from the External File


		FileInputStream logInTestDataFile = new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\vaidexelsheetloginpageorangeHRM.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet logInTestDataSheet = workBook.getSheet("Sheet1");

		
		int	rowCount=logInTestDataSheet.getLastRowNum();



		for(int rowIndex=1;rowIndex<=rowCount;rowIndex++) {
		

			

			Row rowofthecell=logInTestDataSheet.getRow(rowIndex);

			

		int	rowofCellCount=rowofthecell.getLastCellNum();



		Cell cell=rowofthecell.getCell(0);

		String usernametestdata=cell.getStringCellValue();



		

		By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable

		WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage

		userName.sendKeys(usernametestdata);

		

		cell=rowofthecell.getCell(1);

		String passwordtestdata=cell.getStringCellValue();

		
try {
		By passwordProperty=By.name("txtPassword");

		WebElement password=driver.findElement(passwordProperty);

		password.sendKeys(passwordtestdata);

		

		By logInButtonProperty=By.className("button");

		WebElement logInButton=driver.findElement(logInButtonProperty);

		logInButton.click();

		

		System.out.println();

		// Expected Title should be - OrangeHRM


		String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRM Application HOME Page is :- "+expected_OrangeHRMApplicationHomePageTitle);


		String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
		System.out.println(" The actual Title of the OrangeHRM Application Home Page is :- "+actual_OrangeHRMApplicationHomePageTitle);

		if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
		
		
		}
		
		
		
		String Expectrd_organeHRM_logInPageURL = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.out.println("The Expected URLAddress of the  orangeHRM Page is:-"+ Expectrd_organeHRM_logInPageURL);

		String Actual_orangeHRM_logInPageURL = driver.getCurrentUrl();
		System.out.println("The Actual URLAddress of the  orangeHRM Page is:-"+ Actual_orangeHRM_logInPageURL);

		if(Actual_orangeHRM_logInPageURL.equals(Expectrd_organeHRM_logInPageURL))
		{
			System.out.println(" URL is match:- Pass");
		}
		else
		{

			System.out.println(" URL is not match:- Fail");

		}
		if(Actual_orangeHRM_logInPageURL.equals(Expectrd_organeHRM_logInPageURL))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		Cell testResultCell=rowofthecell.createCell(2);
		testResultCell.setCellValue("Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		}

		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
		Cell testResultCell=rowofthecell.createCell(2);
		testResultCell.setCellValue("Failed to Navigate to the OrangeHRM Application HOME Page - FAIL  ");
		}
		
		
		By menuPimButtonProperty = By.id("menu_pim_viewPimModule");
		WebElement menuPimButton = driver.findElement(menuPimButtonProperty);
		menuPimButton.click();


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Validating HOME Page
		// expected Text should have - Admin

		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println(" The Expected TEXT of OrangeHRM Application Home Page is :- "+expected_OrangeHRMApplicationHomePageText);

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		// By welComeAdminProperty=By.linkText("Welcome Admin");

		By welComeAdminProperty=By.partialLinkText("Welcome");


		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		String actual_welComeAdminText=welComeAdmin.getText();

		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_welComeAdminText);

		

		FileOutputStream testResultFile = new FileOutputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\vaidexelsheetloginpageorangeHRM.xlsx");
		workBook.write(testResultFile);


		welComeAdmin.click();

		Thread.sleep(5000);

		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		/*
		By logOutProperty=By.linkText("Logout");
		OR
		*/

		By logOutProperty=By.partialLinkText("Logo"); // considering a part of the Text of the LINK as Selector
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		
		

		// LogIn Page Validation

	}
catch (Exception error) {
	System.out.println(error);
	
}

	}
		
}
}
