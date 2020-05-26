# webdrivermanager
WebDriver Manger:
WebDriverManager is a library which allows to automate the management of the binary drivers (e.g. chromedriver, geckodriver, etc.)

Developed by: bonigarcia
Link: https://github.com/bonigarcia/webdrivermanager  

Why to use: 
While using Selenium WebDriver, we need to use different browsers such as Chrome, Firefox, Edge, Opera, PhantomJS, or Internet Explorer, first you need to download the driver for browser. Like if you want to work on chorme then we need to download chrome browser. i.e. a binary file which allows WebDriver to handle browsers. 
To overcome maintenance of managing drivers and versions. Use WebDriverManager API which take care of your driver automation.

How to use:
Include WebDriverManager as Java dependency in POM file.
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>4.0.0</version>
    <scope>test</scope>
</dependency>


Implementation:
	public class ChromeTest {

	    private WebDriver driver;

	    @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }

	    @Before
	    public void setupTest() {
	        driver = new ChromeDriver();
	    }

	    @After
	    public void teardown() {
	            driver.quit();
	        
	    }

	    @Test
	    public void test() {
	        // Your test code here
	    }

	}


Project contains:
Java, maven, TestNg 


Common Exceptions:
WebDriver exception: cannot find chrome binary: when browser is not available on the system.
