package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageTitle {
	private WebDriver driver;
	public String homePage = "https://www.dieticiangroup.com/home";
	public String registerUrl = "https://www.dieticiangroup.com/register";
	
	//constructor of the page class
    public RegisterPageTitle (WebDriver driver) {
	this.driver=driver;
	try {
		PageFactory.initElements(driver, this);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

  //page actions
    
    public void getPageTitle() {
    String pgtitle = driver.getTitle();
    System.out.println(pgtitle);
}
}