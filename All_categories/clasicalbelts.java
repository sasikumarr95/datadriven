package All_categories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clasicalbelts {
	
   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.1.22:51");
		driver.manage().window().maximize();
		
		
		WebElement allcategories = driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']"));
		allcategories.click();
		
		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(motorpower).build().perform();
		
		WebElement classicalbelt = driver.findElement(By.linkText("Classical Belts"));
		classicalbelt.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement a100 = driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_1"));
		a100.click();
		
	    WebElement addbelt =driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0"));
		addbelt.click();
		  
		WebElement lessbelt =driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0"));
		lessbelt.click();
		  
		driver.navigate().back();
		/*
		 * System.out.println("(clasic belt)PRODUCT 100 TEST SUCESSFULLY");
		 * 
		 * WebElement a101 =
		 * driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_2"));
		 * a101.click();
		 * 
		 * WebElement add = driver.findElement(By.xpath(
		 * "//*[@id=\"ContentPlaceHolder1_rptProductDetail_btn1_0\"]")); add.click();
		 * 
		 * WebElement remove =
		 * driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0"));
		 * remove.click();
		 * 
		 * driver.navigate().back();
		 */
		
		System.out.println("(classic belt) PRODUCT 101 TEST SUCESSFULLY");
		 
		driver.quit();
		 
				 
		
	
	}
	

}
