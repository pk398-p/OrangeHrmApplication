package comAddEmp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_emp {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver ();

	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

	String orangeHRMHomePageTitle=driver.getTitle();




	System.out.println(" The title of the OrangeHRM Application Home Page is :- "+orangeHRMHomePageTitle);

	String expected_chromeHomePageTitle="OrangeHRM"; // Should be
	System.out.println(" The Expected Title of the chrome Home Page is :- "+expected_chromeHomePageTitle);

	String actual_chromeHomePageTitle=driver.getTitle();
	System.out.println(" The Actual Title of the chrome Home Page is :- "+actual_chromeHomePageTitle);

	if(actual_chromeHomePageTitle.equals(expected_chromeHomePageTitle))
	{
	System.out.println("The chrome Home page Title Matched - PASS ");

	}
	else
	{
	System.out.println("The chrome Home page Title NOT Matched - FAIL ");
	}

	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

	String Expectrd_organeHRM_HomePageTitle = "OrangeHRM";
	System.out.println("The Expected URLTitle of the  orangeHRM Page is:-"+ Expectrd_organeHRM_HomePageTitle);

	String Actual_orangeHRM_HomePageTitle = driver.getTitle();
	System.out.println("The Actual URLTitle of the  orangeHRM Page is:-"+ Actual_orangeHRM_HomePageTitle);

	if(Actual_orangeHRM_HomePageTitle.contains(Expectrd_organeHRM_HomePageTitle))
	{
		System.out.println("Title of the URL is match:- Pass");
	}
	else
	{

		System.out.println("Title of the URL is not match:- Fail");

	}








	String userNameTestData="pavankalyan"; // TestData assigned to a Variable
	By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
	WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
	userName.sendKeys(userNameTestData);// Operation on the Identified WebElement

	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

	String passwordTestData="Pavan398@";
	By passwordProperty=By.name("txtPassword");
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);

	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();



	By menuPinProperty=By.id("menu_pim_viewPimModule");
	WebElement menuPin=driver.findElement(menuPinProperty);

	// Creating an Object for the Actions class to work with Mouse Operation
	Actions mouseHoverOperation = new Actions(driver);
	mouseHoverOperation.moveToElement(menuPin).build().perform();





	// <a href="https://www.valuelabs.com/services/custom-software-development/">Software Development</a>

	By menuPin_add_employeetProperty=By.id("menu_pim_addEmployee");
	WebElement addEmployee=driver.findElement(menuPin_add_employeetProperty);
	addEmployee.click();



	String AddEmpolyeeProperty="pavankalyan"; // TestData assigned to a Variable
	By AddEmpolyeePropertys=By.id("firstName"); // Property of an element assigned to a variable
	WebElement AddempolyeeName=driver.findElement(AddEmpolyeePropertys); // Identify the element in the Current WebPage
	AddempolyeeName.sendKeys(AddEmpolyeeProperty);

	String AddEmpolyeelistProperty="pavankalyan"; 
	By AddEmpolyeelistPropertys=By.id("menu_pim_viewEmployeeList");
	WebElement AddempolyeelistName=driver.findElement(AddEmpolyeelistPropertys); 
	
	
	AddempolyeelistName.click();

	By EmpolyeeTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form");
	WebElement EmpolyeewebTable=driver.findElement(EmpolyeeTableProperty);
	
	By Emp_rowProperty=By.tagName("td");
	List<WebElement>Emp_TableRows=EmpolyeewebTable.findElements(Emp_rowProperty);
	
	 for (WebElement row : Emp_TableRows) {
         List<WebElement> cells = row.findElements(By.tagName("td"));
         for (WebElement cell : cells) {
             System.out.print(cell.getText() + " | ");
         }
         System.out.println();
     }

     // Close the browser
     driver.quit();


}


}








