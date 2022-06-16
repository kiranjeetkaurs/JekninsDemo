package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RedirectionsFromHomePage {

	private WebDriver driver;
	
	//navigation Pages
	public String ProductUrl = "https://www.dieticiangroup.com/PRODUCT";
	public String ClientUrl = "https://www.dieticiangroup.com/Clients";
	public String TeamUrl = "https://www.dieticiangroup.com/Team";
	public String RegisterUrl = "https://www.dieticiangroup.com/register";
	public String AboutPageUrl = "https://www.dieticiangroup.com/About";
	public String FeaturedUrl = "https://www.dieticiangroup.com/Featured Content";
	public String BlogUrl = "https://www.dieticiangroup.com/Blog";
	public String ContactUsUrl = "https://www.dieticiangroup.com/Contactus";
	public String SignInUrl = "https://www.dieticiangroup.com/SignIn";
	
	
	//1. by locators
	@FindBy(linkText = "PRODUCT")
	WebElement ProductLink;
	
	@FindBy(linkText = "CLIENTS")
	WebElement ClientsLink;
	
	@FindBy(linkText = "TEAM")
	WebElement TeamLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement RegisterLink;
	
	
	@FindBy(linkText = "About")
	WebElement AboutLink;
	
	@FindBy(linkText = "Featured")
	WebElement FeaturedLink;
	
	@FindBy(linkText = "Blog")
	WebElement BlogLink;
	
	@FindBy(linkText = "Contact us")
	WebElement ContactUsLink;
	
	@FindBy(linkText = "Sign In")
	WebElement SignInLink;
	
	
	//2.constructor of the page class
			public RedirectionsFromHomePage (WebDriver driver) {
					this.driver=driver;
					try {
						PageFactory.initElements(driver, this);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
			}
			
			// 3.Page actions
			
			//Product Tab
			public void ClickOnProductLink() {
				ProductLink.click();
			}
			
			public ProductPage RedirectToProductPage() {

			    driver.navigate();	
			    return new ProductPage(driver);
				
			}
			
			
			//Client Testimonials Tab
			public void ClickOnClientLink() {
				ClientsLink.click();
			}
			
			public ClientTestimonialPage RedirectToClientsPage() {
			
				driver.navigate();
				return new ClientTestimonialPage(driver);
			}
			
			
			//TEAM Tab 
			public void ClickOnTeamLink() {
				TeamLink.click();
			}
			
			public DoctorTeamPage RedirectToTeamPage() {
				
				driver.navigate();
				return new DoctorTeamPage(driver);
			}
			
			
			//SignUp/Register Tab
			
			public void ClickOnRegisterLink() {
				RegisterLink.click();
			}
			
			public SignUpForm RedirectRegisterPage() {
				driver.navigate();
				return new SignUpForm(driver);
			}
			
			
			//About Tab 
			public void ClickOnAboutLink() {
				AboutLink.click();
			}
			
			public AboutWebsitePage RedirectToAboutPage() {
				driver.navigate();
				return new AboutWebsitePage(driver);
			}
			
			
			//Featured Tab 
			public void ClickOnFeaturedLink() {
				FeaturedLink.click();
			}
			
			public FeaturedContentPage RedirectToFeaturedPage() {
				
				driver.navigate();
				return new FeaturedContentPage(driver);
			}
			
			
			//Blogs Page
			public void ClickOnBlogPage() {
				BlogLink.click();
				
			}
			public BlogsPage RedirectToBlogPage() {
				driver.navigate();
				return new BlogsPage(driver);
				
			}
			
			
			//Contact us Page 
			
			public void ClickonContactUs() {
				ContactUsLink.click();
			}
			
			public ContactusPage RedirectToContactusPage() {
				
				driver.navigate();
				return new ContactusPage(driver);
			}
			
			
			//Sign-in Page
			
			public void ClickonSignInIcon() {
				SignInLink.click();
			}
			public SignInPage RedirectToSingInPage() {
				
				driver.navigate();
				return new SignInPage(driver);
			}
	
	
}
