package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import PomScript.WelcomePage;
import PomScript.logInPage;

public class ALoginTest extends BaseClass {
	@Test
	public void testCase() {
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		 logInPage l=new logInPage(driver);
		 l.getEmailTextField().sendKeys(username);
		 l.getPasswordTextField().sendKeys(password);
		 l.getLogiButton().click();
		
		
	}

}
