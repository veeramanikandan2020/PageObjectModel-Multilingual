package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC006ViewLeadspage extends ProjectSpecificMethods {

	
	public TC006ViewLeadspage verifyLead(String cName) {
		String text = driver.findElement(By.id(prop.getProperty("ViewLeadspage_verifyLead"))).getText();
		// Hard assert
		// Assert.assertEquals(text, "Testleaf");
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");

		}

		return this;

	}

}
