package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lakahotia_login_page {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://122.165.161.231:82/");
		 
		 WebElement user = driver.findElement(By.id("ContentPlaceHolder1_txtUserName"));
		 user.sendKeys("rjs");
		 user.click();
		 
		 WebElement password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
		 user.sendKeys("rjs");
		 password.sendKeys("1234");
		 password.click();
		 
		 WebElement signin = driver.findElement(By.id("ContentPlaceHolder1_btnSubmit"));
		 signin.click();
		 
		 System.out.println("login test completed");
	}
}
