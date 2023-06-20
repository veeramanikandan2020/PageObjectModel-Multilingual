package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.TC001LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	
	@Test
	public void runCreatelead() throws InterruptedException {
		
		TC001LoginPage lp = new TC001LoginPage();
		lp.enterUserName().
		enterPassword().
		clickSubmit().
		clickCRMSFA().
		clickLeads().
		createLeads().
		enterCompanyName("TestLeaf").
		enterFirstName("Subraja").
		enterLastName("Subi").
		clickSubmitButton();
		/*
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("Demosalesmanager").
		enterPassword("crmsfa").
		clickLoginButton().
		verifyHomePage("Leaftaps").
		clickCRMSFALink().
		leads().createLeads().
		enterCompanyName("TestLeaf").
		enterFirstName("Subraja").
		enterLastName("Subi").
		enterPhoneNumber("99").
		clickSubmitButton().
		verifyLead(); */
	}

	
}
