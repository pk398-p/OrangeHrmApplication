package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class basicTest {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	@BeforeTest
	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);

	}

	@AfterTest
	public void applicationClose()
	{
	driver.close();
	}

	}


