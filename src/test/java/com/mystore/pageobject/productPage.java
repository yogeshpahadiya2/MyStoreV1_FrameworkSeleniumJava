package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage {
	// create object of webdriver
	WebDriver ldriver;

	// constructor
	public productPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "quantity_wanted")
	WebElement quantity;
	@FindBy(id = "group_1")
	WebElement size;
	@FindBy(name = "Submit")
	WebElement addToCart;

}
