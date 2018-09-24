package pages;

import org.apache.log4j.Logger;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.Link;

public class HomePage extends BasePage {

	final static Logger logger = Logger.getLogger(HomePage.class);

	public HomePage(Browser browser) {
		super(browser);
	}
	/******************Define Objects******************/
	public EditField findUserNameEditField()
	{
		return appModel.WelcomeMercuryToursPage().UserNameEditField();
	}
	
	public Link findREGISTERLink() {
		return appModel.WelcomeMercuryToursPage().REGISTERLink();
	}
	
	/******************Helper methods******************/
	
	public boolean clickREGISTERLink()
	{
		
		return clickElement(findREGISTERLink());
	}
	
	public boolean checkHomePageExists()
	{
		return isElementDisplayed(findUserNameEditField(), 30000);
	}
	
	
}
