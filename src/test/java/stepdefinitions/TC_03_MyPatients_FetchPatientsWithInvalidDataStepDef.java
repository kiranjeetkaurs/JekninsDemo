package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC_03_MyPatients_FetchPatientsWithInvalidDataStepDef {
	
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User is on my patients page")
	public void user_is_on_my_patients_page() {
	     
	     
	}

	@When("User types in anything other than [{int}-{int}] in phone number field")
	public void user_types_in_anything_other_than_in_phone_number_field(Integer int1, Integer int2) {
	     
	
		mpPage.getInvalidDataValidation("invalidPhoneNo");
	     
	}


	@Then("It must throw error message and discontinue search action.")
	public void it_must_throw_error_message_and_discontinue_search_action() {
	     
		Assert.assertEquals( mpPage.validationErrorMsg(), "It must throw error message and discontinue search action");
	    
	}

	@When("User types in anything other valid character in email address field")
	public void user_types_in_anything_other_valid_character_in_email_address_field() {
	     
		mpPage.getInvalidDataValidation("invalidEmailAdd");
	}

	@When("User types in anything other alphabets in name field")
	public void user_types_in_anything_other_alphabets_in_name_field() {
	     
		mpPage.getInvalidDataValidation("invalidName");
	}



}
