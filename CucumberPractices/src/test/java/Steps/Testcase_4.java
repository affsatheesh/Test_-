package Steps;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Properties;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
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
	      Properties properties=null;
			
		  @Test
		  public void opengoogle() throws IOException, InterruptedException {
		    ExtentTest testcase = extentreport.createTest(" Verify the URL");
		    driver.get("https://www.developer-connector-mern.com/");
		    driver.findElement(By.xpath("//a[@id='landing__btn-login']")).click();
		    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("affsatheesh@gmail.com");
		     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Timeover");
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		     
		     Thread.sleep(4000);
			WebElement profile = driver.findElement(By.id("dashboard__create-profile-btn"));
			profile.click();
		   
	WebElement	profilehandle = driver.findElement(By.xpath("//input[@name='handle']"))
		
	WebElement selectprofessionalstatus =driver.findElement(By.xpath(" //select[@name='status']"));
	
	  WebElement	company	=driver.findElement(By.xpath(" //input[@name='company']")).sendKeys("PIXEL MIND IT SOLUTIONS");
			WebElement	website=driver.findElement(By.xpath(" //input[@name='website']")).sendKeys("www.mindIT.com");
			WebElement	location= driver.findElement(By.xpath("//input[@name='location']")).sendKeys("Bangalore");
			WebElement	skills=driver.findElement(By.xpath("//input[@name='skills'] ")).sendKeys("java,selenium");
			WebElement	githubusername=driver.findElement(By.xpath("//input[@name='githubUsername'] ")).sendKeys("Affsatheesh");
			WebElement	shrotbio	=driver.findElement(By.xpath("//textarea[@name='bio'] ")).sendKeys("Software Testing");
/*		Select sel = new Select (selectprofessionalstatus);
	    List<WebElement> options=	sel.getOptions();
	    int optionlist = options.size();
	    System.out.println(optionlist);
	    
	    for (WebElement webElement : options)
	    {
			String alloptiontext = webElement.getText();
			System.out.println(alloptiontext);
			if(webElement.getText().equalsIgnoreCase(" QA Tester"))
			{
				webElement.click();
				System.out.println("It is QA Tester");
			}
				else
				{
					System.out.println("Qa Tester not there in the list");
		}
	   */

	    }
		  }

		  
		  @BeforeSuite
		  public void LanuchBrower() {
		    extentreport = new ExtentReports();
		    htmlreporter = new ExtentHtmlReporter("Testcase_1_Report.html");
		    extentreport.attachReporter(htmlreporter);
		    System.setProperty("webdriver.chrome.driver", "D:\\software\\Study@@\\jar files\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		    driver =new ChromeDriver();
		  }
		  
		  @AfterSuite
		  public void CloseBrowser() {
		    driver.quit();
		    extentreport.flush();
		  }
		}


}
