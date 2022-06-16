package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.ConfirmHealthConditionsTogglePage;
import com.pages.ContactusPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmHealthConditionsToggleSteps {
	
	private ConfirmHealthConditionsTogglePage chctp = new ConfirmHealthConditionsTogglePage(DriverFactory.getDriver());

	
	
	@Given("User is logged on to Dietician website")
	public void user_is_logged_on_to_dietician_website() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Home"); 
	}

	@When("User lands on the Confirm Conditions and Create Plan page")
	public void user_lands_on_the_confirm_conditions_and_create_plan_page() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");  
	}

	@Then("User should see toggle option menu box to update health conditions")
	public void user_should_see_toggle_option_menu_box_to_update_health_conditions() {
		chctp.ToggleOptionsVisible();
	}

	@Then("User should see Confirm button in the toggle option menu box")
	public void user_should_see_confirm_button_in_the_toggle_option_menu_box() {
	    chctp.ConfirmBtn_Displayed();
	}

	@Then("User can update the health conditions using the Toggle buttons")
	public void user_can_update_the_health_conditions_using_the_toggle_buttons() {
		chctp.UpdateConditions_usingToggle();
		chctp.UpdateCoMorbidiConditions_usingToggle();
	    chctp.SelectPreferences();
	}
	

	@Given("User is on Create Plan Page")
	public void user_is_on_create_plan_page() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan"); 
	}

	@When("User clicks on Confirm button in the toggle option menu box")
	public void user_clicks_on_confirm_button_in_the_toggle_option_menu_box() {
	    chctp.ConfirmBtn_Click();
	}

	@Then("User cannot update the health conditions in the toggle option menu box")
	public void user_cannot_update_the_health_conditions_in_the_toggle_option_menu_box() {
	    chctp.DisabledToggles();
	}



}
