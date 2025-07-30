package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtility {

	private WebDriver driver;
	
	public BrowserUtility(WebDriver driver) {
		super();
		this.driver=driver;  //to initiaze the instance variable driver!
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
}
