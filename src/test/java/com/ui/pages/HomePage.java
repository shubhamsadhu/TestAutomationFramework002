package com.ui.pages;

import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	public HomePage(WebDriver driver) {
		super(driver);  // to call a parent class constructor from the child contructor
		goToWebsite("https://www.eyeontask.com/login");
	}

}
