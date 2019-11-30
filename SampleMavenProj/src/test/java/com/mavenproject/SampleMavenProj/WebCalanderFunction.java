package com.mavenproject.SampleMavenProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebCalanderFunction {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIv9S88vLy5AIVmjUrCh3eMABOEAAYASAAEgIJ6PD_BwE");
		//driver.findElement(By.id("src")).sendKeys("Bangalore (All Locations)");
		//driver.findElement(By.id("dest")).sendKeys("Chilakaluripeta");
		
		//OnwardDate
		String date="12-Dec 2019";
		String[] splitter=date.split("-");
		String OnwardMonth=splitter[1];
		String OnwardDay=splitter[0];

		
		Thread.sleep(3000);
		driver.findElement(By.id("onward_cal")).click();
		List<WebElement> month = driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[1]"));
		System.out.println(month.size());
		for(int i=0;i<month.size();i++)	{
			System.out.println(month.get(i).getText());
			if(month.get(i).getText().equals(OnwardMonth)) {
				List<WebElement> day = driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr"));
				for(WebElement d:day) {
					System.out.println(d.getText());
					if(d.getText().equals(OnwardDay)) {
						d.click();
					}
				}
			}
		}
		
		
		//driver.findElement(By.id("search_btn")).click();
		
		
		Thread.sleep(3000);
		//driver.quit();
		
		
		
		
		
		
		
	}
	
}