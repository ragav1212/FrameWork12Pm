package org.sam;

import java.io.IOException;

public class Hotel extends LibGlobal {
	
	public static void main(String[] args) throws IOException {
		launchBrowser();
		url("http://adactinhotelapp.com/");
		fullScreen();
		 
		HotelPojo h=new HotelPojo();
		btnclick(h.getRegFree());
		pass(h.getUserName(), "ragav");
		pass(h.getPin(), "123123123123");
		pass(h.getConformpin(),"123123123123");
		pass(h.getNameFull(), "Ragavendra");
		pass(h.getFullmail(), "yuvanraga@gmail.com");
		btnclick(h.getCheck());
		Screenshot("E:\\ExcelFiles\\FrameTraining\\captures\\page.png");
	}
}
