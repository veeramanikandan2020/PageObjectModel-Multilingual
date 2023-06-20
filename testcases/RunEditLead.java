package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.TC001LoginPage;

public class RunEditLead extends ProjectSpecificMethods{
	@Test
	public void runEditLead() throws InterruptedException {
		TC001LoginPage lp = new TC001LoginPage();
		lp.enterUserName().enterPassword().clickSubmit().clickCRMSFA().clickLeads().findLeads().
		enterPhoneNumber("99").clickFindLeads().clickFirstResultingLead().clickEditLead().editCompanyName("TCS").submitEditLead().verifyEditLead();
	}
	
	

}
