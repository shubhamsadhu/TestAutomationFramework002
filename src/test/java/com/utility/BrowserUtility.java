package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.constants.Browser;


//now we can't able to create object of abstract class that's why we create a object of child class & child class object call


public abstract class BrowserUtility {

	private WebDriver driver;
	
	public WebDriver getDriver() {  //this method is return driver
		return driver;
	}
	
	public BrowserUtility(WebDriver driver) {
		this.driver=driver;  //to initiaze the instance variable driver!
	}
	
	public BrowserUtility(Browser browser) {
		if(browser==Browser.CHROME) {
			driver = new ChromeDriver();
		}
		else if(browser==Browser.FIREFOX) {
			driver = new FirefoxDriver();
		}
		else {
			System.err.print("Invalid Browser selected");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

//	public void setDriver(WebDriver driver) {
//		this.driver = driver;
//	}

	public void goToWebsite(String url) {
		driver.get(url);
	}
	
//	public void maxmizeWindow() {
//		driver.manage().window().maximize();
//	}
	
	public void clickonElement(By locator) {
		WebElement Element = driver.findElement(locator);
		Element.click(); 
	}
	
	public void enterText(By locator, String text) {
		WebElement Element = driver.findElement(locator);
		Element.sendKeys(text); 
	}
	
	 protected void waitForElement(By locator) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }
	 
	 public void close() {
		 System.out.println("Browser Closed");
		 driver.close();
	 }

}
