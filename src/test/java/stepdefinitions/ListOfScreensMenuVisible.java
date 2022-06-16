package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ListOfScreensPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ListOfScreensMenuVisible {
	WebDriver driver;
	ListOfScreensPage listpage = new ListOfScreensPage(DriverFactory.getDriver());
	
	@Given("User is on the Dietician website")
	public void user_is_on_the_dietician_website() {
	    DriverFactory.getDriver().get(listpage.DieticianHomePage);
	}

	@When("User selects the link with three horizontal lines displayed on top right corner")
	public void user_selects_the_link_with_three_horizontal_lines_displayed_on_top_right_corner() {
	     listpage.clickListOfScreensMenu();
	}

	@Then("User should see name on the list of screens as {string}")
	public void user_should_see_name_on_the_list_of_screens_as(String nameMenu) {
	    String menu = listpage.listName();
	    Assert.assertEquals(menu, nameMenu);
	}


}
