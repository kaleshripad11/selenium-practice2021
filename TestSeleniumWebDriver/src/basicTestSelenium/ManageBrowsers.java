package basicTestSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class ManageBrowsers {
	// Creating reference 
	{{System.out.println("1 - Creating the reference for geckodriver...");}}
	WebDriver driver;
	
	// Set up the properties and driver path
	{{System.out.println("2 - Setting up the properties...");}}
	void setConfiguration() {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		driver = new FirefoxDriver();
		manageBrowser();
	}
	
	// Create method to manage the browser actions, Ex - Opening browser, Loading URL, Maximizing the window
	void manageBrowser() {
		System.out.println("3 - Opening browser...");
		driver.manage().window().maximize();
		System.out.println("4 - Loading URL : 'https://www.google.com'...");
		driver.get("https://www.google.com");
	}
	
	public static void main(String args[]) {
		ManageBrowsers mb = new ManageBrowsers();
		mb.setConfiguration();
		System.out.println("5 - Closing the browser...");
		mb.driver.close();
	}
}
