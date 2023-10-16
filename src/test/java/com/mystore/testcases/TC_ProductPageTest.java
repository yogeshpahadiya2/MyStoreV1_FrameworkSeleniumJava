package com.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccountPage;
import com.mystore.pageobject.registeredUserAccount;
import com.mystore.pageobject.searchResultPage;

import junit.framework.Assert;

public class TC_ProductPageTest extends BaseClass {
	@Test(enabled = true)
	public void verifySearchProduct() throws IOException {
		String searchKey = "T-shirts";
		logger.info("**********TestCase Search Product started**********");
		// Sign in
		indexPage pg = new indexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		myAccountPage myAcpg = new myAccountPage(driver);
		// Enter account details- email and password
		myAcpg.enterRegisteredEmailAddress("yogeshpara2@gmail.com");
		logger.info("Entered email address");
		myAcpg.enterRegisteredPassword("Yog123");
		logger.info("Entered password");
		myAcpg.clickSignIn();
		logger.info("Clicked on sign in link..");
		// Enter searchkey in search box
		registeredUserAccount regUser = new registeredUserAccount(driver);
		regUser.enterDataInSearchBox("T-shirts");
		regUser.clickOnSearchButton();
		// Get Name of Searched Product
		searchResultPage resultPg = new searchResultPage(driver);
		String searchResultProductName = resultPg.getSearchResultProductName();
		// Verify that correct Product is displaying after search
		if (searchResultProductName.contains(searchKey)) {
			Assert.assertTrue(true);
			logger.info("Search Product testcase - Passed");
			regUser.clickOnSignOut();
		} else {
			logger.info("Search Product testcase - Failed");
			captureScreenShot(driver, "verifySearchProduct");
			Assert.assertTrue(false);
		}
		logger.info("**********TestCase Search Product ends**********");
	}
}
