package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;

public class TC_10_ViewPatientsTestReports_PDFDownloadStepDef {

	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	String validatePDFData = null;
	
	@Given("User is on {string} pagee")
	public void user_is_on_pagee(String string) {
	    
	     mpPage.patientPageDisplayed();
	}

	@When("user clicks on {string}")
	public void when_user_clicks_on(String string) {
		
		mpPage.clickViewPdfButton(string);
	    
	     
	}

	@Then("PDF is opened in proper readable format")
	public void pdf_is_opened_in_proper_readable_format() {
	    
	   Assert.assertTrue(mpPage.checkPDFOpen("TestPDF.pdf"));
	}

	@Given("User has clicked view PDF button")
	public void user_has_clicked_view_pdf_button() {
	    
		mpPage.clickViewPdfButton("View PDF");
	}

	@When("User is on PDF")
	public void user_is_on_pdf() {
	    
		 Assert.assertTrue(mpPage.checkPDFOpen("TestPDF.pdf"));
	}

	@Then("PDF has patients details like patient ID, name, email, address, phone number")
	public void pdf_has_patients_details_like_patient_id_name_email_address_phone_number() throws IOException {
	    
	    validatePDFData =  mpPage.checkPDFData("TestPDF.pdf");
	    Assert.assertTrue(validatePDFData.contains("name"));
	    Assert.assertTrue(validatePDFData.contains("email"));
	    Assert.assertTrue(validatePDFData.contains("address"));
	    Assert.assertTrue(validatePDFData.contains("phone number"));
	    
	}

	@Then("PDF has doctor details like doc ID, doctor name, email address, clinic\\/facility name, doctor's specialization")
	public void pdf_has_doctor_details_like_doc_id_doctor_name_email_address_clinic_facility_name_doctor_s_specialization() {
	    
	    Assert.assertTrue(validatePDFData.contains("doc ID"));
	    Assert.assertTrue(validatePDFData.contains("doctor name"));
	    Assert.assertTrue(validatePDFData.contains("email"));
	    Assert.assertTrue(validatePDFData.contains("address"));
	    Assert.assertTrue(validatePDFData.contains("clinic\\\\/facility name"));
	    Assert.assertTrue(validatePDFData.contains("doctor's specialization"));
	    
	}

	@Then("PDF shows list of conditions, preferences list, Co-morbidites")
	public void pdf_shows_list_of_conditions_preferences_list_co_morbidites() {
	    
		    Assert.assertTrue(validatePDFData.contains("list of conditions"));
		    Assert.assertTrue(validatePDFData.contains("preferences list"));
		    Assert.assertTrue(validatePDFData.contains("Co-morbidites"));
	     
	}

	@Then("PDF shows diet menu for {int} days, any warning and comments mentioned by doctor.")
	public void pdf_shows_diet_menu_for_days_any_warning_and_comments_mentioned_by_doctor(Integer int1) {
	    
	    Assert.assertTrue(validatePDFData.contains("shows diet menu"));
	    Assert.assertTrue(validatePDFData.contains("any warning"));
	    Assert.assertTrue(validatePDFData.contains("comments mentioned by doctor"));
	}
	
}
