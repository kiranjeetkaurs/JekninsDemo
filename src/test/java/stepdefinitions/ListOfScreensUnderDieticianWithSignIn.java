package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.ListOfScreensPage;
import com.pages.SignInPage;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ListOfScreensUnderDieticianWithSignIn {
	WebDriver driver;
	ListOfScreensPage dietpage = new ListOfScreensPage(DriverFactory.getDriver());
	SignInPage signin = new SignInPage(DriverFactory.getDriver());
	
	@Given("User is signed in on the Dietician website")
	public void user_is_signed_in_on_the_dietician_website() {
	    DriverFactory.getDriver().get(dietpage.SignInPageUrl);
	    signin.userName(dietpage.username);
	    signin.password(dietpage.password);
	    signin.signInBtn();
	}

	@Then("User is redirected to page {string}")
	public void user_is_redirected_to_page(String page) {
	    String expectedURL = dietpage.DieticianLinks(page);
	    String currentURL = dietpage.currentURL();
	    Assert.assertEquals(expectedURL, currentURL);
	    System.out.println("User is navigated to "+page+" page");
	    
	}

}
