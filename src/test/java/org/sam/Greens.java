package org.sam;

public class Greens extends LibGlobal{
	
	
	public static void main(String[] args) {
		launchBrowser();
		url("http://www.greenstechnologys.com/index.html");
		fullScreen();
		
		GreensPojo g=new GreensPojo();
		scrollDown(g.getGoDown());
		scrollUp(g.getGoUp());
		btnclick(g.getGoIn());
		btnclick(g.getGoContent());
		btnclick(g.getPassAll());
		
	}

}
