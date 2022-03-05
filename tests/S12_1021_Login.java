package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1021_Login extends BasePage{

	@Test
	public void loginTest() {
		
		new LoginPage(driver)
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickcreateLead()
		.typeCompanyName("TestLeaf")
		.typeFirstName("venkatesh")
		.typeLastName("Ravi")
		.clickSubmit()
		.verifyFirstName();
		
	}
	
}
