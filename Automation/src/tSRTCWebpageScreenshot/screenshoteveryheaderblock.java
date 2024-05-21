package tSRTCWebpageScreenshot;

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

public class screenshoteveryheaderblock {
	
	
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	By tsrtcHomePageHeaderBlockLinksProperty;
	By tsrtcHomePageHeaderBlockProperty;
	int tsrtcHeaderBlockLinksCount;
	List<WebElement>tsrtcHomePageHeaderBlockLinks;
	WebElement tsrtcHomePageHeaderBlock;
	File TSRTCScreenShot;
	
	
	public void TSRTCapplicantsLanch ()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();
		
	
	
	}
	
public void TSRTCloginvalid()
{
	
	tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
	WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>

	//Header Block ELement Common property is a- tag
	tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
	//going the the Header Block and identifying the elements of the Header Block
	tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
	tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();

	System.out.println(tsrtcHeaderBlockLinksCount);
	//Displaying the Names of the Header Block
}	
	
public void tSRTCHeaderblock() throws IOException
{
	for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++) {

	String	tsrtcHomePageHeaderBlocklinknames=tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();
		tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();
		
		TSRTCScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// the captured screenShot should be save to the location of the Project
		FileUtils.copyFile(TSRTCScreenShot, new File("D:\\New folder\\pk program\\Automation\\src\\tSRTCWebpageScreenshot\\"+tsrtcHomePageHeaderBlocklinknames+".png"));
		
		

		String actual_WebPageTitle=driver.getTitle();
		System.out.println(" The Title of the Navigated WebPage is:-  "+actual_WebPageTitle);

		String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Current Url Address of the Navigated WebPage is:-  "+actual_WebPageCurrentUrlAddress);
		
		String Expectrd_TSRTC_PageTitle = driver .getCurrentUrl();
		
		System.out.println("The Expected URLTitle of the  TSRTC Page is:-"+ Expectrd_TSRTC_PageTitle);
		
		if(actual_WebPageCurrentUrlAddress.equals(Expectrd_TSRTC_PageTitle))
		{
			System.out.println("Title of the URL is match:- Pass");
		}
		else
		{

			System.out.println("Title of the URL is not match:- Fail");

		}
		
		
	        System.out.println();
		
		driver.navigate().back(); // Back main method used because the periovous delcared in array list data stored will be cleared

		tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

		tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
				
		
		
			
	}

}
	


	public static void main(String[] args) throws IOException {
		
		screenshoteveryheaderblock TSRTC = new screenshoteveryheaderblock();
		TSRTC.TSRTCapplicantsLanch();
		TSRTC.TSRTCloginvalid();
		TSRTC.tSRTCHeaderblock();		

	}

}
