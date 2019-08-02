package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFilePopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\Selenium\\\\Drivers\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Vijji Docs\\Selinium.docx");
	}

}
