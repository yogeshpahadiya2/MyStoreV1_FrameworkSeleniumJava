package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {
	// create object of webdriver
	WebDriver ldriver;

	// constructor
	public myAccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// identify webelements
	// create new account
	@FindBy(id = "email_create")
	WebElement createEmailId;

	@FindBy(id = "SubmitCreate")
	WebElement submitCreate;

	// Already registered users
	@FindBy(id = "email")
	WebElement registeredUserEmail;

	@FindBy(id = "passwd")
	WebElement registeredUserPwd;

	@FindBy(id = "SubmitLogin")
	WebElement signIn;

	// identify action on webelement
	public void enterCreateEmailAddress(String emailAdd) {
		createEmailId.sendKeys(emailAdd);
	}

	public void clickSubmitCreate() {
		submitCreate.click();
	}
	// ACTIONS METHODS FOR ALREADY REGISTERED USERS

	public void enterRegisteredEmailAddress(String emailAdd) {
		registeredUserEmail.sendKeys(emailAdd);
	}

	public void enterRegisteredPassword(String pwd) {
		registeredUserPwd.sendKeys(pwd);
	}

	public void clickSignIn() {
		signIn.click();
	}

}
