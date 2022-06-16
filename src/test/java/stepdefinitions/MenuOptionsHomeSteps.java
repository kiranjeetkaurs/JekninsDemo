package stepdefinitions;

import com.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pages.MenuOptionsHomePage;

public class MenuOptionsHomeSteps {
	
	private MenuOptionsHomePage menuOptionshome = new MenuOptionsHomePage(DriverFactory.getDriver());
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		System.out.println("User is on the browser");
	}
	

	@When("User opens the Dietician Website and checks the {string} on the Home Page")
	public void user_opens_the_dietician_website_and_checks_the_on_the_home_page(String string) {
		DriverFactory.getDriver().get("DieticianHomePageURL");
	}

	
	@Then("User should see the Top Menu Tabs displayed in the Home Page")
	public void user_should_see_the_top_menu_tabs_displayed_in_the_home_page() {
		menuOptionshome.TopMenuOptionsHomePage_IsDisplayed();
	}

	@Then("User should see the Bottom Menu Tabs present in the Home Page")
	public void user_should_see_the_bottom_menu_tabs_present_in_the_home_page() {
	   menuOptionshome.BottomMenuTabsinHomePage_IsDisplayed();
	}
	
	

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
		DriverFactory.getDriver().get("DieticianHomePageURL");
	}
	

	@Then("User should see a search option symbol on the bottom menu bar of the Home Page")
	public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
	    menuOptionshome.SearchIcon_IsDisplayed();

	}

	@Then("User should see a SignIn option symbol on the bottom menu bar of the Home Page")
	public void user_should_see_a_sign_in_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
	   menuOptionshome.SignIn_IsDisplayed();
	}


}
