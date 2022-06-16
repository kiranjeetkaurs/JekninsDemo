package stepdefinitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageTitle {
	
	//WebDriver driver;

	//RedirectionsFromHomePage homepage = new RedirectionsFromHomePage(DriverFactory.getDriver());
    SignInPage signinpage = new SignInPage(DriverFactory.getDriver());
	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		DriverFactory.getDriver().get(signinpage.DieticianHomePage);
		//Click on sign in icon homepage.methodname();
		DriverFactory.getDriver().get(signinpage.SignInPageUrl);
	    
	}

	@When("User click on icon symbol to Sign In")
	public void user_click_on_icon_symbol_to_sign_in() {
	    // Click on sign in icon on home page
		//SignInLink homepage.clickSignInLink();
		System.out.println("Click on sign in icon");
	    
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String title) {
	   String signInPageTitle = signinpage.getTitle();
	   Assert.assertEquals(title, signInPageTitle);
	}

}
