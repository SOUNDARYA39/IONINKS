package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='login-input']")
	private WebElement name;
	
	@FindBy(xpath="//button[@class='button-login']")
	private WebElement getOtp;
	
	@FindBy(xpath="//input[@class='login-input2']")
	private WebElement enterotp;
	
	@FindBy(xpath="//button[@class='button-login']")
	private WebElement verify;
	
	

	public WebElement getEnterotp() {
		return enterotp;
	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGetOtp() {
		return getOtp;
	}
	
	public void logintoapp(String ele)
	{
		name.sendKeys(ele);
		getOtp.click();
	}
	
	
public void verifyotp(String no)
	{
		enterotp.sendKeys(no);
		verify.click();
	}
	
	

}
