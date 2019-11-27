package industrial_warehouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class delivery_details {
	WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("http://192.168.1.22:51/warehouse/Login.aspx");
	driver.findElement(By.name("txtUserName")).sendKeys("uatins+D@gmail.com");
	driver.findElement(By.name("txtPassword")).sendKeys("123456789");
	driver.findElement(By.name("btnSubmit")).click();
	}
	@Test
	public void homepage() {
		WebElement drivername = driver.findElement(By.id("lblEmployee"));
		Actions actions = new Actions(driver);
		actions.moveToElement(drivername).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#liASNPickupListforDriverId")));
		driver.findElement(By.id("ContentPlaceHolder1_rptProduct_btnok_0")).click();
		
	}
	@AfterTest
	public void quitpage() {
		driver.quit();
	}
	

}
