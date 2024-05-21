package comfun1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsrtcWebapplicantion {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\pk program\\\\comTesting\\\\broswer123\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
driver.get(applicationUrlAddress);



//Identifying the Header Block of the Webpage
//class="menu-wrap" - property of header Block

By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);


//Header Block ELement Common property is a- tag
By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
//going the the Header Block and identifying the elements of the Header Block
List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();

System.out.println(tsrtcHeaderBlockLinksCount);
//Displaying the Names of the Header Block
for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++) {

	tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();

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
}
