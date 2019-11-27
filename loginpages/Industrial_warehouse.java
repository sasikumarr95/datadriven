package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Industrial_warehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://192.168.1.22:51/warehouse/Login.aspx");
		
		WebElement user = driver.findElement(By.id("txtUserName"));
		user.sendKeys("uatins+W@gmail.com");
		user.click();
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("123456789");
		password.click();
		
		WebElement login = driver.findElement(By.id("btnSubmit"));
		login.click();
	}

}
