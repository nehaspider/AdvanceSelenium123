package GenricUtility;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

/**
 * @author nehas
 */
public class WebdriverUtility {
	public static ChromeDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static  Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	
	/**
	 * this method used to give the url of the page
	 * @param url
	 */
	public static void get_url(String url) {
		driver.get(url);
	}
	
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	/**
	 * this method use to get html source code the page
	 * @return
	 */
	public static String pageSource() {
		return driver.getPageSource();
		
	}
	/**
	 * this method is used to get the title of the page
	 * @return
	 */
	public static String title() {
		return driver.getTitle();
		
	}
	/**
	 * this method is used for get the session id of the page
	 * @return
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();
		
	}
	/**
	 * this method is used for get the all session id 
	 * @return
	 */
	public static Set<String> allWindow(){
		return driver.getWindowHandles();
	}
	/**
	 * this method is used to maximise the page
	 */
	
	public static void maximise() {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the web page
	 */
	public static void minimize() {
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to forward the page
	 */
	public static  void forward() {
		driver.navigate().forward();
	}
	/**
	 * this method is used to backward the page
	 */
	public static void backward() {
		driver.navigate().back();
	}
	/**
	 * this method is used to refresh the page
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}
	/**
	 * this method is used to navigate to the application
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	/**
	 * this method used to close the current window
	 */
	public static void close() {
		driver.close();
	}
	/**
	 * this method used to close all the windows
	 */
	public static void quit() {
		driver.quit();
	}
	/**
	 * this method is used for syncronization 
	 * @param element
	 */
	public static void ExplicitWait(WebElement element) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is used to select the option from dropdown by using index value
	 * @param i
	 * @param element
	 */
	public static void dropDown(int i,WebElement element) {
		s=new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * this method is used to select the option from the dropdown using attribute value
	 * @param value
	 * @param element
	 */
	public static void dropDown(String value,WebElement element) {
		s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is used to select the option from the dropdown using text function
	 * @param element
	 * @param Visibletext
	 */
	public static void dropDown(WebElement element,String Visibletext) {
		s=new Select(element);
		s.selectByVisibleText(Visibletext);
		
	}
	/**
	 * this method is used to move the element
	 * @param element
	 */
	public static void moveCurrent(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();

}
	/**
	 * this method is used to right click on web targeted element
	 * @param element
	 */
	public static void rightClick(WebElement element) {
		a=new Actions(driver);
		a.contextClick(element).perform();

}
	/**
	 * this method is used to double click on targeted web element
	 * @param element
	 */
	public static void doubleClick(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();

}
	/**
	 * this method is used to click on the targeted Webelement
	 * @param source
	 * @param destination
	 */
	public static void dragAndDrop(WebElement source,WebElement destination) {
		a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
	}
	/**
	 * this method is used to click on targeted web element
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		a=new Actions(driver);
		a.click(element).perform();
	}
	/**
	 * this method is used to click anywhere in the webpage
	 */
	public static void clickElement() {
		a=new Actions(driver);
		a.click().perform();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
}

