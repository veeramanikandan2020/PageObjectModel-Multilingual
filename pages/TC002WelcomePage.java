package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC002WelcomePage extends ProjectSpecificMethods{
	
	public TC003MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new TC003MyHomePage();

	}


}
