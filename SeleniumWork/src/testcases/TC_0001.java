package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateDriver;

public class TC_0001  extends CreateDriver{
	
	
	@Test
	public void tcase1()
	{
		
		driver.findElementById("email").sendKeys("Hjello");
		driver.findElementById("email").sendKeys("Hjello");
		
	}

}
