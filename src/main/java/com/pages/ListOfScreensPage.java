package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListOfScreensPage {
	
	WebDriver driver = null;
	//1. Applications URLs and web element locators
	public String SignInPageUrl = "https://www.dieticiangroup.com/SignIn";
	public String DieticianHomePage="https://www.dieticiangroup.com";
	public String RegisterUrl = "https://www.dieticiangroup.com/Register";
	public String forgotPwdUrl = "https://www.dieticiangroup.com/forgotPassword";
	public String teamURL="https://www.dieticiangroup.com/team";
	public String testimonnialsURL="https://www.dieticiangroup.com/Testimonials";
	public String featuresURL="https://www.dieticiangroup.com/ProductFeatures";
	public String contactURL="https://www.dieticiangroup.com/Contact";
	public String blogsURL="https://www.dieticiangroup.com/Blogs";
	public String featuredContentURL="https://www.dieticiangroup.com/featuredContent";
	public String viewDietURL = "https://www.dieticiangroup.com/ViewDiet";
	public String viewReportURL = "https://www.dieticiangroup.com/ViewReports";
	public String addPatientURL = "https://www.dieticiangroup.com/AddPatient";
	public String dieticianHomeURL = "https://www.dieticiangroup.com/Home";
	public String myPatientsURL = "https://www.dieticiangroup.com/MyPatients";
	public String createPlanURL = "https://www.dieticiangroup.com/CreatePlan";
	public String username = "Dietician15";
	public String password = "TestDiet@123";
	
	
	@FindBy(xpath="//div[contains(@class,'menu-label')]")
	@CacheLookup
	WebElement list;
	
	@FindBy(xpath="//div[contains(@id,'public')]")
	@CacheLookup
	WebElement public_menu;
	
	@FindBy(xpath="//span[@class='menu-label']")
	@CacheLookup
	WebElement menu_name;
	
	// Links under public
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[1]")
	@CacheLookup
	WebElement user_signIn;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[2]")
	@CacheLookup
	WebElement register;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[3]")
	@CacheLookup
	WebElement team;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[4]")
	@CacheLookup
	WebElement testimonials;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[5]")
	@CacheLookup
	WebElement forgotPwd;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[6]")
	@CacheLookup
	WebElement prodFeatures;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[7]")
	@CacheLookup
	WebElement contact;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[8]")
	@CacheLookup
	WebElement blogs;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[9]")
	@CacheLookup
	WebElement content;
	
	@FindBy(xpath="//div[contains(@id,'public')]/li[10]")
	@CacheLookup
	WebElement home;
	
	//Links under dietician
	@FindBy(xpath="//div[contains(@id,'dietician')]")
	@CacheLookup
	WebElement dietician_menu;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[1]")
	@CacheLookup
	WebElement view_diet;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[2]")
	@CacheLookup
	WebElement view_report;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[3]")
	@CacheLookup
	WebElement add_patient;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[4]")
	@CacheLookup
	WebElement Dietician_home;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[5]")
	@CacheLookup
	WebElement myPatients;
	
	@FindBy(xpath="//div[contains(@id,'dietician')]/li[6]")
	@CacheLookup
	WebElement create_plan;
	
	//2.constructor of the page class
	public ListOfScreensPage (WebDriver driver) {
		this.driver=driver;
		try {
			
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
	//3. Page actions
	public void clickListOfScreensMenu() {
		if (list.isDisplayed()==true) {
			if (isClickable(list, driver)==true) {
				System.out.println("List of Screens menu is clickable");
				list.click();
			}
			else
				System.out.println("List of Screens menu is not clickable");
		}
	}
	
	public String listName() {
		String menu = public_menu.getText();
		return menu;
	}
	
	public String diet_menu() {
		String menu = dietician_menu.getText();
		return menu;
	}
	
	public boolean isClickable(WebElement el, WebDriver driver) 
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
	public String getTitle() {
		 String title = driver.getTitle();
		 return title;
	 }
	public String currentURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void verifyPublicLinks(String link) {
		
		switch (link) {
		case "User Sign In":
			if(user_signIn.isDisplayed()==true) {
			if(user_signIn.getText()==link ) {
				user_signIn.click();
				
			}}
			break;
		case "Register":
			if(register.isDisplayed()==true) {
			if(register.getText()==link ) {
				register.click();
				
			}}
			break;
		case "Team":
			if(team.isDisplayed()==true) {
			if(team.getText()==link ) {
				team.click();
				
			}}
			break;
			
		case "Testimonials":
			if(testimonials.isDisplayed()==true) {
			if(testimonials.getText()==link ) {
				testimonials.click();
				
			}}
			break;
		case "Forgot Password":
			if(forgotPwd.isDisplayed()==true) {
			if(forgotPwd.getText()==link ) {
				forgotPwd.click();
				
			}}
			break;
		case "Product Features":
			if(prodFeatures.isDisplayed()==true) {
			if(prodFeatures.getText()==link ) {
				prodFeatures.click();
				
			}}
			break;
		case "Contact":
			if(contact.isDisplayed()==true) {
			if(contact.getText()==link ) {
				contact.click();
				
			}}
			break;
		case "Blogs":
			if(blogs.isDisplayed()==true) {
			if(blogs.getText()==link ) {
				blogs.click();
				
			}}
			break;
		case "Featured Content":
			if(content.isDisplayed()==true) {
			if(content.getText()==link ) {
				content.click();
				
			}}
			break;
		case "Home":
			if(home.isDisplayed()==true) {
			if(home.getText()==link ) {
				home.click();
				
			}}
			break;
		default:
			System.out.println("Invalid link");
			break;}
		}
		
		public void verifyDieticianLinks(String link) {
			
			switch (link) {
			case "View Recent Diets":
				if(view_diet.isDisplayed()==true) {
				if(view_diet.getText()==link ) {
					view_diet.click();
					
				}}
				break;
			case "View Recent Test Reports":
				if(view_report.isDisplayed()==true) {
				if(view_report.getText()==link ) {
					view_report.click();
					
				}}
				break;
			case "Add New Patient":
				if(add_patient.isDisplayed()==true) {
				if(add_patient.getText()==link ) {
					add_patient.click();
					
				}}
			case "Dietician Home":
				if(Dietician_home.isDisplayed()==true) {
				if(Dietician_home.getText()==link ) {
					Dietician_home.click();
					
				}}
				break;
			case "My Patients":
				if(myPatients.isDisplayed()==true) {
				if(myPatients.getText()==link ) {
					myPatients.click();
					
				}}
				break;
			case "Confirm Conditions and Create Plan":
				if(create_plan.isDisplayed()==true) {
				if(create_plan.getText()==link ) {
					create_plan.click();
					
				}}
				break;
			default:
				System.out.println("Invalid link");
				break;
			}
		
	}

     public String DieticianLinks(String link) {
			String url=null;
			switch (link) {
			case "View Recent Diets":
				url = viewDietURL;
				break;
			case "View Recent Test Reports":
				url = viewReportURL;
				break;
			case "Add New Patient":
				url = addPatientURL;
				break;
			case "Dietician Home":
				url = dieticianHomeURL;
				break;
			case "My Patients":
				url = myPatientsURL;
				break;
			case "Confirm Conditions and Create Plan":
				url = createPlanURL;
				break;
			
			default:
				System.out.println("Invalid link");
				
				break;
			}
			return url;
			
		
	}
}
