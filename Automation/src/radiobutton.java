import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
	
	
	
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
	
	
	public void radioButtons() throws InterruptedException {
        By group1RadioButtonsProperty = By.name("group1");
        List<WebElement> group1RadioButtons = driver.findElements(group1RadioButtonsProperty);

        By group2RadioButtonsProperty = By.name("group2");
        List<WebElement> group2RadioButtons = driver.findElements(group2RadioButtonsProperty);

        checkRadioButtonsStatus("group1", group1RadioButtons);
        checkRadioButtonsStatus("group2", group2RadioButtons);
    }

    private void checkRadioButtonsStatus(String groupName, List<WebElement> radioButtons) throws InterruptedException {
        System.out.println("Status of Radio Buttons in " + groupName + ":");

        for (WebElement radioButton : radioButtons) {
            radioButton.click();
            Thread.sleep(2000); // Wait for 2 seconds to observe the selection

            String radioButtonName = radioButton.getAttribute("value");
            String radioButtonStatus = radioButton.getAttribute("checked");

            System.out.println("Selected Radio Button: " + radioButtonName + " - " + (radioButtonStatus != null ? "true" : "null"));
        }

        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        radiobutton radio = new radiobutton();
        radio.applicationLauch();
        radio.radioButtons();
        radio.applicationClose();
    }
}