package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.ClientTestimonialPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClientTestimonialPageSteps {
	
	private ClientTestimonialPage clienttestimonial = new ClientTestimonialPage(DriverFactory.getDriver());
	
	@Given("User is on the Dietician Website")
	public void user_is_on_the_dietician_website() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home");   
	}

	@When("User lands on the Client Testimonial page")
	public void user_lands_on_the_client_testimonial_page() {
		
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Clients");
	   
	}

	@Then("user should see the Client Testimonials")
	public void user_should_see_the_client_testimonials() {
		
		clienttestimonial.clientTestimony();
	   

	}



}
