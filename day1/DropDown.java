package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prajna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rao");
		
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options =new Select(dropdown);
		options.selectByIndex(4);
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option = new Select (dropdown2);
		option.selectByVisibleText("Automobile");
		
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt =new Select(dropdown3);
		opt.selectByValue("OWN_SCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();
		
		
		
		
		
		
		

	}

}
