package com.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.indexPage;

import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;
import com.mystore.pageobject.searchResultPage;

import junit.framework.Assert;

public class TC_MyAccountPageTest extends BaseClass {

	@Test(enabled = false)
	public void verifyRegistrationAndLogin() {
		logger.info("**********TestCase Verify Registration and Login starts**********");
		indexPage pg = new indexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		myAccountPage myAcpg = new myAccountPage(driver);
		myAcpg.enterCreateEmailAddress("yogeshpara8@gmail.com");
		logger.info("Email address entered in create account section.");
		myAcpg.clickSubmitCreate();
		logger.info("clicked on create an account button");
		accountCreationDetails accCreationPg = new accountCreationDetails(driver);
		accCreationPg.selectTitleMr();
		accCreationPg.enterCustFirstName("Yogesh");
		accCreationPg.enterCustLastName("Pahadiya");
		accCreationPg.enterPassword("Yog123");
		accCreationPg.selectCheckBox();
		logger.info("entered user details on account creation page.");
		accCreationPg.clickOnRegister();
		logger.info("clicked on Register button");
		registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = regUser.getUserName();
		Assert.assertEquals("Yogesh Pahadiya", userName);
		regUser.clickOnSignOut();
		logger.info("TestCase Verify Registration and Login ends");
	}

	@Test(enabled = true)
	public void verifyLogin() throws IOException {
		logger.info("**********TestCase Verify Login starts**********");
		indexPage pg = new indexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		myAccountPage myAcpg = new myAccountPage(driver);
		myAcpg.enterRegisteredEmailAddress("yogeshpara2@gmail.com");
		logger.info("Entered email address");
		myAcpg.enterRegisteredPassword("Yog123");
		logger.info("Entered password");
		myAcpg.clickSignIn();
		logger.info("Clicked on sign in link..");
		registeredUserAccount regUser = new registeredUserAccount(driver);
		String userName = regUser.getUserName();
		if (userName.equals("Yogesh Pahadiya")) {
			logger.info("VerifyLogin - Passed");
			regUser.getUserName();
			Assert.assertTrue(true);
			logger.info("**********TestCase Verify Login ends**********");
		} else {
			logger.info("VerifyLogin - Failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}
	}

}
