package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class MyLeadsPage extends BasePage {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickcreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();	
		return new CreateLeadPage(driver);
	}

}
