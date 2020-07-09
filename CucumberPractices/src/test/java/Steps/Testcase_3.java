package Steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Testcase_3 
{
	 WebDriver driver; 
	  ExtentReports extentreport; 
	  ExtentHtmlReporter htmlreporter;  
	  ExtentTest testcase;
	  
	@Given("^Enter the login$")
	public void enter_the_login() throws Throwable {
		extentreport = new ExtentReports();
	    htmlreporter = new ExtentHtmlReporter("ExtentReport.html");
	    extentreport.attachReporter(htmlreporter);
	    
	    
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
        ExtentTest testcase3 = extentreport.createTest(" Verify the URL Testcase_3");
        testcase3.log(Status.INFO, "NAVIGATING TO DEVCONNECTOR URL");
        
        driver.get("https://www.developer-connector-mern.com/");
        
        testcase3.log(Status.INFO, "CLICKING LOGIN BUTTON");
        driver.findElement(By.xpath("//a[@id='landing__btn-login']")).click();
        
	}

	@When("^User enters \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_and_password(String name, String pass) throws Throwable {
	 ExtentTest testcase03 = extentreport.createTest(" Verify the Login page Testcase_3");
	 testcase03.log(Status.INFO, "Enter the name and password");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(name);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(3000);
		    String url = driver.getCurrentUrl();
		    
		    testcase03.log(Status.PASS, "Login page displayed testcase Pass");
		    if (url.equals("https://www.developer-connector-mern.com/dashboard"))
		    	
		    {
		    	System.out.println("Login test case pass");
		    	testcase03.log(Status.INFO, "Login testcase_3 pass");
		    }
		    else 
		    {
		    	System.out.println("login test case fail");
		    	testcase03.log(Status.INFO, "Login testcase_3 fail");
			      TakesScreenshot screenshot = (TakesScreenshot)this.driver;
			      File src = (File)screenshot.getScreenshotAs(OutputType.FILE);
			      File des = new File("Failedtestcase.png");
			      FileHandler.copy(src, des);
			      testcase03.log(Status.INFO, "taking failed tasecase screenshot");
			      testcase.addScreenCaptureFromPath("Failedtestcase.png", "Homepage is not displayed");
			      driver.close();
		    }

		    driver.close();
		    extentreport.flush();
		    } 
	     
	}

