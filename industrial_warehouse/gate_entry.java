package industrial_warehouse;

import java.util.concurrent.TimeUnit;

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
public class gate_entry {
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
	(priority=1)
	public void gateESntry() {
		
		
		WebElement drivername = driver.findElement(By.cssSelector("a[id=lblInbound]"));
		WebElement d = driver.findElement(By.xpath("a#liGateEntryId"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		
		 actions.moveToElement(drivername).build().perform(); 
		 actions.click(d).build().perform();
		
		driver.manage().window().maximize();
		
	}
	@Test
	(enabled=false)
	//(priority=2)
	public void gateway_details() {
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtVehicleNo"))
		.sendKeys("TN03Dummy");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtDriver"))
		.sendKeys("Driver I S");
	}
	@Test
	(enabled=false)
	//(priority=3)
	public void check_details() {
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_chkBox_0")).click();
		//driver.findElement(By.id("ContentPlaceHolder1_btnSub")).click();
		
	}
	@AfterTest
	public void teardown() {
		//driver.quit();
	}
	
}
