package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC_07_ViewPatientsTestReports_PatientsTestReportsStepDef {
	
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User has searched patients after login")
	public void user_has_searched_patients_after_login() {
	     
		mpPage.patientPageDisplayed();
	}

	@When("User is on {string} page")
	public void user_is_on_page(String string) {
	     
	     mpPage.getPageTitel("View Patient Test Reports");
	}

	@Then("{string} tab is selected\\/highlighted")
	public void tab_is_selected_highlighted(String string) {
	     
		Assert.assertTrue(mpPage.checkHighligtedTab());
		
	}

	@Then("Title is displayed as 'View Patient Test Reports")
	public void title_is_displayed_as_view_patient_test_reports() {
	     
		Assert.assertTrue(mpPage.getPageTitel("View Patient Test Reports"));
	}

	@Then("It displays patient's old and latest test reports")
	public void it_displays_patient_s_old_and_latest_test_reports() {
	     
		Assert.assertTrue(mpPage.checkReports());
	}

	@Then("It shows column heading as Record number, Doc-ID, File Uploaded time, File\\/Report name, Identified health conditions")
	public void it_shows_column_heading_as_record_number_doc_id_file_uploaded_time_file_report_name_identified_health_conditions() {
	     
		Assert.assertEquals(mpPage.seeRecordsInTable("ColumnHeader"),"Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions");
	}

	
}
