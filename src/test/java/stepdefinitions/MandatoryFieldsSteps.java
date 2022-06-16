package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.RegisterPageTitle;
import com.pages.MandatoryFields;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MandatoryFieldsSteps {

private RegisterPageTitle registerPageTitle=new RegisterPageTitle(DriverFactory.getDriver());
private MandatoryFields mandatoryFields= new MandatoryFields(DriverFactory.getDriver());


@Given("Users is on dietician website")
public void user_is_on_dietician_website() {
   String dieticianUrl = registerPageTitle.homePage;
   DriverFactory.getDriver().get(dieticianUrl);
}
    
@When("Users lands on register page")
public void user_lands_on_register_page() {
   String registerUrl = registerPageTitle.registerUrl;
}

@Then("Users should see all mandatory fields with star symbol on top of those fields")
public void user_should_see_all_mandatory_fields_with_star_symbol_on_top_of_those_fields() {
	mandatoryFields.checkMandatoryFields();
}

}
