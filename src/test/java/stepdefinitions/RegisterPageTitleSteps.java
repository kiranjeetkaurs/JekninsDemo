package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.RegisterPageTitle;
import com.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageTitleSteps {

private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());

@Given("User on dietician website")
public void user_is_on_dietician_website() {
   String dieticianUrl = registerPageTitle.homePage;
   DriverFactory.getDriver().get(dieticianUrl);
}
    
@When("User land on register page")
public void user_lands_on_register_page() {
   String registerUrl = registerPageTitle.registerUrl;
}

@Then("user should see title of the page as {string}")
public void user_should_see_the_title_of_the_page_as(String string) {
	registerPageTitle.getPageTitle();
}

}
