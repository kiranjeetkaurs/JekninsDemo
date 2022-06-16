package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	
	@FindBy(name = "HOME")
	WebElement HomeTitle;
	
	//to find the Logo of the page
	@FindBy(id="logo")
	WebElement Homelogo;
	
	
	//2.constructor of the page class
	public HomePage (WebDriver driver) {
			this.driver=driver;
			try {
				PageFactory.initElements(driver, this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	// 3.Page actions
	
	public String getHomeTitle() {
		String HomeTitle = driver.getTitle();
		System.out.println(HomeTitle);
		return HomeTitle;
	}
	
	public boolean gethomelogo() {
		return Homelogo.isDisplayed();
		
	}
	

}
