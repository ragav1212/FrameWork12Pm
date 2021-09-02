package org.sam;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken  {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\ExcelFiles\\FrameTraining\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> attri = driver.findElements(By.tagName("a"));

		int count = 0;
		for (int i = 0; i < attri.size(); i++) {
			String links = attri.get(i).getAttribute("href");

			URL url = new URL(links);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection conn = (HttpsURLConnection) openConnection;
			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {

				System.out.println(links);
				count++;
			}

		}
		System.out.println(count);
	}

}
