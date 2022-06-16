package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ListOfScreensPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ListOfScreensUnderDieticianWithoutSignIn {
	WebDriver driver;
	ListOfScreensPage dietpage = new ListOfScreensPage(DriverFactory.getDriver());
	
	@Then("User should see the {string} sub menu")
	public void user_should_see_the_sub_menu(String name) {
	    
	    Assert.assertEquals(name, dietpage.diet_menu());
	    System.out.println(name+" sub menu is displayed");
	}

	@When("User clicks on the link {string} under Dietician section")
	public void user_clicks_on_the_link_under_dietician_section(String menu_link) {
	    dietpage.clickListOfScreensMenu();
		dietpage.verifyDieticianLinks(menu_link);
	}

	@Then("User is redirected to {string} page")
	public void user_is_redirected_to_page(String page) {
	    dietpage.currentURL();
	    Assert.assertEquals(dietpage.currentURL(), dietpage.SignInPageUrl);
	    System.out.println("User is navigated to "+page+" page");
	}


}
