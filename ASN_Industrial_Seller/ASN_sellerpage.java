package ASN_Industrial_Seller;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ASN_sellerpage {
	WebDriver driver;
	
	@BeforeTest
	public void industrial_seller_login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.1.22:51/seller/Login.aspx");
		Reporter.log("open industrial store login_page");
		driver.manage().window().maximize();
		Reporter.log("");
		driver.findElement(By.id("txtEmailId")).sendKeys("Lakhotia@gmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("1234567");
		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log("enter usename and password");
	}	
	@Test
	//(enabled=false)
	(priority=1)
	public void ASN_Seller_panel() {
		WebElement Seller_panel = driver.findElement(By.xpath("//*[@id=\"lblAsn\"]/span"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Seller_panel).build().perform();
		driver.findElement(By.id("liASNId")).click();
		Reporter.log("move to ASN seller_page");
	}
	@Test
	(enabled=false)
	//(priority=2)
	public void Enter_product_name () {
		WebElement Enter_product_name = driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_txtMfgCode_0"));
		Enter_product_name.sendKeys("FHP2240");
		Enter_product_name.sendKeys(Keys.ENTER);
		Reporter.log("TO enter product name");
	}
	@Test
	//(enabled=false)
	(priority=3)
	public void ADD_Quantity() {
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_txtQty_0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_txtQty_0"))
		.sendKeys("20");
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_txtTransferPrice_0")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_txtTransferPrice_0"))
		.sendKeys("30");
		Reporter.log("add quantity");

		driver.findElement(By.id("ContentPlaceHolder1_btnSub")).click();
	}
	@Test
	(enabled=false)
	//(priority=4)
	public void ASN_Packing() {
		WebElement ASN_packing = driver.findElement(By.xpath("//*[@id=\"lblAsn\"]/span"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ASN_packing).build().perform();
		driver.findElement(By.id("liASNforPackingId")).click();
		Reporter.log("move to ASN packing_page");
		WebElement checkbox=driver.findElement(By.id("ContentPlaceHolder1_rptOrderlist_chkBox_3"));
		checkbox.click();
	}
	@Test
	(enabled=false)
	//(priority=5)
	public void Packing_details() {
		driver.findElement(By.id("ContentPlaceHolder1_imgPopUp1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtJoining_day_4_2")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtL")).sendKeys("22");
		Reporter.log("to Enter date");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtB")).sendKeys("24");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("ContentPlaceHolder1_txtH")).sendKeys("25");
		Reporter.log("package size");
	}

	@Test
	(enabled=false)
	//(priority=6)
	public void box_weight() {
		driver.findElement(By.id("ContentPlaceHolder1_txtWeight")).sendKeys("100");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		WebElement dropdown =driver.findElement(By.id("ContentPlaceHolder1_ddlWUom")); dropdown.click();
		Select s = new Select(dropdown); s.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.id("ContentPlaceHolder1_txtWeight")).sendKeys("100");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div[4]")).click();
		Reporter.log("To enter box weight");
		
		driver.findElement(By.id("ContentPlaceHolder1_btnSub")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div[2]/div/div/div/div/div/div/div/div[4]/button")) .click();
		 */
	}


	@AfterTest
	public void tearDown(){
		driver.quit();
	}


}







