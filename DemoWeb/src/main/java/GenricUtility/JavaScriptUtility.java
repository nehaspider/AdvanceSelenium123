package GenricUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebdriverUtility {
	/**
	 * this method is used to scroll the webpage according to the x axis and y axis
	 * @param x
	 * @param y
	 */
	public static void ScrollBy(int x,int y) {
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * this method is used to scroll the webpage from the resume point
	 * @param x
	 * @param y
	 */
	public static void ScrollTo(int x,int y) {
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	 /**
	  * this method is used to scroll the page until the element is visible
	  * @param b
	  * @param element
	  * @param index
	  */
	 public static void ScrollIntoView(boolean b,WebElement element,int index) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[index].scrollIntoView("+b+");",element);
	}
	 /**
	  * this method is used to click the disable element
	  * @param element
	  */
	 public static void clickDisable(WebElement element) {
			js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",element);
		}
	

}
