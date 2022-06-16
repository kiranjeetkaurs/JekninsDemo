package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.DieticianHomepage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DieticianHomeSteps {

	DieticianHomepage DieticianHome;
	public WebDriver driver = DriverFactory.getDriver();
	public DieticianHomeSteps() {
		DieticianHome = new DieticianHomepage(DriverFactory.getDriver());
	}

	/*
	 * public DieticianHomeSteps() throws IOException { super(); ConfigReader confi
	 * = new ConfigReader(); //driver =DriverFactory.Initialization();
	 * driver.get(confi.prop.getProperty("URL") +
	 * confi.prop.getProperty("Basepath_login")); }
	 */

	@Given("User logged in to the Dietician website")
	public void user_logged_in_to_the_dietician_website() {
				 driver.get(DieticianHome.homeurl);
		//driver.get("https://www.dieticiangroup.com/DieticianHome");
	}

	@When("User is in Dietician Home Page")
	public void user_is_in_dietician_home_page() {
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/DieticianHome");
		System.out.println("Url's are Same");
	}

	@Then("User Should see {string} are displayed in header menu of Dietician Home Screen")
	public void user_should_see_are_displayed_in_header_menu_of_dietician_home_screen(String string) {
		DieticianHome.funDieticianHomeMenu_IsDisplayed();
	}

	/*
	 * @Given("User logged in the Dietician website") public void
	 * user_logged_in_the_dietician_website() {
	 * driver.get("https://www.dieticiangroup.com/DieticianHome"); }
	 */

	@When("User is in the Dietician Home Page")
	public void user_is_in_the_dietician_home_page() {
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/DieticianHome");
		System.out.println("Url's are Same");
	}

	@Then("User Should see Banner or Announcements section in right side bar of Dietician Home Screen")
	public void user_should_see_banner_or_announcements_section_in_right_side_bar_of_dietician_home_screen() {
		DieticianHome.funBannerAnnouncements();
	}

	/*
	 * @Given("User logged in Dietician website") public void
	 * user_logged_in_dietician_website() {
	 * driver.get("https://www.dieticiangroup.com/DieticianHome"); }
	 */

	@When("User is  Dietician Home Page")
	public void user_is_dietician_home_page() {
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/DieticianHome");
		System.out.println("Url's are Same");
	}

	@Then("User Should see Logged in Dietician Name Message in top right side of Dietician Home Screen")
	public void user_should_see_logged_in_dietician_name_message_in_top_right_side_of_dietician_home_screen() {
		DieticianHome.funUserName();
	}

	/*
	 * @Given("User logged in to the Dietician site") public void
	 * user_logged_in_to_the_dietician_site() {
	 * driver.get("https://www.dieticiangroup.com/DieticianHome"); }
	 */

	@When("User in the Dietician Home Page of Dietician site")
	public void user_in_the_dietician_home_page_of_dietician_site() {
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/DieticianHome");
		System.out.println("Url's are Same");
	}

	@Then("User should see image and content displayed in Dietician Home Screen")
	public void user_should_see_image_and_content_displayed_in_dietician_home_screen() {
		driver.get(DieticianHome.homeurl);
	}

	/*
	 * @Given("User logged in to the Dietician Home Page") public void
	 * user_logged_in_to_the_dietician_home_page() {
	 * driver.get("https://www.dieticiangroup.com/DieticianHome"); }
	 */

	@When("User selects New Patient link\\/button")
	public void user_selects_new_patient_link_button() {
		DieticianHome.funNewPatient();
		// driver.get("https://www.dieticiangroup.com/AddNewPatient");
	}

	@Then("User lands on Add New Patient page")
	public void user_lands_on_add_new_patient_page() {
		String title = DieticianHome.Verifytitle();
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/AddNewPatient");
		assertEquals(title, "AddNewPatient");
		System.out.println("Url's are Same");
	}

	@Given("User logged in Dietician Home Page")
	public void user_logged_in_dietician_home_page() {
		driver.get(DieticianHome.homeurl);
		//driver.get("https://www.dieticiangroup.com/DieticianHome");
	}

	@When("User selects My Patient link\\/button")
	public void user_selects_my_patient_link_button() {
		DieticianHome.funMyPatients();
		// driver.get("https://www.dieticiangroup.com/MyPatients");
	}

	@Then("User lands on My Patient page")
	public void user_lands_on_my_patient_page() {
		String title = DieticianHome.Verifytitle();
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/MyPatients");
		assertEquals(title, "MyPatients");
		System.out.println("Url's are Same");
	}

	@Given("User logged in to the Dietician Home Page")
	public void user_logged_in_to_the_dietician_home_page() {
		driver.get(DieticianHome.homeurl);
		//driver.get("https://www.dieticiangroup.com/DieticianHome");
	}

	@When("User selects Diet Plans link\\/button")
	public void user_selects_diet_plans_link_button() {
		DieticianHome.funDietplans();
		// driver.get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
	}

	@Then("User lands on Diet Plans page")
	public void user_lands_on_diet_plans_page() {
		String title = DieticianHome.Verifytitle();
		String Url = DieticianHome.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
		assertEquals(title, "ConfirmConditions and CreatePlan");
		System.out.println("Url's are Same");
	}

	@Given("User logged in Dietician Home Page of Dietician site")
	public void user_logged_in_dietician_home_page_of_dietician_site() {
		driver.get(DieticianHome.homeurl);
		//driver.get("https://www.dieticiangroup.com/DieticianHome");
	}

	@When("User can see {string} button after successful login")
	public void user_can_see_button_after_successful_login(String string) {
		DieticianHome.btnSignoutfun();
	}

	@Then("User can click on {string} button for logging off successfully")
	public void user_can_click_on_button_for_logging_off_successfully(String string) {
		DieticianHome.funbtnSignout();
		System.out.println("Dietician log out");
	}

}
