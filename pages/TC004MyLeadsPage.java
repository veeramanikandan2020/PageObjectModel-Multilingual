package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC004MyLeadsPage extends ProjectSpecificMethods {


	public TC005CreateLeadPage createLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage_createlead_linkText"))).click();
		return new TC005CreateLeadPage();
	}

}
