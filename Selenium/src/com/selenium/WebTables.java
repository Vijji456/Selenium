package com.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static String driverpath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	public static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com");
		driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'HTML Tables')]")).click();
		
		
		List<WebElement> tr_listElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	    System.out.println("Number of rows in this table is:" +tr_listElements.size());
	    
	    int row_num,col_num;
	    
	    row_num=1;
	    for(WebElement tr_Element:tr_listElements) {
	    	List<WebElement> td_listElements = tr_Element.findElements(By.xpath("td"));
	    	col_num=1;
	    	for(WebElement td_element:td_listElements) {
	    		System.out.println("Row #" +row_num+",Col # "+col_num+ ",Text=" +td_element.getText());
	    		col_num++;
	    	}
	    	row_num++;
	    }
	    
	    
	    
	    
	    Thread.sleep(3000);
		driver.quit();
		
		
	}

}
