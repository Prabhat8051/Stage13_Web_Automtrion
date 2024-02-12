package com.cineverse.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.ForgotPasswordPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.LogInPage;
import com.cineverse.qa.pages.SignUpPage;

import junit.framework.Assert;

public class LogInPageTest extends CineverseBase{
	
	LogInPage loginpage;
	HomePage homepage;
	ForgotPasswordPage forgotpasswordpage;
	SignUpPage signuppage;
	
	 public LogInPageTest()
	 {
		 super();
	 }
	
	 
	 @BeforeMethod
		public void setup() throws InterruptedException
		{
			initialization();
			loginpage = new LogInPage();
			homepage=new HomePage();
			loginpage = homepage.ValidateClickOnlogInPage();
		}
	 
	 
	 @Test(priority=1)
	 public void ValidateHeadTextTest()
	 {
		String htext= loginpage.ValidateHeadText();
		Assert.assertEquals(htext, "Subscriber Benefits");
		 
	 }
	 
	
	 @Test(priority=2)
	 public void ValidateFreeTextTest()
	 {
		String ftext= loginpage.ValidateFreeText();
		Assert.assertEquals(ftext, "Free");
	 }
	 
	 
	 @Test(priority=3)
	 public void ValidateRegisteredTextTest()
	 {
		 String rtext=loginpage.ValidateRegisteredText();
		 Assert.assertEquals(rtext, "Registered");
	 }
	 
	 
	 @Test(priority=4)
	 public void ValidatePremiumTextTest()
	 {
		 String ptext=loginpage.ValidatePremiumText();
		 Assert.assertEquals(ptext, "Premium");
	 }
	 
	 
	 @Test(priority=5)
	 public void ValidateValidateCrossDeviceAccessTextTest()
	 {
		 String crosstext=loginpage.ValidateCrossDeviceAccessText();
		 Assert.assertEquals(crosstext, "Cross Device Access");
	 }
	 
	 
	 @Test(priority=6)
	 public void ValidateAdFreeMovesAndShowsTextTest()
	 {
		String adfreetext= loginpage.ValidateAdFreeMovesAndShowsText();
		Assert.assertEquals(adfreetext, "Ad Free Movies And Shows");
	 }
	 
	 
	 
	 @Test(priority=7)
	 public void ValidateContinueWatchTextTest()
	 {
		 String cwtext=loginpage.ValidateContinueWatchText();
		 Assert.assertEquals(cwtext, "Continue Watching");
	 }
	 
	 
	 
	 @Test(priority=8)
	 public void ValidateFavouriteListTextTest()
	 {
		 String fltext=loginpage.ValidateFavouriteListText();
		 Assert.assertEquals(fltext, "Favorites List");
	 }
	 
	 
	 @Test(priority=9)
	 public void ValidateWatchUnratedContentTextTest()
	 {
		 String wuctext=loginpage.ValidateWatchUnratedContentText();
		 Assert.assertEquals(wuctext, "Watch Unrated Content");
	 }
	 
	 
	 @Test(priority=10)
	 public void ValidateWatchUncutContentTextTest()
	 {
		String wuncttext= loginpage.ValidateWatchUncutContentText();
		Assert.assertEquals(wuncttext, "Watch Uncut Content");
	 }
	 
	 
	 @Test(priority=11)
	 public void ValidateWatch4KContentTextTest()
	 {
		 String w4ktext=loginpage.ValidateWatch4KContentText();
		 Assert.assertEquals(w4ktext, "Watch 4K Content");
	 }
	 
	 
	 @Test(priority=12)
	 public void ValidateExclusiveContentTextTest()
	 {
		String ectext= loginpage.ValidateExclusiveContentText();
		Assert.assertEquals(ectext, "Exclusive Content");
	 }
	 
	 
	 
	 @Test(priority=13)
	 public void ValidateLoginWitheMailTextTest()
	 {
		 String lwmtext=loginpage.ValidateLoginWitheMailText();
		 Assert.assertEquals(lwmtext, "Login With Email");
	 }
	 
	 
	 @Test(priority=14)
	 public void ValidateLoginToYourCineverseAccountTextTest()
	 {
		 String lcatext=loginpage.ValidateLoginToYourCineverseAccountText();
		 Assert.assertEquals(lcatext, "Login to Your Cineverse Account:");
	 }

	 
	 
	@Test(priority=15)
	public void ValidateLoginButtonIsDisplayedTest()
	{
		boolean flag=homepage.ValidateLoginIsDisplayed();
		Assert.assertTrue(flag);
	}
	 
	
	 @Test(priority=16)
	 public void ValidateSignUpButtonIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidateSignUpButtonIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 
	 @Test(priority=17)
	 public void ValidateEmailAddressInputFieldTest()
	 {
		 boolean flag=loginpage.ValidateEmailAddressInputField();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 @Test(priority=18)
	 public void ValidatePasswordInputFieldIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidatePasswordInputFieldIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 
	 @Test(priority=19)
	 public void ValidatePasswordFieldViewIconIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidatePasswordFieldViewIconIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 
	 @Test(priority=20)
	 public void ValidateBottomLoginButtonIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidateBottomLoginButtonIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 @Test(priority=21) 
	 public void ValidateSeePlansButtonIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidateSeePlansButtonIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	 
	 
	 
	 
	 @Test(priority=22)
	 public void ValidateSignUpNowButtonIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidateSignUpNowButtonIsDisplayed();
		 Assert.assertTrue(flag);
		
	 }
	 
	 
	 
	 @Test(priority=23)
	 public void ValidateForgotPasswordButtonIsDisplayedTest()
	 {
		 boolean flag=loginpage.ValidateForgotPasswordButtonIsDisplayed();
		 Assert.assertTrue(flag);
	 }
	
	 
	 @Test(priority=24)
	 public void ValidateClickonSignUpButtonTest()
	 {
		
		 signuppage=loginpage.ValidateClickonSignUpButton();
	 }
	 
	 
	 
	 @Test(priority=25)
	 public void ValidateClickOnForgotPasswordTest()
	 {
		forgotpasswordpage= loginpage.ValidateClickOnForgotPassword();
	 }
	 
	 
	 
	 
	 
	 @AfterMethod
		public void teardown()
		{
			driver.quit();
		}
	 
	 
	 

}
