package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert; 

public class TC_02_MyPatients_SearchPatientsStepDef {
	
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Then("Name, email and phone number filter options and search button are displayed.")
	public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
 
		Assert.assertEquals(mpPage.checkTextBoxAndBtn(), true);
		
	}

	@Given("User is logged in")
	public void user_is_logged_in() {
 
	     
	}

	@When("User is on my patients1")
	public void user_is_on_my_patients1() {
 
	   
	}

	@Then("Button used for search has text as {string}")
	public void button_used_for_search_has_text_as(String string) {
		
		Assert.assertTrue(mpPage.checkTextOrLabel());
	     
	}

	@Given("User is on my patients")
	public void user_is_on_my_patients() {
 
	     
	}

	@When("User starts typing inside name filter box")
	public void user_starts_typing_inside_name_filter_box() {
 
	   mpPage.typeText("Name");  
	}

	@Then("Text inside name filter box should disappear")
	public void text_inside_name_filter_box_should_disappear() {
 
	     Assert.assertTrue( mpPage.checkTextClears("Name"));
	     
	}

	@When("User starts typing inside email address filter box")
	public void user_starts_typing_inside_email_address_filter_box() {
 
		  mpPage.typeText("Email"); 
	}

	@Then("Text inside email address filter box should disappear")
	public void text_inside_email_address_filter_box_should_disappear() {
 
		Assert.assertTrue( mpPage.checkTextClears("Email"));
	}

	@When("User starts typing inside phone number filter box")
	public void user_starts_typing_inside_phone_number_filter_box() {
 
		 mpPage.typeText("Phone"); 
	}

	@Then("Text inside phone number filter box should disappear")
	public void text_inside_phone_number_filter_box_should_disappear() {
 
		Assert.assertTrue( mpPage.checkTextClears("Phone"));
	}

	@When("User clicks on search with Test Patient1 into name filter box.")
	public void user_clicks_on_search_with_test_patient1_into_name_filter_box() {
 
	     mpPage.enterTextAndSearch("Test Patient1");
	}

	@Then("Button Records for Test Patient1 are shown.")
	public void button_records_for_test_patient1_are_shown() {
 
	    Assert.assertEquals(mpPage.seeRecordsInTable("Test Patient1"), "Test Patient1"); 
	}

	@When("User clicks on search with Test Patient2 into name filter box.")
	public void user_clicks_on_search_with_test_patient2_into_name_filter_box() {
 
		 mpPage.enterTextAndSearch("Test Patient1");
	}

	@Then("Button Records for Test Patient2 are shown.")
	public void button_records_for_test_patient2_are_shown() {
 
		Assert.assertEquals(mpPage.seeRecordsInTable("Test Patient2"), "Test Patient2"); 
	}

	@When("User clicks on search with TestPatient1@dummy.com into email address filter.")
	public void user_clicks_on_search_with_test_patient1_dummy_com_into_email_address_filter() {
 
		 mpPage.enterTextAndSearch("TestPatient1@dummy.com");
	}

	@Then("Records for TestPatient1@dummy.com are shown.")
	public void records_for_test_patient1_dummy_com_are_shown() {
 
		Assert.assertEquals(mpPage.seeRecordsInTable("TestPatient1@dummy.com"), "TestPatient1@dummy.com"); 
		
	}

	@When("User clicks on search with TestPatient2@dummy.com into email address filter.")
	public void user_clicks_on_search_with_test_patient2_dummy_com_into_email_address_filter() {
 
		 mpPage.enterTextAndSearch("TestPatient2@dummy.com");
	}

	@Then("Records for TestPatient2@dummy.com are shown.")
	public void records_for_test_patient2_dummy_com_are_shown() {
 
		Assert.assertEquals(mpPage.seeRecordsInTable("TestPatient2@dummy.com"), "TestPatient2@dummy.com"); 
	}

	@When("User clicks on search with {int} into phone number filter.")
	public void user_clicks_on_search_with_into_phone_number_filter(Integer int1) {
 
		 mpPage.enterTextAndSearch("int1");
	}

	@Then("Records for {int} are shown.")
	public void records_for_are_shown(Integer int1) {
 
		Assert.assertEquals(mpPage.seeRecordsInTable("int1"), "int1"); 
	}

	@When("User clicks on search button with Test Patient1 into name filter box, {int} into phone number filter")
	public void user_clicks_on_search_button_with_test_patient1_into_name_filter_box_into_phone_number_filter(Integer int2) {
 
		 mpPage.enterTextAndSearch("int2");
	}

	@Then("Records for Test Patient1 and {int} are shown.")
	public void records_for_test_patient1_and_are_shown(Integer int2) {
 
		Assert.assertEquals(mpPage.seeRecordsInTable("int2"), "int2"); 
	}

	@When("User clicks on search button with Test Patient2 into name filter box, {int} into phone number filter")
	public void user_clicks_on_search_button_with_test_patient2_into_name_filter_box_into_phone_number_filter(Integer int1) {
 
		 mpPage.enterTwoFieldsTextAndSearch("PatientPhone" ,"test_patient2" ,"int2");
	}

	@Then("Records for Test Patient2 and {int} are shown.")
	public void records_for_test_patient2_and_are_shown(Integer int1) {
           
		Assert.assertTrue(mpPage.seeTwoRecordsInTable("PatientPhone" ,"test_patient2" ,"int2"));
	     
	}

	@When("User clicks on search button with Test Patient1 into name filter box, TestPatient1@dummy.com into email address filter box")
	public void user_clicks_on_search_button_with_test_patient1_into_name_filter_box_test_patient1_dummy_com_into_email_address_filter_box() {
 
		 mpPage.enterTwoFieldsTextAndSearch("PatientPhone1" ,"test_patient1" ,"int1");
	}

	@Then("Records for Test Patient1 and TestPatient1@dummy.com are shown.")
	public void records_for_test_patient1_and_test_patient1_dummy_com_are_shown() {
 
		Assert.assertTrue(mpPage.seeTwoRecordsInTable("PatientPhone1" ,"test_patient1" ,"int1"));
	}

	@When("User clicks on search button with Test Patient2 into name filter box, TestPatient2@dummy.com into email address filter box")
	public void user_clicks_on_search_button_with_test_patient2_into_name_filter_box_test_patient2_dummy_com_into_email_address_filter_box() {
 
		 mpPage.enterTwoFieldsTextAndSearch("PatientEmail2" ,"Test Patient2" ,"TestPatient2@dummy.com");
	}

	@Then("Records for Test Patient2 and TestPatient2@dummy.com are shown.")
	public void records_for_test_patient2_and_test_patient2_dummy_com_are_shown() {
 
		Assert.assertTrue(mpPage.seeTwoRecordsInTable("PatientEmail2" ,"Test Patient2" ,"TestPatient2@dummy.com"));
	}

	@When("User clicks on search button with {int} into phone number filter box, TestPatient1@dummy.com into email address filter box")
	public void user_clicks_on_search_button_with_into_phone_number_filter_box_test_patient1_dummy_com_into_email_address_filter_box(Integer int1) {
 
		 mpPage.enterTwoFieldsTextAndSearch("PatientEmail1" ,"Test Patient1" ,"TestPatient1@dummy.com");
	     
	}

	@Then("Records for {int} and TestPatient1@dummy.com are shown.")
	public void records_for_and_test_patient1_dummy_com_are_shown(Integer int1) {
 
		Assert.assertTrue(mpPage.seeTwoRecordsInTable("PatientEmail1" ,"Test Patient1" ,"TestPatient1@dummy.com"));
	}

	@When("User clicks on search button with {int} into phone number filter box, TestPatient2@dummy.com into email address filter box")
	public void user_clicks_on_search_button_with_into_phone_number_filter_box_test_patient2_dummy_com_into_email_address_filter_box(Integer int1) {
 
		 mpPage.enterTwoFieldsTextAndSearch("PatientEmail1" ,"Test Patient1" ,"TestPatient1@dummy.com");
	}

	@Then("Records for {int} and TestPatient2@dummy.com are shown.")
	public void records_for_and_test_patient2_dummy_com_are_shown(Integer int1) {
 
		Assert.assertTrue(mpPage.seeTwoRecordsInTable("PatientEmail1" ,"Test Patient1" ,"TestPatient1@dummy.com"));
	}
	

}
