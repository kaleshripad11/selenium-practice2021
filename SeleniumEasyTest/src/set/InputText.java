package set;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import basicTestSelenium.Configuration; // Custom class imported from another project
public class InputText {
	
	// Create configuration class object
	static Configuration c = new Configuration();
	static String your_msg; //Store the value from the input field
	
	void startTesting() {
		// The webriver will be set here
		c.runChrome(); 
		
		// Will open chrome in maximized window
		c.driver.manage().window().maximize(); 
		
		// Fetch url
		c.driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html"); 
		
		// Locate elements
		WebDriverWait wait = new WebDriverWait(c.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Close']"))).click();
		
		// Input some text
		c.driver.findElement(By.id("user-message")).sendKeys("Hello There");
		
		// Click button
		c.driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		// Store some text to variable 'your_msg' 
		your_msg = c.driver.findElement(By.id("display")).getText();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputText text = new InputText();
		text.startTesting();
		
		// Display input text on console
		System.out.println("Your entered text is => "+your_msg);
		
		// Wait 20 seconds and then close browser window
		WebDriverWait wait = new WebDriverWait(c.driver, 20);
		//c.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		c.driver.close();
	}

}
