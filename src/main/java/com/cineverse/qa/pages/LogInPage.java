package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class LogInPage extends CineverseBase {
	
	//Object Repository
	
	@FindBy(xpath="//div[text()='Subscriber Benefits']")
	WebElement headtext;
	
	@FindBy(xpath="//th[text()='Free']")
	WebElement freetext ;
	
	@FindBy(xpath="//th[text()='Registered']")
	WebElement  registeredtext;
	
	@FindBy(xpath="//th[text()='Premium']")
	WebElement  premiumtext ;
	
	
	@FindBy(xpath="//td[text()='Cross Device Access']")
	WebElement crossdeviceaccesstext;
	
	@FindBy(xpath="//td[text()='Ad Free Movies and Shows']")
	WebElement adfreemovesandshowstext ;
	
	@FindBy(xpath="//td[text()='Continue Watching']")
	WebElement continuewatchtext ;
	
	@FindBy(xpath="//td[text()='Favorites List']")
	WebElement favouritelisttext ;
	
	@FindBy(xpath="//td[text()='Watch Unrated Content']")
	WebElement watchunratedcontenttext ;
	
	@FindBy(xpath="//td[text()='Watch Uncut Content']")
	WebElement watchuncutcontenttext ;
	
	@FindBy(xpath="//td[text()='Watch 4K Content']")
	WebElement watch4kcontenttext ;
	
	@FindBy(xpath="//td[text()='Exclusive Content']")
	WebElement  exclusivecontenttext;
	
	@FindBy(xpath="//h2[text()='Login With Email']")
	WebElement loginwithemailtext ;
	
	@FindBy(xpath="//p[text()='Login to Your Cineverse Account:']")
	WebElement logintoyourcineverseaccounttext ;
	
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected inner-tabs css-1q2h7u5']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary inner-tabs css-1q2h7u5']")
	WebElement signupbutton ;
	
	
	@FindBy(xpath="(//input[@class='sc-3d62c686-0 jCVIMG errorMargin'])[1]")
	WebElement  emailaddressinputfield;
	
	@FindBy(xpath="(//input[@class='sc-3d62c686-0 jCVIMG errorMargin'])[2]")
	WebElement passwordinputfield ;
	
	@FindBy(xpath="(//img[@alt='home'])[2]")
	WebElement passwordfieldviewicon ;
	
	
	@FindBy(xpath="//button[@class='sc-17708cd3-0 ieldRr']")
	WebElement bottomloginbutton ;
	
	
	@FindBy(xpath="//button[@class='sc-17708cd3-0 ieldRr seePlansButton']")
	WebElement seeplansbutton ;
	
	@FindBy(xpath="//div[@class='sc-d7605ec7-0 iRnmWa signinformText']")
	WebElement newtocineversesignupnowtext ;
	
	@FindBy(xpath="//button[@class='sc-eb51b621-0 bITdtB signinButton']")
	WebElement signupnowbutton ;
	
	
	@FindBy(xpath="//button[@class='sc-eb51b621-0 bITdtB forgotButton']")
	WebElement forgotpasswordbutton ;
	
	

	
	
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public String ValidateHeadText()
	{
		String htext=headtext.getText();
		return htext;
	}
	
	
	
	public String ValidateFreeText()
	{
		String ftext=freetext.getText();
		return ftext;
	}
	
	
	public String ValidateRegisteredText()
	{
		String rtext=registeredtext.getText();
		return rtext;
	}
	
	
	
	public String ValidatePremiumText()
	{
		String ptext=premiumtext.getText();
		return ptext;
	}
	
	
	public String ValidateCrossDeviceAccessText()
	{
		String crosstext=crossdeviceaccesstext.getText();
		return crosstext;
	}
	
	
	public String ValidateAdFreeMovesAndShowsText()
	{
		String adfreetext=adfreemovesandshowstext.getText();
		return adfreetext;
	}
	
	
	
	public String ValidateContinueWatchText()
	{
		String cwtext=continuewatchtext.getText();
		return cwtext;
	}
	
	
	public String ValidateFavouriteListText()
	{
		String fltext=favouritelisttext.getText();
		return fltext;
	}
	
	
	public String ValidateWatchUnratedContentText()
	{
		String wuctext=watchunratedcontenttext.getText();
		return wuctext;
	}
	
	
	public String ValidateWatchUncutContentText()
	{
		String wuncttext=watchuncutcontenttext.getText();
		return wuncttext;
	}
	
	
	public String ValidateWatch4KContentText()
	{
		String w4ktext=watch4kcontenttext.getText();
		return w4ktext;
	}
	
	
	public String ValidateExclusiveContentText()
	{
		String ectext=exclusivecontenttext.getText();
		return ectext;
	}
	
	
	
	public String ValidateLoginWitheMailText()
	{
		String lwmtext=loginwithemailtext.getText();
		return lwmtext;
		
	}
	
	
	public String ValidateLoginToYourCineverseAccountText()
	{
		String lcatext=logintoyourcineverseaccounttext.getText();
		return lcatext;
	}
	
	
	
	public boolean ValidateLoginButtonIsDisplayed()
	{
		return loginbutton.isDisplayed();
	}
	
	
	public boolean ValidateSignUpButtonIsDisplayed()
	{
		return signupbutton.isDisplayed();
	}
	
	
	public boolean ValidateEmailAddressInputField()
	{
		return emailaddressinputfield.isDisplayed();
	}
	
	
	public boolean ValidatePasswordInputFieldIsDisplayed() 
	{
		return passwordinputfield.isDisplayed();
	}
	
	
	public boolean ValidatePasswordFieldViewIconIsDisplayed()
	{
		return passwordfieldviewicon.isDisplayed();
	}

	
	
	public boolean ValidateBottomLoginButtonIsDisplayed()
	{
		return bottomloginbutton.isDisplayed();
	}
	
	
	public boolean ValidateSeePlansButtonIsDisplayed()
	{
		return seeplansbutton.isDisplayed();
	}
	
	
	//Not implemented inside logintest page
	public String ValidateNewToCineverseSignUpNowText()
	{
		String ncstext=newtocineversesignupnowtext.getText();
		return ncstext;
	}
	
	
	
	public boolean ValidateSignUpNowButtonIsDisplayed()
	{
		return signupnowbutton.isDisplayed();
	}
	
	
	public boolean ValidateForgotPasswordButtonIsDisplayed()
	{
		return forgotpasswordbutton.isDisplayed();
	}
	
	
	
	public SignUpPage ValidateClickonSignUpButton()
	{
		signupbutton.click();
		return new SignUpPage();
	}
	
	
	
	
	public ForgotPasswordPage ValidateClickOnForgotPassword()
	{
		forgotpasswordbutton.click();
		return new ForgotPasswordPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
