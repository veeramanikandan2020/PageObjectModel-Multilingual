package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeLeadTC012VerifyLeadExitsPage extends ProjectSpecificMethods{
	
	MergeLeadTC006SearchByNamePage spp = new MergeLeadTC006SearchByNamePage();

	public MergeLeadTC012VerifyLeadExitsPage enterLeadID() {
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC012VerifyLeadExitsPage_enterLeadID"))).sendKeys(spp.leadID);
		return this;
	}
	
	public MergeLeadTC012VerifyLeadExitsPage searchFindLeads() {
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC012VerifyLeadExitsPage_searchFindLeads"))).click();
		return this;
	}

	public MergeLeadTC012VerifyLeadExitsPage verifyLeadExits() {

		String text = driver.findElement(By.className(prop.getProperty("MergeLeadTC012VerifyLeadExitsPage_verifyLeadExits"))).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		return this;

	}

}
