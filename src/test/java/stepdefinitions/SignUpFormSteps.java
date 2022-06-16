package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MandatoryFields;
import com.pages.RegisterPageTitle;
import com.pages.SignUpForm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpFormSteps {

private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());
private SignUpForm signUpForm= new SignUpForm(DriverFactory.getDriver());

@Then("User should see a form with heading {string}, to sign up using mobile number")
public void user_should_see_a_form_with_heading_to_sign_up_using_mobile_number(String string) {
	signUpForm.heading();
}

@Then("User should see a button with text {string} in the Sign Up form")
public void user_should_see_a_button_with_text_in_the_sign_up_form(String string) {
   	signUpForm.buttonText();
}

@When("User clicks SIGN UP Button in the Sign Up form with all fields empty")
public void user_clicks_sign_up_button_in_the_sign_up_form_with_all_fields_empty() {
    signUpForm.clickSignUpButton();   
	
}

@Then("User should see a message {string}")
public void user_should_see_a_message(String string) {
	signUpForm.ValidateEmptyFields();
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for First Name, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
    	signUpForm.ValidateInputFields("firstName");
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Last Name, valid values for the remaining fields")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
   	signUpForm.ValidateInputFields("lastName");
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering Aphanumeric text for Mobile Number, valid values for the remaining fields .")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_aphanumeric_text_for_mobile_number_valid_values_for_the_remaining_fields() {
    	signUpForm.ValidateInputFields("mobile");
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Any other field, valid values for the remaining fields.")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_any_other_field_valid_values_for_the_remaining_fields() {
    
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering  invalid email Id for Email, valid values for the remaining fields.")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_email_id_for_email_valid_values_for_the_remaining_fields() {
   	signUpForm.ValidateInputFields("email");
}

@When("User clicks SIGN UP Button in the Sign Up form  by entering  invalid password, valid values for the remaining fields.")
public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
    	signUpForm.ValidateInputFields("password");
}

@When("User clicks SIGN UP Button in the Sign Up")
public void user_clicks_sign_up_button_in_the_sign_up() {
    signUpForm.clickSignUpButton();
}

@Then("User is re-directed to Sign In page.")
public void user_is_re_directed_to_sign_in_page() {
    signUpForm.redirectToSignUp(true);
}

}
