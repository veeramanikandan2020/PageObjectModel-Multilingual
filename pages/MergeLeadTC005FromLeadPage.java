package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeLeadTC005FromLeadPage extends ProjectSpecificMethods{
	
	public MergeLeadTC006SearchByNamePage fromLead() {
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC005FromLeadPage_fromLead"))).click();
			return new MergeLeadTC006SearchByNamePage();
	}

}
