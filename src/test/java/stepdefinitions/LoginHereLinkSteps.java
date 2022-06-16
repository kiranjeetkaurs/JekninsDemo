package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MandatoryFields;
import com.pages.RegisterPageTitle;
import com.pages.SignUpForm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHereLinkSteps {

private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());
private SignUpForm signUpForm= new SignUpForm(DriverFactory.getDriver());


@When("User clicks {string} link.")
public void user_clicks_link(String string) {
   signUpForm.clickLoginLink();
}

@Then("User is re-directed to Sign In Page")
public void user_is_re_directed_to_sign_in_page() {
    signUpForm.logInUrl();
}
}
