package pages;

import org.apache.log4j.Logger;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.TestObject;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.ListBox;
import com.hp.lft.sdk.web.WebElement;

import appModel.AppModel;
import utils.LeanFTHelper;

public class BasePage {

	final static Logger logger = Logger.getLogger(BasePage.class);

	// The Browser instance that will be acted upon
	protected Browser browser;
	public AppModel appModel = null;

	// Parameterized Constructor
	public BasePage(Browser browser) {
		this.browser = browser;
		try {
			appModel = new AppModel(this.browser);
			
		} catch (GeneralLeanFtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isElementDisplayed(TestObject objectToWait, int waitUntillSeconds) {
		boolean isElementDisplayed = false;
		boolean doFlag = true;
		int counter = 0;

		do {

			try {
				if (objectToWait.exists(0)) {

					isElementDisplayed = true;
					doFlag = false;

				} else {
					if (counter <= waitUntillSeconds) {
						Thread.sleep(1000);

						counter = counter + 1000;
					} else {
						doFlag = false;
						logger.warn("WARNING : Object not found after " + waitUntillSeconds + " seconds");

					}
				}
			} catch (GeneralLeanFtException | InterruptedException e) {

				System.out.println("EXCEPTION : Exception at Base->isElementDisplayed().");
				e.printStackTrace();
			}

		} while (doFlag);

		return isElementDisplayed;
	}

	public static boolean clickElement(WebElement elementToClick) {
		boolean clickElementFlag = false;
		if (isElementDisplayed(elementToClick, 30000)) {
			try {

				elementToClick.click();
				clickElementFlag = true;

			} catch (GeneralLeanFtException e) {

				clickElementFlag = false;

				logger.error("EXCEPTION : Exception at Base->clickElement().");
				e.printStackTrace();
			}

		} else {
			clickElementFlag = false;

			logger.warn("WARNING : Element " + elementToClick.toString() + " not found..!!!");
		}

		return clickElementFlag;
	}

	public static boolean setTextElement(EditField elementToSetText, String sTextToSet) {

		boolean setTextElementFlag = false;
		if (isElementDisplayed(elementToSetText, 30000)) {
			try {

				elementToSetText.setValue(sTextToSet);
				setTextElementFlag = true;

			} catch (GeneralLeanFtException e) {

				logger.error("EXCEPTION : Exception at Base->setTextElement().");

				e.printStackTrace();
			}
		} else {
			setTextElementFlag = false;
			logger.warn("WARNING : Element " + elementToSetText.toString() + " not found..!!!");

		}
		return setTextElementFlag;
	}

	public static String getTextElementEditor(EditField elementToGetText) {

		String sTextElement = null;
		if (isElementDisplayed(elementToGetText, 30000)) {
			try {
				sTextElement = elementToGetText.getInnerText();

			} catch (GeneralLeanFtException e) {
				logger.error("EXCEPTION : Exception at Base->getTextElementEditor().");

				e.printStackTrace();
			}
		} else {

			logger.warn("WARNING : Element " + elementToGetText.toString() + " not found..!!!");

		}
		return sTextElement;
	}

	public static boolean selectStringElementList(ListBox elementToSelect, String sTextToSelect) {
		boolean selectStringElementListFlag = false;
		if (isElementDisplayed(elementToSelect, 30000)) {
			try {

				elementToSelect.select(sTextToSelect);
				selectStringElementListFlag = true;

			} catch (GeneralLeanFtException e) {

				selectStringElementListFlag = false;

				logger.error("EXCEPTION : Exception at Base->selectStringElementList().");
				e.printStackTrace();
			}
		} else {
			selectStringElementListFlag = false;
			logger.warn("WARNING : Element " + elementToSelect.toString() + " not found..!!!");

		}

		return selectStringElementListFlag;
	}

	public static String getTextElementLabel(WebElement labelToGetText) {
		String sLableText = null;
		if (isElementDisplayed(labelToGetText, 30000)) {
			try {
				sLableText = labelToGetText.getInnerText();
			} catch (GeneralLeanFtException e) {
				logger.error("EXCEPTION : Exception at Base->getTextElementLabel().");

				e.printStackTrace();
			}
		} else {
			logger.warn("WARNING : Element " + labelToGetText.toString() + " not found..!!!");

		}

		return sLableText;
	}

}
