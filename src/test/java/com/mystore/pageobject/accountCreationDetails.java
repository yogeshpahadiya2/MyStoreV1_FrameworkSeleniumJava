package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreationDetails {
	WebDriver ldriver;

	public accountCreationDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement titleMr;
	@FindBy(id = "id_gender2")
	WebElement titleMrs;
	@FindBy(id = "customer_firstname")
	WebElement custFirstName;
	@FindBy(id = "customer_lastname")
	WebElement custLastName;
	@FindBy(id = "passwd")
	WebElement password;
	@FindBy(id = "days")
	WebElement selectDay;
	@FindBy(id = "months")
	WebElement selectMonth;
	@FindBy(id = "years")
	WebElement selectYear;
	@FindBy(id = "newsletter")
	WebElement selectCheckBox;
	@FindBy(id = "submitAccount")
	WebElement register;

	public void selectTitleMr() {
		titleMr.click();
	}

	public void selectTitleMrs() {
		titleMrs.click();
	}

	public void enterCustFirstName(String fName) {
		custFirstName.sendKeys(fName);
	}

	public void enterCustLastName(String lName) {
		custLastName.sendKeys(lName);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

//	public void enterDobDay() {
//		selectDay.click();
//		
//	}
//
//	public void enterDobMonth() {
//		selectMonth.click();
//	}
//
//	public void enterDobYear() {
//		selectYear.click();
//	}

	public void selectCheckBox() {
		selectCheckBox.click();
	}

	public void clickOnRegister() {
		register.click();
	}

}
