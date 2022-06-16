package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.CreatePlanBrowsePage;
import com.pages.DieticianHomepage;
import com.pages.ViewRecentDietsPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewRecentDietsSteps {

	private String GPPageNo = null;
	CreatePlanBrowsePage CreatePlanBrowse;
	DieticianHomepage DieticianHome;
	ViewRecentDietsPages ViewRecentDietsBrowse;
	public static WebDriver driver = DriverFactory.getDriver();

	public ViewRecentDietsSteps() {
		ViewRecentDietsBrowse = new ViewRecentDietsPages(driver);
	}

	@Given("User is in logged on to Dietician Website")
	public void user_is_in_logged_on_to_dietician_website() {
		driver.get(ViewRecentDietsBrowse.homeurl);
	}

	@When("User clicks on Dietsplan link")
	public void user_clicks_on_dietsplan_link() {
		DieticianHome.funDietplans();
	}

	@Then("User should land on View Recent diets page and sees the heading Generated Diet Plans displayed on the page")
	public void user_should_land_on_view_recent_diets_page_and_sees_the_heading_generated_diet_plans_displayed_on_the_page() {
		ViewRecentDietsBrowse.currenturl();
		ViewRecentDietsBrowse.funGeneratedText();
	}

	@Given("User in Confirm Conditions and Create Plan Webpage and click generate menu button")
	public void user_in_confirm_conditions_and_create_plan_webpage_and_click_generate_menu_button() {
		driver.get(ViewRecentDietsBrowse.createurl);
		CreatePlanBrowse.funBtnGenerateMenuclick();
	}

	@When("User lands on View Recent Diets Webpage  of site")
	public void user_lands_on_view_recent_diets_webpage_of_site() {
		ViewRecentDietsBrowse.currenturl();
	}

	@Then("User should see that Record No, Plan id, Customer Details, Dietplan,View Pdf,Plan Generated time, Comments are displayed")
	public void user_should_see_that_record_no_plan_id_customer_details_dietplan_view_pdf_plan_generated_time_comments_are_displayed() {
		ViewRecentDietsBrowse.funtabledisplay();
	}

	@Given("User  in Confirm Conditions and Create Plan Webpagepage of Dietician site")
	public void user_in_confirm_conditions_and_create_plan_webpagepage_of_dietician_site() {
		driver.get(ViewRecentDietsBrowse.createurl);
	}

	@When("User lands on View Recent Diets Webpage of website")
	public void user_lands_on_view_recent_diets_webpage_of_website() {
		ViewRecentDietsBrowse.currenturl();
	}

	@Then("User should see {int} records displayed on the page")
	public void user_should_see_records_displayed_on_the_page(Integer int1) {
		ViewRecentDietsBrowse.recordcount();
	}

	@Given("User is in View Recent Diets Page")
	public void user_is_in_view_recent_diets_page() {
		driver.get(ViewRecentDietsBrowse.createurl);
	}

	@When("User has more than {int} records and carried to next page")
	public void user_has_more_than_records_and_carried_to_next_page(Integer int1) {
		ViewRecentDietsBrowse.GDPaginationNo(int1);
	}

	@Then("User should see next page button is enabled with others page buttons disabled")
	public void user_should_see_next_page_button_is_enabled_with_others_page_buttons_disabled() {
		ViewRecentDietsBrowse.checkPagination(GPPageNo);
	}

	@When("User clicks on next page button")
	public void user_clicks_on_next_page_button() {
		ViewRecentDietsBrowse.funGPPageNextBtn();
	}

	@Then("User should go to next page with previous and others pages buttons disabled")
	public void user_should_go_to_next_page_with_previous_and_others_pages_buttons_disabled() {
		ViewRecentDietsBrowse.checkPagination(GPPageNo);
	}

	@When("User is in last page of View Diets pagination")
	public void user_is_in_last_page_of_view_diets_pagination() {
		ViewRecentDietsBrowse.checkPagination(GPPageNo);
	}

	@Then("User should see  previous page button is enabled and others page buttons disabled")
	public void user_should_see_previous_page_button_is_enabled_and_others_page_buttons_disabled() {
		ViewRecentDietsBrowse.checkPagination(GPPageNo);
	}

	@When("User clicks on View PDF button for a generated diet plan")
	public void user_clicks_on_view_pdf_button_for_a_generated_diet_plan() {
		ViewRecentDietsBrowse.funTBDietPlan();
	}

	@Then("User should see the Patient details,Doctor details,Patient health details,{int}-day menu information, warnings,Comments are displayed in the pdf")
	public void user_should_see_the_patient_details_doctor_details_patient_health_details_day_menu_information_warnings_comments_are_displayed_in_the_pdf(
			Integer int1) {
		ViewRecentDietsBrowse.ViewDietPlan();
	}

	@Then("User should be able to see download option for the PDF")
	public void user_should_be_able_to_see_download_option_for_the_pdf() {
		ViewRecentDietsBrowse.funDownload();
	}

}
