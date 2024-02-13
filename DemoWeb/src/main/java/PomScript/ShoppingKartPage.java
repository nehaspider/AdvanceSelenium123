package PomScript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingKartPage extends BasePage {

	public ShoppingKartPage(ChromeDriver driver) {
		super(driver);
		
	}
	@FindBy(id="termsofservice")
	private WebElement termsandconditionCheckbox;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;

	public WebElement getTermsandconditionCheckbox() {
		return termsandconditionCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

}
