package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class industrialstores_login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.1.22:51");
		driver.manage().window().maximize();
		
		WebElement signinlink = driver.findElement(By.id("hlogin"));
		signinlink.click();
		
		WebElement user = driver.findElement(By.id("txtlogEmail"));
		user.sendKeys("sasikumarr95@gmail.com");
		user.click();
		
		WebElement password = driver.findElement(By.id("txtlogPassword"));
		password.sendKeys("aarah123");
		password.click();
		
		WebElement signin = driver.findElement(By.id("btnloginSubmit"));
		signin.click();
		
	}

}
