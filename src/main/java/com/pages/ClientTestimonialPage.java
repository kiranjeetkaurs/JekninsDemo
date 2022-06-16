package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientTestimonialPage {
	
	WebDriver driver;
	
	@FindBy(id = "ClientTestimony")
	WebElement clientTestimony;
	
	//Constructor of the page class
	public ClientTestimonialPage(WebDriver driver) {
		
		
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
    //Page action 
	
	public String clientTestimony() {
		clientTestimony.getText();
		return clientTestimony();
		
	}
	
}
