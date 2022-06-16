package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		
		//Constructor of the page class
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//No Proposed Screens for the Product Page available. 

}
