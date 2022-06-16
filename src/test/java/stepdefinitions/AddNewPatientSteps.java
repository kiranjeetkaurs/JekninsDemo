package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.AddNewPatientPage;
import com.pages.DieticianHomepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPatientSteps {
	
	AddNewPatientPage AddPatient;
	DieticianHomepage DieticianHome;
	public static WebDriver driver = DriverFactory.getDriver();

	public AddNewPatientSteps() {
		AddPatient = new AddNewPatientPage(driver);
	}
	

@Given("User logged in Dietcian Home Page as Dietician and Clicks AddNewPatient tab")
public void user_logged_in_dietcian_home_page_as_dietician_and_clicks_add_new_patient_tab() {
	 driver.get(AddPatient.homeurl);
	//driver.get("https://www.dieticiangroup.com/DieticianHome");
}
	
@When("User is on Add New Patient Page")
public void user_is_on_add_new_patient_page() {
	DieticianHome.funNewPatient();
	// driver.get("https://www.dieticiangroup.com/AddNewPatient");
}

@Then("User should see Add New Patient form displayed with Menu Tabs")
public void user_should_see_add_new_patient_form_displayed_with_menu_tabs() {
	String title = AddPatient.Verifytitle();
	String Url = AddPatient.VerifyUrl();
	assertEquals(Url, "https://www.dieticiangroup.com/AddNewPatient");
	assertEquals(title, "AddNewPatient");
	System.out.println("Url's are Same");
}
	
@Given("User is on Add New Patient Page as Dietician")
public void user_is_on_add_new_patient_page_as_dietician() {
	driver.get("https://www.dieticiangroup.com/AddNewPatient"); // Write code here that turns the phrase above into concrete actions
    
}

@When("User clicks on Update Button without filling Madatory fields")
public void user_clicks_on_update_button_without_filling_madatory_fields() {
	AddPatient.funBtnUpdate();
}

@Then("User should see Error Message {string} displayed")
public void user_should_see_error_message_displayed(String msg) {
	msg="Please fillup all the mandatory fields";
    System.out.println(msg);
    assertEquals(msg,"Please fillup all the mandatory fields");
}

@When("User enter invalid data\\/Empty in {string} of Add New Patient page and clicks on Update Button")
public void user_enter_invalid_data_empty_in_of_add_new_patient_page_and_clicks_on_update_button(String fullName) {
	 AddPatient.funFullname(fullName);
	    AddPatient.funBtnUpdate();

}

@Then("User should verify the {string} and display the message")
public void user_should_verify_the_and_display_the_message(String fullName) {
	if (AddPatient.IsStringValid(fullName)==false)
	{
	System.out.println("Please Enter Valid FullName");
	}
}


	
	@When("User doesn't enter data in {string} of Add New Patient page and clicks on Update Button")
	public void user_doesn_t_enter_data_in_of_add_new_patient_page_and_clicks_on_update_button(String Addressline1) {
		AddPatient.funAddressLine1(Addressline1);
		AddPatient.funBtnUpdate();
	}
	
	@Then("User should verify the {string} and displayed the message")
	public void user_should_verify_the_and_displayed_the_message(String Addressline1) {
	    if (AddPatient.IsAddressValid(Addressline1)==false)
	    {
	    System.out.println("Please Enter Address Line 1");
	    }
	}
	
	@When("User doesn't enter data in {string} of Add New Patient page and clicks Update Button")
	public void user_doesn_t_enter_data_in_of_add_new_patient_page_and_clicks_update_button(String Addressline2) {
		AddPatient.funAddressLine1(Addressline2);
		AddPatient.funBtnUpdate();
	}

	@Then("User should verify {string} and display the message")
	public void user_should_verify_and_display_the_message(String Addressline2) {
	    if (AddPatient.IsAddressValid(Addressline2)==false)
	    {
	    	System.out.println("Please Enter Address Line 2");
	    }
	}
	
	@When("User didn't select {string} of Add New Patient page and clicks on Update Button")
	public void user_didn_t_select_of_add_new_patient_page_and_clicks_on_update_button(String country) {
		AddPatient.funCountryDropdown(country);
		AddPatient.funBtnUpdate();
	}

	@Then("User should see {string} message displayed")
	public void user_should_see_message_displayed(String country) {
	    System.out.println("Please Select the Country");
	}
	
	@When("User enters invalid data\\/Empty in {string} in Add New Patient page and clicks Update Button")
	public void user_enters_invalid_data_empty_in_in_add_new_patient_page_and_clicks_update_button(String city) {
	    AddPatient.funCity(city);
	    AddPatient.funBtnUpdate();
	}

	@Then("User should check {string} and display the message for city")
	public void user_should_check_and_display_the_message_for_city(String city) {
	  if (AddPatient.HasStringValidate(city)==false)
       {
	   System.out.println("Please Enter valid City");
	   }
	}
	
	@When("User enter invalid data\\/Empty in {string} in Add New Patient page and click Update Button")
	public void user_enter_invalid_data_empty_in_in_add_new_patient_page_and_click_update_button(String state) {
	    AddPatient.funRegion(state);
	    AddPatient.funBtnUpdate();
	    
	}

	@Then("User should check {string} and displays the message for state")
	public void user_should_check_and_displays_the_message_for_state(String state) {
		if (AddPatient.HasStringValidate(state)==false)
		{
		System.out.println("Please Enter Valid state");
		}
	}
	
	@When("User enter invalid data\\/Empty in {string} of Add New Patient and clicks Update Button")
	public void user_enter_invalid_data_empty_in_of_add_new_patient_and_clicks_update_button(String postalcode) {
	    AddPatient.funPostalCode(postalcode);
	    AddPatient.funBtnUpdate();
	}

	@Then("User should check the {string} and displayes the message for postal code")
	public void user_should_check_the_and_displayes_the_message_for_postal_code(String postalcode) {
	   if (AddPatient.IsPostalCodeValid(postalcode)==false)
	   {
	   System.out.println("Please Enter valid postal code");
	   }
	}
	@When("User enter invalid data\\/Empty in {string} of Add New Patient page and clicks on Update")
	public void user_enter_invalid_data_empty_in_of_add_new_patient_page_and_clicks_on_update(String email) {
		AddPatient.funEmail(email);
	    AddPatient.funBtnUpdate();
	}

	@Then("User should check {string} and displays the message for Email")
	public void user_should_check_and_displays_the_message_for_email(String email) {
		if (AddPatient.IsEmailValid(email)==false)
		   {
		   System.out.println("Please Enter valid Email");
		   }
	}

	@When("User enter invalid data\\/Empty in {string} of Add New Patient page and click on Update")
	public void user_enter_invalid_data_empty_in_of_add_new_patient_page_and_click_on_update(String phone) {
		AddPatient.funPhonenumber(phone);
	    AddPatient.funBtnUpdate();
	}

	@Then("User should check {string} and displays the message for Phone number")
	public void user_should_check_and_displays_the_message_for_phone_number(String phone) {
	   if ( AddPatient.IsPhoneno(phone)==false)
	   {
	    System.out.println("Please Enter valid phone number");
	   }
	}

	@When("User enters all details for {string}{string}{string}{string}{string}{string}{string}{string}{string} and clicks on Update")
	public void user_enters_all_details_for_and_clicks_on_update(String fullName, String Addressline1, String Addressline2, String country, String city, String state, String postalcode, String email, String phone) {
	   AddPatient.funFullname(fullName); 
	   AddPatient.funAddressLine1(Addressline1);
	   AddPatient.funAddressLine2(Addressline2);
	   AddPatient.funCountryDropdown(country);
	   AddPatient.funCity(city);
	   AddPatient.funRegion(state);
	   AddPatient.funPostalCode(postalcode);
	   AddPatient.funEmail(email);
	   AddPatient.funPhonenumber(phone);
	   AddPatient.funBtnUpdate();
	}

	@Then("User should go to My Patient page")
	public void user_should_go_to_my_patient_page() {
		AddPatient.MyPatientclick();
		String title = AddPatient.Verifytitle();
		String Url = AddPatient.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/MyPatients");
		assertEquals(title, "MyPatients");
		System.out.println("Url's are Same");
		
	}

}
