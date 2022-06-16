package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.LogInWithEmailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;
import com.util.XLSUtility;

public class LogInWithEmailForm {
	WebDriver driver;
	LogInWithEmailPage loginpage = new LogInWithEmailPage(DriverFactory.getDriver());
	String projectPath = System.getProperty("user.dir");
	String path = projectPath+"/TestData/Dietician_TestData.xlsx";
	XLSUtility xlutil = new XLSUtility(path);
	
	@Then("User should see a form with heading {string} and Log in button")
	public void user_should_see_a_form_with_heading_and_log_in_button(String header) {
	   //Verify header
		String loginFormHeader = loginpage.getFormHeader();
	   Assert.assertEquals(header, loginFormHeader);
	   Assert.assertEquals(true, loginpage.logIn());
	}

	@When("User clicks on Log in Button in the Sign In form with all fields empty")
	public void user_clicks_on_log_in_button_in_the_sign_in_form_with_all_fields_empty() {
	    loginpage.emptyFields();
		loginpage.logInBtn();
	}

	@Then("User should get error message {string}")
	public void user_should_get_error_message(String errormsg) {
	    String msg = loginpage.alertmessageVerification();
	    Assert.assertEquals(msg, errormsg);
	}

	@When("User click on Log in button with email and password from sheetname {string} and rownumber {int}")
	public void user_click_on_log_in_button_with_email_and_password_from_sheetname_and_rownumber(String sheet, Integer row) throws IOException {
	    loginpage.enterEmail(xlutil.getCellData(sheet, row, 0));
	    loginpage.enterEmailpassword(xlutil.getCellData(sheet, row, 1));
	    loginpage.logInBtn();
	}

	@Then("User should get a message as in sheetname {string} and rownumber {int}")
	public void user_should_get_a_message_as_in_sheetname_and_rownumber(String sheet, Integer row) throws IOException {
	    String msg = xlutil.getCellData(sheet, row, 2);
	    String loginResponse = loginpage.alertmessageVerification();
	    Assert.assertEquals(msg, loginResponse);
	}

	@When("User clicks on Forgot your password link")
	public void user_clicks_on_forgot_your_password_link() {
	    loginpage.clickForgotYourPwdLink();
	}

	@Then("User is redirected to Reset password link")
	public void user_is_redirected_to_reset_password_link() {
	    String pageTitle = loginpage.getTitle();
	   // String titleToCompare = loginpage.forgotPwdPageTitle;
	    Assert.assertEquals(pageTitle, loginpage.forgotPwdPageTitle);
	    System.out.println("User is navigated to Reset password link");
	}

	@When("User click on facebook button")
	public void user_click_on_facebook_button() {
	    loginpage.clickFacebookBtn();
	}

	@Then("User is redirected to facebook login page")
	public void user_is_redirected_to_facebook_login_page() {
	    String title = loginpage.getTitle();
	    Assert.assertEquals(title, loginpage.facebookPageTitle);
	    System.out.println("User is navigated to facebook login page");
	}

	@When("User click on Google button")
	public void user_click_on_google_button() {
	    loginpage.clickGoogleBtn();
	}

	@Then("User is redirected to Google login page")
	public void user_is_redirected_to_google_login_page() {
	    String title = loginpage.getTitle();
	    Assert.assertEquals(title, loginpage.googlePageTitle);
	    System.out.println("User is navigated to Google login page");
	}

	@When("User click on Sign up here link")
	public void user_click_on_sign_up_here_link() {
	    loginpage.clickSignUpLink();
	}

	@Then("User is redirected to Register page")
	public void user_is_redirected_to_register_page() {
	    loginpage.userOnRegisterPage();
	}


}
