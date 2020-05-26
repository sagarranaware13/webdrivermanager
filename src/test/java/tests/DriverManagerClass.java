package tests;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
	
	// https://github.com/bonigarcia/webdrivermanager
	// 
	public class DriverManagerClass {
	
	  WebDriver driver;
	  
	  @Parameters("browserName")
	  @Test
	  public void driverManagerTest(String browserName) {
		  setUp(browserName);
		  
		  String url="https://www.google.com/";
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  String actualTitile=driver.getTitle();
		  String expectedTitle="Google";
		  
		  assertEquals(actualTitile, expectedTitle);
		  System.out.println("Title verified : The Google is opned");
		  
	  }
	  
	 
	  public void setUp(String browserName) {
		  
//		  WebDriverManager.chromedriver().setup();
//		  WebDriverManager.firefoxdriver().setup();
//		  WebDriverManager.edgedriver().setup();
//		  WebDriverManager.operadriver().setup();
//		  WebDriverManager.phantomjs().setup();
//		  WebDriverManager.iedriver().setup();
//		  WebDriverManager.chromiumdriver().setup();

		  if(browserName.equalsIgnoreCase("ie")) {
			  
			  WebDriverManager.iedriver().setup();
			  driver=new InternetExplorerDriver();
			  
		  } else if(browserName.equalsIgnoreCase("firefox")) {
			
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		
		  } else {

			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
     	  }
	}
	
	  @BeforeMethod
	  public void beforeTest() {
		  System.out.println("Before test");
	  }
	  
	  @AfterMethod
	  public void tearDown() {
	  
		  driver.quit();
	  }

}