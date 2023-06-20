package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class TC001LoginPage extends ProjectSpecificMethods{
	
	
	public TC001LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	
	public TC001LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	
	public TC002WelcomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new TC002WelcomePage();
	}


}
