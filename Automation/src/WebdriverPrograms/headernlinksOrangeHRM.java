package WebdriverPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headernlinksOrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();

		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		//Expected Title should be - OrangeHRM

		String expected_chromelogInPageTitle="OrangeHRM"; // Should be
		System.out.println(" The Expected Title of the chrome Home Page is :- "+expected_chromelogInPageTitle);

		String actual_chromelogInPageTitle=driver.getTitle();
		System.out.println(" The Actual Title of the chrome Home Page is :- "+actual_chromelogInPageTitle);

		



		//Expected Url Address should have - orangehrm-4.2.0.1

		String Expectrd_organeHRM_logInPageURL = "orangehrm-4.2.0.1";
		System.out.println("The Expected URLAddress of the  orangeHRM Page is:-"+ Expectrd_organeHRM_logInPageURL);

		String Actual_orangeHRM_logInPageURL = driver.getCurrentUrl();
		System.out.println("The Actual URLAddress of the  orangeHRM Page is:-"+ Actual_orangeHRM_logInPageURL);

		
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
		
		
		
		By orangeHRMHomePageHeaderBlockProperty=By.className("menu");
		WebElement orangeHRMHomePageHeaderBlock=driver.findElement(orangeHRMHomePageHeaderBlockProperty);

		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>

		//Header Block ELement Common property is a- tag
		By orageHRMHomePageHeaderBlockLinksProperty=By.tagName("a");
		//going the the Header Block and identifying the elements of the Header Block
		List<WebElement>orangeHRMHomePageHeaderBlockLinks=orangeHRMHomePageHeaderBlock.findElements(orageHRMHomePageHeaderBlockLinksProperty);
		int orangeHRMHeaderBlockLinksCount=orangeHRMHomePageHeaderBlockLinks.size();

		System.out.println(orangeHRMHeaderBlockLinksCount);
		//Displaying the Names of the Header Block
		for(int arrayIndex=0;arrayIndex<orangeHRMHeaderBlockLinksCount;arrayIndex++) {

			orangeHRMHomePageHeaderBlockLinks.get(arrayIndex).click();

			String orangeHRMtitle = driver.getTitle(); 

			System.out.println(orangeHRMtitle);

			driver.navigate().refresh(); 

			orangeHRMHomePageHeaderBlock=driver.findElement(orangeHRMHomePageHeaderBlockProperty);

			orangeHRMHomePageHeaderBlockLinks=orangeHRMHomePageHeaderBlock.findElements(orageHRMHomePageHeaderBlockLinksProperty);
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
