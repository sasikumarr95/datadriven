package All_categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wegde_belts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thinkpad\\eclipse-workspace\\first_project\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.1.22:51");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		WebElement allcategories = driver.findElement(By.xpath("//div[@class=' cd-dropdown-wrapper']"));
		allcategories.click();
		
		WebElement motorpower = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[1]/nav/ul/li"));
		motorpower.click();

		actions.moveToElement(motorpower).build().perform();
				  
	    WebElement wedgebelt = driver.findElement(By.linkText("Wedge Belts"));
	    wedgebelt.click();
		
	    WebElement selectWedgbelt = driver.findElement(By.id("ContentPlaceHolder1_rptProducts_imgProduct_0"));
	    selectWedgbelt.click();
	    
	    WebElement addbelt = driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn1_0"));
	    addbelt.click();
	    
	    WebElement lessbelt = driver.findElement(By.id("ContentPlaceHolder1_rptProductDetail_btn2_0"));
	    lessbelt.click();
	    
	    System.out.println("(WEDGE BELT) TEST CAN BE DONE SUCCESSFULLY");
	    
	    driver.navigate().back();
	}

}
