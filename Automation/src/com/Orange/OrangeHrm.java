package com.Orange;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrm {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\comTesting\\broswer123\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		chromeBrowser.get(applicationUrlAddress);

		// Expected Title should be - OrangeHRM
		// Expected Url Address shold have - orangehrm-4.2.0.1

		// Verification & Validation of UserName

		/*
		<input name="txtUsername" id="txtUsername" type="text">


		Element Properties
		Element Properties always contains Attributes and its Corresponding values

		 < - tag
		 input - tag name

		name - attribute / Locator
		txtUsername - value / selector

		id - attribute / locator
		txtUsername - value / selctor

		type - attribute
		text - value
		*/

		// Identification of the Element will done based on the Locator and its corresponding selector
		// Locator and selector of the Element should be found from the properties of the element by inspecting the element
		chromeBrowser.findElement(By.id("txtUsername")).sendKeys("pavankalyan");

		// <input name="txtPassword"  autocomplete="off" type="password">

		chromeBrowser.findElement(By.name("txtPassword")).sendKeys("Pavan398@");

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		chromeBrowser.findElement(By.className("button")).click();

		chromeBrowser.quit();
		

	}

}
