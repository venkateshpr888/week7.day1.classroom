package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class ViewLeadsPage extends BasePage {
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadsPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println("First name = "+text);
		
		return this;
	}

}
