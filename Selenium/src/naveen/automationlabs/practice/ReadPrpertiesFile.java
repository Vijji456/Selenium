package naveen.automationlabs.practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPrpertiesFile {
	//public static String datapath=System.getProperty("user.dir")+"//config.properties";
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\IBM_ADMIN\\git\\Selenium\\Selenium\\config.properties");
		//FileInputStream fis=new FileInputStream(datapath);
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println("age");
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("Firfox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("The given driver is not matched......");
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id(prop.getProperty("firstname_id"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id(prop.getProperty("lastname_id"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("moblenumber_xpath"))).sendKeys(prop.getProperty("mobilenumber"));
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
