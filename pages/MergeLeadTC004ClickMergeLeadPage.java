package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeLeadTC004ClickMergeLeadPage extends ProjectSpecificMethods {
	
	public MergeLeadTC005FromLeadPage clickMergeLead() {
		driver.findElement(By.linkText(prop.getProperty("MergeLeadTC004ClickMergeLeadPage_clickMergeLead"))).click();
		return new MergeLeadTC005FromLeadPage();
	}

}
