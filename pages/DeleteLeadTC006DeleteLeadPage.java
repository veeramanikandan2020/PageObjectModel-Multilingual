package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class DeleteLeadTC006DeleteLeadPage extends ProjectSpecificMethods{
	
	public DeleteLeadTC007FindLeadsPage clickDelete() {
		
		driver.findElement(By.linkText(prop.getProperty("DeleteLeadTC006DeleteLeadPage_clickDelete"))).click();
		return new DeleteLeadTC007FindLeadsPage();
	}

}
