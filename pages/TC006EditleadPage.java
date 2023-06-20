package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC006EditleadPage extends ProjectSpecificMethods {
	
	public TC007SubmitEditLeadPage clickEditLead() {
		driver.findElement(By.linkText(prop.getProperty("TC006EditleadPage_clickEditLead_linkText"))).click();
		return new TC007SubmitEditLeadPage();
	}

}
