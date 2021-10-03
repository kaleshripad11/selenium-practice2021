package basicTestSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class Configuration {
	// Reference for WebDriver
	public WebDriver driver;
		
	// Method to register the driver and instantiate the reference 
	public void setConfig() {
		// Register the Driver
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	}
	
	public void runChrome() {
		setConfig();
		driver = new ChromeDriver();
	}
	
	public void runFirefox() {
		setConfig();
		driver = new FirefoxDriver();
	}
}
