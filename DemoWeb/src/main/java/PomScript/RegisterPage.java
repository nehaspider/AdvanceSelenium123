package PomScript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
	
	public RegisterPage(ChromeDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Constructor
	
	@FindBy(id="gender-female")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastnamer;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement submit;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastnamer() {
		return lastnamer;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSubmit() {
		return submit;
	}
	//Bussiness Logic
	public void RegisterFunction() {
		gender.click();
		firstname.sendKeys("neha");
		lastnamer.sendKeys("singh");
		email.sendKeys("neha998888@gmail.com");
		password.sendKeys("neha0002");
		confirmpassword.sendKeys("neha0002");
		submit.click();

	}
	
	

}
