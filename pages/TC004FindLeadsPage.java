package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC004FindLeadsPage extends ProjectSpecificMethods {
	
	//Delete Lead
	public TC005SearchByPhoneNumberPage findLeads() {
		driver.findElement(By.linkText(prop.getProperty("TC004FindLeadsPage_findLeads_linkText"))).click();
		return new TC005SearchByPhoneNumberPage();

	}
	
	

}
