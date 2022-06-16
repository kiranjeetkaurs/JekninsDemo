package stepdefinitions;

import com.factory.DriverFactory;
import com.pages.DoctorTeamPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoctorTeamSteps {
	
	private DoctorTeamPage team = new DoctorTeamPage(DriverFactory.getDriver());
	
	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/home"); 
	}

	@When("User lands on Teams Page")
	public void user_lands_on_teams_page() {
		DriverFactory.getDriver().get("https://www.dieticiangroup.com/Team");  
	   	}
	

	@Then("User sees Doctor name on Doctor team page")
	public void user_sees_doctor_name_on_doctor_team_page() {
	   team.DoctorNameHead();
	}

	@Then("User should see <{int} default	Doctor names> on the First Page")
	public void user_should_see_default_doctor_names_on_the_first_page(Integer int1) {
	   team.getThreeDoctorRecords("Dr.Vijaya","Dr.Geeta", "Dr.Swati");
	}


}
