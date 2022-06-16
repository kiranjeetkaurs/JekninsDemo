package com.pages;

import com.factory.DriverFactory;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.ConfigReader;

public class DieticianHomepage{

	WebDriver driver;
	public String homeurl="http://www.dieticiangroup.com/DieticianHome";

	public DieticianHomepage(WebDriver driver) {
	  super();
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@FindBy(id = "home")
	@CacheLookup
	WebElement Home;
	@FindBy(id = "newpatient")
	@CacheLookup
	WebElement NewPatient;
	@FindBy(id = "MyPatients")
	@CacheLookup
	WebElement MyPatients;
	@FindBy(id = "Dietplans")
	@CacheLookup
	WebElement Dietplans;
	@FindBy(id = "Announcements")
	@CacheLookup
	WebElement BannerAnnouncements;
	@FindBy(id = "UserName")
	@CacheLookup
	WebElement UserName;
	@FindBy(xpath = ("//*[contains(@id,'Message']"))
	@CacheLookup
	List<WebElement> LoggedinMessage;
	@FindBy(xpath = ("//*[contains(@id,'Message']"))
	@CacheLookup
	WebElement LoggedMessage;
	@FindBy(xpath = ("//img[@title='DietImage']"))
	@CacheLookup
	WebElement DietImage;
	@FindBy(id = "Content")
	@CacheLookup
	WebElement DietContent;
	@FindBy(id = "SignOut")
	@CacheLookup
	WebElement btnSignout;
	
	public boolean funDieticianHomeMenu_IsDisplayed() {
		boolean Home1 = Home.isDisplayed();
		boolean NewPatient1 = NewPatient.isDisplayed();
		boolean MyPatient = MyPatients.isDisplayed();
		boolean Dietplan = Dietplans.isDisplayed();
		return Home1 && NewPatient1 && MyPatient && Dietplan;
	}

	public boolean funBannerAnnouncements() {
		return BannerAnnouncements.isDisplayed();

	}

	public boolean funUserName() {
		if (LoggedinMessage.size() != 0) {
			if (LoggedMessage.getText().equalsIgnoreCase("Logged in as Sam Ganguly")) {
				String Message = LoggedMessage.getText().toString();
				System.out.println(Message);
				return true;
			}
		}
		return false;

	}

	public boolean funDietImage() {
		boolean Dimage = DietImage.isDisplayed();
		boolean DContent=false;
		
		if (DietContent.getText() != null) {
			DContent = DietContent.isDisplayed();
		}
		return Dimage && DContent;
	}
     
	public void funHome() {
		Home.click();
	}

	public void funNewPatient() {
		NewPatient.click();
	}

	public void funMyPatients() {
		MyPatients.click();
	}

	public void funDietplans() {
		Dietplans.click();
	}

	public void funbtnSignout() {
		btnSignout.click();
	}
	public boolean btnSignoutfun() {
		if (btnSignout.isDisplayed() && btnSignout.isEnabled());
		{
			return true;
		}
	}
	
	public String VerifyUrl() {
		return driver.getCurrentUrl();
	}
	
	public String Verifytitle() {
		return driver.getTitle();
	}

}
