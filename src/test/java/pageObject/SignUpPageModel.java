package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageModel extends PageObjectBase {

	public SignUpPageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//finding element for FirstNameInputBox
	@FindBy(how=How.XPATH, using="//input[@name='firstname']")
	WebElement firstNameInputBox;
	
	//finding element for LastNameInputBox
	@FindBy(how=How.XPATH, using="//input[@name='lastname']")
	WebElement lastNameInputBox;
	
	//finding element for Male Radio Button
	@FindBy(how=How.XPATH, using="//input[@value='Male']")
	WebElement maleRadioButton;
	
	//finding element for Year Of Experience Radio Box
	@FindBy(how=How.XPATH, using="//input[@value='4']")
	WebElement yearOfExperienceRadioButton;
	
	//finding element for Date
	@FindBy(how=How.ID, using="datepicker")
	WebElement datePicker;
	
	//finding element for Profession
	@FindBy(how=How.ID, using="profession-1")
	WebElement profession;
	
	//finding element for Automation Tools
	@FindBy(how=How.ID, using="tool-2")
	WebElement automationTools;
	
	public void signupFormFilling()
	{
		firstNameInputBox.sendKeys(Constants.firstname);
		lastNameInputBox.sendKeys(Constants.lastname);
		maleRadioButton.click();
		yearOfExperienceRadioButton.click();
		datePicker.sendKeys(Constants.date);
		profession.click();
		automationTools.click();
	}
	
}
