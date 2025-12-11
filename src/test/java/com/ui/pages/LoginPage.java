package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;


//child class mark as final 
public final class LoginPage extends BrowserUtility {

	//we write final because locator value could not be changed
	private static final By EMAIL_TEXTFIELD = By.id("email");  //final keyword always with static 
	
	public LoginPage(WebDriver driver) {
		super(driver);  // If the parent class have a parameteried constructor then it's child should be have call parent calls constructor using super keyword inside constructor
		goToWebsite("https://automationexercise.com/");
	}
	
	public HomePage LoginMethod() {
		enterText(EMAIL_TEXTFIELD, "shubh_au");
		HomePage homePage = new HomePage(getDriver());
		return homePage;
	}

}
