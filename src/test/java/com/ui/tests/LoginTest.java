package com.ui.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.ui.constants.Browser.*;  //static import we don't need to write Browser text.
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest {
	LoginPage loginPage;
	
	@BeforeMethod(description = "Load the loginPage of website")
	public void setup() {
		 loginPage = new LoginPage(CHROME);
	}
	
	@Test(description = "verify login and enter user name and password", groups = {"E2E","Smoke"})
	public void LoginTestflow() {	
		
		HomePage homePage=loginPage.LoginMethod(); //LoginMethod give a homePage reference that why we write this
		homePage.doSignUp();
		loginPage.close();
	}

}

