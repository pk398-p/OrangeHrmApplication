package TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_EX3 {
	
	
	public class Annotation6
	{

	@BeforeMethod
	public void gmailApplicationLaunch() // this Method is Executed Prior to all the Test Cases
	// it is not a Functionality under Test Statements  

	{
	System.out.println(" ******* Gmail Application Launch Successfully ********" );
	}


	// Any functionality of an application which is under Test Should be always be written using the
//	     TestNG Annotation @Test
	// A Class can be Implemented with any number of Test Cases

	// If a Class contains multiple Test Cases then the Test Cases will be executed Based on the
//	    alphabetical order of the Given Test Case Names

	// If a class contains multiple Test Cases - then the Test cases will be executed based on the
//	      alphabetical Order of the Given Test case Names considering the Upper case letter of the
//	         given test case Names

	@Test(priority=1)
	public void LogInTest()
	{
	System.out.println("  LogIn Functionality Test Successfull ");
	}

	@Test(priority=2)
	public void InBoxTest()
	{
	System.out.println("  InBox Functionality Test Successfull ");
	}

	@Test(priority=3)
	public void composeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successfull ");
	}

	@Test(enabled=false) // it's a fase Test Case - this current TestCase will be ignored by the TestNG
//	    during the Test RUN
	public void DraftsMailTest()
	{
	System.out.println(" Drafts Mail Functionality Test Successfull ");
	}

	@Test(priority=5)
	public void sentMailTest()
	{
	System.out.println(" Sent Mail Functionality Test Successfull ");
	}

	@AfterMethod // This method will be executed after all the Test cases - it is also not a Functionality
	public void gmailApplicationClose()
	{
	System.out.println(" *********** Gmail Application Closed Successfully ****************");
	}

	}








	
	
	
	

}
