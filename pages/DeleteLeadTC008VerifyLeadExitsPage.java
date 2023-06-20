package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class DeleteLeadTC008VerifyLeadExitsPage extends ProjectSpecificMethods {

	TC005SearchByPhoneNumberPage spp = new TC005SearchByPhoneNumberPage();

	public DeleteLeadTC008VerifyLeadExitsPage enterLeadID() {
		driver.findElement(By.xpath(prop.getProperty("DeleteLeadTC008VerifyLeadExitsPage_enterLeadID"))).sendKeys(spp.leadID);
		return this;
	}
	
	public DeleteLeadTC008VerifyLeadExitsPage searchFindLeads() {
		driver.findElement(By.xpath(prop.getProperty("DeleteLeadTC008VerifyLeadExitsPage_searchFindLeads"))).click();
		return this;
	}

	public DeleteLeadTC008VerifyLeadExitsPage verifyLeadExits() {

		String text = driver.findElement(By.className(prop.getProperty("DeleteLeadTC008VerifyLeadExitsPage_verifyLeadExits"))).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		return this;

	}

}
