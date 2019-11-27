package industrial_warehouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class warehouse_details {
	WebDriver driver;

	@BeforeTest
	public void login_warehouse() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://192.168.1.22:51/warehouse/Login.aspx");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUserName")).sendKeys("uatins+W@gmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("123456789");
		driver.findElement(By.id("btnSubmit")).click();

	}

	@Test
	(priority = 1)
	// (enabled=false)
	public void InBound_Operations() {
		
		  WebElement inbound = driver.findElement(By.xpath("lblInbound")); 
		  Actions action = new Actions(driver); 
		  action.moveToElement(inbound).build().perform();
		  driver.findElement(By.id("liPickupMilkRunId")).click();

	}

	@Test(priority = 2)
	// (enabled = false)
	public void warehouse_pickup_run() {
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_chkBox_1")).click();
		WebElement vechile_no = driver.findElement(By.id("ContentPlaceHolder1_ddlVehicleNo"));
		vechile_no.click();
		Select s = new Select(vechile_no);
		s.selectByValue("4");
	}

	@Test
	(priority=3)
	//(enabled = false)
	public void driver_nemre() {
		WebElement driver_name = driver.findElement(By.id("ContentPlaceHolder1_ddlEmpName"));
		Select s = new Select(driver_name);
		s.selectByValue("6");
		driver.findElement(By.id("ContentPlaceHolder1_imgPopUp1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtJoining_day_1_3")).click();
		driver.findElement(By.id("ContentPlaceHolder1_btnSub")).click();

	}

	@Test
	public void teardown() {
		driver.quit();
	}

}
