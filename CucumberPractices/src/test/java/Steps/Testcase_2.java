package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Testcase_2
{
	 WebDriver driver; 
	  ExtentReports extentreport; 
	  ExtentHtmlReporter htmlreporter;  
	  ExtentTest testcase;
	  
	@Given("^Create login account$")
	public void create_login_account() throws Throwable {
		extentreport = new ExtentReports();
	    htmlreporter = new ExtentHtmlReporter("ExtentReport2.html");
	    extentreport.attachReporter(htmlreporter);
	    
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 ExtentTest testcase1= extentreport.createTest(" verify the URL");
		 testcase1.log(Status.INFO, "NAVIGATING TO DEVCONNECTOR URL");
		 
        driver.get("https://www.developer-connector-mern.com/");
        testcase1.log(Status.INFO, "Url working good");
        
        ExtentTest testcase2= extentreport.createTest(" Open the signup Creating page");
        testcase2.log(Status.INFO, "CLICKING Signup BUTTON");
        WebElement signup=driver.findElement(By.id("landing__btn-sign-up"));
		signup.click();
	}
	@When("^User enters \"([^\"]*)\" and mailId \"([^\"]*)\"and password\"([^\"]*)\"and conform \"([^\"]*)\"$")
	public void user_enters_and_mailId_and_password_and_conform(String name, String mail, String pass, String conformpass) throws Throwable {
		 ExtentTest testcase02= extentreport.createTest(" Create signup");
		testcase02.log(Status.INFO, "Entering vaild invalied password");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
	     driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	     driver.findElement(By.xpath("//input[@name='password2']")).sendKeys(conformpass);
	}

	@When("^click the Submit button$")
	public void click_the_Submit_button() throws Throwable {
		 driver.findElement(By.xpath("//input [@type='submit']")).click();
		 ExtentTest testcase002= extentreport.createTest("Submitting");
		 testcase002.log(Status.INFO, "signup created successfully");
		 driver.close();
		 extentreport.flush();
	}

}
