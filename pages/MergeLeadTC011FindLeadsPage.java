package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeLeadTC011FindLeadsPage extends ProjectSpecificMethods{
	
	public MergeLeadTC012VerifyLeadExitsPage findLeads() {

		driver.findElement(By.linkText(prop.getProperty("MergeLeadTC011FindLeadsPage_findLeads"))).click();
		return new MergeLeadTC012VerifyLeadExitsPage();

	}


}
