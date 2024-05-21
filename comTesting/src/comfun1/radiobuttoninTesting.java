package comfun1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoninTesting {
	
	
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	}


	public void applicationClose()
	{
	driver.close();
	}
	
	public void handleRadioButtons(String groupName) {
        List<WebElement> groupRadioButtons = driver.findElements(By.name(groupName));

        for (WebElement radioButton : groupRadioButtons) {
            radioButton.click();

            System.out.println("Radio Button Group: " + groupName);
            
            for (WebElement button : groupRadioButtons) {
                String radioButtonName = button.getAttribute("value");
                String isChecked = button.getAttribute("checked");
                System.out.println(radioButtonName + " - " + isChecked);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        radiobuttoninTesting radio = new radiobuttoninTesting();
        radio.applicationLauch();
        radio.handleRadioButtons("group1");
        radio.handleRadioButtons("group2");
        radio.applicationClose();
    }
}