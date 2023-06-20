package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class TC007SubmitEditLeadPage extends ProjectSpecificMethods{
	
	public TC007SubmitEditLeadPage editCompanyName(String cName) {
		WebElement companyName = driver.findElement(By.id(prop.getProperty("TC007SubmitEditLeadPage_editCompanyName")));
		companyName.clear();
		companyName.sendKeys(cName);
		return this;
		
	}
	
	public TC008VerifyEditLeadPage submitEditLead() {
		driver.findElement(By.name(prop.getProperty("TC007SubmitEditLeadPage_submitEditLead_name"))).click();
		return new TC008VerifyEditLeadPage();

	}

}
