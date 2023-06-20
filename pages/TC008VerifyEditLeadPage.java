package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC008VerifyEditLeadPage extends ProjectSpecificMethods {

	public TC008VerifyEditLeadPage verifyEditLead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		} else {
			System.out.println("Lead is not editted");

		}

		return this;
	}

}
