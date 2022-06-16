package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.pages.CreatePlanBrowsePage;
import com.pages.DieticianHomepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePlanBrowseSteps {
	
	CreatePlanBrowsePage CreatePlanBrowse;
	DieticianHomepage DieticianHome;
	public static WebDriver driver = DriverFactory.getDriver();

	public CreatePlanBrowseSteps() {
		CreatePlanBrowse = new CreatePlanBrowsePage(driver);
	}


	@Given("User is logged on to Dietician website")
	public void user_is_logged_on_to_dietician_website() {
		driver.get(CreatePlanBrowse.homeurl);
		//driver.get("https://www.dieticiangroup.com/DieticianHome");
	}

    
   	@When("User lands on Confirm Conditions and Create Plan page")
	public void user_lands_on_confirm_conditions_and_create_plan_page() {
	  	DieticianHome.funDietplans();
		//driver.get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
		String Url = CreatePlanBrowse.VerifyUrl();
		assertEquals(Url, "https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
		System.out.println("Url's are Same");
		System.out.println("Titles are Same");
	}

	@Then("User sees the heading {string} displayed on the page")
	public void user_sees_the_heading_displayed_on_the_page(String string) {
		String Title = CreatePlanBrowse.Verifytitle();
		assertEquals(Title, "ConfirmConditionsandCreatePlan");
		CreatePlanBrowse.funTextHeader();
	}
	
	@Then("User should see a button with name Browse on the page displayed on the page")
	public void user_should_see_a_button_with_name_browse_on_the_page_displayed_on_the_page() {
		CreatePlanBrowse.funBtnBrowse();
	}

	@Then("User should see a button with name Upload on the page displayed on the page")
	public void user_should_see_a_button_with_name_upload_on_the_page_displayed_on_the_page() {
	    CreatePlanBrowse.funBtnUpload();
	}
	
	@Given("User is in Confirm Conditions and Create Plan page")
	public void user_is_in_confirm_conditions_and_create_plan_page() {
		driver.get(CreatePlanBrowse.currenturl);
		//driver.get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
	}

	@When("User clicks the Browse button and selects a document")
	public void user_clicks_the_browse_button_and_selects_a_document() {
		CreatePlanBrowse.funbtnBrowseclick();
	    CreatePlanBrowse.funTextArea();
	}

	@Then("User should see the selected document in the field next to the Browse button on the page")
	public void user_should_see_the_selected_document_in_the_field_next_to_the_browse_button_on_the_page() {
	    CreatePlanBrowse.FileUploadTextAreaSize();
	}

	@Given("User is on Confirm Conditions and Create Plan page")
	public void user_is_on_confirm_conditions_and_create_plan_page() {
		driver.get(CreatePlanBrowse.currenturl);
	}

	@When("User clicks the Upload button without selecting a document")
	public void user_clicks_the_upload_button_without_selecting_a_document() {
		CreatePlanBrowse.funBtnUploadclick();
	}

	@Then("User should see error message {string}")
	public void user_should_see_error_message(String string) {
	  if (CreatePlanBrowse.FileUploadTextAreaSize()==false)
	  {
		  System.out.println("Please select the file to Upload");
	  }
	}

	@When("User clicks the Upload button by selecting a non-PDF file")
	public void user_clicks_the_upload_button_by_selecting_a_non_pdf_file() {
		CreatePlanBrowse.funTextArea();
		CreatePlanBrowse.funBtnUploadclick();
	}
	
	@Then("User should see error message displayed {string}")
	public void user_should_see_error_message_displayed(String filedata) {
	    if (CreatePlanBrowse.funFileType(filedata)==false)
	    {
	    	System.out.println("please upload files with extension .pdf");
	    }
	}

	@When("User clicks the Upload button by selecting a PDF file of size greater than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_greater_than_2mb(String filedata) {
		CreatePlanBrowse.funFileUploadsize(filedata);
		CreatePlanBrowse.funFileType(filedata);
	}
	
	@Then("User should see error message as {string}")
	public void user_should_see_error_message_as(String filedata) {
	  if (CreatePlanBrowse.funFileUploadsize(filedata)==false)
	  {
		  System.out.println("PDF File exceeding the size limit of 2MB");
	  }
	}

	@When("User clicks the Upload button by selecting a pdf file of size less than 2MB")
	public void user_clicks_the_upload_button_by_selecting_a_pdf_file_of_size_less_than_2mb(String filedata) {
		CreatePlanBrowse.funFileUploadsize(filedata);
		CreatePlanBrowse.funFileType(filedata);
	}

	@Then("User should see the  message {string}")
	public void user_should_see_the_message(String filedata) {
		if (CreatePlanBrowse.funFileUploadsize(filedata)==true && CreatePlanBrowse.funFileUploadsize(filedata)==true )
		  {
			  System.out.println("PDF File Uploading Successfully");
		  }
	}
	

@Given("User is logged in to Dietician website")
public void user_is_logged_in_to_dietician_website() {
	driver.get(CreatePlanBrowse.homeurl);
}

@When("User lands on Confirm conditions and Create Plan page of site")
public void user_lands_on_confirm_conditions_and_create_plan_page_of_site() {
	DieticianHome.funDietplans();
	//driver.get("https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
	String Url = CreatePlanBrowse.VerifyUrl();
	assertEquals(Url, "https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan");
	System.out.println("Url's are Same");
	System.out.println("Titles are Same");
}

@Then("User should see a button with text {string}  at the bottom of the page")
public void user_should_see_a_button_with_text_at_the_bottom_of_the_page(String string) {
	CreatePlanBrowse.funBtnGenerateMenu();
}

@Given("User is in Confirm Conditions and Create Plan page of site")
public void user_is_in_confirm_conditions_and_create_plan_page_of_site() {
	driver.get(CreatePlanBrowse.currenturl);
}

@When("User clicks the GENERATE MENU button")
public void user_clicks_the_generate_menu_button() {
	CreatePlanBrowse.funBtnGenerateMenuclick();
}

@Then("User should land on {string} page with New Diet Plan generated with the latest confirmed Health conditions")
public void user_should_land_on_page_with_new_diet_plan_generated_with_the_latest_confirmed_health_conditions(String string) {
    driver.get(CreatePlanBrowse.nexturl);
    String Url = CreatePlanBrowse.VerifyUrl();
	assertEquals(Url, "http://www.dieticiangroup.com/ViewRecentDiets");
	System.out.println("Url's are Same");
	
}


}
