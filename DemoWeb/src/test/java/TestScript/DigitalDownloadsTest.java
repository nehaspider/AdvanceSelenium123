package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.ReadExcelUtility;
import PomScript.DigitalDownloadPage;
import PomScript.WelcomePage;
import PomScript.logInPage;

public class DigitalDownloadsTest extends BaseClass {
	WelcomePage wp;
	logInPage lp;
	DigitalDownloadPage dd;
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
	@Test 
	public void testCase02() {
		dd=new DigitalDownloadPage(driver);
		wp.getdigitaldownload().click();
		dd.getProductLink1().click();
	}
	
	
	

}
