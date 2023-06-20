package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC005SearchByPhoneNumberPage extends ProjectSpecificMethods {

	public static String leadID;

	public TC005SearchByPhoneNumberPage enterPhoneNumber(String pNo) {
		driver.findElement(By.xpath(prop.getProperty("TC005SearchByPhoneNumberPage_enterPhoneNumber_phone"))).click();
		driver.findElement(By.xpath(prop.getProperty("TC005SearchByPhoneNumberPage_enterPhoneNumber_phoneNumber")))
				.sendKeys(pNo);
		return this;

	}

	public TC005SearchByPhoneNumberPage clickFindLeads() {
		driver.findElement(By.xpath(prop.getProperty("TC005SearchByPhoneNumberPage_clickFindLeads"))).click();
		return this;
	}

	// Edit Lead
	/*
	 * public TC006EditleadPage clickFirstResultingLead() throws
	 * InterruptedException { Thread.sleep(2000);
	 * driver.findElement(By.xpath(prop.getProperty(
	 * "TC005SearchByPhoneNumberPage_clickFirstResultingLead"))).click(); leadID =
	 * driver.findElement(By.xpath(
	 * "TC005SearchByPhoneNumberPage_clickFirstResultingLead")).getText(); return
	 * new TC006EditleadPage();
	 */

	// Delete Lead
	public DeleteLeadTC006DeleteLeadPage clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DeleteLeadTC006DeleteLeadPage();

		/*
		 * String leadID = driver.findElement(By.
		 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 * driver.findElement(By.
		 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 */

	}

}
