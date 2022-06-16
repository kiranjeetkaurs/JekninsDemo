package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC_08_ViewPatientsTestReports_PatientsTestReports_PaginationStepDef {

	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User clicks on button {string} on Test Reports page.")
	public void user_clicks_on_button_on_test_reports_page(String string) {
	    
		mpPage.patientPageDisplayed();
		mpPage.useronViewPatientTestReports(string);
	}

	@When("User is on {string} page.")
	public void user_is_on_page(String string) {
	    
	     Assert.assertEquals(mpPage.getPageTitle(), string);
	}

	@Then("More than {int} records should be displayed on different pages through pagination")
	public void more_than_records_should_be_displayed_on_different_pages_through_pagination(Integer int1) {
	    
		 Assert.assertTrue(mpPage.myPatientsPagination(int1));
		 
	}

	@Then("Pagination has {string} link")
	public void pagination_has_link(String string) {
	    
		Assert.assertTrue(mpPage.checkPagination(string));
	    
	}
	
}
