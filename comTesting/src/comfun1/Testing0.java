package comfun1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing0 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\comTesting\\broswer123\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		String applicationUrlAddress="http://google.com";

		driver.get(applicationUrlAddress);
		
		String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(ApplicationUrlAddress);
		
		


	}

}
