package Verification_file;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class MainTestCaseFile {
	
	WebDriver d1;
	WebDriver d2;
	WebDriver d3;
	
	ExtentReports extent;
	ExtentTest logger;
	
	
	@BeforeTest
   public void choose() throws Exception
   {
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for Firefox");
		System.out.println("Press 3 for Internet Explorer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
	   if(n==1)
	   {	
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Ranjan_Kumar_mandal\\Videos\\SeleniumPackages\\Selenium\\chromedriver_win32\\chromedriver.exe");
			d1 = new ChromeDriver();
			d2 = new ChromeDriver();
			d3 = new ChromeDriver();
			//Thread.sleep(2000);
	   }
	   
	   else if(n==2)
	   {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ranjan_Kumar_mandal\\Videos\\SeleniumPackages\\Selenium\\geckoDriver\\geckodriver.exe");
		    d1 = new FirefoxDriver();
		    d2 = new FirefoxDriver();
		    d3 = new FirefoxDriver();

			//Thread.sleep(2000);
	   }
	   
	   else if(n==3)
	   {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Ranjan_Kumar_mandal\\Videos\\SeleniumPackages\\Selenium\\ie\\IEDriverServer.exe");
			d1 = new InternetExplorerDriver();
			d2 = new InternetExplorerDriver();
			d3 = new InternetExplorerDriver();
			//Thread.sleep(2000);
	   }
	   
	   else
	   {
		   throw new Exception("Browser is not Correct");
	   }
	   
	 	extent = new ExtentReports("C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file\\ExtentReportResults.html");
	 	logger = extent.startTest("ExtentReport for the irctc Registration test cases with given credentials (COGNIZANT TRAINING FINAL PROJECT - GROUP 2)");
	   
	   d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	   
   }
	
	@Test
	public void a_validTestCase() throws Exception {
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.get("https://www.irctc.co.in/nget/profile/user-registration");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//button[@type='submit']")).click();
		
		TestCase validTC = new TestCase();
		validTC.process(d1);
		
		logger.log(LogStatus.PASS, "Test cases for all field with VALID credentials got executed, final result : TEST CASE PASSED");
	}
	
	@Test
	public void b_invalidTestCase() throws Exception {
		 d2.manage().window().maximize();
		 d2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 d2.get("https://www.irctc.co.in/nget/profile/user-registration");
		 d2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 d2.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 d2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 TestCaseInvalid invalidTC = new TestCaseInvalid();
		 invalidTC.process1(d2);
		 
		 if(d2.getPageSource().contains("invalid"))
			 logger.log(LogStatus.PASS, "Test cases for some field with INVALID credentials got executed, error found successfully, final result : TEST CASE PASSED");
	}
	
	@Test
	public void c_blankTestCase() throws Exception {
		d3.manage().window().maximize();
		d3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d3.get("https://www.irctc.co.in/nget/profile/user-registration");
		d3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d3.findElement(By.xpath("//button[@type='submit']")).click();  
		
		 d3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 TestCaseBlank blankTC = new TestCaseBlank();
		 blankTC.process2(d3);
		
		if(d3.getPageSource().contains("required"))
			 logger.log(LogStatus.PASS, "Test cases for some field with BLANK credentials got executed, error found successfully, final result : TEST CASE PASSED");
	}

	
	@AfterTest
	public void finish() {
		logger.log(LogStatus.PASS, "@BeforeTest and @Aftertest methods have executed successfully, status : TEST CASE PASSED");
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}
}
