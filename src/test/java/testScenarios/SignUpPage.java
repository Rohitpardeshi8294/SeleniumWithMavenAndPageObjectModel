package testScenarios;

import org.testng.annotations.Test;

import pageObject.SignUpPageModel;

public class SignUpPage extends TestBase {
	
	@Test
	public void signUpPage()
	{
		SignUpPageModel signupPageModel=new SignUpPageModel(driver);
		signupPageModel.signupFormFilling();
	}
}
