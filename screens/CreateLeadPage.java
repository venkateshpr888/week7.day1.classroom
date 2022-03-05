package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class CreateLeadPage extends BasePage{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	

	public CreateLeadPage typeCompanyName(String compname) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(compname);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage typeLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
public ViewLeadsPage clickSubmit() {
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	return new ViewLeadsPage(driver);
}
}