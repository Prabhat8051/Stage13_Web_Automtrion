package com.cineverse.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cineverse.qa.base.CineverseBase;

public class SignUpPage extends CineverseBase {
	
	
	
	//Object Repository
	@FindBy(xpath="//input[@class='sc-3d62c686-0 jCVIMG normalMargin loginInput']")
	WebElement emailinputbox;
	
	
	@FindBy(xpath="//input[@class='sc-3d62c686-0 jCVIMG normalMargin']")
	WebElement nameinputbox;
	
	
	@FindBy(xpath="//input[@class='sc-3d62c686-0 jCVIMG lastinput']")
	WebElement passwordinputbox;
	
	
	@FindBy(xpath="(//img[@alt='home'])[2]")
	WebElement viewicon;
	
	
	@FindBy(xpath="//div[@class='sc-d7605ec7-0 iRnmWa newMargin']")
	WebElement passwordinstrcttext;
	
	
	@FindBy(xpath="//div[@class='sc-d7605ec7-0 iRnmWa signupBoxText']")
	 WebElement byclickingtext;
	
	
	@FindBy(xpath="//p[@class='sc-f6cb8f4d-0 jTlyJX underline_text']")
	WebElement termslink;
	
	
	@FindBy(xpath="//p[@class='sc-f6cb8f4d-0 jTlyJX']")
	WebElement privacylink;
	
	
	
	@FindBy(xpath="//div[@class='sc-4546a606-0 erPRo']")
	WebElement iunderstandtext;
	
	
	
	@FindBy(xpath="//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	WebElement checkbox;
	
	
	
	@FindBy(xpath="//button[@class='sc-17708cd3-0 ieldRr signupButton']")
	WebElement agreesignupbutton;

	
	
	
	

	public SignUpPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public boolean ValidateEmailInputBoxIsDisplayed()
	{
		 return emailinputbox.isDisplayed();
	}
	
	
	
	
	public boolean ValidateNameInputBoxIsDisplayed()
	{
		return nameinputbox.isDisplayed();
	}
	
	
	
	public boolean ValidatePasswordInputBoxIsDisplayed()
	{
		return passwordinputbox.isDisplayed();
	}
	
	
	
	
	public boolean ValidateViewIconIsDisplayed()
	{
		return viewicon.isDisplayed();
	}
	
	
	
	public boolean ValidatePasswordInstrctTextIsDisplayed()
	{
		return passwordinstrcttext.isDisplayed();
	}
	
	
	public boolean ValidateByClickingTextIsDisplayed()
	{
		return byclickingtext.isDisplayed();
	}
	
	
	
	public boolean ValidateTermsLinkIsDisplayed()
	{
		return termslink.isDisplayed();
		
	}
	
	
	
	public boolean ValidatePrivacyLinkIsDisplayed()
	{
		return privacylink.isDisplayed();
	}
	
	
	
	public boolean ValidateIUnderstandTextIsDisplayed()
	{
		return iunderstandtext.isDisplayed();
	}
	
	
	
	public boolean ValidateAgreeSignupButtonIsDisplayed()
	{
		return agreesignupbutton.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
