package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class UploadPage extends BasePage {
//static WebDriver driver;
	@FindBy(xpath="(//div[@class='row'])[3]/div[1]")
	private WebElement AddTrials;
	@FindBy(xpath = "(//span[.='1 trial is ready to upload.'])[1]")
	private WebElement TrialisReady;
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement UploadFiles;
	@FindBy (xpath="(//span[.='1 file successfully uploaded'])[1]")
	private WebElement Successmessage;
	@FindBy (xpath="(//span)[.='CDS97203']")
	private WebElement Filenamevalue;
	
public UploadPage(WebDriver driver){
	super(driver);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	PageFactory.initElements(driver, this);

	}

public void AddTrialfiles(){
	
	AddTrials.click();
}
public void TrialisReadyMessage(){
	VerifyElement(TrialisReady);
}
public void ClickonUploadFiles(){
	UploadFiles.click();
}
public void uploadedFileMessage(){
	VerifyElement(Successmessage);
	}

public void onlyuploadfilename(){
	VerifyElement(Filenamevalue);
}
}
