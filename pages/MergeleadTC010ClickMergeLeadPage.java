package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeleadTC010ClickMergeLeadPage extends ProjectSpecificMethods{
	
	public MergeLeadTC011FindLeadsPage clickMergeLead() {
		driver.findElement(By.xpath(prop.getProperty("MergeleadTC010ClickMergeLeadPage_clickMergeLead"))).click();
		driver.switchTo().alert().accept();
		return new MergeLeadTC011FindLeadsPage();
	}


}
