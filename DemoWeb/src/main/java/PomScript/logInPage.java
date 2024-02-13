package PomScript;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class logInPage extends BasePage {
	public logInPage(ChromeDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//constructor
	
		@FindBy(id="Email")
		private WebElement emailTextField;
		
		@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
		private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@value='Log in']")
		private WebElement loginButton;
		
		

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLogiButton() {
			return loginButton;
		}
		
		
      //Bussiness class
		public void loginFunction() {
			emailTextField.sendKeys("neha0001@gmail.com");
			passwordTextField.sendKeys("neha0001@gmail.com");
			loginButton.click();
		}

}
