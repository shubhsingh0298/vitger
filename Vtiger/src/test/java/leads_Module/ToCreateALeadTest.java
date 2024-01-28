package leads_Module;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.IPathConstant;
import pomRepository.CreatingNewLeadPage;
import pomRepository.HomePage;
import pomRepository.LeadsInformationPage;
import pomRepository.LeadsPage;
/**
 * 
 * @author HP
 *
 */
@Listeners(genericUtility.ListenersImplementationClass.class)
public class ToCreateALeadTest extends BaseClass{

		
		@Test(priority=1,retryAnalyzer=genericUtility.RetryAnalyzerImplementationClass.class)
		public void toCreateALeadAndVerifyTheLeadDetails() throws EncryptedDocumentException, FileNotFoundException, IOException
		{
			//Test Data
			String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 0);
			String leadFirstName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 1);
			String leadLastName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 2);
			String leadCompanyName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 3);
			String leadAssignedToGroupOption = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 4);
		}

		//Object Creation for all the Pom Classes
		HomePage  home= new HomePage(driver);
		LeadsPage lead= new LeadsPage(driver);
		CreatingNewLeadPage createLeads= new CreatingNewLeadPage(driver);
		LeadsInformationPage leadsInfo= new LeadsInformationPage(driver);
		
		
		//Actual Testscripts

	} 
