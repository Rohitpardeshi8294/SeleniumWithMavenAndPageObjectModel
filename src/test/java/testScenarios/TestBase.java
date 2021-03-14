package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeSuite
	public static void setDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Main\\chromedriver.exe"); 
		driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown()
	{
		try
		{
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
