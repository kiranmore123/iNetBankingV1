package com.iNetBanking.Page.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how =How.XPATH, using = "//a[normalize-space()='New Customer']") WebElement lnkAddNewCuctomer;
	
	@FindBy(how =How.XPATH, using = "//input[@name='name']") WebElement txtCutomerName;
	
	@FindBy(how =How.XPATH, using = "//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[2]") WebElement rdGender;
	
	@FindBy(how =How.XPATH, using = "//input[@id='dob']") WebElement txtdob;
	
	@FindBy(how =How.XPATH, using ="//textarea[@name='addr']")  WebElement txtadress;
	
	@FindBy(how =How.XPATH, using ="//input[@name='city']") WebElement txtcity;
	
	@FindBy(how =How.XPATH, using ="//input[@name='state']") WebElement txtState;
	
	@FindBy(how =How.XPATH, using ="//input[@name='pinno']") WebElement txtPin;
	
	@FindBy(how =How.XPATH, using ="//input[@name='telephoneno']") WebElement txtMobileNo;
	
	@FindBy(how =How.XPATH, using ="//input[@name='emailid']") WebElement txtEmail;
	
	@FindBy(how =How.XPATH, using ="//input[@name='password']") WebElement txtPassword;
	
	@FindBy(how =How.XPATH, using ="//input[@name='sub']") WebElement btnsubmitt;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCuctomer.click();
	}
	
	public void custName(String cname)
	{
		txtCutomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	
	public void custAdress(String cadress)
	{
		txtadress.sendKeys(cadress);
	}
	
	public void CustCity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPinNo(String cpinno)
	{
		txtPin.sendKeys(String.valueOf(cpinno));
	}
	
	public void custTelephoneNo(String ctelephonne)
	{
		txtMobileNo.sendKeys(ctelephonne);
	}
	
	public void custEmailId (String cemailid)
	{
		txtEmail.sendKeys(cemailid);
	}
	
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	public void custSubmitt()
	{
		btnsubmitt.click();
	}
	

}
