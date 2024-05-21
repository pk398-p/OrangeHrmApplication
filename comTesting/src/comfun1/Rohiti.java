package comfun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rohiti {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\comTesting\\broswer123\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		String expected_titelis=" OrangeHRM ";
		System.out.println("the titel of the orangehrm is"+ expected_titelis);
		
		  String Actual_titelis=driver.getTitle();
		  System.out.println("the titel of the orangehrm is"+Actual_titelis);
		  
		String expected_orangehrm_is =("orangehrm-4.2.0.1");
		  System.out.println("the Url of the orangehrm application is "+expected_orangehrm_is);
		  
		 String actual_orangehrm_URLis =driver.getCurrentUrl();
		  System.out.println("the url of the orangehrm application is"+ actual_orangehrm_URLis);
		  
		  if(actual_orangehrm_URLis.contains(expected_orangehrm_is))
		  {
			  System.out.println("if the current url is contain pass "+expected_orangehrm_is);
		  }
		  
		  else 
		  {
			System.out.println("if the current url is contains fail"+actual_orangehrm_URLis);  
		  }
		  //<input name="txtUsername" id="txtUsername" type="text">
		   String usernamedatatype="pavankalyan";
		   By usernameproperty= By.id("txtUsername");
		    WebElement username=driver.findElement(usernameproperty);
		    username.sendKeys(usernamedatatype);
		    
		    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		    String passwordtestdata=("Pavan398@");
		     By passwordproperty=By.id("txtPassword");
		    WebElement password=driver.findElement(passwordproperty);
		    password.sendKeys(passwordtestdata);
		    
		    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		  By  loginproperty = By.id("btnLogin");
		   WebElement loginbutton=driver.findElement(loginproperty);
		   loginbutton.click();
		   
		  String expected_titelofhomepageis=("OrangeHRM");
		  System.out.println("the titel of the orangehrm home page is"+expected_titelofhomepageis);
		  
		 String Actual_titelofthehomepage=driver.getTitle();
		 System.out.println("the titel of the orangeappliaction is "+ Actual_titelofthehomepage);

		 //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		 
		  By welcome= By.id("welcome");
		   WebElement welcomelink =driver.findElement(welcome);
		  welcomelink.click();
		  
		  Thread.sleep(2000);
		  
		 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		 By logoutlink= By.linkText("Logout");
		WebElement logoutlinks=driver.findElement(logoutlink);
		logoutlinks.click();
		 
		String expected_titel_oranngehrm ="OrangeHRM";
		System.out.println(" The Expected Title of the chrome Home Page is :- "+expected_titel_oranngehrm);

		
		String actual_titel_orangehrm = driver.getTitle();
		System.out.println("the titel of the orange application is "+actual_titel_orangehrm);
		if(expected_titel_oranngehrm.equals(actual_titel_orangehrm))
		{
			System.out.println("the titel of the orange application is pass");
		}
		else
		{
			
		System.out.println("the titel of the orange application is fail");
		}
		
		
		
		
	}

}
