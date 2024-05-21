package TestNG1;

import org.testng.annotations.Test;

public class testNG_EX1 {
	
	public class Annotations1
	{
	@Test // Test Case
	public void gmailApplicationLaunch() // Test Case Name
	
	{
	System.out.println(" ******* Gmail Application Launch Successfully ********" );
	}

	@Test
	public void LogInTest()
	{
	System.out.println("  LogIn Functionality Test Successfull ");
	}


	@Test
	public void composeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successfull ");
	}

	@Test
	public void DraftsMailTest()
	{
	System.out.println(" Drafts Mail Functionality Test Successfull ");
	}

	@Test
	public void sentMailTest()
	{
	System.out.println(" Sent Mail Functionality Test Successfull ");
	}

	@Test
	public void gmailApplicationClose()
	{
	System.out.println(" *********** Gmail Application Closed Successfully ****************");
	}
	}
	
	
	
	
	

}
