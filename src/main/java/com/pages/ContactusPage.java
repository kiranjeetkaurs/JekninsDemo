package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	
	WebDriver driver;
	
	//locators
	
	@FindBy (xpath="//input[text(firstname)]")
  	@CacheLookup
  	WebElement firstNameTextInput;
  	
  	@FindBy (xpath="//input[text(lastname)]")
  	@CacheLookup
  	WebElement lastNameTextInput;
  	
  	@FindBy (xpath="//input[text(email)]")
  	@CacheLookup
  	WebElement emailTextInput;
  	
  	@FindBy (xpath="//input[text(subject)]")
  	@CacheLookup
  	WebElement subjectTextInput;
  	
  	@FindBy (xpath="//input[text(message)]")
  	@CacheLookup
  	WebElement messageTextInput;
  	
  	@FindBy (id = "Submit")
  	@CacheLookup
  	WebElement SubmitBtn;
  	
	
	//constructor of the page class
    public ContactusPage (WebDriver driver) {
	this.driver=driver;
	try {
		PageFactory.initElements(driver, this);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
	
    //page actions
    
    public void ClickContactusBtn() {
    	SubmitBtn.click();
    }
    
    public void  ValidateEmptyFields() 
    {	
    
     boolean isFirstName=firstNameTextInput.getText().isEmpty();
     boolean isLastName=lastNameTextInput.getText().isEmpty();
     boolean isEmail=emailTextInput.getText().isEmpty();
     boolean isSubject=subjectTextInput.getText().isEmpty();
     boolean isMessage=messageTextInput.getText().isEmpty();
     boolean isEmpty = false;
     
	     if (isFirstName   & isLastName & isEmail  & isSubject & isMessage)
	     {
	    	  isEmpty = true;
	    	 System.out.print("Mandatory fields cannot be empty. Please fill the fields");
	     }
     
    }
    
    public void ValidateFirstName(String inputName) {
    	firstNameTextInput.sendKeys("123");
    	boolean isValid = true;
    	if(!firstNameTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "firstName")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for First Name");
    	}
    	else
    	{
    		System.out.println("Valid First Name");
    	}
    }
    
    public void ValidateLastName(String inputName) {
    	lastNameTextInput.sendKeys("123");
    	boolean isValid = true;
    	if(!lastNameTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "lastName")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Last Name");
    	}
    	else
    	{
    		System.out.println("Valid Last Name");
    	}
    }
    
    public void ValidateEmail(String inputName) {
    	emailTextInput.sendKeys("123@fmlo");
    	String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
    	boolean isValid = true;
    	if(!emailTextInput.getAttribute("value").matches(regex) & inputName == "email")
    	{
    		isValid = false;
    		System.out.print("Invalid data entered for Email");
    }
    	else {
    		System.out.println("It is a Valid email ID");
    	}
    }
    
    public void ValidateSubject(String inputName) {
    	subjectTextInput.sendKeys("123@f&^543");
    	
    	boolean isValid = true;
    	if(!subjectTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "subject")
    	{
    		isValid = false;
    		System.out.print("junk data entered in Subject");
    	}
    	else
    	{
    		System.out.println("Valid Subject entered");
    	}
    }
    
    public void ValidateMsgField(String inputName) {
      messageTextInput.sendKeys("3@f&^5de43");
    	
    	boolean isValid = true;
    	if(!messageTextInput.getAttribute("value").matches("[a-zA-Z]") & inputName == "message")
    	{
    		isValid = false;
    		System.out.print("junk data entered in the Message field");
    	}
    	else
    	{
    		System.out.println("Valid Message entered");
    	}
    }

}
