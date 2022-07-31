package com.iNetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.Page.Objects.AddCustomerPage;
import com.iNetBanking.Page.Objects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("User name is provided");
		lp.setPassword(password);
		Logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addCust = new AddCustomerPage(driver);
		
		addCust.clickAddNewCustomer();
		Logger.info("Providing customer details");
		
		addCust.custName("pavan");
		addCust.custgender("male");
		addCust.custdob("10", "15", "1985");
		Thread.sleep(3000);
		addCust.custAdress("INDIA");
		addCust.CustCity("HYD");
		addCust.custState("AP");
		addCust.custPinNo("422012");
		addCust.custTelephoneNo("9594027600");
		
		String email = randomstring()+"@gmail.com";
		addCust.custEmailId(email);
		addCust.custPassword("abcdef");
		addCust.custSubmitt();
		
		Thread.sleep(3000);
		
		Logger.info("Validation is started");
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			Logger.info("Test case is passed");
		}
		else
		{
			Logger.info("Test case is failed");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
	
}
