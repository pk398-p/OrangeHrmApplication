package WebdriverPrograms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";

	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\comTesting\\broswer123\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	
	
	
	}


	public void applicationClose()
	{
	driver.close();
	}


	public void dropDownoptingTesting() throws IOException, InterruptedException
	{


	By selectLaunguagesProperty=By.id("gtranslate_selector");
	WebElement selectLaunguagesDropDown=driver.findElement(selectLaunguagesProperty);


	

	By languagesProperty=By.tagName("option");
	List<WebElement>selectLanguages=selectLaunguagesDropDown.findElements(languagesProperty);

	int selectLanguagesCount=selectLanguages.size();
	System.out.println(" The Number of Languages in the Select Language DropDow are :- "+selectLanguagesCount);

	

	for(int arrayIndex=0;arrayIndex<selectLanguagesCount;arrayIndex++)
	{
		
	String language=selectLanguages.get(arrayIndex).getText();
	
	selectLanguages.get(arrayIndex).click();
	Thread.sleep(3000);
	
	System.out.println(language);
	
	File TSRTCScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(TSRTCScreenShot, new File("D:\\New folder\\pk program\\Automation\\src\\WebdriverPrograms\\DropdownTesting.java"+language+".png"));
	
	
	
	}




	

	}
	
	
	
	
	
	
	
	
	
	


	public static void main(String[] args) throws IOException, InterruptedException {

		DropdownTesting languages = new DropdownTesting();
	languages.applicationLauch();
	languages.dropDownoptingTesting();


	
	
	}
}