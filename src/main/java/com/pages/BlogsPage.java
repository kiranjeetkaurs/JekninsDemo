package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogsPage {
	
WebDriver driver;
	
	@FindBy(id = "BlogContent")
	WebElement blogcontent;
	
	//Constructor of the page class
	public BlogsPage(WebDriver driver) {
		
		
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
    //Page action 
	
	public String BlogContentMethod() {
	/*	blogcontent.getText();
		return BlogContentMethod();  */
		
		String bc = blogcontent.getText();
		return bc;
		
	}

}
