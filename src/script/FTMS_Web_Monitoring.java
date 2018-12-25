package script;

import generic.BasePage;
import generic.BaseTest;
import utilities.AssignmentSearchPage;
import utilities.BiologyPlanReportPage;
import utilities.BiologyPlanSearchpage;
import utilities.ChemicalsPage;
import utilities.HomePage;
import utilities.ProtocolIndexReportPage;
import utilities.ProtocolSearchPage;
import utilities.SOPSummaryReportpage;
import utilities.SOPsSearchPage;
import utilities.TechnicalObjectiveSearchPage;
import utilities.UploadPage;
import utilities.UserGroupsPage;
import utilities.ValueEditorsPage;
import utilities.VendorPlanReportpage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FTMS_Web_Monitoring extends BaseTest {
@Test
	public void Monitering_from_Webside() 
	{
	test = extent.startTest("FTMS Web Monitoring");
	
	BasePage BP = new BasePage(driver);

	HomePage HP= new HomePage(driver);
	BiologyPlanSearchpage BPSearch = new BiologyPlanSearchpage(driver);
	TechnicalObjectiveSearchPage TOSearch = new TechnicalObjectiveSearchPage(driver);
	SOPsSearchPage SSPage = new SOPsSearchPage(driver);
	ProtocolSearchPage PSearch = new ProtocolSearchPage(driver);
	AssignmentSearchPage ASearch = new AssignmentSearchPage(driver);
	SOPSummaryReportpage SSReport = new SOPSummaryReportpage(driver);
	BiologyPlanReportPage BPReport = new BiologyPlanReportPage(driver);
	VendorPlanReportpage VPReport = new VendorPlanReportpage(driver);
	ValueEditorsPage VEPage = new ValueEditorsPage(driver);
	UserGroupsPage UGPage = new UserGroupsPage(driver);
	ChemicalsPage CSearch = new ChemicalsPage(driver);
	UploadPage UPage = new UploadPage(driver);
	
	HP.DropButtonElement();
	HP.ClickOnDropButton();
	HP.ClickOnPlans();
	HP.ClickOnBiologyPlan();
	BPSearch.BiologyPlanTable();
	BP.Verifytitle("FTMS: Biology Plan");
	
	HP.ClickOnDropButton();
	HP.ClickonTechnicalObjective();
	BP.ClearSearchfiled();
	TOSearch.TechnicalObjectiveTable();
	BP.Verifytitle("FTMS: Technical Objectives");
	
	HP.ClickOnDropButton();
	HP.ClickonSOPsSearchPage();
	SSPage.SOPsTable();
	BP.Verifytitle("FTMS: SOP Search"); 
	

	HP.ClickOnDropButton();
	HP.ClickonProtocolsandTrials();
	HP.ClickonProtocol();
	PSearch.ProtocolSearchTable();
	BP.Verifytitle("FTMS: Protocols");
	
	HP.ClickOnDropButton();
	HP.ClickonAssignments();
	ASearch.AssignmentSearchTable();
	BP.Verifytitle("FTMS: Assignment");
	
	HP.ClickOnDropButton();
	HP.ClickonReports();
	HP.ClickonSOPSummaryReport();;
	SSReport.SOPSummaryReportTable();;
	BP.Verifytitle("FTMS: SOP Summary Report");
	
	HP.ClickOnDropButton();
	HP.ClickonBiologyPlanReport();
	BPReport.BiologyPlanReportTable();
	BP.Verifytitle("FTMS: Biology Plan Report");
	
	HP.ClickOnDropButton();
	HP.ClickonVendorReport();
	VPReport.VendorPlanTable();
	
	BP.Verifytitle("FTMS: Vendor Report");
	HP.ClickOnDropButton();
	HP.ClickonAdmin();
	HP.ClickonValuesEditor();
	VEPage.ValueEditorsTable();
	BP.Verifytitle("FTMS: Values Editor");
	
	HP.ClickOnDropButton();
	HP.ClickonUserGroups();
	UGPage.UserGroupsTable();
	BP.Verifytitle("FTMS: User Groups");
	
	HP.ClickOnDropButton();
	HP.ClickonRequest();
	HP.ClickonChemicals();
	CSearch.ChemicalTable();
	BP.Verifytitle("FTMS: Chemical");
	
   // Below code is uploading file from local desktop. So code runs,if file and path has to be configured. 
/*	HP.ClickOnDropButton();
	HP.ClickonProtocolsandTrials();
	HP.ClickonUpload();
	UPage.AddTrialfiles();
	BP.Uploadfiles("d:\\Desktop\\Autoitscripts\\Uploadfile1.exe");
	UPage.onlyuploadfilename();
	UPage.AddTrialfiles();
	BP.Uploadfiles("d:\\Desktop\\Autoitscripts\\Uploadfile2.exe");
	UPage.TrialisReadyMessage();
	UPage.ClickonUploadFiles();
	UPage.uploadedFileMessage();
	BP.Verifytitle("FTMS: Upload Page");
	//BP.Screenshot("Upload");
	Reporter.log("Verify, mail has to recive from ftmsdonotreply@dupont.com",true);*/
	}

}
