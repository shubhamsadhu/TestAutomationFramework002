package com.ui.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest {

	
	public void LoginTestflow() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage=loginPage.LoginMethod(); //LoginMethod give a homePage reference that why we write this
		homePage.doSignUp();
		loginPage.close();
	}

}
