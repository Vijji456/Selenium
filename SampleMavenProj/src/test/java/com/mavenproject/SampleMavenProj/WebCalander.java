package com.mavenproject.SampleMavenProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class WebCalander {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.tripadvisor.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		driver.findElement(By.xpath("//div[@class='unified-picker citrus departure']")).click();
		
		//CheckIn
		String date="15-December 2019";
		String[] splitter=date.split("-");
		String CheckInDay=splitter[0];
		String checkInMonth=splitter[1];
		
		selectDate(checkInMonth,CheckInDay);
		
		//Thread.sleep(60000);
		
		//checkOut
		driver.findElement(By.xpath("//div[@class='unified-picker citrus ui_picker_arrow_target return focused']")).click();
		String date1="22-December 2019";
		String[] splitter1=date1.split("-");
		String CheckOutDay=splitter1[0];
		String CheckOutMonth=splitter1[1];
		
		selectDate(CheckOutMonth,CheckOutDay);
		
		
		
		
				
	
	}

	public static void selectDate(String month_year, String day) throws InterruptedException {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='rsdc-months']/span/span[1]"));
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			if(elements.get(i).getText().equals(month_year)) {
				List<WebElement> day_elements = driver.findElements(By.xpath("//div[@class='rsdc-months']/span["+(i+1)+"]/span"));
				for(WebElement d:day_elements)
				{
					System.out.println(d.getText());
					if(d.getText().equals(day)) {
						d.click();
						return;
					}
				}
			}
			
		
		}
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='rsdc-next rsdc-nav ui_icon single-chevron-right']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='rsdc-next rsdc-nav ui_icon single-chevron-right']")))).click();
		
		Thread.sleep(3000);
		selectDate(month_year,day);
		
	}

}
