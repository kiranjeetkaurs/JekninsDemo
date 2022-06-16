package com.pages;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePlanBrowsePage {

	WebDriver driver;
	public String currenturl = "https://www.dieticiangroup.com/ConfirmConditionsandCreatePlan";
	public String homeurl="https://www.dieticiangroup.com/DieticianHome";
	public String  nexturl="https://www.dieticiangroup.com/ViewRecentDiets";
	public static String filedata = "C:/Users/svatt/git/Dietician-UI-Automation-Hackathon/src/test/resources/sample.pdf";
	public long filesize;
	public File filetype;
	public String filetypecheck;

	public CreatePlanBrowsePage(WebDriver driver) {
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
	@FindBy(id = "TextHeader")
	@CacheLookup
	WebElement TextHeader;

	@FindBy(id = "TextHeader")
	@CacheLookup
	List<WebElement> TextHeaderString;

	@FindBy(id = "TextArea")
	@CacheLookup
	WebElement FileUploadTextArea;

	@FindBy(name = "TextArea")
	@CacheLookup
	List<WebElement> FileUploadTextAreaSize;

	@FindBy(id = "BtnBrowse")
	@CacheLookup
	WebElement BtnBrowse;

	@FindBy(id = "BtnUpload")
	@CacheLookup
	WebElement BtnUpload;
	
	@FindBy(id = "BtnGenerateMenu")
	@CacheLookup
	WebElement BtnGenerateMenu;

	public boolean funTextHeader() {
		if (TextHeaderString.size() != 0) {
			if (TextHeader.getText().equalsIgnoreCase("Confirm Health Conditions and Generate a New Diet Plan")) {
				String TextHead = TextHeader.getText().toString();
				System.out.println(TextHead);
				return true;
			}
		}
		return false;
	}

	public void funTextArea() {
		BtnBrowse.click();
		FileUploadTextArea.sendKeys(filedata);
	}
	
	public void funBtnGenerateMenuclick()
	{
		driver.get(nexturl);
	}
	
	public boolean funBtnGenerateMenu()
	{ if (BtnGenerateMenu.isEnabled()&&	BtnGenerateMenu.isDisplayed())
	{
		return true;
	}return false;
	}

	public boolean FileUploadTextAreaSize() {
		if (FileUploadTextAreaSize.size() != 0) {
			FileUploadTextArea.isSelected();
			return true;
		}
		return false;
	}

	public boolean funFileType(String filedata) {
		File filetype = new File(filedata);
		filetypecheck = filetype.getName().toUpperCase();
		boolean extension = filetypecheck.endsWith(".PDF");

		if (!extension) {
			return false;
		}

		return true;

	}

	public boolean funFileUploadsize(String filedata) {
		if(!funFileType(filedata)) {
			return false;
		}
		File fileh = new File(filedata);
		filesize = FileUtils.sizeOf(fileh);

		if (filesize > 2097152) {
			System.out.println("File size should not exceed 2MB");
			return false;
		}
		return true;
	}

	public void funbtnBrowseclick() {
		BtnBrowse.click();
	}

	public void funBtnUploadclick() {
		BtnUpload.click();
	}

	public boolean funBtnBrowse() {
		return BtnBrowse.isDisplayed();

	}

	public boolean funBtnUpload() {
		return BtnUpload.isDisplayed();

	}

	public String VerifyUrl() {
		return driver.getCurrentUrl();
	}

	public String Verifytitle() {
		return driver.getTitle();
	}

}