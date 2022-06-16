package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorTeamPage {
	
	WebDriver driver;
	
	//Locators
	@FindBy(id = "DoctorHead")
	WebElement doctornamehead;
	
	@FindBy(xpath = "/input/doctor1")
	WebElement doctor1;
	
	@FindBy(xpath = "/input/doctor2")
	WebElement doctor2;
	
	@FindBy(xpath = "/input/doctor3")
	WebElement doctor3;
	
	
	//Constructor of the page class
		public DoctorTeamPage(WebDriver driver) {
			
			
			this.driver=driver;
			try {
				PageFactory.initElements(driver, this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public String DoctorNameHead() {
			
			String Doctorname = doctornamehead.getText();
			System.out.println(Doctorname);
			return Doctorname;
		}
		
		public boolean getThreeDoctorRecords(String Doctor1, String Doctor2, String Doctor3) {
			
			if( (( doctor1.getText() ).equals(Doctor1)) &&  ((doctor2.getText() ).equals(Doctor2)) 
					&& (( doctor3.getText() ).equals(Doctor3)))
	{
				return true;
			}
			else {
			return false;
			}
		}

}
