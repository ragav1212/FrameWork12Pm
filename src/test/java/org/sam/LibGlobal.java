package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void fullScreen() {
		driver.manage().window().maximize();
	}
	
	public static void getTopic() {
		driver.getTitle();
	}
	
	public static void currentUrl() {
		driver.getCurrentUrl();
	}
	
	public static void getText(WebElement refName) {
		String text = refName.getText();
		System.out.println(text);
	}
	
	public static void getAttribute(WebElement element, String ref) {
		String attribute = element.getAttribute(ref);
		System.out.println(attribute);
	}
	
	public static void sleep(long millies) throws InterruptedException {
		Thread.sleep(millies);

	}
	
	public static void shut() {
		driver.close();
	}
	
	public static void pass(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	
	public static void btnclick(WebElement element) {
	 	element.click();
	}
	
	
	public static void moveElement(WebDriver element, WebElement target) {
		Actions a=new Actions(element);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		a.moveToElement(target);
	}
	
	public static void dragDrop(WebDriver driver, WebElement source, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).perform();
	}
	
	public static void doublepress(WebDriver driver, WebElement ref) {
		Actions a=new Actions(driver);
		a.moveToElement(ref).perform();
	}
	
	public static void rightPress(WebDriver driver, WebElement ref) {
	Actions a=new Actions(driver);
	a.contextClick(ref).perform();
	}
	
	public static void robotPress(int keycode) throws AWTException {
		Robot r=new Robot();
		r.keyPress(keycode);
	}
	
	public static void robotRelease(int keycode) throws AWTException {
		Robot r=new Robot();
		r.keyRelease(keycode);
	}
	
	public static void acceptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void dismissAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void acceptAlertwithtext(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();
	}
	
	public static void Screenshot(String path) throws IOException {
		TakesScreenshot tc=(TakesScreenshot)driver;
		File screenshotAs = tc.getScreenshotAs(OutputType.FILE);
		File dest= new File(path);
		FileUtils.copyFile(screenshotAs, dest);
		}
	
	public static void copyFile(File source, File dest) throws IOException {
		FileUtils.copyFile(source, dest);
	}
	
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void attributeClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("attributes[0].click()", element);
	}
	
	public static void javascriptSend(WebElement element, String send) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value,'"+send+"')", element);
	}
	
	public static void returnAttribute(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", element);
		String s=(String)executeScript;
		System.out.println(s);
	}
	
	public static void frameId(String refValue) {
		driver.switchTo().frame(refValue);
	}
	
	public static void frameName(String refName) {
		driver.switchTo().frame(refName);
	}
	
	public static void frameInt(int index) {
	driver.switchTo().frame(index);	
	}
		
	public static void frameWeb(WebElement element) {
			driver.switchTo().frame(element);
	}
	
	public static void frameParent(WebElement element) {
		 driver.switchTo().parentFrame();
	}
	
	public static void frameConstruct() {
		driver.switchTo().defaultContent();
	}
	
	public static void parentWindow() {
		String windowHandle = driver.getWindowHandle();
		System.out.println("ParentWindow :" + windowHandle);
	}
	
	public static void allWin() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
	
	public static void selectIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selectVisible(WebElement element, String refname) {
		Select s= new Select(element);
		s.selectByVisibleText(refname);
	}
	
	public static void selectValue(WebElement element, String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	public static void isMulti(WebElement element) {
		Select s= new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	
	public static void getOpt(WebElement element) {
		Select s= new Select(element);
		List<WebElement> o = s.getOptions();
		System.out.println(o);
	}
	
	public static void deselectOptions(WebElement element, String value) {
		Select s= new Select(element);
		s.deselectByValue(value);
	
	}
	

}
