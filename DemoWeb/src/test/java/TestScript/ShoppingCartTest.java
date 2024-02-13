package TestScript;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import PomScript.CheckOutPage;
import PomScript.DigitalDownloadPage;
import PomScript.ShoppingKartPage;
import PomScript.WelcomePage;

public class ShoppingCartTest extends BaseClass {
	WelcomePage wp;
	@Test
	public void testCase01() throws InterruptedException {
		wp=new WelcomePage(driver);
		wp.getdigitaldownload().click();
		DigitalDownloadPage dp=new DigitalDownloadPage(driver);
		dp.getProductLink1().click();
		Thread.sleep(3000);
		wp.getShoppingCartLink().click();
		ShoppingKartPage sp=new ShoppingKartPage(driver);
		sp.getTermsandconditionCheckbox().click();
		sp.getCheckoutButton().click();
		CheckOutPage cp=new CheckOutPage(driver);
		cp.getContinueButton().click();
		
	}
	

}
