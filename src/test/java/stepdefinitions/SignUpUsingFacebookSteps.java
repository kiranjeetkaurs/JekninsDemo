package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MandatoryFields;
import com.pages.RegisterPageTitle;
import com.pages.SignUpForm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpUsingFacebookSteps {

private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());
private SignUpForm signUpForm= new SignUpForm(DriverFactory.getDriver());

@When("User clicks Facebook Button in the Sign Up with your Email form .")
public void user_clicks_facebook_button_in_the_sign_up_with_your_email_form() {
	signUpForm.clickFaceBookButton();
	signUpForm.redirectToSignUp(true);
}

@Then("User successfully login with Facebook account.")
public void user_successfully_login_with_facebook_account() {
    signUpForm.signUpWithFacebook(null);
}
}
