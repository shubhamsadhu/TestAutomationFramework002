package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//this is a parent class & parent class should be marked as abstract
//now we can't able to create object of abstract class that's why we create a object of child class & child class object call
//parent class constructor using super keywork see this in LoginPage.java class
public abstract class BrowserUtility {

	private WebDriver driver;
	
	public BrowserUtility(WebDriver driver) {
		super();
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

	public void sendtext(){
	
	}
}
