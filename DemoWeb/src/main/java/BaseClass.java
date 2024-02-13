

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

import GenricUtility.WebdriverUtility;

public class BaseClass extends WebdriverUtility {
	
	public static ChromeDriver driver;
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
   public void beforeClass() {
	   driver=new ChromeDriver() ;
	   Reporter.log("Crome got launched successfully", true);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get("https://demowebshop.tricentis.com/");
	   Reporter.log("Closed the browser",true);
	   
   }
   
   @AfterClass
   public void afterClass() {
	   driver.quit();
	   Reporter.log("close the browser", true);
	   
  }
   
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("log in", true);
	  
  }
    
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("log out", true);
  }
  

	

}
