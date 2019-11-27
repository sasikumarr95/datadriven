package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.loginpages;

public class product_test {

	String driverpath = "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe";
	static WebDriver driver=null;


	@BeforeTest
	public void firstpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.industrialstore.com");
		driver.manage().window().maximize();
	}

	@Test
	(priority=1)//(enabled=false)
	public void multi_poly_v_belt() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();
		Reporter.log("choose product categories");
		WebElement motorpower1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower1.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower1).build().perform();	  
		WebElement vbelt = driver.findElement(By.linkText("Multipull Poly-V Belts"));
		vbelt.click();

		Reporter.log("select multi_poly_v_belt");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_btn2_0")).click();
		Reporter.log(" Less product quantity");
		driver.navigate().back();
	}

	@Test 
	//(enabled=false)
	(priority=2)
	public void Wedge_belt() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();
		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();
		Reporter.log("wedge belts");

		driver.findElement(By.linkText("Wedge Belts")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select product");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();

	}

	@Test 
	//(enabled=false)
	(priority=3)
	public void FHP_belts() {

		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("FHP Belts")).click();
		Reporter.log("FHP_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();
	}

	@Test
	//(enabled=false)
	(priority=4)
	public void  HTD_Timing_belts() {


		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("HTD Timing Belts")).click();
		Reporter.log("HTD Timing Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();

	}

	@Test 
	//(enabled=false)
	(priority=5)
	public void Cogged_belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Cogged Belts")).click();
		Reporter.log("Cogged Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");

		driver.navigate().back();
	}

	@Test
	//(enabled=false)
	(priority=6)
	public void FXT_MR_belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("FXT MR Belts")).click();
		Reporter.log("Cogged Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");

		driver.navigate().back();
	}
	@Test 
	//(enabled=false)
	(priority=7)
	public void V_belt(){
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("V-Belt")).click();
		Reporter.log("V-Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();
	}

	@Test
	//(enabled=false)
	(priority=8)
	public void Timer_belts() {
		WebElement allcategories = driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']"));
		allcategories.click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Timer Belts")).click();
		Reporter.log("Timew_Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");

		driver.navigate().back();
	}

	@Test
	//(enabled=false)
	(priority=9)
	public void Poly_chain_belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Poly Chain Belts")).click();
		Reporter.log("poly_chain_Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();
	}
	@Test 
	//(enabled=false)
	(priority=10)
	public void Timing_Belt() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Timing Belts")).click();
		Reporter.log("Timing_Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();
	}
	@Test 
	//(enabled=false)
	(priority=11)
	public void Poly_Chain_Timing_Belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Poly Chain Timing Belts")).click();
		Reporter.log("poly_chain_Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");
		driver.navigate().back();
	}

	@Test
	(priority=12)
	//(enabled=false)
	public void Conveyor_Belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		WebElement conveyorbelt = driver.findElement(By.linkText("Conveyor Belts"));
		conveyorbelt.click();
		Reporter.log("poly_chain_Belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("add product quantity");

		driver.navigate().back();
	}

	@Test
	(priority=13)
	//(enabled=false)
	public void Flat_belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Flat Belts")).click();
		Reporter.log("Flat_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("less product quantity");

		driver.navigate().back();
	}
	@Test
	(priority=14)
	//(enabled=false)
	public void Oil_Skimmer_belt() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Oil Skimmer Belts")).click();
		Reporter.log("Flat_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("add product quantity");
		driver.navigate().back();
	}
	@Test
	(priority=15)
	//(enabled=false)
	public void Round_Belts() {
		driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']")).click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Round Belts")).click();
		Reporter.log("Round_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("add product quantity");

		driver.navigate().back();
	}
	@Test
	(priority=16)
	//(enabled=false)
	public void Scrum_Belts() {

		WebElement allcategories = driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']"));
		allcategories.click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Scrum Belts")).click();
		Reporter.log("Scrum_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("add product quantity");
		driver.navigate().back();
	}

	@Test(priority=17)
	//(enabled=false)
	public void classical_belt() {
		WebElement allcategories = driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']"));
		allcategories.click();

		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();

		driver.findElement(By.linkText("Classical Belts")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("Scrum_belts");
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0")).click();
		Reporter.log("select belt model");

		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0")).click();
		Reporter.log("add product quantity");
		driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0")).click();
		Reporter.log("add product quantity");
		driver.navigate().back();

	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
