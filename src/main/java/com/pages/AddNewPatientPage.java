package com.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewPatientPage {

	WebDriver driver;
	
	public String nexturl="https://www.dieticiangroup.com/MyPatients";
	public String homeurl="http://www.dieticiangroup.com/DieticianHome";
	public AddNewPatientPage(WebDriver driver) {
		super();
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@FindBy(id = "Fullname") @CacheLookup 	WebElement Fullname;
		
	@FindBy(id = "AddressLine1")
	@CacheLookup
	WebElement AddressLine1;

	@FindBy(id = "AddressLine2")
	@CacheLookup
	WebElement AddressLine2;

	@FindBy(id = "Country")
	@CacheLookup
	WebElement CountryDropdown;
	
	@FindBy(id = "City")
	@CacheLookup
	WebElement City;

	@FindBy(id = "Region")
	@CacheLookup
	WebElement Region;

	@FindBy(id = "PostalCode")
	@CacheLookup
	WebElement PostalCode;
	@FindBy(id = "Email")
	@CacheLookup
	WebElement Email;

	@FindBy(id = "Phonenumber")
	@CacheLookup
	WebElement Phonenumber;

	@FindBy(id = "btnUpdate")
	@CacheLookup
	WebElement BtnUpdate;

	@FindBy(id = "btnUpdateHealthCondition")
	@CacheLookup
	WebElement btnUpdateHealthCondition;

	public void funFullname(String fullName) {
	   Fullname.sendKeys(fullName);
	}

	public void funAddressLine1(String Addressline1) {
		AddressLine1.sendKeys(Addressline1);
	}

	public void funAddressLine2(String Addressline2) {
		AddressLine2.sendKeys(Addressline2);
	}

	public void funCountryDropdown(String country) {
		//String country = null;
		Select Dropdown=new Select(CountryDropdown);
		Dropdown.selectByVisibleText(country);
	}
	
	public void funCity(String city) {
		City.sendKeys(city);
	}

	public void funRegion(String state) {
		Region.sendKeys(state);
	}

	public void funPostalCode(String postalcode) {
		PostalCode.sendKeys(postalcode);
	}

	public void funEmail(String email) {
		Email.sendKeys(email);
	}

	public void funPhonenumber(String phone) {
		Phonenumber.sendKeys(phone);
	}

	public void funBtnUpdate() {
		BtnUpdate.click();
	}
	
	public void funbtnUpdateHealthCondition() {
		btnUpdateHealthCondition.click();
	}
	
	public boolean IsNullOrEmpty(String value) {
        boolean result = ((value == null) || (value.isEmpty()) );
        return result;
    }

    public boolean IsStringValid(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }

        String matchPattern = "[a-z]+\\s[a-z]+";

        Pattern pattern = Pattern.compile(matchPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);
       
        return matcher.matches();
    }
    
    public boolean HasStringValidate(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }

        String matchPattern = "[a-z]+";

        Pattern pattern = Pattern.compile(matchPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);
       
        return matcher.matches();
    }


    public boolean IsAddressValid(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }
        return true;
    }

    public boolean IsPostalCodeValid(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }
        String matchPattern = "^[0-9]{6}$";

        Pattern pattern = Pattern.compile(matchPattern, Pattern.CANON_EQ);
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }
    
    public boolean IsEmailValid(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }

        String matchPattern = "[a-z0-9_]+@[a-z]+\\.(com|io|org|gov){1}";

        Pattern pattern = Pattern.compile(matchPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);
       
        return matcher.matches();
    }
    
    public boolean IsPhoneno(String value) {
        if (IsNullOrEmpty(value)) {
            return false;
        }
        String matchPattern = "^[0-9]{10}$";

        Pattern pattern = Pattern.compile(matchPattern, Pattern.CANON_EQ);
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }
    
    
    public void MyPatientclick()
    {
    	driver.get(nexturl);
    }
    
    public String VerifyUrl() {
		return driver.getCurrentUrl();
	}
	
	public String Verifytitle() {
		return driver.getTitle();
	}



}
