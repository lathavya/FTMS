package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProtocolIndexReportPage extends BasePage {
	@FindBy(xpath="(//tr)[6]")
	private WebElement Table;
	
	public ProtocolIndexReportPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
		
public void ProtocolIndexReportTable(){
	VerifyElement(Table);
}
}
