package comfun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orangeHRM_add_employee {

		
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");

				ChromeDriver driver = new ChromeDriver ();

				driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

				String orangeHRMHomePageTitle=driver.getTitle();


				//url verfy

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

               	By menuPin_add_employeetProperty=By.id("menu_pim_addEmployee");
				WebElement addEmployee=driver.findElement(menuPin_add_employeetProperty);
				addEmployee.click();



				String AddEmpolyeeProperty="pavan"; // TestData assigned to a Variable
				By AddempolyeeProperty=By.id("firstName"); // Property of an element assigned to a variable
				WebElement AddempolyeeName=driver.findElement(AddempolyeeProperty); // Identify the element in the Current WebPage
				AddempolyeeName.sendKeys(AddEmpolyeeProperty);


				String expected_empoyleeFristempolyee="pavan"; // Should be
				System.out.println(" The Expected Name empoylee Frist empolyee is :- "+expected_empoyleeFristempolyee);

				String actual_empoyleeFristempolyee = AddEmpolyeeProperty;
				System.out.println(" The Actual Name empoylee Frist empolyee is :- "+actual_empoyleeFristempolyee);

				if(actual_empoyleeFristempolyee.equals(expected_empoyleeFristempolyee))
				{
				System.out.println("The empoylee Frist empolyee is Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee Frist empolyee is NOT Matched - FAIL ");
				}

		

				String AddEmpolyee_middle_nameProperty="kalyan"; // TestData assigned to a Variable
				By MiddleNameProperty=By.id("middleName"); // Property of an element assigned to a variable
				WebElement MiddleName=driver.findElement(MiddleNameProperty); // Identify the element in the Current WebPage
				MiddleName.sendKeys(AddEmpolyee_middle_nameProperty);


				String expected_middleNameempolyee="kalyan"; // Should be
				System.out.println(" The Expected Name empoylee Frist empolyee is :- "+expected_middleNameempolyee);

				String actual_middleNametempolyee = AddEmpolyee_middle_nameProperty;
				System.out.println(" The Actual Name empoylee Frist empolyee is :- "+actual_middleNametempolyee);

				if(actual_middleNametempolyee.equals(expected_middleNameempolyee))
				{
				System.out.println("The empoylee middle name empolyee is Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee middle name empolyee is NOT Matched - FAIL ");
				}
		
				
				String AddEmpolyee_last_nameProperty="suda"; // TestData assigned to a Variable
				By lastNameProperty=By.id("lastName"); // Property of an element assigned to a variable
				WebElement lastName=driver.findElement(lastNameProperty); // Identify the element in the Current WebPage
				lastName.sendKeys(AddEmpolyee_last_nameProperty);


				String expected_lastNameempolyee="suda"; // Should be
				System.out.println(" The Expected Name empoylee last empolyee is :- "+expected_lastNameempolyee);

				String actual_lastNametempolyee = expected_lastNameempolyee;
				System.out.println(" The Actual Name empoylee last empolyee is :- "+actual_lastNametempolyee);

				if(actual_lastNametempolyee.equals(expected_lastNameempolyee))
				{
				System.out.println("The empoylee last name empolyee is Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee last name empolyee is NOT Matched - FAIL ");
				}
				
				
			 // TestData assigned to a Variable
				By EmpolyeeId_Property=By.id("employeeId"); // Property of an element assigned to a variable
				WebElement EmpolyeeId=driver.findElement(EmpolyeeId_Property); // Identify the element in the Current WebPage
				String EMP=EmpolyeeId.getAttribute("Value");
				System.out.println("the emp id is-"+EMP);


				By saveButtonProperty=By.id("btnSave");
				WebElement saveButton=driver.findElement(saveButtonProperty);
				saveButton.click();
				
				By savefristnameProperty=By.id("personal_txtEmpFirstName");
				WebElement savefristname=driver.findElement(savefristnameProperty);
				String EMPfristname=savefristname.getAttribute("Value");
				System.out.println("the emp fristname is-"+EMPfristname);
				
				String expected_saveFristempolyee="pavan"; // Should be
				System.out.println(" The Expected Name empoylee Frist empolyee is :- "+expected_saveFristempolyee);

				String actual_saveFristempolyee = EMPfristname;
				System.out.println(" The Actual Name empoylee Frist empolyee is :- "+actual_saveFristempolyee);

				if(actual_empoyleeFristempolyee.equals(expected_empoyleeFristempolyee))
				{
				System.out.println("The empoylee Frist empolyee save is  Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee Frist empolyee save is NOT Matched - FAIL ");
				}
				
				
				By savemiddlenameProperty=By.id("personal_txtEmpMiddleName");
				WebElement savemiddletname=driver.findElement(savemiddlenameProperty);
				String EMPmiddlename=savemiddletname.getAttribute("Value");
				System.out.println("the emp middle name is-"+EMPmiddlename);
				
				
				String expected_middleName="kalyan"; // Should be
				System.out.println(" The Expected save Name empoylee Frist empolyee is :- "+expected_middleName);

				String actual_middleName = EMPmiddlename;
				System.out.println(" The Actual save Name empoylee Frist empolyee is :- "+actual_middleName);

				if(actual_middleNametempolyee.equals(expected_middleNameempolyee))
				{
				System.out.println("The empoylee middle name save empolyee is Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee middle name save empolyee is NOT Matched - FAIL ");
				}
				
				
				By savelastnameProperty=By.id("personal_txtEmpLastName");
				WebElement savelasttname=driver.findElement(savelastnameProperty);
				String EMPlastname=savelasttname.getAttribute("Value");
				System.out.println("the emp lastname is-"+EMPlastname);
				
				
				String expected_Namelast="suda"; // Should be
				System.out.println(" The Expected save Name empoylee Frist empolyee is :- "+expected_Namelast);

				String actual_Namelast = EMPlastname;
				System.out.println(" The Actual save Name empoylee Frist empolyee is :- "+actual_Namelast);

				if(actual_Namelast.equals(expected_Namelast))
				{
				System.out.println("The empoylee middle name save empolyee is Matched - PASS ");

				}
				else
				{
				System.out.println("The empoylee middle name save empolyee is NOT Matched - FAIL ");
				}
				
				By saveEmpolyeeId_Property=By.id("personal_txtEmployeeId"); // Property of an element assigned to a variable
				WebElement saveEmpolyeeId=driver.findElement(saveEmpolyeeId_Property); // Identify the element in the Current WebPage
				String EMPsaved=saveEmpolyeeId.getAttribute("Value");
				System.out.println("the emp id is-"+EMPsaved);
				
				
				
				

					}
				}

