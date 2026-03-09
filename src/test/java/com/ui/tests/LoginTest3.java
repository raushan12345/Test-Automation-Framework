package com.ui.tests;

import static com.constant.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest3 {
	HomePage homePage;

	@BeforeMethod(description = "Load the home page of the website")
	public void setup() {
		homePage = new HomePage(CHROME);
	}

	@Test(description = "Verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" })
	public void loginTest() {
		
		assertEquals(homePage.goToLoginPage().doLoginWith("plctest00@gmail.com", "password").getUserName(),
		"Raushan Kumar");
	}

}
