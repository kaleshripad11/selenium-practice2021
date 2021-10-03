package basicTestSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeDriver;
import basicTestSelenium.Configuration;

public class OpenDemoSite {
	// Create object for Configuration class
	Configuration c = new Configuration();
	
	// Open demo site 'https://www.seleniumeasy.com/'
	void openSite() {
		// open chrome in maximized state
		c.runChrome();
		c.driver.manage().window().maximize();
		c.driver.get("https://www.seleniumeasy.com/");
		startTesting();
	}
	
	void startTesting() {
		// Locate the link element and click it
		c.driver.findElement(By.linkText("Demo Website!")).click();
		//c.driver.findElement(By.id("image-darkener"));
		/*
		 * As few elements are hidden due to javascript, they can not be located directly. In order to locate them 
		 * we use class WebDriverWait class. In the constructor of the class we provide the object of WebDriver and time.
		 */
		WebDriverWait q = new WebDriverWait(c.driver, 20);	
		q.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'at4-close']"))).click();
		c.driver.findElement(By.id("btn_basic_example")).click();
		q.until(ExpectedConditions.elementToBeClickable(By.className("list-group-item"))).click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenDemoSite ods = new OpenDemoSite();
		ods.openSite();
	}

}
