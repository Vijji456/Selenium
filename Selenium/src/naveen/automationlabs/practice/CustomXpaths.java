package naveen.automationlabs.practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.ebay.com/");
		
		//Custom xpaths creation
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[@size='50']")).sendKeys("CoreJava");
		//driver.findElement(By.xpath("//input[@spellcheck='false']")).sendKeys("Vijji");
		
		//Dynamic id available like below then we have to use contains(),starts-with(),ends-with() methods
		
		/*contains() 
		 * id=test_123
		 * id=test_456
		 * id=test_test_7890_test*/
		
		
		/* starts-with()
		 *  id=test_123
		 *  id=test_345
		 *  id=test_567
		 *  id=test_678  */
		
		/* id=123_test_t
		 * id=456_test_t
		 * id=567_test_t   */
		
//		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("ABC");
//		driver.findElement(By.xpath("//input[satrts-with(@id,'test_')]")).sendKeys("ABC");
//		driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]")).sendKeys("ABC");
		
		//for links- custom X-paths-----all links represented by html <a> tag
		//driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
	 List <WebElement> linklist=driver.findElements(By.tagName("a"));
	 System.out.println(linklist.size());// Size of the array
	 for(int i=0;i<(linklist.size());i++) {
		 String list=linklist.get(i).getText();
		 System.out.println(list);// to display text of each link
		 
		 //if you do not want the blank tags then use below statemnet
		 //if(!linklist.get(i).getText().isEmpty())
	 }
	}

}
