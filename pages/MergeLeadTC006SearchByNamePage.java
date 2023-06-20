package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MergeLeadTC006SearchByNamePage extends ProjectSpecificMethods{
	
	public List<String> allhandles;
	public static String leadID;
	
	public MergeleadTC010ClickMergeLeadPage searchByName() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC006SearchByNamePage_searchByName"))).sendKeys("Subraja");
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC006SearchByNamePage_searchByName_findleads"))).click();
		Thread.sleep(1000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC008ToLeadPage_toLead"))).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC008ToLeadPage_toLead_firstName"))).sendKeys("hari");
		driver.findElement(By.xpath(prop.getProperty("MergeLeadTC008ToLeadPage_toLead_FindLeads"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.switchTo().window(allhandles2.get(0));
		
		return new MergeleadTC010ClickMergeLeadPage();
		
		//return new MergeLeadTC007MainWindowPage();
	}

}
