/*
 * package pages;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Set;
 * 
 * import org.openqa.selenium.By;
 * 
 * import base.ProjectSpecificMethods;
 * 
 * public class MergeLeadTC008ToLeadPage extends ProjectSpecificMethods{
 * 
 * public List<String> allhandles2;
 * 
 * public MergeLeadTC009BackToMainWindowPage toLead() throws
 * InterruptedException {
 * 
 * driver.findElement(By.xpath(prop.getProperty(
 * "MergeLeadTC008ToLeadPage_toLead"))).click(); Set<String> allWindows2 =
 * driver.getWindowHandles(); allhandles2 = new ArrayList<String>(allWindows2);
 * driver.switchTo().window(allhandles2.get(1));
 * driver.findElement(By.xpath(prop.getProperty(
 * "MergeLeadTC008ToLeadPage_toLead_firstName"))).sendKeys("hari");
 * driver.findElement(By.xpath(prop.getProperty(
 * "MergeLeadTC008ToLeadPage_toLead_FindLeads"))).click(); Thread.sleep(1000);
 * driver.findElement(By.
 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
 * return new MergeLeadTC009BackToMainWindowPage(); }
 * 
 * }
 */