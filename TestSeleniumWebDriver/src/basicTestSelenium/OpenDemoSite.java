package basicTestSelenium;
import org.openqa.selenium.*;
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
		c.driver.findElement(By.xpath("//a[@class = 'at-cv-button at-cv-lightbox-yesno at-cm-no-button']")).click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenDemoSite ods = new OpenDemoSite();
		ods.openSite();
	}

}
