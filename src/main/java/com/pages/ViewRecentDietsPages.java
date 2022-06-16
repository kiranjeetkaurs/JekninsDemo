package com.pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewRecentDietsPages {
	
	WebDriver driver;
	public String createurl = "https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan";
	public String homeurl="https://www.dieticiangroup.com/DieticianHome";
	public String  currenturl="https://www.dieticiangroup.com/ViewRecentDiets";
	public static String filedata = "C:/Users/svatt/git/Dietician-UI-Automation-Hackathon/src/test/resources/sample.pdf";
	public long filesize;
	public File filetype;
	
	

	public ViewRecentDietsPages(WebDriver driver) {
		super();
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	@FindBy(id = "home")
	@CacheLookup
	WebElement Home;

	@FindBy(id = "newpatient")
	@CacheLookup
	WebElement NewPatient;

	@FindBy(id = "MyPatients")
	@CacheLookup
	WebElement MyPatients;

	@FindBy(id = "Dietplans")
	@CacheLookup
	WebElement Dietplans;

	@FindBy(id = "GeneratedText")
	@CacheLookup
	WebElement GeneratedText;

	@FindBy(id = "TextGenerated")
	@CacheLookup
	List<WebElement> TextGeneratedString;

	@FindBy(id = "TBRecordNo")
	@CacheLookup
	WebElement TBRecordNo;

	@FindBy(id = "TBPlanId")
	@CacheLookup
	WebElement TBPlanId;

	@FindBy(id = "TBCustomerDetails")
	@CacheLookup
	WebElement TBCustomerDetails;
	
	@FindBy(id = "TBDietPlan")
	@CacheLookup
	WebElement TBDietPlan;

	@FindBy(id = "TBDietPlans")
	@CacheLookup
	List<WebElement> TBDietPlans;

	@FindBy(id = "TBPlanGeneratedTime")
	@CacheLookup
	WebElement TBPlanGeneratedTime;

	/*
	 * @FindBy(name = "TBComments")
	 * 
	 * @CacheLookup List<WebElement> FileUploadTextAreaSize;
	 */

	@FindBy(id = "TBComments")
	@CacheLookup
	WebElement TBComments;

	@FindBy(id = "PaginationNo")
	@CacheLookup
	WebElement GDPaginationNo;

	@FindBy(id = "GDPagecount")
	@CacheLookup
	WebElement GDPagecount;

	@FindBy(id = "GDPageNextBtn")
	@CacheLookup
	WebElement GPPageNextBtn;

	@FindBy(id = "GPPagePreviousBtn")
	@CacheLookup
	WebElement GPPagePreviousBtn;

	@FindBy(id = "GPPageViewPDF")
	@CacheLookup
	List<WebElement> GPPageViewPDF;

	@FindBy(id = "GPViewPDF")
	@CacheLookup
	List<WebElement> GPViewPDF;
	
	@FindBy(id = "Patientdetails")
	@CacheLookup
	WebElement GDPatientdetails;

	@FindBy(id = "GDDoctordetails")
	@CacheLookup
	WebElement GPDoctordetails;

	@FindBy(id = "GPPatienthealthdetails")
	@CacheLookup
	WebElement GPPatienthealthdetails;

	@FindBy(id = "menuinformation")
	@CacheLookup
	WebElement  GPmenuinformation;

	@FindBy(id = "GPwarnings")
	@CacheLookup
	WebElement GPwarnings;
	
	@FindBy(id = "Comments")
	@CacheLookup
	WebElement GPComments;
	
	@FindBy(id = "Download")
	@CacheLookup
	WebElement btnDownload;
	
	
	public boolean funGeneratedText() {
		if (TextGeneratedString.size() != 0) {
			if (GeneratedText.getText().equalsIgnoreCase("Generated Diet Plans")) {
				String GText = GeneratedText.getText().toString();
				System.out.println(GText);
				return true;
			}
		}
		return false;
	}
	
	public boolean funtabledisplay() {
		boolean TBRecord=TBRecordNo.isDisplayed();
		boolean TBPlan=TBPlanId.isDisplayed();
		boolean TBCustomer=TBCustomerDetails.isDisplayed();
		boolean TBDiet=TBDietPlan.isDisplayed();
		boolean TBPlantime=TBPlanGeneratedTime.isDisplayed();
		boolean TBComment=TBComments.isDisplayed();
        return TBRecord && TBPlan && TBCustomer && TBDiet && TBPlan && TBComment;
		}
	
	
	public int recordcount()
	{  return TBDietPlans.size();
		
	}
	public boolean GDPaginationNo(Integer int1) {

		if(Integer.parseInt(GDPagecount.getText()) > 5){
			if(GPPagePreviousBtn.isDisplayed() && GPPageNextBtn.isDisplayed()) 
			return true;
		}
		else if(Integer.parseInt(GDPagecount.getText()) > int1){
			if(GPPageNextBtn.isDisplayed() && GPPagePreviousBtn.isDisplayed()) 
			return true;
		}
		return false;
		
	}
	public void funTBDietPlan()
	{
		TBDietPlan.click();
	}
	
	public boolean funFileType(String filedata) {
		File filetype = new File(filedata);
		String filetypecheck = filetype.getName().toUpperCase();
		boolean extension = filetypecheck.endsWith(".PDF");

		if (!extension) {
			return false;
		}

		return true;

	}
	
	public boolean funDownload()
	{ if (btnDownload.isDisplayed() && btnDownload.isEnabled())
	{
		return true;
	}return false;
	}
	
		
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean ViewDietPlan() {
		if(
				TBDietPlan.getText().equals(GDPatientdetails) &&
				TBDietPlan.getText().equals(GPDoctordetails) &&
				TBDietPlan.getText().equals(GPPatienthealthdetails) &&
				TBDietPlan.getText().equals(GPmenuinformation) &&
				TBDietPlan.getText().equals(GPwarnings) &&
				TBDietPlan.getText().equals(GPComments)
		) {
			
			return true;
		}
		return false;
		
	}
	public boolean checkPagination(String string) {
	int initialCount = 1;
	String nextPageCount = null;
	int CountIncrease;
	
	if(string.equals("Next")) {
		GPPageNextBtn.click();
	
	nextPageCount = GDPaginationNo.getText();
	
	CountIncrease = Integer.parseInt(nextPageCount) - initialCount;
	
	if(CountIncrease == 1) {
		return true;
	}
	}
	else if(string.equals("Previous")) {
		GPPagePreviousBtn.click();
		
		nextPageCount = GPPagePreviousBtn.getText();
		
		CountIncrease = Integer.parseInt(nextPageCount) - initialCount;
		
		if(CountIncrease == 0) {
			return true;
		}
		}
	  else if(string.equals("VNext")) {
		
		  return GPPageNextBtn.isDisplayed();
		  
		}
	  else if(string.equals("VPrevious")) {
			
		  return GPPagePreviousBtn.isDisplayed();
		  
		}
	return false;
	}

	
	public void funGPPageNextBtn()
	{
		GPPageNextBtn.click();
	}
	
	public void currenturl() {
		driver.get(currenturl);
	}

	
}
