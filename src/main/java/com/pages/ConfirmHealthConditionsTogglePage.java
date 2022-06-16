package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ConfirmHealthConditionsTogglePage {
	
	WebDriver driver;
	
	//locators
	@FindBy(id = "condition1Toggle")
	WebElement Condition1Toggle;
	
	@FindBy(id = "condition2Toggle")
	WebElement Condition2Toggle;
	
	@FindBy(id = "condition3Toggle")
	WebElement Condition3Toggle;
	
	@FindBy(id = "condition4Toggle")
	WebElement Condition4Toggle;
	
	@FindBy(xpath = "//a[@class=' Conditions-select']")
	WebElement SelectConditions;
	
	@FindBy(id = "CoMorbidicondition1Toggle")
	WebElement CoMorbidiCondition1Toggle;
	
	@FindBy(id = "CoMorbidicondition2Toggle")
	WebElement CoMorbidiCondition2Toggle;
	
	@FindBy(id = "CoMorbidicondition3Toggle")
	WebElement CoMorbidiCondition3Toggle;
	

	@FindBy(xpath = "///a[@class=' CoMorbidiConditions-sel']")
	WebElement SelAllCoMorbidiConditions;
	
	
	@FindBy(id = "Preference1Toggle")
	WebElement Preference1Toggle;
	

	@FindBy(id = "Preference2Toggle")
	WebElement Preference2Toggle;
	

	@FindBy(id = "Preference3Toggle")
	WebElement Preference3Toggle;
	


	@FindBy(xpath = "/a[@class=' Preference-sel']]")
	WebElement allPref;
	
	@FindBy(id = "ConfirmToggle")
	WebElement ConfirmBtnInToggle;
	
	
	
	//constructor of the page class
	public ConfirmHealthConditionsTogglePage(WebDriver driver) {
		
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	//action Pages
	
	public boolean ToggleOptionsVisible() {
		
		boolean C1Toggle = Condition1Toggle.isDisplayed();
		boolean C2Toggle = Condition2Toggle.isDisplayed();
		boolean C3Toggle = Condition3Toggle.isDisplayed();
		boolean C4Toggle = Condition4Toggle.isDisplayed();
		boolean CM1Toggle = CoMorbidiCondition1Toggle.isDisplayed();
		boolean CM2Toggle = CoMorbidiCondition2Toggle.isDisplayed();
		boolean CM3Toggle = CoMorbidiCondition3Toggle.isDisplayed();
		boolean P1Toggle = Preference1Toggle.isDisplayed();
		boolean P2Toggle = Preference2Toggle.isDisplayed();
		boolean P3Toggle = Preference3Toggle.isDisplayed();
	 
		
		if (C1Toggle & C2Toggle & C3Toggle & C4Toggle & CM1Toggle & CM2Toggle & CM3Toggle & P1Toggle & P2Toggle & P3Toggle) {
			System.out.println("All the Toggle Options are visible in the Menu option box");
			return true;	
		}
		else {
			System.out.println("The Toggle options are not visible on the screen");
			return false;
		}	
	}
	
	public boolean ConfirmBtn_Displayed() {
		if (ConfirmBtnInToggle.isDisplayed()) {
			System.out.println("The Confirm Button is Displayed");
			return true;
		}
		else {
			System.out.println("The Confirm Button is not Displayed");
			return false;
		}
	}
	
	public void UpdateConditions_usingToggle() {
		
		//Condition1Toggle.isSelected();
		
      List<WebElement> allConditions = driver.findElements(By.xpath("//a[@class=' Conditions-select']"));
		
		int totalNumConditions = allConditions.size();
		System.out.println("INFORMATION FOR " + totalNumConditions + " Health Conditions");        
		
		for (int i = 1; i <= totalNumConditions; i++) {
			SelectConditions.isSelected();
		}
		
	}
	
public void UpdateCoMorbidiConditions_usingToggle() {
		
      List<WebElement> allCoMorbidiConditions = driver.findElements(By.xpath("//a[@class=' CoMorbidiConditions-sel']"));
		
		int totalNumCoMorbidiConditions = allCoMorbidiConditions.size();
		System.out.println("INFORMATION FOR " + allCoMorbidiConditions + " Conditions");        
		
		for (int i = 1; i <= totalNumCoMorbidiConditions; i++) {
			SelAllCoMorbidiConditions.isSelected();
		}
		
	}
		public void SelectPreferences() {
			List<WebElement> allPreferences = driver.findElements(By.xpath("//a[@class=' Preference-sel']"));
			
			int totalPreferences = allPreferences.size();
			System.out.println("INFORMATION FOR " + allPreferences + " Preferences");        
			
			for (int i = 1; i <= totalPreferences; i++) {
				allPref.isSelected();
			}
			
		}
		
	public void ConfirmBtn_Click() {
		ConfirmBtnInToggle.click();
	}
	
	
	public boolean DisabledToggles() {
		Actions actions = new Actions(driver);
		
		if (actions.click(ConfirmBtnInToggle) == null){
			
			SelectConditions.isEnabled();
			SelAllCoMorbidiConditions.isEnabled();
			allPref.isEnabled();
			return true;
		 }
		else 
			return false;
				
		} 
	
}
