import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void A() {
	  Assert.assertEquals("vinay", "GHouse");
	  System.out.println("Test A");
  }
  @Test
  public void B() {
	  System.out.println("Test B");	  
  }

  @Test(priority=2)
  public void C() {
	  System.out.println("Test C");
  }

  @Test(priority=1,dependsOnMethods="A",alwaysRun=true)
  public void D() {
	  System.out.println("Test D");
  }

	
	/*@Test(dependsOnMethods="register")
	public void login()
	{
		System.out.println("Login method");
		
	}
	@Test
	public void mail() {
		System.out.println("mail Method");
	}
	
	
	@Test
	
		public void register() {
			System.out.println("register method");
	}
		@Test
		public void home() {
			System.out.println("home method");
		
	}
*/  }
