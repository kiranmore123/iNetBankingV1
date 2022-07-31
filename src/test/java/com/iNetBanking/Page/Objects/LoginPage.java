package com.iNetBanking.Page.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name=\"uid\"]") WebElement txtUSerName;
	
	@FindBy(xpath = "//*[@type=\"password\"]") WebElement txtPassword;
	
	@FindBy(xpath = "//*[@type=\"submit\"]") WebElement btnLogin;
	
	@FindBy(xpath = "//*[text()=\"Log out\"]") WebElement lnkLogout;
	
	public void setUserName(String uname)
	{
		txtUSerName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

}
