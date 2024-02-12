package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;

import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LogInPage;
import com.cineverse.qa.pages.SignUpPage;

import junit.framework.Assert;

public class SignUpPageTest extends CineverseBase {
	SignUpPage signuppage;
	HomePage homepage;
	LogInPage loginpage;
	
	public SignUpPageTest()
	{
		
		super();
	}
	
	

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		homepage= new HomePage();
		loginpage = new LogInPage();
		signuppage= new SignUpPage();
		loginpage=homepage.ValidateClickOnlogInPage();
		signuppage=loginpage.ValidateClickonSignUpButton();
	}
	
	
	
	@Test(priority=1)
	public void ValidateEmailInputBoxIsDisplayedTest()
	{
		boolean flag=signuppage.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test (priority=2)
	public void ValidateNameInputBoxIsDisplayedTest()
	{
		boolean flag=signuppage.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=3)
	public void ValidatePasswordInputBoxIsDisplayedTest()
	{
		boolean flag=signuppage.ValidatePasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(priority=4)
	public void ValidateViewIconIsDisplayedTest()
	{
		boolean flag=signuppage.ValidateViewIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=5)
	public void ValidatePasswordInstrctTextIsDisplayedTest()
	{
		boolean flag=signuppage.ValidatePasswordInstrctTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	

}
