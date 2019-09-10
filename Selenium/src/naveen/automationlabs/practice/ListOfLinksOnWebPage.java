package naveen.automationlabs.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfLinksOnWebPage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	
	List <WebElement> linklist=driver.findElements(By.tagName("a"));
	System.out.println(linklist.size());
	for(int i=0;i<linklist.size();i++) {
		String list=linklist.get(i).getText();
		System.out.println(list);
	}
	
	driver.quit();
	}
	

}
