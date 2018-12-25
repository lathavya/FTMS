package utilities;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import generic.BasePage;

public class HomePage extends BasePage 
{
	@FindBy(xpath="//span[@class='caret']")
	private WebElement Dropbutton;
	@FindBy(xpath="(//a[.='Plans'])[1]")
	private WebElement Plans;
	@FindBy(xpath="(//a[.='Biology Plan'])[1]")
	private WebElement BiologyPlan;	
	@FindBy(xpath="(//a[.='Protocols and Trials'])[1]")
	private WebElement ProtocolsandTrials;
	@FindBy(xpath="(//a[.='Reports'])[1]")
	private WebElement Reports;
	@FindBy(xpath="(//a[.='Admin'])[1]")
	private WebElement Admin;
	@FindBy(xpath="(//a[.='Request'])[1]")
	private WebElement Request;
	@FindBy(xpath="(//a[.='Technical Objectives'])[1]")
	private WebElement TechnicalObjective;
	@FindBy(xpath="(//a[.='SOPs'])[1]")
	private WebElement SOPs;	
	@FindBy(xpath="(//a[.='Protocols'])[1]")
	private WebElement Protocols;
	@FindBy(xpath="(//a[.='Assignments'])[1]")
	private WebElement Assignments;
	@FindBy(xpath="(//a[.='Upload'])[1]")
	private WebElement Upload;
	@FindBy(xpath="(//a[.='Protocol Index Report'])[1]")
	private WebElement ProtocolIndexReport; 
	@FindBy(xpath="(//a[.='SOP Summary Report'])[1]")
	private WebElement SOPSummaryReport;
	@FindBy(xpath="(//a[.='Biology Plan Report'])[1]")
	private WebElement BiologyPlanReport;
	@FindBy (xpath="(//a[.='Vendor Report'])[1]")
	private WebElement VendorReport;
	@FindBy(xpath="(//a[.='Values Editor'])[1]")
	private WebElement ValuesEditor;
	@FindBy(xpath="(//a[.='User Groups'])[1]")
	private WebElement UserGroups;
	@FindBy(xpath="(//a[.='Chemicals'])[1]")
	private WebElement Chemicals;
	    
public HomePage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);
	}
public void ClickOnDropButton()
	{
     Dropbutton.click();
	}
public void DropButtonElement()
	{
	 VerifyElement(Dropbutton);
	}
public void ClickOnPlans()
	{
	 Plans.click();
	}
public void ClickOnBiologyPlan()
	{
	 BiologyPlan.click();
	}
public void ClickonProtocolsandTrials()
	{
	 ProtocolsandTrials.click();
	}
public void ClickonReports()
	{
	 Reports.click();
	}
public void ClickonAdmin()
	{
	 Admin.click();
	}
public void ClickonRequest()
	{
	 Request.click();
	}
public void ClickonSOPsSearchPage()
	{
	 SOPs.click();
	}
public void ClickonTechnicalObjective()
	{
	 TechnicalObjective.click();
	}
public void ClickonUpload()
	{
	 Upload.click();
	}
public void ClickonProtocol()
	{
	 Protocols.click();
	}
public void ClickonAssignments()
	{
	 Assignments.click();
	}
public void ClickonProtocolIndexReport()
	{
	 ProtocolIndexReport.click();
	}
public void ClickonSOPSummaryReport()
	{
	 SOPSummaryReport.click();
	}
public void ClickonBiologyPlanReport()
	{
	 BiologyPlanReport.click();
	}
public void ClickonVendorReport()
	{
	 VendorReport.click();
	}
public void ClickonValuesEditor()
	{
	 ValuesEditor.click();
	}
public void ClickonUserGroups()
	{
	 UserGroups.click();
	}
public void ClickonChemicals()
	{
	 Chemicals.click();
	}
}
