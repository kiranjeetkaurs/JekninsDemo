package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.FeaturedContentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeaturedContentSteps {
	
	private FeaturedContentPage featured = new FeaturedContentPage(DriverFactory.getDriver());
	
	@Given("User is on the Dietician Website")
	public void user_is_on_the_dietician_website() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home");   
	   
	}

	@When("User lands on the Featured Content page")
	public void user_lands_on_the_featured_content_page() {
		
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Featured Content");   
	}

	@Then("user should see the Featured Content of the Page")
	public void user_should_see_the_featured_content_of_the_page() {
		featured.featuredcontentmethod();
	}


}
