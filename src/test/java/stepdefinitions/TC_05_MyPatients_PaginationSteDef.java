package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

public class TC_05_MyPatients_PaginationSteDef {
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	boolean check = false;

	@Given("Patients records are displayed")
	public void patients_records_are_displayed() {
	     
		mpPage.patientPageDisplayed();
	     
	}

	@When("Records are more than {int}")
	public void records_are_more_than(Integer int1) {
	     
		check =   mpPage.myPatientsPagination(int1);
	}

	@Then("It must show pagination links")
	public void it_must_show_pagination_links() {
	     
	     Assert.assertTrue(check);
	}

	@When("User clicks on next pagination link")
	public void user_clicks_on_next_pagination_link() {
	     
		check =  mpPage.checkPagination("Next");
	}

	@Then("It goes to next page and shows different patients on that page")
	public void it_goes_to_next_page_and_shows_different_patients_on_that_page() {
	     
		Assert.assertTrue(check);
	}

	@When("User clicks on previous pagination link")
	public void user_clicks_on_previous_pagination_link() {
	     
		check =  mpPage.checkPagination("Previous");
	}

	@Then("It goes to previous page")
	public void it_goes_to_previous_page() {
	     
		Assert.assertTrue(check);
	}
}
