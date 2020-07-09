package testcase_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Testcase_4 
{
	WebDriver driver; 
	ExtentReports extentreport; 
	ExtentHtmlReporter htmlreporter;  
	ExtentTest testcase;
	
	@Test
	public void CreateProfile() throws Throwable {
		extentreport = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter("ExtentReport4.html");
		extentreport.attachReporter(htmlreporter);


		System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		ExtentTest testcase4 = extentreport.createTest(" CreateProfile(Testcase_4");
		testcase4.log(Status.INFO, "NAVIGATING TO Profilecreate Page");

		driver.get("https://www.developer-connector-mern.com/");

		testcase4.log(Status.INFO, "CLICKING LOGIN BUTTON");
		driver.findElement(By.xpath("//a[@id='landing__btn-login']")).click();

		ExtentTest testcase_4 = extentreport.createTest(" Verify the Login page (Testcase_4)");
		testcase4.log(Status.INFO, "Enter the name and password");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("affsatheesh@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Timeover");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Create Profile']")).click();
		testcase4.log(Status.INFO, "CLICKING CreateProfile BUTTON");

		WebElement	profilehandle =	driver.findElement(By.xpath("//input[@name='handle']"));
		profilehandle.sendKeys("affsatheesh@gmail.com");
		testcase4.log(Status.INFO, "Profile Handle name entering");
		
		WebElement dropdown =driver.findElement(By.xpath("//select[@name='status']"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(10);
		testcase4.log(Status.INFO, "CLICKING dropdown BUTTON");

WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
company.sendKeys("PIXEL MIND IT SOLUTIONS");
testcase4.log(Status.INFO, "Entering the company name");

WebElement	website=	driver.findElement(By.xpath("//input[@name='website']"));
website.sendKeys("www.mindIT.com");
testcase4.log(Status.INFO, "Entering the Company Website name");

WebElement	location=	driver.findElement(By.xpath("//input[@name='location']"));
location.sendKeys("Bangalore");
testcase4.log(Status.INFO, "Entering the Location details");

WebElement	skills=	driver.findElement(By.xpath("//input[@name='skills']"));
skills.sendKeys("Java,selenium");
testcase4.log(Status.INFO, "Testing skills details Entering");

WebElement	githubusername=	driver.findElement(By.xpath("//input[@name='githubUsername']"));
githubusername.sendKeys("affsatheesh");
testcase4.log(Status.INFO, "Github userId Entering");

WebElement bio=	driver.findElement(By.xpath("//textarea[@name='bio']"));
bio.sendKeys("Software testing"); 
testcase4.log(Status.INFO, "Entering the Bio ");


WebElement	AddsocialNetworklinks =	driver.findElement(By.xpath("//button[text()='Add Social Network Links']"));
AddsocialNetworklinks .click();
testcase4.log(Status.INFO, "Click on Networklinks");

WebElement Twitter=	driver.findElement(By.xpath("//input[@name='twitter']"));
Twitter.sendKeys("https://twitter.com/affsatheesh"); 
testcase4.log(Status.INFO, "Twitter Url Entered");

WebElement	facebook=	driver.findElement(By.xpath("//input[@name='facebook']"));
facebook.sendKeys("https://facebook.com/sathez");
testcase4.log(Status.INFO, "facebook Url Entered");

WebElement Linkedin=	driver.findElement(By.xpath("//input[@name='linkedin']"));
Linkedin.sendKeys("https://www.linkedin.com/in/satheshkumar-42245929a");
testcase4.log(Status.INFO, "linkedin Url Entered");

WebElement youtube=	driver.findElement(By.xpath("//input[@name='youtube']"));
youtube.sendKeys("https://youtube.com/learnsathez"); 
testcase4.log(Status.INFO, "youtube Url Entered");

WebElement instragram=	driver.findElement(By.xpath("//input[@name='instagram']"));
instragram.sendKeys("https://instra.com/sathez");
testcase4.log(Status.INFO, "instragram Url Entered");

WebElement finalsubmit=	driver.findElement(By.xpath("//input[@value='Submit']"));
finalsubmit.click();
testcase4.log(Status.INFO, "Final submit button Entered");
testcase4.log(Status.INFO, "profile created");

ExtentTest testcase5= extentreport.createTest(" CreateProfile(Testcase_5)");
testcase4.log(Status.INFO, "successfully logout");
WebElement logout=	driver.findElement(By.xpath("//a[@id='navbar__logout-li']"));
logout.click();


	}
	@AfterSuite
	public void CloseBrowser() {
		driver.close();
		extentreport.flush();

	}
}
