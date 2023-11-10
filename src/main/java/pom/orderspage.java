package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderspage {
	
	public orderspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//@FindBy(linkText = "Orders")
//private WebElement orders;
	
	@FindBy(id="654ceb74ac32b4d35d2a38cc")
	private WebElement accept;
	
	@FindBy(id="654b168a176f3fdfc52dbb65")
	private WebElement reject;
	

	public WebElement getAccept() {
		return accept;
	}


	public WebElement getReject() {
		return reject;
	}


	//public WebElement getOrders() {
		//return orders;
	//}
	
	public void accrej()
	{
		//orders.click();
		accept.click();
		reject.click();
		
		
	}

}
