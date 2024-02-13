package PomScript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(ChromeDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="BillingNewAddress_FirstName") 
	private WebElement firstnameTextField;
	
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement lastnameTextField;
	
	@FindBy(id="BillingNewAddress_Email")
	private WebElement emailTextField;
	
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyTexrField;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement countryDropDown;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_StateProvinceId']")
	private WebElement stateDropDown;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityTextField;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1TextField;
	
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement address2TextField;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement postalCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextField;
	
	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCompanyTexrField() {
		return companyTexrField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getAddress1TextField() {
		return address1TextField;
	}

	public WebElement getAddress2TextField() {
		return address2TextField;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}
	@FindBy(id="BillingNewAddress_FaxNumber")
	private WebElement faxNumberTextField;
	

	public WebElement getFaxNumberTextField() {
		return faxNumberTextField;
	}
	
	@FindBy(xpath="(//input[@value='Continue' and @type='button'])[1]")
	private WebElement continueButton;
	

	public WebElement getContinueButton() {
		return continueButton;
	}

	
	
	
	

}
