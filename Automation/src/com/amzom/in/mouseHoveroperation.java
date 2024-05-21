package com.amzom.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoveroperation {
	
	
	
	
	WebDriver driver;
	String applicationUrlAddress="https://www.amazon.in/";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\pk program\\Automation\\browserfiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize(); // Maximize the Browser

	}



	
	public void mouseHoverOperation_Services()
	{

	// <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="static"> Services  </a>
	By servicesProperty=By.id("nav-link-accountList-nav-line-1");
	WebElement services=driver.findElement(servicesProperty);

	// Creating an Object for the Actions class to work with Mouse Operation
	Actions mouseHoverOperation = new Actions(driver);
	mouseHoverOperation.moveToElement(services).build().perform();
	

	}
	public void yourwishlist()
	{

	// <a href="https://www.valuelabs.com/services/custom-software-development/">Software Development</a>

	By yourWishListtProperty=By.linkText("Your Wish List");
	WebElement amzonwishlist=driver.findElement(yourWishListtProperty);
	amzonwishlist.click();

	String amzonwishtWebPageTitle=driver.getTitle();

	System.out.println(" The title of the WebPage is :- " + amzonwishtWebPageTitle);

	}
	
	

		

	public static void main(String[] args) {
		
		
		mouseHoveroperation mouseOperation = new mouseHoveroperation();
		mouseOperation.applicationLaunch();
		mouseOperation.mouseHoverOperation_Services();
		// Actions class Object will now perform an operation to moveTo an WebElement on the Current Build - to moveTo a WebELement Services
        mouseOperation.yourwishlist();

	}

}
