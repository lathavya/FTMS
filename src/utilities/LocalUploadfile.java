package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LocalUploadfile extends BasePage 
{
public LocalUploadfile(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);		
}

@FindBy(xpath="//input[@id='uploadfile']")
private WebElement Upload;

public void ClickonUploadfile(){
	Upload.click();
}
}
