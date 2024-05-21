package comfun1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

			WebDriver driver;
			String applicationUrlAddress="https://www.osmania.ac.in/";
			

			public void applicationLauch()
			{

			System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();

			driver.get(applicationUrlAddress);

			driver.manage().window().maximize();

			//Thread.sleep(10000);

			}


			public void applicationClose()
			{
			driver.close();
			}


		

	}


