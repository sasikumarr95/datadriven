package All_categories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mulipoly_v_bet {

	public static void main(String[] args) throws InterruptedException {
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
		
				  
	    WebElement vbelt = driver.findElement(By.linkText("Multipull Poly-V Belts"));
		vbelt.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				  
	    WebElement add1 =
	    driver.findElement(By.id("ContentPlaceHolder1_rptProducts_btn1_0"));
	    add1.click();
				  
		
		WebElement remove1 =
		driver.findElement(By.id("ContentPlaceHolder1_rptProducts_btn2_0"));
		remove1.click(); Thread.sleep(2000);
		
		driver.navigate().back();
		
		System.out.println("(MULITIPOLY V BELT) TEST CAN BE DONE SUCCESSFULLY");
		
		driver.quit();
		
		
		
		
	}

}
