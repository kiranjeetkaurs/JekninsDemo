package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_06_MyPatients_PatientInformation {
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User has searched patients")
	public void user_has_searched_patients() {
		
		mpPage.patientPageDisplayed();
	     
	}

	@Then("Columns {string} {string} {string} {string} {string} {string}")
	public void columns(String RecordNumber, String CustId, String Name, String Details, String LastVisit, String Actions) {
	   
		mpPage.checkPatientsInformation(RecordNumber, CustId, Name, Details, LastVisit, Actions);
	     
	}

	@When("User clicks on button {string}")
	public void user_clicks_on_button(String actionBtn) {
	   
	     mpPage.clickonActionButton(actionBtn);
	}

	@Then("It redirects user to {string} page")
	public void it_redirects_user_to_page(String pageTitle) {
	   
		 mpPage.getPageTitel(pageTitle);
	}
}