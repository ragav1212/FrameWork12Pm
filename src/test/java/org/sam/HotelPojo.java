package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends LibGlobal {

	public HotelPojo() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement regFree;
	
	@FindBy(id="username")
	private WebElement userName;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pin;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement conformpin;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement nameFull;
	
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement fullmail;


	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement check;


	public WebElement getRegFree() {
		return regFree;
	}


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPin() {
		return pin;
	}


	public WebElement getConformpin() {
		return conformpin;
	}


	public WebElement getNameFull() {
		return nameFull;
	}


	public WebElement getFullmail() {
		return fullmail;
	}


	public WebElement getCheck() {
		return check;
	}
	
	
	
}
