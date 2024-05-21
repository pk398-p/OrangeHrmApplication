import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pk {

	    public static void main(String[] args) throws IOException {
	    	WebDriver driver;

	    	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	    	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");

	    	driver = new ChromeDriver();

	    	driver.get(applicationUrlAddress);

	    	//ExcelFile For LoginPage Title And LoginPage text Validation
	    	FileInputStream orangeHrmLoginTestDatafile=new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\loginpaneltextexcel1.xlsx");

	    	XSSFWorkbook oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);

	    	XSSFSheet  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("Sheet1");

	    	int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();

	    	for(int arrayIndex=1;arrayIndex<rowcount;arrayIndex++)
	    	{
	    	XSSFRow Row=orangeHrmLoginTestDataSheet.getRow(1);

	    	    Cell rowOfcell=Row.getCell(0);

	    	    String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();

	    	    Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	    rowOfcell=Row.createCell(0);

	    	    rowOfcell.setCellValue(expected_OrangeHrmLoginPanelText);

	    	    System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);
	    	   
	    	    ////Identifying  LoginPanel
	    	   
	    	   
	    	       By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");

	    	WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

	    	String OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

	    	System.out.println(" Actual Orangehrm Login Page text is - "+OrangeHRMApplicationLogInPageLogInPanelText);

	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	Cell actual_OrangeHrmLoginPageTextActualCell=Row.createCell(2);//create cell

	    	  actual_OrangeHrmLoginPageTextActualCell.setCellValue(OrangeHRMApplicationLogInPageLogInPanelText);


	    	//validation of LoginPanel text

	    	if(OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHrmLoginPanelText))

	    	{

	    	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - Text Found - Pass ");

	    	Cell result_OfLoginPageText=Row.createCell(3);

	    	result_OfLoginPageText.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - Text Found - Pass ");

	    	}

	    	else

	    	{

	    	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - Text not Found - Fail ");

	    	Cell result_OfLoginPageText=Row.createCell(3);

	    	result_OfLoginPageText.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - Text not Found - Fail");



	    	}
	    	System.out.println();

	    	//Validation Title of Home Page

	    	Row=orangeHrmLoginTestDataSheet.getRow(1);

	    	Cell orangeHrmLoginPageTitle=Row.getCell(4);

	    	String expected_OrangeHrmLoginPageTitle=orangeHrmLoginPageTitle.getStringCellValue();

	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	orangeHrmLoginPageTitle=Row.createCell(4);

	    	orangeHrmLoginPageTitle.setCellValue(expected_OrangeHrmLoginPageTitle);

	    	System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);

	    	   String orangeHrmLoginPagetitle=driver.getTitle();

	    	Cell actual_OrangeHrmLoginPageTitle=Row.createCell(5);

	    	actual_OrangeHrmLoginPageTitle.setCellValue(orangeHrmLoginPagetitle);

	    	System.out.println(" Actual OrangeHrm Login Page title is -"+orangeHrmLoginPagetitle);


	    	if(orangeHrmLoginPagetitle.equals(expected_OrangeHrmLoginPageTitle))

	    	{

	    	System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - Pass ");

	    	Cell result_OfLoginPageTitle=Row.createCell(6);

	    	result_OfLoginPageTitle.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - Pass");

	    	}

	    	else

	    	{

	    	System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - Fail ");

	    	Cell result_OfLoginPageTitle=Row.createCell(6);

	    	result_OfLoginPageTitle.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - Text not Found - Fail ");

	    	}
	    	System.out.println();

	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	Cell orangeHrmLogin_UserName=Row.getCell(7);

	    	String userNameTestData=orangeHrmLogin_UserName.getStringCellValue();

	    	Cell orangeHrmLogin_Password=Row.getCell(8);

	    	String passwordTestData=orangeHrmLogin_Password.getStringCellValue();


	    	   By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable

	    	WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage

	    	userName.sendKeys(userNameTestData);// Operation on the Identified WebElement

	    	By passwordProperty=By.name("txtPassword");

	    	WebElement password=driver.findElement(passwordProperty);

	    	password.sendKeys(passwordTestData);

	    	By logInButtonProperty=By.className("button");

	    	WebElement logInButton=driver.findElement(logInButtonProperty);

	    	logInButton.click();

	    	System.out.println();
	    	Row=orangeHrmLoginTestDataSheet.getRow(1);

	    	Cell welcomeAdmin_HomePage=Row.getCell(9);

	    	//String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();

	    	String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();

	    	//System.out.println("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);

	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	Cell expected_HomePageWelcomeText=Row.createCell(9);

	    	expected_HomePageWelcomeText.setCellValue(expected_WelecomeAdmin_Text);



	    	try {



	    	By welComeAdminProperty=By.partialLinkText("Welcome");



	    	WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

	    	String actual_HomePageText=welComeAdmin.getText();

	    	System.out.println("Actual OrangeHrm Home Page Text - "+actual_HomePageText);



	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	Cell actual_HomePageWelcomeText=Row.createCell(10);

	    	actual_HomePageWelcomeText.setCellValue(actual_HomePageText);

	    	System.out.println("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);


	    	if(actual_HomePageText.contains(expected_WelecomeAdmin_Text))
	    	{

	    	System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page - PASS ");

	    	Cell result_OfHomePageTextValidation=Row.createCell(11);

	    	result_OfHomePageTextValidation.setCellValue(" Succusfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");



	    	  }
	    	else
	    	{

	    	System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - FAIL ");

	    	Cell result_OfHomePageTextValidation=Row.createCell(11);

	    	result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

	    	}



	    	welComeAdmin.click();

	    	Thread.sleep(5000);

	    	By logOutProperty=By.linkText("Logout");

	    	WebElement logOut= driver.findElement(logOutProperty);

	    	logOut.click();



	    	}
	    	catch (Exception pk)
	    	{


	    	   String actual_HomePageText="Login Page";

	    	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	Cell actual_HomePageWelcomeText=Row.createCell(10);

	    	actual_HomePageWelcomeText.setCellValue(actual_HomePageText);

	    	}

	    	try
	    	{

	    	Row=orangeHrmLoginTestDataSheet.getRow(1);

	    	rowOfcell=Row.getCell(1);

	    	   String  expected_OrangeHrmLoginPanelTextInvalid=rowOfcell.getStringCellValue();

	    	   

	    	    System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelTextInvalid);

	    	    Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	rowOfcell=Row.createCell(1);

	    	rowOfcell.setCellValue(expected_OrangeHrmLoginPanelTextInvalid);

	    	By orangeHrmLoginPageTextProperty=By.id("spanMessage");

	    	WebElement  orangeHrmLoginPageText=driver.findElement(orangeHrmLoginPageTextProperty);

	    	   String actual_orangehrmLoginPage=orangeHrmLoginPageText.getText();

	    	   

	    	   System.out.println(" Actual Orangehrm Login Page text is - "+actual_orangehrmLoginPage);

	    	   

	    	  // Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

	    	if(expected_OrangeHrmLoginPanelTextInvalid.equals(actual_orangehrmLoginPage))
	    	{

	    	 System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - Text Not Found - Fail ");

	    	 Cell result_OfHomePageTextValidation=Row.createCell(11);

	    	 result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application Home Page -Text Not Found - Fail ");

	    	   

	    	 //Tacking Screenshot of invalidDatas Login Page

	    	 File orangehrmApplicationInvalidCredianial_ScreenShort =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	    	 FileUtils.copyFile(orangehrmApplicationInvalidCredianial_ScreenShort,new File("./src/com/OrangeHrmInvalidCrediantialsScreenshorts/InvalidCredentials"+userNameTestData+" "+passwordTestData+".png"));
	    	 }
	    	else
	    	{

	    	    System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page -Text  Found - Pass ");

	    	Cell result_OfHomePageTextValidation=Row.createCell(11);

	    	result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - Text Found - Pass ");

	    	   

	    	    }

	    	}

	    	    catch (Exception kp)
	    	    {


	    	}


	    	FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\loginpaneltextexcel1.xlsx");

	    	oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);
	    	}

	    	}

	    	}
