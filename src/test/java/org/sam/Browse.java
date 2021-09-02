package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browse extends LibGlobal{

	public static void main(String[] args) {
		
		launchBrowser();
		url("https://www.facebook.com");
		fullScreen();
		getTopic();
		currentUrl();
		WebElement findElement = driver.findElement(By.id("email"));
		pass(findElement, "ragavendra");
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		pass(findElement2, "9898989898");
	}
}
