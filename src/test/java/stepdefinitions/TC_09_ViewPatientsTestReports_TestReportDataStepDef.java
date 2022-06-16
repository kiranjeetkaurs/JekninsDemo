package stepdefinitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_09_ViewPatientsTestReports_TestReportDataStepDef {

	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User clicks on button {string}..")
	public void user_clicks_on_button(String string) {
	     
		mpPage.useronViewPatientTestReports(string);
	    
	}

	@When("User is on {string} page..")
	public void user_is_on_page(String string) {
	     
		 Assert.assertEquals(mpPage.getPageTitle(), string);
	}

	@Then("Every record shows {string} option")
	public void every_record_shows_option(String string) {
	     
		Assert.assertTrue(mpPage.viewPdfText(string));
    }
	
	@Then("Columns {string} {string} {string} {string} {string} <Actions>")
	public void columns_actions(String file, String docId, String fileUplaodTime, String name ,String identifiedCondition) {
	     
		Assert.assertTrue(mpPage.ViewReprtData(file, docId, fileUplaodTime, name, identifiedCondition));
	    
	}

	

	}
