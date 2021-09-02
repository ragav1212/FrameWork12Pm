package org.sam;

public class LogIn extends LibGlobal {
	public static void main(String[] args) {
		launchBrowser();
		url("https://www.facebook.com");
		fullScreen();
		
		LoginPojo l=new LoginPojo();
		pass(l.getUsername(), "Ragavendra");
		pass(l.getPassword(), "989898");
		
		driver.navigate().refresh();
		LoginPojo li=new LoginPojo();
		pass(li.getUsername(), "Lakshan");
		pass(li.getPassword(), "987845698745");
		btnclick(li.getGo());
	}
}
