package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.ReadExcelUtility;
import PomScript.RegisterPage;
import PomScript.WelcomePage;

public class RegistrationTest extends BaseClass {
	@Test(dataProvider="Register")
	public void testCase(String fn,String ln,String email,String pass,String conpass) {
		
		
		WelcomePage w= new WelcomePage(driver);
		w.getRegisterLink().click();
		RegisterPage r=new RegisterPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys(fn);
		r.getLastnamer().sendKeys(ln);
		r.getEmail().sendKeys(email);
		r.getPassword().sendKeys(pass);
		r.getConfirmpassword().sendKeys(conpass);
		r.getSubmit().click();
	}
	
	@DataProvider(name="Register")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet1");
	}
	

}
