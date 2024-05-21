package WebdriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver ();

driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
//Expected Title should be - OrangeHRM

String expected_chromelogInPageTitle="OrangeHRM"; // Should be
System.out.println(" The Expected Title of the chrome Home Page is :- "+expected_chromelogInPageTitle);

String actual_chromelogInPageTitle=driver.getTitle();
System.out.println(" The Actual Title of the chrome Home Page is :- "+actual_chromelogInPageTitle);

if(actual_chromelogInPageTitle.equals(expected_chromelogInPageTitle))
{
System.out.println("The chromeBrowser in this login page Title Matched - PASS ");

}
else
{
System.out.println("The chromeBrowser in this login page Title NOT Matched - FAIL ");
}




//Expected Url Address should have - orangehrm-4.2.0.1

String Expectrd_organeHRM_logInPageURL = "orangehrm-4.2.0.1";
System.out.println("The Expected URLAddress of the  orangeHRM Page is:-"+ Expectrd_organeHRM_logInPageURL);

String Actual_orangeHRM_logInPageURL = driver.getCurrentUrl();
System.out.println("The Actual URLAddress of the  orangeHRM Page is:-"+ Actual_orangeHRM_logInPageURL);

if(Actual_orangeHRM_logInPageURL.contains(Expectrd_organeHRM_logInPageURL))
{
	System.out.println(" URL is match:- Pass");
}
else
{

	System.out.println(" URL is not match:- Fail");

}

//Automate login
//UserName

String userNameTestData="pavankalyan"; // 
By userNameProperty=By.id("txtUsername"); 
WebElement userName=driver.findElement(userNameProperty); 
userName.sendKeys(userNameTestData);
// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
//Password

String passwordTestData="Pavan398@";
By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(passwordTestData);

// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
//Button

By logInButtonProperty=By.className("button");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();

String expected_AfterchromelogInPageTitle="OrangeHRM"; // Should be
System.out.println(" The Expected Title of the chrome Home Page is :- "+expected_AfterchromelogInPageTitle);

String actual_AfterchromelogInPageTitle=driver.getTitle();
System.out.println(" The Actual Title of the chrome Home Page is :- "+actual_AfterchromelogInPageTitle);

if(actual_AfterchromelogInPageTitle.equals(expected_AfterchromelogInPageTitle))
{
System.out.println("The chromeBrowser in this After login page Title Matched - PASS ");

}
else
{
System.out.println("The chromeBrowser in this After login page Title NOT Matched - FAIL ");
}



By adminButtonProperty=By.linkText("Admin");
WebElement adminInButton=driver.findElement(adminButtonProperty);
adminInButton.click();

By adminProperty=By.linkText("Admin");
WebElement signIn=driver.findElement(adminProperty);

// Getting the Text of the WebElement Sign In
String adminText=signIn.getText();
System.out.println(" The text of the WebElement SignIn Is :- "+adminText);


///get WelcomeAdmin get text 

String expectedAdminText = "Admin";
System.out.println("The expected welcomeAdminButton Text is :-" +expectedAdminText );

By welcomeAdminproerty = By.id("welcome");
WebElement WelcomeAdminText = driver.findElement(welcomeAdminproerty);
String acutcaldAdminText =  WelcomeAdminText.getText();
System.out.println("The expected welcomeAdminButton Text is :-" +acutcaldAdminText );
if (acutcaldAdminText.contains(expectedAdminText)) {
	System.out.println("The AcutalText of the WelcomeAdmin Dropdrownbox is found - Pass");
}
else {
	System.out.println("The ExpectedText of the WelcomeAdmin Dropdrownbox is not found - Fail");

}


//Automate WelCome Admin
//WelcomeButton

By WelcomeAdminButtonProperty = By.id("welcome");
WebElement WelcomeButton = driver.findElement(WelcomeAdminButtonProperty);
WelcomeButton.click();


//Automate LogOut

Thread.sleep(10000); // its a wait of Java Language


By logutButtonProperty=By.linkText("Logout");
WebElement logoutInButton=driver.findElement(logutButtonProperty);

logoutInButton.click();

//After logout return to Homepage Expected Title should be - OrangeHRM

String expected_AfterlogoutchromelogInPageTitle="OrangeHRM"; // Should be
System.out.println(" The Expected Title of the chrome Home Page after logout is :- "+expected_AfterlogoutchromelogInPageTitle);

String actual_afterlogoutchromelogInPageTitle=driver.getTitle();
System.out.println(" The Actual Title of the chrome Home Page after logout is :- "+actual_afterlogoutchromelogInPageTitle);

if(actual_afterlogoutchromelogInPageTitle.equals(expected_AfterlogoutchromelogInPageTitle))
{
System.out.println("The chromeBrowser in this After logout return to login page Title Matched - PASS ");

}
else
{
System.out.println("The chromeBrowser in this after logout return to login page Title NOT Matched - FAIL ");
}


//After logout Expected Url Address should have - orangehrm-4.2.0.1

String Expectrd_AfterorganeHRM_logInPageURL = "orangehrm-4.2.0.1";
System.out.println("The Expected after logout URLAddress of the  orangeHRM Page is:-"+ Expectrd_AfterorganeHRM_logInPageURL);

String Actual_afterorangeHRM_logInPageURL = driver.getCurrentUrl();
System.out.println("The Actual after logout  URLAddress of the  orangeHRM Page is:-"+ Actual_afterorangeHRM_logInPageURL);

if(Actual_afterorangeHRM_logInPageURL.contains(Expectrd_AfterorganeHRM_logInPageURL))
{
	System.out.println("After logout URL is match:- Pass");
}
else
{

	System.out.println("After logout URL is not match:- Fail");

}

//After logout in Home page there is login panel in text

String expectedloginpanelText = "LOGIN Panel";
System.out.println("The Acutal after logout return homepage there is login panel Text is :-" +expectedloginpanelText );

By welcomeloginpanelproerty = By.id("logInPanelHeading");
WebElement WelcomeloginpanelText = driver.findElement(welcomeloginpanelproerty);

String acutcalloginpanelText =  WelcomeloginpanelText.getText();
System.out.println("The expected after logout return homepage there is login panel Text is :-" +acutcalloginpanelText );

if (acutcalloginpanelText.equals(expectedloginpanelText)) {
	System.out.println("The AcutalText of the LOGIN panelText is found - Pass");
}
else {
	System.out.println("The ExpectedText of the LOGIN panelText is not found - Fail");

}



driver.quit();


	}
}



