package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest implements Auto_const 
{
	static
	{
		System.setProperty(Chrome_Key, Chrome_value);
	}

public WebDriver driver;
public ExtentReports extent;
public ExtentTest test;


@BeforeTest
public void extentreport()
	{
	extent = new ExtentReports("./test-output/Extentreport.html", true);
	
	}

@BeforeMethod
public void OpenApp()
	{
	driver = new ChromeDriver();
	driver.get("http://bs4485:Bangalore@2@ftms-qa-hsb.dupont.com/FTMS/");
	driver.manage().window().maximize();
	}

@AfterMethod
public void ReportsandCloseApp(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		try
		{
		test.log(LogStatus.FAIL,"These test case is Failed"+result.getName());
		test.log(LogStatus.FAIL, "These test case is Failed"+result.getThrowable());
		BasePage BP = new BasePage(driver);
		Thread.sleep(2000);
		test.log(LogStatus.FAIL, test.addScreenCapture(BP.Screenshot("FTMS_Monitor")));
		}
		catch(Exception e)
		{
			System.out.println("Errorin capture in extent report");
		}
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(LogStatus.PASS, "These test case is pass"+result.getName());
	}
	extent.endTest(test);
	driver.quit();
	}

@AfterTest
public void Writeextentreport()
	{
	extent.flush();
	extent.close();
	}
}
