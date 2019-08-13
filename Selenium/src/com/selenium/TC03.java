package com.selenium;

public class TC03 extends BaseTest2 {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		
		
		selectDropDown("amzondropdown_id","Books");
		searchText("amazonTextBox_name","Harrypotter");
		clickButton("amazonsearchbutton_xpath");
	}


}
