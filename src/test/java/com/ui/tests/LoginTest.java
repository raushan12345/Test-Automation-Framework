package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Launch a Browser Window!! Browser Session is created!!
		BrowserUtility browserUtility = new BrowserUtility(driver);
		browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");
		browserUtility.maximizeWindow();

		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign')]");
		browserUtility.clickOn(signInLinkLocator);

		By emailTextBoxLocator = By.id("email");
		browserUtility.enterText(emailTextBoxLocator, "plctest00@gmail.com");

		By passwordTextBoxLocator = By.id("passwd");
		browserUtility.enterText(passwordTextBoxLocator, "password");

		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserUtility.clickOn(submitLoginButtonLocator);
	}

}
