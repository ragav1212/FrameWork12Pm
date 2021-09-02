package org.sam;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal{

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="email")
	private WebElement username;
	
	@FindBy (id="pass")
	private WebElement password;
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement go;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getGo() {
		return go;
	}
	
}
