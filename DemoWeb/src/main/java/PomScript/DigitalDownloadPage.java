package PomScript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class DigitalDownloadPage extends BasePage {
	public DigitalDownloadPage(ChromeDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement productLink1;
	
	@FindBy(xpath="(//a[text()='Music 2'])[1]/../../..//input[@value='Add to cart']")
	private WebElement productlink2;

	
	@FindBy(xpath="(//a[text()='Music 2'])[2]/../../..//input[@value='Add to cart']")
	private WebElement productlink3;


	public WebElement getProductLink1() {
		return productLink1;
	}


	public WebElement getProductlink2() {
		return productlink2;
	}


	public WebElement getProductlink3() {
		return productlink3;
	}


}
