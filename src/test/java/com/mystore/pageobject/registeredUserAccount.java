package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredUserAccount {
	// create object of webdriver
	WebDriver ldriver;

	// constructor
	public registeredUserAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement userName;

	@FindBy(linkText = "Sign out")
	WebElement signOut;

	@FindBy(name = "search_query")
	WebElement searchBox;

	@FindBy(name = "submit_search")
	WebElement submitSearch;

	public String getUserName() {
		String text = userName.getText();
		return text;
	}

	public void clickOnSignOut() {
		signOut.click();
	}

	public void enterDataInSearchBox(String searchKey) {
		searchBox.sendKeys(searchKey);
	}

	public void clickOnSearchButton() {
		submitSearch.click();
	}

}