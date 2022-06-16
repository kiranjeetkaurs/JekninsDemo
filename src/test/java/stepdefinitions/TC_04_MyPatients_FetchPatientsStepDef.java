package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC_04_MyPatients_FetchPatientsStepDef {
	
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
	     
		mpPage.enterTextAndSearch("blank");
	     
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
	    
		Assert.assertTrue(mpPage.checkPatientDisplayed("patientCount"));
		   
	}

	@When("User clicks on search button with or without all fields empty")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
	     
		mpPage.enterTextAndSearch("data");
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
	     
		Assert.assertTrue(mpPage.checkPatientDisplayed("columnHeaderData"));
		
	}

	@Then("It shows action buttons for {string}, {string}, {string}")
	public void it_shows_action_buttons_for(String string, String string2, String string3) {
	     
		Assert.assertTrue(mpPage.checkPatientDisplayed("actionButtons"));
	}

	
}
