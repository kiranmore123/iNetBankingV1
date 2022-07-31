package com.iNetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.Page.Objects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException
	{
		
		//driver.get(baseURL);
		Logger.info("Browser is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("USername is entered");
		
		lp.setPassword(password);
		Logger.info("Password is entered");
		
		lp.clickSubmit();
		Logger.info("Submitt button is clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Logger.info("Test is passed");
		}
		else
		{
			captureScreen (driver, "loginTest");
			Assert.assertTrue(false);
			Logger.info("Test is failed");
		}
	}
}
