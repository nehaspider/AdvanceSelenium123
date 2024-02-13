package PomScript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class WelcomePage extends BasePage {
	public WelcomePage(ChromeDriver driver) {
		super(driver);
		
	}



	@FindBy(linkText="Register")
    private WebElement registerLink;
    
    @FindBy(linkText="Log in")
    private WebElement loginLink;
    
    @FindBy(xpath ="//span[text()='Shopping cart']")
    private WebElement ShoppingCartLink;
    
    @FindBy(xpath="//a[text()='Log out']")
    private WebElement logoutlink;
    
    @FindBy(partialLinkText="Digital download")
    private WebElement digitaldownload;


	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getShoppingCartLink () {
		return ShoppingCartLink;
		
}
		public WebElement getlogoutlink () {
		return logoutlink;
		
	}
		public WebElement getdigitaldownload () {
			return digitaldownload;
			
		}

}
