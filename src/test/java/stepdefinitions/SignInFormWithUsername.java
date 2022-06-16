package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInFormWithUsername {
	WebDriver driver;
	SignInPage signinpage = new SignInPage(DriverFactory.getDriver());
	
	
	@When("User lands on Sign In page")
	public void user_lands_on_sign_in_page() {
		DriverFactory.getDriver().get(signinpage.SignInPageUrl);
	
	}

	@Then("User should see a form with heading {string} and SIGN IN button")
	public void user_should_see_a_form_with_heading_and_sign_in_button(String form_heading) {
	    String header = signinpage.getHeader();
	    Assert.assertEquals(header, form_heading);
	    //Verify SIGN IN button is displayed
	    Assert.assertEquals(true, signinpage.signIn());
	}

	@Given("User is on Sign In Page")
	public void user_is_on_sign_in_page() {
		DriverFactory.getDriver().get(signinpage.SignInPageUrl);
	}

	@When("User clicks Sign In Button in the Sign In form with all fields empty")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
	    signinpage.emptyFields();
	    signinpage.signInBtn();	    
	}

	@Then("User should get error message\"Please fill out the mandatory fields\"")
	public void user_should_get_error_message_please_fill_out_the_mandatory_fields() {
		//Print error message
		System.out.println("Error message: "+signinpage.responseMessageVerification());
	}

	@When("User enters values for {string} and {string} and click on SIGN IN button")
	public void user_enters_values_for_and_and_click_on_sign_in_button(String username, String password) {
		signinpage.userName(username);
	    signinpage.password(password);
	    signinpage.signInBtn();
	}

	@Then("User should get {string} response")
	public void user_should_get_response(String response) {
	    String signInResponse = signinpage.responseMessageVerification();
	    Assert.assertEquals(response, signInResponse);
	}

	@When("User clicks on Forgot Password link")
	public void user_clicks_on_forgot_password_link() {
	    signinpage.clickForgotPwdLink();
	}

	@Then("User should be directed to {string} link")
	public void user_should_be_directed_to_link(String link) {
	    String title = signinpage.getTitle();
	    //Verify title of the page "Reset password"
	    Assert.assertEquals(title, link);
	}

	@When("User clicks on Not a member yet link")
	public void user_clicks_on_not_a_member_yet_link() {
	    signinpage.clickNotMemberLink();
	}

	@Then("User will land on Register Page")
	public void user_will_land_on_register_page() {
	    signinpage.userOnRegisterPage();
	}


	

}
