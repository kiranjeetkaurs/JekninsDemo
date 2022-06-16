package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.RedirectionsFromHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedirectionsFromHomePageSteps {
	
	private RedirectionsFromHomePage Redirectionhome = new RedirectionsFromHomePage(DriverFactory.getDriver());
	
	
	@Given("User is on the Home Page")
	public void user_is_on_the_home_page() {

		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home");   
	}

	@When("User clicks on the PRODUCT link on the Home Page")
	public void user_clicks_on_the_product_link_on_the_home_page() {
		Redirectionhome.ClickOnProductLink();
	}

	@Then("User is re-directed to the PRODUCT page")
	public void user_is_re_directed_to_the_product_page() {
		Redirectionhome.RedirectToProductPage();
	    Redirectionhome.ProductUrl.toString();
	}

	
	@When("User clicks on the CLIENTS link on the Home Page")
	public void user_clicks_on_the_clients_link_on_the_home_page() {
	   Redirectionhome.ClickOnClientLink();
	}

	@Then("User is re-directed to the CLIENTS page")
	public void user_is_re_directed_to_the_clients_page() {
		Redirectionhome.RedirectToClientsPage();
	    Redirectionhome.ClientUrl.toString();
	}

	
	@When("User clicks on the TEAM link on the Home Page")
	public void user_clicks_on_the_team_link_on_the_home_page() {
		Redirectionhome.ClickOnTeamLink();	    
	}

	@Then("User is re-directed to the TEAM page")
	public void user_is_re_directed_to_the_team_page() {
	   Redirectionhome.RedirectToTeamPage();
	   Redirectionhome.TeamUrl.toString();
	}

	
	@When("User clicks on the REGISTER link on the Home Page")
	public void user_clicks_on_the_register_link_on_the_home_page() {
	    Redirectionhome.ClickOnRegisterLink();
	}

	@Then("User is re-directed to the REGISTER page")
	public void user_is_re_directed_to_the_register_page() {
		Redirectionhome.RedirectRegisterPage();
	    Redirectionhome.RegisterUrl.toString();
	}

	
	@When("User clicks on the About link on the Home Page")
	public void user_clicks_on_the_about_link_on_the_home_page() {
	   Redirectionhome.ClickOnAboutLink();
	}

	@Then("User is re-directed to the About page")
	public void user_is_re_directed_to_the_about_page() {
	   Redirectionhome.RedirectToAboutPage();
	   Redirectionhome.AboutPageUrl.toString();
	}

	
	@When("User clicks on the Featured link on the Home Page")
	public void user_clicks_on_the_featured_link_on_the_home_page() {
	    Redirectionhome.ClickOnFeaturedLink();
	}

	@Then("User is re-directed to the Featured content page")
	public void user_is_re_directed_to_the_featured_content_page() {
	   Redirectionhome.RedirectToFeaturedPage();
	   Redirectionhome.FeaturedUrl.toString();
	}

	
	@When("User clicks on the Blog link on the Home Page")
	public void user_clicks_on_the_blog_link_on_the_home_page() {
	    Redirectionhome.ClickOnBlogPage();
	}

	@Then("User is re-directed to the Blogs page")
	public void user_is_re_directed_to_the_blogs_page() {
	    Redirectionhome.RedirectToBlogPage();
	    Redirectionhome.BlogUrl.toString();
	}

	
	@When("User clicks on the Contact us link on the Home Page")
	public void user_clicks_on_the_contact_us_link_on_the_home_page() {
		Redirectionhome.ClickonContactUs();
	}

	@Then("User is re-directed to the Contact us page")
	public void user_is_re_directed_to_the_contact_us_page() {
	   Redirectionhome.RedirectToContactusPage();
	   Redirectionhome.ContactUsUrl.toString();

	}

	
	@When("User clicks on the Sign In link on the Home Page")
	public void user_clicks_on_the_sign_in_link_on_the_home_page() {
	   Redirectionhome.ClickonSignInIcon();
	}

	@Then("User is re-directed to the Sign In page")
	public void user_is_re_directed_to_the_sign_in_page() {
		Redirectionhome.RedirectToSingInPage();
		Redirectionhome.SignInUrl.toString();
	}


}
