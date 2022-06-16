package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOptionsHomePage {
	
	WebDriver driver;
	
	public String DieticianHomePageURL="https://www.dieticiangroup.com/home";
	
	
	//Top Menu Tabs
	@FindBy(linkText = "PRODUCT")
	WebElement ProductLink;
	
	@FindBy(linkText = "CLIENTS")
	WebElement ClientsLink;
	
	@FindBy(linkText = "TEAM")
	WebElement TeamLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement RegisterLink;
	
	
	//Bottom Menu Tabs
	@FindBy(linkText = "About")
	WebElement AboutLink;
	
	@FindBy(linkText = "Featured")
	WebElement FeaturedLink;
	
	@FindBy(linkText = "Blog")
	WebElement BlogLink;
	
	@FindBy(linkText = "Contact us")
	WebElement ContactUsLink;
	
	@FindBy(id = "SearchIcon")
	WebElement searchIcon;
	
	@FindBy(linkText = "SignIn")
	WebElement SignInOption;
	
	
	//2.constructor of the page class
		public MenuOptionsHomePage (WebDriver driver) {
				this.driver=driver;
				try {
					PageFactory.initElements(driver, this);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		
		// 3.Page actions
		public void TopMenuOptionsHomePage_IsDisplayed() {
			ProductLink.isDisplayed();
			ClientsLink.isDisplayed();
			TeamLink.isDisplayed();
			RegisterLink.isDisplayed();
		}
		
		public void BottomMenuTabsinHomePage_IsDisplayed() {
			AboutLink.isDisplayed();
			FeaturedLink.isDisplayed();
			BlogLink.isDisplayed();
			ContactUsLink.isDisplayed();
		}
		
		public void SearchIcon_IsDisplayed() {
			searchIcon.isDisplayed();
		}
		
		public void SignIn_IsDisplayed() {
			SignInOption.isDisplayed();
		}

}
