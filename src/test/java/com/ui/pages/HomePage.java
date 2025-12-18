package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	public HomePage(WebDriver driver) {
		super(driver);  // to call a parent class constructor from the child contructor			
	}
	
	private static final By namefield = By.xpath("//input[@name='name']");
	private static final By emailfield = By.xpath("//input[@data-qa='signup-email']");
	private static final By submitbtn = By.xpath("//button[@data-qa='signup-button']");
	
	
	public void doSignUp() {
		enterText(namefield, "shubham");
		enterText(emailfield, "shubham98@gmail.com");
		clickonElement(submitbtn);

	}

}


//for trail we use homepage as a product page