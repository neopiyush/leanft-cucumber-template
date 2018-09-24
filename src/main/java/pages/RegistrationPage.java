package pages;

import org.apache.log4j.Logger;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.Image;
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.WebElement;

public class RegistrationPage extends BasePage{
	
	final static Logger logger = Logger.getLogger(RegistrationPage.class);
	
	public RegistrationPage(Browser browser) {
		super(browser);
	}
	
	
	/******************Define Objects******************/
	
	public EditField findFirstNameEditField()
	{
		return appModel.RegisterMercuryToursPage().FirstNameEditField();
	}
	
	public EditField findLastNameEditField()
	{
		return appModel.RegisterMercuryToursPage().LastNameEditField();
	}
	
	public EditField findPhoneEditField()
	{
		return appModel.RegisterMercuryToursPage().PhoneEditField();
	}
	
	public EditField findUserNameEditField()
	{
		return appModel.RegisterMercuryToursPage().UserNameEditField();
	}
	
	public EditField findAddress1EditField()
	{
		return appModel.RegisterMercuryToursPage().Address1EditField();
	}
	public EditField findCityEditField()
	{
		return appModel.RegisterMercuryToursPage().CityEditField();
	}
	
	public EditField findStateEditField()
	{
		return appModel.RegisterMercuryToursPage().StateEditField();
	}
	public EditField findPostalCodeEditField()
	{
		return appModel.RegisterMercuryToursPage().PostalCodeEditField();
	}

	public EditField findEmailEditField()
	{
		return appModel.RegisterMercuryToursPage().EmailEditField();
	}
	public EditField findPasswordEditField()
	{
		return appModel.RegisterMercuryToursPage().PasswordEditField();
	}
	
	public EditField findConfirmPasswordEditField()
	{
		return appModel.RegisterMercuryToursPage().ConfirmPasswordEditField();
	}
	
	public Image findRegisterImageButton()
	{
	return appModel.RegisterMercuryToursPage().RegisterImage();
	}
	
	public ListBox findCountryListBox()
	{
		return appModel.RegisterMercuryToursPage().CountryListBox();
	}
	
	public WebElement findUserNameWebElement()
	{
		return appModel.RegisterMercuryToursPage().UserNameWebElement();
	}
	
	/******************Helper methods******************/
	
	public boolean enterFirstName(String sFirstName)
	{
		return setTextElement(findFirstNameEditField(), sFirstName);
	}
	
	public boolean enterLastName(String sLastName)
	{
		return setTextElement(findLastNameEditField(), sLastName);
	}
	
	public boolean enterPhoneNumber(String sPhoneNumber)
	{
		return setTextElement(findPhoneEditField(), sPhoneNumber);
	}
	
	public boolean enterEmailID(String sEmail)
	{
		return setTextElement(findEmailEditField(), sEmail);
	}
	
	public boolean enterMailingAddress(String sMailingAdd)
	{
		return setTextElement(findAddress1EditField(), sMailingAdd);
	}
	
	public boolean enterCity(String sCity)
	{
		return setTextElement(findCityEditField(), sCity);
	}
	public boolean enterState(String sState)
	{
		return setTextElement(findStateEditField(), sState);
	}
	
	public boolean enterPostalCode(String sPostalCode)
	{
		return setTextElement(findPostalCodeEditField(), sPostalCode );
	}
	
	public boolean selectCountry(String sCountry)
	{
		return selectStringElementList(findCountryListBox(), sCountry);
	}
	public boolean enterUserName(String sUserName)
	{
		return setTextElement(findUserNameEditField(), sUserName);
	}
	
	public boolean enterPassword(String sPassword)
	{
		return setTextElement(findPasswordEditField(), sPassword);
	}
	
	public boolean enterConfirmPassword(String sPassword)
	{
		return setTextElement(findConfirmPasswordEditField(), sPassword);
	}
	
	public boolean clickRegister()
	{
		return clickElement(findRegisterImageButton());
	}
	
	public boolean isUserNameGenerated()
	{
		return isElementDisplayed(findUserNameWebElement(), 30000);
	}
	
	public String getGeneratedUserName() {
		String sUserNameLabel = getTextElementLabel(findUserNameWebElement());
		String[] sUserNameLabelArray = sUserNameLabel.split(" ");
		 
		String sUserName = sUserNameLabelArray[(sUserNameLabelArray.length - 1)].trim();
		
		return sUserName.substring(0, sUserName.length()-1);

		
	}
}
