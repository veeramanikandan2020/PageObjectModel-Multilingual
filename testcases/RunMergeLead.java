package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.TC001LoginPage;

public class RunMergeLead extends ProjectSpecificMethods {
	@Test
	public void runMergeLead() throws InterruptedException {
		
		TC001LoginPage lp = new TC001LoginPage();
		
		lp.enterUserName().
		enterPassword().
		clickSubmit().
		clickCRMSFA().
		clickLeads().
		clickMergeLead().
		fromLead().
		searchByName().
		//mainWindow().
		//toLead().
		//backToMainWindow().
		clickMergeLead().
		findLeads().
		enterLeadID().
		searchFindLeads().
		verifyLeadExits();

	}

}
