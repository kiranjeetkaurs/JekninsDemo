package com.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInWithEmailPage {
	WebDriver driver = null;
	//1. Applications URLs and web element locators
	public String SignInPageUrl = "https://www.dieticiangroup.com/SignIn";
	public String DieticianHomePage="https://www.dieticiangroup.com";
	public String RegisterUrl = "https://www.dieticiangroup.com/Register";
	public String forgotPwdUrl = "https://www.dieticiangroup.com/forgotPassword";
	public String facebookUrl = "https://www.dieticiangroup.com/facebook";
	public String GoogleUrl = "https://www.dieticiangroup.com/Google";
	public String forgotPwdPageTitle = "Forgot your password";
	public String googlePageTitle = "Google";
	public String facebookPageTitle = "facebook";
	
	 //Log in with email on Sign In Form
	
		@FindBy (id="Email")
		@CacheLookup
		WebElement email;
		
		@FindBy (id="EmailPassword")
		@CacheLookup
		WebElement emailPwd;
		
		@FindBy (id="Login")
		@CacheLookup
		WebElement btn_login;
		
		@FindBy (id="facebook")
		@CacheLookup
		WebElement btn_facebook;
		
		@FindBy (id="Google")
		@CacheLookup
		WebElement btn_google;
		
		@FindBy (linkText="Forgot your password?")
		@CacheLookup
		WebElement forgotYourPwd;
		
		@FindBy (linkText="Sign up here")
		@CacheLookup
		WebElement signUp;
		
		@FindBy(id="errorMessage")
		@CacheLookup
		WebElement error;
		
		@FindBy(id="form_heading")
		@CacheLookup
		WebElement loginFormHeading;
		
		//2. constructor of the page class
		public LogInWithEmailPage (WebDriver driver) {
			this.driver=driver;
			try {
				
				PageFactory.initElements(driver, this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			}
		
		//3. Page actions
		//Log in with email on Sign In Form
		 
		 public void enterEmail(String Email) {
			 String regexPattern = "^(?=.{1,30}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
				        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			 if (usernamePwdIsEmpty(Email)==true)	{
				 System.out.println("Email field is empty");
			 }
			 else if (emailIsValid(Email, regexPattern)==true) {
			 email.sendKeys(Email);}
			 else 
				 System.out.println("Email is invalid");
}
			 public void enterEmailpassword(String pwd) {
				 String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$"; 
				 if(usernamePwdIsEmpty(pwd)==true) {
					 System.out.println("Password field is empty");
				 }
				 else if (isValidPassword(pwd,regex)==true) {
				 emailPwd.sendKeys(pwd);}
				 else
					 System.out.println("Password is invalid");
				 
					}
			 public void logInBtn() {
				 btn_login.click();
			}
			 public void clickForgotYourPwdLink(){
				 forgotYourPwd.click();}
			 
			 public void clickSignUpLink() {
				 signUp.click(); 
			 }
			 
			 public void clickFacebookBtn() {
				 btn_facebook.click();
			 }
			 
			 public void clickGoogleBtn() {
				 btn_google.click();
			 }
			 
			 public String alertmessageVerification() {
					String mesg = error.getText();
				    return mesg;
				}
			 
			 public String getFormHeader() {
					String header = loginFormHeading.getText().trim();
					return header;
					
				}
			 public boolean logIn() {
					boolean display = btn_login.isDisplayed();
					return display;
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
			 
			 public void emptyFields() {
				 email.clear();
				 emailPwd.clear();
			 }
			 public String getTitle() {
				 String title = driver.getTitle();
				 return title;
			 }
			 public boolean usernamePwdIsEmpty(String name) {
				 boolean empty = name.isEmpty();
				 return empty;
			 }
			 
			 public boolean isValidPassword(String password,String regex)
			    {
			        Pattern pattern = Pattern.compile(regex);
			        Matcher matcher = pattern.matcher(password);
			        return matcher.matches();
			    }
			 public boolean emailIsValid(String emailAddress, String regexPattern) {
				    return Pattern.compile(regexPattern)
				      .matcher(emailAddress)
				      .matches();
				}

}
