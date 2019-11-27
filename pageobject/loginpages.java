package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpages {
	
	WebDriver driver;
	
	By signinbar = By.xpath("//*[@id=\"hlogin\"]/span");
	By username = By.id("txtlogEmail");
	By password = By.id("txtlogPassword");
	By signin = By.id("btnloginSubmit");
	
	public void siginlink (String login) {
		
		driver.findElement(signinbar).click();	
	}
	
	public void setusername(String strUsername) {

		driver.findElement(username).sendKeys(strUsername);

	}
	public void setpassword(String strpassword) {

		driver.findElement(password).sendKeys(strpassword);

	}

	public void clicklogin() {

		driver.findElement(signin).click();


  }
  
   }
