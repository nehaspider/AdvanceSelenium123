package GenricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PomScript.WelcomePage;
import PomScript.logInPage;

public class BaseClass extends WebdriverUtility {
	
	
	@BeforeSuite 
	public void beforeSuite() {
		Reporter.log("connection to the server ", true);
		}
	
	@AfterSuite
		public void afterSuite() {
			Reporter.log("disconnect to the server", true);
		}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("connect to data base", true);
		}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("disconnect to data base", true);
	}
	
   @BeforeClass
   public void beforeClass() throws IOException {
	   driver=new ChromeDriver();
	   Reporter.log("Crome got launched successfully", true);
	   maximise();
	   implicitWait();
	   String url=PropertyFileUtility.propertyData("url");
      get_url(url);
   }
   
   @AfterClass
   public void afterClass() {
	   driver.quit();
	   Reporter.log("close the browser", true);
	   
  }
   
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  WelcomePage wp= new WelcomePage(driver);
	  wp.getLoginLink().click();
	  logInPage lp=new logInPage(driver);
	  lp.getEmailTextField().sendKeys(PropertyFileUtility.propertyData("email"));
	  lp.getPasswordTextField().sendKeys(PropertyFileUtility.propertyData("password"));
	  lp.getLogiButton();
	  Reporter.log("log in", true);
	  
	  
  }
    
  @AfterMethod
  public void aftermethod() {
	  WelcomePage wp=new WelcomePage(driver);
	  wp.getLoginLink().click();
	  Reporter.log("log out", true);
  }
  

	

}
