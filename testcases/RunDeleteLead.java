package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.TC001LoginPage;

public class RunDeleteLead extends ProjectSpecificMethods{
	@Test
	public void runDeleteLead() throws InterruptedException {
		
		TC001LoginPage lp = new TC001LoginPage();
		lp.enterUserName().
		enterPassword().
		clickSubmit().
		clickCRMSFA().
		clickLeads().
		findLeads().
		enterPhoneNumber("99").
		clickFindLeads().
		clickFirstResultingLead().
		clickDelete().
		findLeads().
		enterLeadID().
		searchFindLeads().
		verifyLeadExits();

	}

}
