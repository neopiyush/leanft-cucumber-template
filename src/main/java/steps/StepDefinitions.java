package steps;

import java.io.IOException;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utils.LeanFTHelper;
import utils.PropertiesManager;

public class StepDefinitions{
	
	public static Browser browser;
	
	static
	{
		try {
			//Initialize Test Settings
			PropertiesManager.initializeProperties();
			
			//Inititalize LeanFT SDK
			LeanFTHelper.initializeSDK();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
	@Before
	public void launchBrowser() throws GeneralLeanFtException, IOException
	{		
		//Launch Browser
		browser = LeanFTHelper.launchBrowser();
	}
	
	@After 
	public void closeBrowser() throws GeneralLeanFtException, InterruptedException
	{		
		browser.close();
		Thread.sleep(1000);
	}
	
	@Given("^User is on \"([^\"]*)\" Page$")
	public void user_is_on_Page(String page) throws Throwable {
		
		HomePage HP = new HomePage(browser);
		
		if(page.toUpperCase().equals("HOME")){
			browser.navigate(PropertiesManager.getProperty("websiteURL"));
			//Check that the Home Page is present
			Assert.assertTrue(HP.checkHomePageExists());
		}
	}

	@Given("^User click on Register Link$")
	public void user_click_on_Register_Link() throws Throwable {
	    
		HomePage HP = new HomePage(browser);
		Assert.assertTrue(HP.clickREGISTERLink());
	}

	@When("^Enter Contact information \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Contact_information_and(String firstName, String lastName, String phoneNumber, String emailID) throws Throwable {
	   
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertTrue(RP.enterFirstName(firstName));
		Assert.assertTrue(RP.enterLastName(lastName));
		Assert.assertTrue(RP.enterPhoneNumber(phoneNumber));
		Assert.assertTrue(RP.enterEmailID(emailID));
		
	}

	@When("^Enter mailing information \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_mailing_information_and(String address, String city, String state, String postalCode, String country) throws Throwable {
		
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertTrue(RP.enterMailingAddress(address));
		Assert.assertTrue(RP.enterCity(city));
		Assert.assertTrue(RP.enterState(state));
		Assert.assertTrue(RP.enterPostalCode(postalCode));
		Assert.assertTrue(RP.selectCountry(country));
	}

	@When("^Enter user information \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_user_information_and(String userName, String password) throws Throwable {
	   
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertTrue(RP.enterUserName(userName));
		Assert.assertTrue(RP.enterPassword(password));
		Assert.assertTrue(RP.enterConfirmPassword(password));
	}

	@When("^click on Register button$")
	public void click_on_Register_button() throws Throwable {
	    
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertTrue(RP.clickRegister());
	}

	@Then("^UserName should be generated$")
	public void username_should_be_generated() throws Throwable {
		
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertTrue(RP.isUserNameGenerated());
	}


	@Then("^Generated UserName should be same as \"([^\"]*)\"$")
	public void generated_UserName_should_be_same_as_neoautomation(String sExpectedUserName) throws Throwable {
		RegistrationPage RP = new RegistrationPage(browser);
		Assert.assertEquals(RP.getGeneratedUserName(), sExpectedUserName);
	
		
	}

	/*@When("^User logs in using username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logs_in_using_username_as_and_password_as(String username, String password) throws Throwable {
		HomePage HP = new HomePage(browser);
		HP.login(username, password);
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Exception {
		HomePage HP = new HomePage(browser);
	    Assert.assertTrue(HP.isLoggedIn());
	}

	@When("^User presses Sign Out button$")
	public void user_presses_Sign_Out_button() throws Throwable {
		HomePage HP = new HomePage(browser);
		HP.logOut();
	}

	@Then("^logout should be successful$")
	public void logout_should_be_successful() throws Throwable {
		HomePage HP = new HomePage(browser);
	    Assert.assertTrue(HP.isLoggedOut());
	}
*/
}
