package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MandatoryFields {
	private WebDriver driver;
	
	//1. by locators 
	@FindBy (xpath="//input[text(mobile)]")
	@CacheLookup
	WebElement mobileTextInput;
	
	@FindBy (xpath="//input[text(firstname)]")
	@CacheLookup
	WebElement firstNameTextInput;
	
	@FindBy (xpath="//input[text(lastname)]")
	@CacheLookup
	WebElement lastNameTextInput;
	
	@FindBy (xpath="//input[text(email)]")
	@CacheLookup
	WebElement emailTextInput;
	
	@FindBy (xpath="//input[text(password)]")
	@CacheLookup
	WebElement passwordTextInput;
	
	//constructor of the page class
    public MandatoryFields (WebDriver driver) {
	this.driver=driver;
	try {
		PageFactory.initElements(driver, this);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

  //page actions
    
    public boolean  checkMandatoryFields() 
    {	
     boolean isMobile=mobileTextInput.isDisplayed();
     boolean isFirstName=firstNameTextInput.isDisplayed();
     boolean isLastName=lastNameTextInput.isDisplayed();
     boolean isEmail=emailTextInput.isDisplayed();
     boolean isPassword=passwordTextInput.isDisplayed();
     boolean isAvailable = false;
	     if (isMobile & isFirstName   & isLastName & isEmail  & isPassword)
	     {
	    	 isAvailable = true;
	     }
     
       return isAvailable;
    }

    
}
