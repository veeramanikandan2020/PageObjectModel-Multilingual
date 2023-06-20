package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver;
	
	public static Properties prop;
	
	@BeforeMethod
	public void preCondition() throws IOException {
		
		
		//set up the path of the properties file
				FileInputStream fis = new FileInputStream("src/main/resources/config_en_mergelead.properties");
				
				// Create an object for the properties class
				prop = new Properties();
				
				//Load this fis in the prop class
				prop.load(fis);
				
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.quit();

	}
	
	
}
