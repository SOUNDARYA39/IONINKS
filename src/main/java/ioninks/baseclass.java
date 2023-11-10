package ioninks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public WebDriver driver;
	@BeforeSuite
	public void beforesuite()
	{
		
	}
	
	@BeforeClass()
	public void beforeclass()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get("https://www.washitup.in/vendordashboard");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod()
	public void beforemethod()
	{
		
	}
	
	@AfterMethod()
	public void aftermethod()
	{
		
	}
	
	@AfterClass()
	public void afterclass()
	{
		
	}
	@AfterSuite()
	public void aftersuite()
	{
		
	}

}
