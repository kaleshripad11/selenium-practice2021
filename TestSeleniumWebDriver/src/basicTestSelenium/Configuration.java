package basicTestSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class Configuration {
	// Reference for WebDriver
	WebDriver driver;
		
	// Method to register the driver and instantiate the reference 
	void setConfig() {
		// Register the Driver
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	}
	
	void runChrome() {
		setConfig();
		driver = new ChromeDriver();
	}
	
	void runFirefox() {
		setConfig();
		driver = new FirefoxDriver();
	}
}
