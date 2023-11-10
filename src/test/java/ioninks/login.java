package ioninks;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.inject.Key;

import pom.loginpage;
import pom.orderspage;

public class login extends baseclass {

	
	@Test()
	public void logintoapp() throws InterruptedException
	{
		loginpage lp = new loginpage(driver);
		lp.logintoapp("7892080200");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter otp=");
		
		String enter=sc.nextLine();
	
		lp.verifyotp(enter);
		WebElement order = driver.findElement(By.xpath("//h5[text()='Orders']"));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		wait.until(ExpectedConditions.elementToBeClickable(order));
		
     orderspage op = new orderspage(driver);
op.accrej();
	}
	
	
}
