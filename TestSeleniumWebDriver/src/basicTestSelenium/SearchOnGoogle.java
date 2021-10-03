package basicTestSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;

public class SearchOnGoogle {
	// Reference for WebDriver
	WebDriver driver;
	
	// Method to register the driver and instantiate the reference 
	void setConfig() {
		// Register the Driver
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
	}
	
	// Fetch search queries
	void searchGoogle() {
		// Set the browser window to Maximize state
		driver.manage().window().maximize();
		
		// Search for query
		driver.get("https://www.google.com/");
		
		// Locate searchbox 
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("selenium easy");	
		
		// locate search button and click it
		driver.findElement(By.className("gNO89b")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchOnGoogle sog = new SearchOnGoogle();
		sog.setConfig();
		sog.searchGoogle();
	}

}
