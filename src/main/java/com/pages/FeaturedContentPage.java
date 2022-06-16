package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedContentPage {
	
WebDriver driver;
	
	@FindBy(id = "Featuredcontent")
	WebElement featuredcontent;
	
	//Constructor of the page class
	public FeaturedContentPage(WebDriver driver) {
		
		
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
    //Page action 
	
	public String featuredcontentmethod() {
		featuredcontent.getText();
		return featuredcontentmethod();
		
	}

}
