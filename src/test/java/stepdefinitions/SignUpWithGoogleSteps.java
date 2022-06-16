package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MandatoryFields;
import com.pages.RegisterPageTitle;
import com.pages.SignUpForm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpWithGoogleSteps {

	private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
	private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());
	private SignUpForm signUpForm= new SignUpForm(DriverFactory.getDriver());

@When("User clicks Google Button in the Sign Up with your Email form .")
public void user_clicks_google_button_in_the_sign_up_with_your_email_form() {
	signUpForm.clickgoogleButton();
    
}

@Then("User successfully login with Google account.")
public void user_successfully_login_with_google_account() {
	signUpForm.redirectToSignUp(true);
}


}
