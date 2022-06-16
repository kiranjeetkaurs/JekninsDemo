package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.ContactusPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactusSteps {
	
	private ContactusPage Contact = new ContactusPage(DriverFactory.getDriver());
	
	
	
	@Given("User is on Contact us page")
	public void user_is_on_contact_us_page() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Contactus"); 
	}

	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
	    Contact.ClickContactusBtn();
	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
	    Contact.ValidateEmptyFields();
	}

	
	@When("User enters invalid data in <First Name> field")
	public void user_enters_invalid_data_in_first_name_field() {
	    Contact.ValidateFirstName("fhj34^");
	}

	@Then("User should get appropriate error message for First Name")
	public void user_should_get_appropriate_error_message_for_first_name() {
	 System.out.println("Please enter a Valid First Name");  
	}

	
	@When("User enters invalid data in <Last Name> field")
	public void user_enters_invalid_data_in_last_name_field() {
	    Contact.ValidateLastName("dhjk456@h");
	}

	@Then("User should get appropriate error message for Last Name")
	public void user_should_get_appropriate_error_message_for_last_name() {
		System.out.println("Please enter a Valid Last Name"); 
	}

	
	@When("User enters invalid data in <Email> field")
	public void user_enters_invalid_data_in_email_field() {
	    Contact.ValidateEmail("hcifk2345.c@ggo");
	}

	@Then("User should get appropriate error message for email")
	public void user_should_get_appropriate_error_message_for_email() {
	    System.out.println("Please enter an valid email ID");
	}

	@When("User enters junk data in <Subject> field")
	public void user_enters_junk_data_in_subject_field() {
	   Contact.ValidateSubject("wejj42643");
	}

	@Then("User should get appropriate error message for Subject")
	public void user_should_get_appropriate_error_message_for_subject() {
	   System.out.println("Please enter valid Data in the Subject field");
	}

	@When("User enters invalid data in <Write your Message Here> field")
	public void user_enters_invalid_data_in_write_your_message_here_field() {
	    Contact.ValidateMsgField("sfdj457hd");
	}

	@Then("User should get appropriate error message for Message")
	public void user_should_get_appropriate_error_message_for_message() {
	    System.out.println("Please enter valid data in the Message field");
	}


}
