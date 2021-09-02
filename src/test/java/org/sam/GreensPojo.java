package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends LibGlobal{
	
	public GreensPojo() {
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="(//span[@class='blue_text'])[1]")
	private WebElement goDown;
	
	@FindBy(xpath="//font[text()='GREENS TECHNOLOGY']")
	private WebElement goUp;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement goIn;
	
	@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")
	private WebElement goContent;
	
	@FindBy(xpath="//span[text()='Selenium IDE icons']")
	private WebElement passAll;

	public WebElement getGoDown() {
		return goDown;
	}

	public WebElement getGoUp() {
		return goUp;
	}

	public WebElement getGoIn() {
		return goIn;
	}

	public WebElement getGoContent() {
		return goContent;
	}

	public WebElement getPassAll() {
		return passAll;
	}
	
	

	
}
