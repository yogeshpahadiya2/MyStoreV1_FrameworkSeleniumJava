package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	// create object of webdriver
	WebDriver ldriver;

	// constructor
	public indexPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// identify webelemrnts
	@FindBy(linkText = "Sign in")
	WebElement signIn;

	// identify action on webelement
	public void clickOnSignIn() {
		signIn.click();
	}

}