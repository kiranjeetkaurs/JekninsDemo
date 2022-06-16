package com.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver = null;
	//1. Applications URLs and web element locators
	public String SignInPageUrl = "https://www.dieticiangroup.com/SignIn";
	public String DieticianHomePage="https://www.dieticiangroup.com";
	public String RegisterUrl = "https://www.dieticiangroup.com/Register";
	public String NotMemberUrl = "https://www.dieticiangroup.com/NotMemberYet";
	//Sign In form with username
	
	@FindBy(id="Heading")
	@CacheLookup
	WebElement heading;
	
	@FindBy (id="Username")
	@CacheLookup
	WebElement userName;
	
	@FindBy (id="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy (id="SignIn")
	@CacheLookup
	WebElement btn_signIn;
	
	@FindBy (linkText="Forgot password?")
	@CacheLookup
	WebElement forgotPwdLink;
	
	@FindBy (linkText="Not a member yet?")
	@CacheLookup
	WebElement notMemberLink;
	
	@FindBy(id="message")
	@CacheLookup
	WebElement msg;
	
	
	//2. constructor of the page class
	public SignInPage (WebDriver driver) {
		this.driver=driver;
		try {
			
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
	//3. Page actions
	// Sign In form
	 public void userName(String UsrName) {
		 String regex = "^[A-Za-z]\\w{5,29}$";
		if(usernamePwdIsEmpty(UsrName)==true) {
			System.out.println("Username field is empty");
		}
		else if(isValidUsername(UsrName, regex)==true)
		{
			userName.sendKeys(UsrName);
		}
		else
			System.out.println("Username is invalid");
		}
	 public void password(String pwd) {
		 String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		 if (usernamePwdIsEmpty(pwd)==true) {
		 System.out.println("Password field is empty");	 
		 }
		 else if (isValidPassword(pwd, regex)==true) {
			 password.sendKeys(pwd); 
		 }
		 else {
			 System.out.println("Password is invalid");
		}
			}
	 public void signInBtn() {
		 btn_signIn.click();
	}
	 public void clickForgotPwdLink(){
	     forgotPwdLink.click();}
	 
	 public void clickNotMemberLink() {
		 notMemberLink.click(); 
	 }
	 
	 public String getHeader() {
			String header = heading.getText().trim();
			return header;
			
		}
	 public boolean signIn() {
		boolean display = btn_signIn.isDisplayed();
		return display;
	 }
	 
	 public String responseMessageVerification() {
			String mesg = msg.getText();
		    return mesg;
		}
	 public String getTitle() {
		 String title = driver.getTitle();
		 return title;
	 }
	 public void userOnRegisterPage() {
		 String newURL = driver.getCurrentUrl();
		 if(RegisterUrl.equals(newURL)) {
			 System.out.println("User is on Register page");
		 } else
		 {
			 System.out.println("User is not navigated to Register page");
		 }
	 }
	 
	 public boolean usernamePwdIsEmpty(String name) {
		 boolean empty = name.isEmpty();
		 return empty;
	 }
	 public void emptyFields() {
		 userName.clear();
		 password.clear();
	 }
	 public boolean isValidPassword(String password,String regex)
	    {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        return matcher.matches();
	    }
	 public boolean isValidUsername(String name,String regex)
	    {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(name);
	        return matcher.matches();
	    }

}