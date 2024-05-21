package orangeHRMprojectAddaccount;

public class Add_account_id {
	
	public static void main(String[] args) throws InterruptedException
	{
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





		// <a href="https://www.valuelabs.com/services/custom-software-development/">Software Development</a>

		By menuPin_add_employeetProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(menuPin_add_employeetProperty);
		addEmployee.click()



		String AddEmpolyeeProperty="pavankalyan"; // TestData assigned to a Variable
		By AddEmpolyeeProperty=By.id("firstName"); // Property of an element assigned to a variable
		WebElement AddempolyeeName=driver.findElement(AddEmpolyeeProperty); // Identify the element in the Current WebPage
		AddempolyeeName.sendKeys(AddEmpolyeeProperty)




		Thread.sleep(10000); // its a wait of Java Language


		By logutButtonProperty=By.linkText("Logout");
		WebElement signInButton=driver.findElement(logutButtonProperty);

		signInButton.click();




			}
		}



}
