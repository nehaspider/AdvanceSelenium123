package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenricUtility.ReadExcelUtility;

public class Sample_1Test {
	@Test(dataProvider="cred")
	public void testCase(String username,String password) {
		Reporter.log("sampletest1 executed",true);
		Reporter.log(username,true);
		Reporter.log(password,true);
	}
	@DataProvider(name="cred")
	public Object[][]fetchExcelData() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet1");
	}
	
	

}
