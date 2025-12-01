package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//this is a parent class & parent class should be marked as abstract
//now we can't able to create object of abstract class that's why we create a object of child class & child class object call
//parent class constructor using super keyword see this in LoginPage.java class

public abstract class BrowserUtility {

	private WebDriver driver;
	
	public BrowserUtility(WebDriver driver) {
		this.driver=driver;  //to initiaze the instance variable driver!
	}
	
	
	public WebDriver getDriver() {  //getter use in page object classes
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void goToWebsite(String url) {
		driver.get(url);
	}
	
	public void maxmizeWindow() {
		driver.manage().window().maximize();
	}
	
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

}
