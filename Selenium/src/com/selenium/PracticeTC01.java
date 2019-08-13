package com.selenium;

public class PracticeTC01 extends PracticeExample1 {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigate("flipkarturl");
		
		typeText("flipkartTextBox_xpath","Books");
		clickSearchButton("flipkartSearchButtom_xpath");
		
	}

	}
