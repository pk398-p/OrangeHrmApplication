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

public class Classtestingloginpanelexcel {

	public static void main(String[] args) throws IOException {
		
			WebDriver driver;

		String application_URL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");

		driver=new ChromeDriver();



		driver.get(application_URL);
		
		

  FileInputStream file=new FileInputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\loginpaneltextexcel1.xlsx");
  XSSFWorkbook workBook=new XSSFWorkbook(file);
  XSSFSheet sheet=workBook.getSheet("Sheet1");

		   int rowcount=sheet.getLastRowNum();

		 

		   for(int rowindex=1;rowindex<=rowcount;rowindex++)

		   {

		    By logInPanelProperty=By.id("logInPanelHeading");

		    WebElement loginPanel=driver.findElement(logInPanelProperty);

		    String actual_OHRM_loginpageText=loginPanel.getText();

		   

		    String expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";

		    System.out.println("The expected text of Orange HRM Application Login Page Is:-"+ expected_OrangeHRMApplicationLoginPageText);

		   

		 

		  Row row=sheet.getRow(rowindex);

		  int rowofcellCount= row.getLastCellNum();



		  Cell Expected_LogInPageText= row.createCell(7);

		  Expected_LogInPageText.setCellValue(expected_OrangeHRMApplicationLoginPageText);



		  Cell Actual_LogInPageText=row.createCell(8);

		  Actual_LogInPageText.setCellValue(actual_OHRM_loginpageText);

		 



		   String actual_OrangeHRMApplicationLoginPageText=loginPanel.getText();



		   System.out.println("The actual text of Orange HRM Application Login Page Is:-"+ actual_OrangeHRMApplicationLoginPageText);

		   

		   if(actual_OHRM_loginpageText.equals(expected_OrangeHRMApplicationLoginPageText))

		   {

		    System.out.println("Orange HRM Application Login Page is as expected - Pass ");

		    Cell Text_Test_Result=row.createCell(3);

		    Text_Test_Result.setCellValue("Orange HRM Application Login Page is as expected - Pass");

		   }

		   else

		   {

		    System.out.println("Orange HRM Application Login Page is as Not expected - Fail ");

		    Cell Text_Test_Result=row.createCell(3);

		    Text_Test_Result.setCellValue("Orange HRM Application Login Page is as Not expected - Fail ");

		   }

		   

		   String expected_OrangeHRMApplicationLoginPageTitle="orangeHRM";

		   System.out.println("The expected text of Orange HRM Application Login Page title Is:-"+ expected_OrangeHRMApplicationLoginPageTitle);

		   

		   

		   Cell Expected_LogInPageTitle= row.createCell(4);

		   Expected_LogInPageTitle.setCellValue(expected_OrangeHRMApplicationLoginPageTitle);



		   String actual_OrangeHRMApplicationLoginPageTitle="OrangeHRM";

		   System.out.println("The actual text of Orange HRM Application Login Page title Is:-"+ actual_OrangeHRMApplicationLoginPageTitle);

		   

		   Cell Actual_LogInPageTitle=row.createCell(5);

		   Actual_LogInPageTitle.setCellValue(actual_OrangeHRMApplicationLoginPageTitle);

	



		     if(actual_OrangeHRMApplicationLoginPageTitle.equals(expected_OrangeHRMApplicationLoginPageTitle))

		      {

		       System.out.println("Title of OrangeHRM Loginpage title is Mateched:- PASS");

		       Cell Text_Test_Result=row.createCell(6);

		       Text_Test_Result.setCellValue("OrangeHRM Application Login Page title is as expected - Pass");



		     }

		    else

		     {

		       System.out.println("Title of OrangeHRM Loginpage title is Not Matched:- Fail");

		       Cell Text_Test_Result=row.createCell(6);

		       Text_Test_Result.setCellValue("OrangeHRM Application Login Page title is as Not expected - Fail ");

		     }



		        System.out.println();

		        

		        

		        

		        

		        

		        int	rowCount=sheet.getLastRowNum();



                for(int rowIndex=1;rowIndex<=rowCount;rowIndex++) {

	

	            Row rows=sheet.getRow(rowIndex);

	

                int	rowofCellCount=rows.getLastCellNum();





	            Cell cell=rows.getCell(7);

	            String usernametestdata=cell.getStringCellValue();

	            	        
try {
		        

		        By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable

		        WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage

		        userName.sendKeys(usernametestdata);



		        cell=rows.getCell(8);

		        String passwordtestdata=cell.getStringCellValue();

		      

		        By passwordProperty=By.name("txtPassword");

                WebElement password=driver.findElement(passwordProperty);

                password.sendKeys(passwordtestdata);

                

		         By logInButtonProperty=By.className("button");

		         WebElement logInButton=driver.findElement(logInButtonProperty);

		         logInButton.click();

		         

		         String expected_OrangeHRMHomepagetext="Admin";

		         System.out.println(" The Expected title of the OrangeHRM Home Page is :- "+expected_OrangeHRMHomepagetext);

		         Cell expected_homepagetext=rows.createCell(9);

		         expected_homepagetext.setCellValue(expected_OrangeHRMHomepagetext);







		         String actual_OrangeHRMHomePagetext=driver.getTitle();

		         System.out.println(" The Actual title of the OrangeHRM Application Login Page is :- "+actual_OrangeHRMHomePagetext);

		         Cell actual_homepagetext=rows.createCell(10);

		         actual_homepagetext.setCellValue(actual_OrangeHRMHomePagetext);



		         

		         //System.out.println(" The Actual title of the OrangeHRM Application Login Page is :- "+actual_OrangeHRMHomePagetext);

		         

		         if(actual_OrangeHRMHomePagetext.equals(expected_OrangeHRMHomepagetext))

		        {

		           System.out.println("text of OrangeHRM Homepage is Matched:- Pass");

		           Cell Text_Test_Result=rows.createCell(11);

		     

		           Text_Test_Result.setCellValue(" Pass");



		        }

		      else

		       {

		          System.out.println("Title of OrangeHRM Homepage text is Not Matched:- Fail");

		          Cell Text_Test_Result=rows.createCell(11);

		          Text_Test_Result.setCellValue(" Fail");



		       }



		       System.out.println();

		
		         FileOutputStream testResult=new FileOutputStream("D:\\New folder\\pk program\\Automation\\src\\com\\exelfiles\\loginpaneltextexcel1.xlsx");

		         workBook.write(testResult);

		       }
                
		       
		   
                catch (Exception error) {
                	System.out.println(error);
                	
                }

		   }
		   }
	}
}
		

	

