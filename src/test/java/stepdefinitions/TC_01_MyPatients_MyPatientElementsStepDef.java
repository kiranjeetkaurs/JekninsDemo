package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.MyPatientsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert; 

public class TC_01_MyPatients_MyPatientElementsStepDef {
	
	MyPatientsPage mpPage = new MyPatientsPage(DriverFactory.getDriver());
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
	    
	}

	@When("User clicks on {string} tab")
	public void user_clicks_on_tab(String string) {
	    
		mpPage.clickOnTab(string);
	  
	}

	@Then("My Patients tab is selected and highlighted")
	public void my_patients_tab_is_selected_and_highlighted() {
	    
	  Assert.assertEquals( mpPage.checkHighligtedTab(), true);
	  
	}

	@Then("It shows breadcrubs as {string}")
	public void it_shows_breadcrubs_as(String string) {
	   
		Assert.assertEquals(mpPage.checkBreadCrum(string), string);
	  
	}

	@Then("Page title is displayed as {string}")
	public void page_title_is_displayed_as(String string) {
	    
		Assert.assertEquals(mpPage.getPageTitle(), string);
	}

}
