package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ListOfScreensPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ListOfScreensUnderPublic {
	
	WebDriver driver;
	ListOfScreensPage listOfScreensPage = new ListOfScreensPage(DriverFactory.getDriver());
	
	@Then("User should see the sub menu with text {string}")
	public void user_should_see_the_sub_menu_with_text(String name) {
		Assert.assertEquals(name, listOfScreensPage.listName());
		System.out.println("Public menu is displayed");
	}

	@When("User clciks on the link with text {string} displayed under Public section")
	public void user_clciks_on_the_link_with_text_displayed_under_public_section(String menu_link) {
	    listOfScreensPage.clickListOfScreensMenu();
		listOfScreensPage.verifyPublicLinks(menu_link);
	    System.out.println(menu_link + " link is displayed under Public section");
	}

	@Then("User should be redirected to the {string} page")
	public void user_should_be_redirected_to_the_page(String page) {
	    String currentScreenTitle = listOfScreensPage.getTitle();
	    Assert.assertEquals(currentScreenTitle, page);
	    System.out.println("User is navigated to "+page+" page");
	    }

}
