package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {


	public ChromeDriver driver;
	@BeforeMethod
	public void bmet()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
	}
	
	@AfterMethod
	public void amet()
	{
		driver.quit();
	}
	
}
