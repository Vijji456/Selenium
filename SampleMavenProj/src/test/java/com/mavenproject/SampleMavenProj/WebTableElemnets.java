package com.mavenproject.SampleMavenProj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebTableElemnets {
WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void webtableList() {
	  driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'HTML Tables')]")).click();
	  List<WebElement> tr_collection = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	  
	  int row_num,col_num;
	  row_num=1;
	  for(WebElement tr_element:tr_collection) {
		  List<WebElement> td_collection = tr_element.findElements(By.xpath("td"));
		  col_num=1;
		  for(WebElement td_element:td_collection) {
			  System.out.println("Row #"+row_num+", Column #"+col_num+",Text ="+td_element.getText());
			  col_num++;
		  }
		  row_num++;
	  }
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }
  
 

}
