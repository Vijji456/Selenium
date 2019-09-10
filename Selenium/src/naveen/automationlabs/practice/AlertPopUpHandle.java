package naveen.automationlabs.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {
	
	//Types of Popups
	//1.Alert pop up-----Javasript Pop Up-----alert API(accept,dismiss)
	//2. FileUpload Pupup---- type='file' and sendKeys(path)
	//3. Window pop up or advertisement pop ups	(windowHandler api getWindowHandles())

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		 if(text.equals("Please enter a valid user name"))
		 {
			 System.out.println("Correct message is displayed");
		 }
		 else
		 {
			 System.out.println("Incorrect message is displayed");
		 }
		 
		 alert.accept();// to click on ok button
		 //alert.dismiss();// to click on cancle button
		 
		 driver.findElement(By.id("login1")).sendKeys("Vijji");
		 driver.findElement(By.name("proceed")).click();
		 Thread.sleep(5000);
		 Alert alert1=driver.switchTo().alert();
		 String text1=alert1.getText();
		 System.out.println(text1);
		 alert1.accept();
		 
	}

}
