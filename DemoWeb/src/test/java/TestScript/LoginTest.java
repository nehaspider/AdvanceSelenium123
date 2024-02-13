package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.ReadExcelUtility;
import PomScript.WelcomePage;
import PomScript.logInPage;

public class LoginTest extends BaseClass {
	WelcomePage wp;
	logInPage lp;
	@Test(dataProvider="cred")
	public void testCase01(String email,String password) {
		 wp=new WelcomePage(driver);
		 wp.getLoginLink().click();
		 lp=new logInPage(driver);
		 lp.getEmailTextField().sendKeys(email);
		 lp.getPasswordTextField().sendKeys(password);
		 lp.getLogiButton().click();
		 Reporter.log("logged in successfull",true);

	}
	@DataProvider(name="cred")
	public Object[][]loginData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet2");
	}
	

}
