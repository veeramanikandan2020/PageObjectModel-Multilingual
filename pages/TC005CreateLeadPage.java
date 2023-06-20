package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class TC005CreateLeadPage extends ProjectSpecificMethods {
	
	public TC005CreateLeadPage enterCompanyName(String cName) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage_enterCompanyname_id"))).sendKeys(cName);
		return this;

	}
	
	public TC005CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage_enterFirstname_id"))).sendKeys(fname);
		return this;
	}

	
	public TC005CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage_enterLastname_id"))).sendKeys(lname);
		return this;
	}

	/*
	 * @When("Click on Submit button") public CreateLeadPage enterPhoneNumber(String
	 * ph) {
	 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
	 * return this; }
	 */

	@When("Click on Submit button")
	public TC006ViewLeadspage clickSubmitButton() {
		driver.findElement(By.name(prop.getProperty("CreateLeadPage_clickSubmitButton_name"))).click();
		return new TC006ViewLeadspage();
	}

}
