package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {

	private static final By EMAIL_TEXTFIELD = By.id("email");  //final keyword always with static 
	
	public LoginPage(WebDriver driver) {
		super(driver);  // to call a parent class constructor from the child constructor
	}

}
