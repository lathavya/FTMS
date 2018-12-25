package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public  class BasePage extends BaseTest  
{
public WebDriver driver;
	
public BasePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
public void Verifytitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log(title+" is passed",true);
		}
		catch(Exception e){
			BasePage BP = new BasePage(driver);
			BP.Screenshot("unexpected");
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	
public void VerifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,70);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			}
		catch(Exception e){
			BasePage BP = new BasePage(driver);
			BP.Screenshot("unexpected");
			Reporter.log("Exsiting values in table not Present",true);
			Assert.fail();
			}
	}

public void Uploadfiles(String filename)
	{
		try {
			Thread.sleep(3000);
			Runtime.getRuntime().exec(filename);
			} 
		catch (Exception e) {
			System.out.println("Not able to upload file");	
			}
	}

public String Screenshot(String Screenshotname)
	{
 String Screenshotpath = "null";
		try {
			 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		     TakesScreenshot ts= (TakesScreenshot) driver ;
          	 File src = ts.getScreenshotAs(OutputType.FILE);
          	 Screenshotpath = "./Screenshot/"+Screenshotname+dateName+".png";
          	 File drc = new File(Screenshotpath);
          	 FileUtils.copyFile(src, drc);
          	return Screenshotpath;
			} 
		catch (Exception e) 
		    {
			System.out.println("Expection while taking screenshot"+e.getMessage());
			} 
		return Screenshotpath;
	}

public void ClearSearchfiled()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			WebElement Searchfield = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
			Thread.sleep(2000);
			Searchfield.clear();
			} catch (Exception e) {
				  System.out.println("Not able to clear fields");	
			}
	}
}
