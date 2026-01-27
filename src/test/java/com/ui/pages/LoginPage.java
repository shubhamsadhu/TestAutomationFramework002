package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.constants.Browser;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*;


//child class mark as final 
public final class LoginPage extends BrowserUtility {

	//we write final because locator value could not be changed
	private static final By LOGINBTN = By.xpath("//a[@href='/login']");  //final keyword always with static 
	
	public LoginPage(Browser browserName) {
		super(browserName);  // If the parent class have a parameteried constructor then it's child should be have call parent calls constructor using super keyword inside constructor
		goToWebsite(ReadProperty("URL"));
	}
	
	public HomePage LoginMethod() {
		clickonElement(LOGINBTN);
		HomePage homePage = new HomePage(getDriver()); // we need a webdriver session here that why we use getDriver() method
		return homePage;
	}

}

//to tril we use login page as a homepage
