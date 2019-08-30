package naveen.automationlabs.practice;

import java.io.File;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class TakeAscreenshotconsept {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Take a screen shot and store as file format
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Users\\IBM_ADMIN\\git\\Selenium\\Selenium\\src\\naveen\\automationlabs\\practice\\.google.png"));

	}

}
