package reddiffmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class full_name {
	WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");

		

		WebDriver driver=new ChromeDriver();

		String applicationredifurl =("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.get(applicationredifurl);
		
	//	<input type="text" onblur="fieldTrack(this);" name="namea28c121c" value="" style="width:185px;" maxlength="61">
	//	<input type="text" name="logina28c121c" value="" style="width:185px;" maxlength="30" onclick="javascript:UncheckAllOptions();" onfocus="javascript:checkFullName(document.forms[0].namea28c121c.value);" onblur="fieldTrack(this);">
//<td valign="top">Choose a Rediffmail ID</td>

	By createAccountProperty=By.linkText("Create a new account");
	WebElement redifflist=driver.findElement(createAccountProperty);
	redifflist.click();
	
	By RediffcreateAccountProperty=By.xpath("//input[@type='text']");

	WebElement FullName=driver.findElement(RediffcreateAccountProperty);
	FullName.sendKeys("Pavan kalyan");
	
	By RediffcreateAccountEmailProperty=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]");

	WebElement Email=driver.findElement(RediffcreateAccountEmailProperty);
	Email.sendKeys("sudapavankalyan5@gmail.com");
	

}
}