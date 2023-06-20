package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class DeleteLeadTC007FindLeadsPage extends ProjectSpecificMethods {
	
	public DeleteLeadTC008VerifyLeadExitsPage findLeads() {

		driver.findElement(By.linkText(prop.getProperty("DeleteLeadTC007FindLeadsPage_findLeads"))).click();
		return new DeleteLeadTC008VerifyLeadExitsPage();

	}

}
