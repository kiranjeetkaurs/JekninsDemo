package com.pages;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class MyPatientsPage {
	WebDriver driver=null;

	//Page Object
	@FindBy(id = "myPatientsTab")  @CacheLookup  WebElement myPatientsTab;

	@FindBy(id = "myPatientsBreadCrub")  @CacheLookup  WebElement myPatientsBreadCrub;

	@FindBy(id = "myPatientSearchBtn")  @CacheLookup  WebElement myPatietSearchBtn;

	@FindBy(id = "myPatientNameFilterTxtBx")  @CacheLookup  WebElement myPatientNameFilterTxtBx ;

	@FindBy(id = "myPatientEmailAddTxtBx")  @CacheLookup  WebElement myPatientEmailAddTxtBx;

	@FindBy(id = "myPatientPhoneNoTxtBx")  @CacheLookup  WebElement myPatientPhoneNoTxtBx;

	@FindBy(id = "mpActionViewPreviousTestReportBtn")  @CacheLookup  WebElement mpActionViewPreviousTestReportBtn ;

	@FindBy(id = "mpActionViewPreviousDietPlanBtn")  @CacheLookup  WebElement mpActionViewPreviousDietPlanBtn;

	@FindBy(id = "mpActionCreateNewReportPlanBtn")  @CacheLookup  WebElement mpActionCreateNewReportPlanBtn;

	@FindBy(id = "myPatientPaginationNextBtn")  @CacheLookup  WebElement myPatientPaginationNextBtn;

	@FindBy(id = "myPatientPaginationPreviousBtn")  @CacheLookup  WebElement myPatientPaginationPreviousBtn;

	@FindBy(id = "myPatientTableNameFirstRecord")  @CacheLookup  WebElement myPatientTableNameFirstRecord;

	@FindBy(id = "myPatientTableEmailFirstRecord")  @CacheLookup  WebElement myPatientTableEmailFirstRecord;

	@FindBy(id = "myPatientTablePhoneFirstRecord")  @CacheLookup  WebElement myPatientTablePhoneFirstRecord;

	@FindBy(id = "myPatientvalidationErrorMsg")  @CacheLookup  WebElement myPatientvalidationErrorMsg;

	@FindBy(id = "myPatientCount")  @CacheLookup  WebElement myPatientCount;

	@FindBy(id = "myPatientcolumnHeaderData")  @CacheLookup  WebElement myPatientcolumnHeaderData;

	@FindBy(id = "myPatientPaginationNo")  @CacheLookup  WebElement myPatientPaginationNo;

	@FindBy(id = "myPatientReports")  @CacheLookup  WebElement myPatientReports;

	@FindBy(id = "ViewReprtPageCount")  @CacheLookup  WebElement ViewReprtPageCount;

	@FindBy(id = "ViewReprtPageNextBtn")  @CacheLookup  WebElement ViewReprtPageNextBtn;

	@FindBy(id = "ViewReprtPagePreviousBtn")  @CacheLookup  WebElement ViewReprtPagePreviousBtn;

	@FindBy(id = "ViewReprtPageViewPDF")  @CacheLookup  List<WebElement> ViewReprtPageViewPDF;

	@FindBy(id = "ViewReprtData")  @CacheLookup  List<WebElement> ViewReprtData;

	@FindBy(id = "ViewReprtPDFBtn")  @CacheLookup  WebElement ViewReprtPDFBtn;


	//Initialize Page Objects
	public MyPatientsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public  void clickOnTab(String string) {

		if(string.equals("My Patients")) {
			myPatientsTab.click();
		}

	}

	public boolean checkHighligtedTab() {

		return myPatientsTab.isEnabled();
	}

	public String checkBreadCrum(String string) {

		if(string.equals("Dietician Software/ MyPatients")) {
			return myPatientsBreadCrub.getText();
		}

		else
			return null;
	}

	public String getPageTitle() {

		return driver.getTitle();

	}

	public Boolean checkTextBoxAndBtn() {

		if(myPatietSearchBtn.isDisplayed() && myPatientNameFilterTxtBx.isDisplayed() 
				&& myPatientEmailAddTxtBx.isDisplayed() && myPatientPhoneNoTxtBx.isDisplayed())
		{
			return true;
		}
		else
			return false;

	}

	public boolean checkTextOrLabel() {

		if(myPatietSearchBtn.getText().equals("Search")){
			return true;
		}
		else 
			return false;
	}

	public void typeText(String string) {

		if(string.equals("Name")) {
			myPatientNameFilterTxtBx.sendKeys("Test");
		}
		else if(string.equals("Email")) {
			myPatientNameFilterTxtBx.sendKeys("Test");
		}
		else if(string.equals("Phone")) {
			myPatientNameFilterTxtBx.sendKeys("Test");
		}

	}

	public boolean checkTextClears(String string) {
		if(string.equals("Name"))
		{
			if(myPatientNameFilterTxtBx.getAttribute("name").equals("null"))
				return true;
		}
		else if(string.equals("Email")) {
			if(myPatientEmailAddTxtBx.getAttribute("email").equals("null"))
				return true;
		}
		else if(string.equals("Phone")) {
			if(myPatientEmailAddTxtBx.getAttribute("phone").equals("null"))
				return true;
		}

		return false;
	}

	public void enterTextAndSearch(String string) {

		if(string.equals("Test Patient1")) {
			myPatientNameFilterTxtBx.sendKeys(string);
		}
		else if(string.equals("Test Patient2")) {
			myPatientNameFilterTxtBx.sendKeys(string);
		}
		else if(string.equals("TestPatient1@dummy.com")) {
			myPatientEmailAddTxtBx.sendKeys(string);
		}
		else if(string.equals("TestPatient2@dummy.com")) {
			myPatientEmailAddTxtBx.sendKeys(string);
		}
		else if(string.equals("int1")) {
			myPatientPhoneNoTxtBx.sendKeys(string);
		}
		else if(string.equals("int2")) {
			myPatientPhoneNoTxtBx.sendKeys(string);
		}
		else if(string.equals("data")) {
			myPatientPhoneNoTxtBx.sendKeys(string);
		}

		myPatietSearchBtn.click();

	}

	public String seeRecordsInTable(String string) {

		if(string.equals("Test Patient1")) {
			return myPatientTableNameFirstRecord.getText();
		}
		else if(string.equals("Test Patient2")) {
			return myPatientTableNameFirstRecord.getText();
		}
		else if(string.equals("TestPatient1@dummy.com")) {
			return myPatientTableEmailFirstRecord.getText();
		}
		else if(string.equals("TestPatient2@dummy.com")) {
			return myPatientTableEmailFirstRecord.getText();
		}
		else if(string.equals("int1")) {
			return myPatientTablePhoneFirstRecord.getText();
		}
		else if(string.equals("int2")) {
			return myPatientTablePhoneFirstRecord.getText();
		}
		else if(string.equals("ColumnHeader")) {
			if(myPatientReports.getText().contains("Record number, Doc-ID, File Uploaded time, FileReport name, Identified health conditions"));
			return myPatientReports.getText();
		}
		else return null;
	}

	public void enterTwoFieldsTextAndSearch(String string, String string1, String string2) {

		if(string.equals("PatientPhone")) {
			myPatientNameFilterTxtBx.sendKeys(string1);
			myPatientPhoneNoTxtBx.sendKeys(string2);
		} else 	if(string.equals("PatientPhone1")) {
			myPatientNameFilterTxtBx.sendKeys(string1);
			myPatientPhoneNoTxtBx.sendKeys(string2);
		} else 	if(string.equals("PatientEmail2")) {
			myPatientNameFilterTxtBx.sendKeys(string1);
			myPatientEmailAddTxtBx.sendKeys(string2);
		}else 	if(string.equals("PatientEmail1")) {
			myPatientNameFilterTxtBx.sendKeys(string1);
			myPatientEmailAddTxtBx.sendKeys(string2);
		}

		myPatietSearchBtn.click();
	}

	public boolean seeTwoRecordsInTable(String string, String string2, String string3) {

		if(string.equals("PatientPhone"))
		{
			if(myPatientTableNameFirstRecord.getText().equals(string2) && myPatientTablePhoneFirstRecord.getText().equals(string3))
				return true;
		}
		else if(string.equals("PatientPhone1"))
		{
			if(myPatientTableNameFirstRecord.getText().equals(string2) && myPatientTablePhoneFirstRecord.getText().equals(string3))
				return true;
		}
		else if(string.equals("PatientEmail2"))
		{
			if(myPatientTableNameFirstRecord.getText().equals(string2) && myPatientEmailAddTxtBx.getText().equals(string3))
				return true;
		}
		else if(string.equals("PatientEmail1"))
		{
			if(myPatientTableNameFirstRecord.getText().equals(string2) && myPatientEmailAddTxtBx.getText().equals(string3))
				return true;
		}
		return false;


	}

	public void getInvalidDataValidation(String string) {

		if(string.equals("invalidPhoneNo")) {

			myPatientPhoneNoTxtBx.sendKeys("Abc");
		} else if(string.equals("invalidEmailAdd")) {

			myPatientPhoneNoTxtBx.sendKeys("Email");
		} else if(string.equals("invalidName")) {

			myPatientPhoneNoTxtBx.sendKeys("78952@@Name");
		}

	}

	public String validationErrorMsg() {

		return myPatientvalidationErrorMsg.getText();

	}

	public boolean checkPatientDisplayed(String string) {


		if(string.equals("patientCount")) {

			if(myPatientCount.getText().equals("items found"))
				return true;
		} else if(string.equals("columnHeaderData")) {

			if(myPatientcolumnHeaderData.getText().contains("Recors Number Cust Id Name Details Last Visit Actions"))
				return true;
		}   else if(string.equals("actionButtons")) {

			if(mpActionViewPreviousTestReportBtn.isDisplayed() && mpActionViewPreviousDietPlanBtn.isDisplayed() && mpActionCreateNewReportPlanBtn.isDisplayed())
				return true;
		}

		return false;
	}

	public void patientPageDisplayed() {
		// TODO Auto-generated method stub

	}

	public boolean myPatientsPagination(Integer int1) {

		if(Integer.parseInt(myPatientCount.getText()) > 10){
			if(myPatientPaginationPreviousBtn.isDisplayed() && myPatientPaginationNextBtn.isDisplayed()) 
				return true;
		}
		else if(Integer.parseInt(ViewReprtPageCount.getText()) > int1){
			if(ViewReprtPageNextBtn.isDisplayed() && ViewReprtPagePreviousBtn.isDisplayed()) 
				return true;
		}
		return false;

	}

	public boolean checkPagination(String string) {

		int initialCount = 1;
		String nextPageCount = null;
		int CountIncrease;

		if(string.equals("Next")) {
			myPatientPaginationNextBtn.click();

			nextPageCount = myPatientPaginationNo.getText();

			CountIncrease = Integer.parseInt(nextPageCount) - initialCount;

			if(CountIncrease == 1) {
				return true;
			}
		}
		else if(string.equals("Previous")) {
			myPatientPaginationPreviousBtn.click();

			nextPageCount = myPatientPaginationPreviousBtn.getText();

			CountIncrease = Integer.parseInt(nextPageCount) - initialCount;

			if(CountIncrease == 0) {
				return true;
			}
		}
		else if(string.equals("VNext")) {

			return ViewReprtPageNextBtn.isDisplayed();

		}
		else if(string.equals("VPrevious")) {

			return ViewReprtPagePreviousBtn.isDisplayed();

		}
		return false;


	}

	public boolean checkPatientsInformation(String recordNumber, String custId, String name, String details,
			String lastVisit, String actions) {

		return true;

	}

	public void clickonActionButton(String actionBtn) {

		if(actionBtn.equals("View Previous Diet Plans")) {
			mpActionViewPreviousDietPlanBtn.click();

		}else if(actionBtn.equals("Create New Report/Plan")) {
			mpActionCreateNewReportPlanBtn.click();

		}else if(actionBtn.equals("View Previous Test Reports")) {
			mpActionViewPreviousTestReportBtn.click();
		}


	}

	public boolean getPageTitel(String pageTitle) {

		if(pageTitle.equals("Generated Diet Plans")) {
			return true;
		}else if(pageTitle.equals("Confirm Health Conditions and Generate a New Diet plan")) {
			return true;
		}else if(pageTitle.equals("View Patient Test Reports")) {
			return true;
		}


		return false;


	}

	public boolean checkReports() {

		if(myPatientReports.getText().equals("Thyroid"))
			return true;

		else return false;
	}

	public void useronViewPatientTestReports(String string) {

		if(string.equals("View Previous Test Reports")) {
			mpActionViewPreviousTestReportBtn.click();
		}
	}

	public boolean viewPdfText(String string) {

		for (WebElement pdfElement : ViewReprtPageViewPDF) {

			if(!pdfElement.getText().equals(string)) {
				return false;
			}
			else return true;

		}
		return false;

	}

	@SuppressWarnings("unlikely-arg-type")
	public boolean ViewReprtData(String file, String docId, String fileUplaodTime, String name,
			String identifiedCondition) {

		if(
				ViewReprtPageViewPDF.get(0).equals(file) &&
				ViewReprtPageViewPDF.get(1).equals(docId) &&
				ViewReprtPageViewPDF.get(2).equals(fileUplaodTime) &&
				ViewReprtPageViewPDF.get(3).equals(name) &&
				ViewReprtPageViewPDF.get(4).equals(identifiedCondition)
				) {

			return true;
		}
		return false;

	}

	public void clickViewPdfButton(String string) {

		if(string.equals("View PDF")) {

			ViewReprtPDFBtn.click();

		}

	}

	public boolean checkPDFOpen(String string) {

		String pdfUrl = driver.getCurrentUrl();

		if(pdfUrl.equals(string))
			return true;
		else
			return false;


	}

	public String checkPDFData(String PDFurl) throws IOException {

		URL url = new URL(PDFurl);

		InputStream is = url.openStream();

		BufferedInputStream fileParse = new BufferedInputStream(is);

		PDDocument document = null;

		document = PDDocument.load(fileParse);

		String pdfContent = new PDFTextStripper().getText(document);

		return pdfContent;


	}



}
