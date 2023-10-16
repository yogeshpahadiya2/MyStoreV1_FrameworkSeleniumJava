package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchResultPage {
	// create object of webdriver
	WebDriver ldriver;

	// constructor
	public searchResultPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	WebElement searchResultProduct;
	@FindBy(linkText = "More")
	WebElement more;

	public String getSearchResultProductName() {
		return (searchResultProduct.getText());
	}

	public void clickOnMore() {
		more.click();
	}
}
