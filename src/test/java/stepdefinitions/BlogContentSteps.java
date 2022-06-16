package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.BlogsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogContentSteps {
	
	private BlogsPage blogpage = new BlogsPage(DriverFactory.getDriver());
	
	@Given("User is on the Dietician Website")
	public void user_is_on_the_dietician_website() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home");  
	}

	@When("User lands on the Blogs page")
	public void user_lands_on_the_blogs_page() {
		
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Blog");
		   
	}

	@Then("user should see the content of the Blog")
	public void user_should_see_the_content_of_the_blog() {
	    blogpage.BlogContentMethod();
	}


}
