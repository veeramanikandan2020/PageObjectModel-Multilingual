package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC003MyHomePage extends ProjectSpecificMethods{
	
	/*
	 * public TC004MyLeadsPage clickLeads() { String leadsValue =
	 * prop.getProperty("MyLeadspage_leads_linkText");
	 * System.out.println(leadsValue);
	 * driver.findElement(By.linkText(leadsValue)).click(); return new
	 * TC004MyLeadsPage();
	 * 
	 * }
	 */
	// Edit Lead or Delete Lead
	/*
	 * public TC004FindLeadsPage clickLeads() { String leadsValue =
	 * prop.getProperty("MyLeadspage_leads_linkText");
	 * System.out.println(leadsValue);
	 * driver.findElement(By.linkText(leadsValue)).click(); return new
	 * TC004FindLeadsPage();
	 */
		
		//Merge lead
		public MergeLeadTC004ClickMergeLeadPage clickLeads() {
			String leadsValue = prop.getProperty("MyLeadspage_leads_linkText");
			System.out.println(leadsValue);
			driver.findElement(By.linkText(leadsValue)).click();
			return new MergeLeadTC004ClickMergeLeadPage();

	}

}
