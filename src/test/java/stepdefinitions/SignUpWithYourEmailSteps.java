package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MandatoryFields;
import com.pages.RegisterPageTitle;
import com.pages.SignUpForm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpWithYourEmailSteps {


private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());
private SignUpForm signUpForm= new SignUpForm(DriverFactory.getDriver());


@When("User lands on register page")
public void user_lands_on_register_page() {
	String registerUrl = registerPageTitle.registerUrl;
}

@Then("User should see a form with heading {string}, to sign up using Email Id")
public void user_should_see_a_form_with_heading_to_sign_up_using_email_id(String string) {
	signUpForm.heading();
}

@Then("User should see a button with text {string} in the Sign Up with your Email form")
public void user_should_see_a_button_with_text_in_the_sign_up_with_your_email_form(String string) {
	signUpForm.buttonText();
}

@When("User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty")
public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_with_all_fields_empty() {
	 signUpForm.clickSignUpButton(); 
}

@Then("Users should see a message {string}")
public void users_should_see_a_message(String string) {
	signUpForm.ValidateEmptyFields();
}

@When("User clicks SIGN UP Button in the Sign Up with your Email form  by entering numeric text for First Name, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("firstName");
}

@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Last Name, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("lastName");
}

@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for User Name, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_user_name_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("mobile");
}

@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Email Address, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_email_address_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("email");
}

@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid password, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("password");
}

@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value ,valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_a_value_that_is_different_than_the_password_field_value_valid_values_for_the_remaining_fields() {
	signUpForm.ValidateInputFields("password");
}

@When("User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values for the all fields")
public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_by_entering_valid_values_for_the_all_fields() {
	signUpForm.redirectToSignUp(true);
}

@Then("User is re-directed to Sign In page")
public void user_is_re_directed_to_sign_in_page() {
	 signUpForm.redirectToSignUp(true);
}

}
