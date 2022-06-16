package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpForm {
private WebDriver driver;
public String signUpUrl = "https://www.dieticiangroup.com/signUp";
public String loginInUrl = "https://www.dieticiangroup.com/login";
	//1. by locators 
	@FindBy (xpath="id[button(signup)]")
	@CacheLookup
	WebElement signUpButton;
	
	@FindBy (xpath="id[button(facebook)]")
	@CacheLookup
	WebElement faceBookButton;
	
	@FindBy (xpath="id[button(loginherelink)]")
	@CacheLookup
	WebElement loginHereLink;
	
	@FindBy (xpath="id[button(google)]")
	@CacheLookup
	WebElement googleButton;
	
	//constructor of the page class
    public SignUpForm (WebDriver driver) {
	this.driver=driver;
	try {
		PageFactory.initElements(driver, this);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

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
  	
  	
  	
  	//page actions
    public void heading()
    {
    	String signUpheading = "Sign Up form";
    }
    
    public String buttonText()
    {
    	String txt = signUpButton.getText();
    	return txt;
    }
    
    public void clickSignUpButton () {
    signUpButton.click();
    
    }
    
    public void clickLoginLink () {
        loginHereLink.click();
        
        }
    
    public void clickFaceBookButton () {
    	faceBookButton.click();
        
        }
    
    public void clickgoogleButton () {
    	googleButton.click();
        
        }
    public void  ValidateEmptyFields() 
    {	
     boolean isMobile = mobileTextInput.getText().isEmpty();
     boolean isFirstName=firstNameTextInput.getText().isEmpty();
     boolean isLastName=lastNameTextInput.getText().isEmpty();
     boolean isEmail=emailTextInput.getText().isEmpty();
     boolean isPassword=passwordTextInput.getText().isEmpty();
     boolean isEmpty = false;
	     if (isMobile & isFirstName   & isLastName & isEmail  & isPassword)
	     {
	    	 isEmpty = true;
	    	 System.out.print("Mandatory fields cannot be empty");
	     }
     
    }
    
    public void ValidateInputFields(String inputName)
    {
    	firstNameTextInput.sendKeys("123");
    	lastNameTextInput.sendKeys("123");
    	mobileTextInput.sendKeys("abc");
    	emailTextInput.sendKeys("abc!");
    	passwordTextInput.sendKeys("xyxz");
    	String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    	boolean isValid = true;
    	if(!firstNameTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "firstName")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for First Name");
    	}else if(!lastNameTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "lastName")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Last Name");
    	}else if(!mobileTextInput.getAttribute("value").matches("[0-9]") & inputName == "mobile")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Mobile Number");
    	}else if(!emailTextInput.getAttribute("value").matches(regex) & inputName == "email")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Email");
    	}else if(!passwordTextInput.getAttribute("value").matches("geeta") & inputName == "password")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Password");
    	}
    	redirectToSignUp(isValid);
    }
    
    public void redirectToSignUp(boolean isValid)
    {
    	if(isValid)
    	{
    		signUpUrl.toString();
    	}
    }
public void signUpWithFacebook(String inputName) {
	faceBookButton.click();
	emailTextInput.sendKeys("abc!");
	String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	boolean isValid = true;
	if(!emailTextInput.getAttribute("value").matches(regex) & inputName == "email") {
}
	redirectToSignUp(isValid);
}
public void signUpWithGoogle() {
	googleButton.click();
}
	
	public void logInUrl() {
		googleButton.click();
	
	
}

}