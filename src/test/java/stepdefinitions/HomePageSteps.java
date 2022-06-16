package stepdefinitions;



import org.openqa.selenium.WebDriver;


import com.factory.DriverFactory;
import com.pages.HomePage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	public static WebDriver driver;
	
	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		System.out.println("User is on the browser");
	}

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
	
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home");   
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
	   
		homepage.getHomeTitle();
		
	}

	@Then("User should see a logo image with company name on the Home Page")
	public void user_should_see_a_logo_image_with_company_name_on_the_home_page() {
	    
		homepage.gethomelogo();
	}


}
