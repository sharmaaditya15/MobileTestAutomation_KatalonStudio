import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterAndLoginToMobileAppSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User opens the app")
	def openTheApp() {
		
		Mobile.startApplication('LoginApp.apk', false)
	}
	
	
	@When("Clicks on the link to create account")
	def clickOnCreateAccount() {
		
		Mobile.tap(findTestObject('RegisterUser/android.widget.TextView - No account yet Create one'), 0)
	}
	
	@When("Enters the (.*) in name field")
	def enterTheName(String name) {
		
		Mobile.setText(findTestObject('RegisterUser/android.widget.EditText'), name, 0)
	}
	
	@When("Enters the (.*) in email field")
	def enterTheEmail(String email) {
		
		Mobile.setText(findTestObject('RegisterUser/android.widget.EditText (1)'), email, 0)
	}
	
	@When("Enters the (.*) in password field")
	def enterThePassword(String password) {
		
		Mobile.setText(findTestObject('RegisterUser/android.widget.EditText (2)'), password, 0)
	}
	
	@When("Enters the (.*) in confirm password field")
	def enterTheConfirmPassword(String cpassword) {
		
		Mobile.setText(findTestObject('RegisterUser/android.widget.EditText (3)'), cpassword, 0)
	}
	
	@When("User clicks on Register button")
	def clickOnRegisterButton() {
		
		Mobile.tap(findTestObject('RegisterUser/android.widget.Button - REGISTER'), 0)
	}

	@When("User enters the (.*) and (.*)")
	def enterCredentials(String username, String password) {

		Mobile.setText(findTestObject('Login/android.widget.email'), username, 0)
		Mobile.setText(findTestObject('Login/android.widget.password'), password, 0)
	}
	
	@When("User clicks on Login button")
	def clickOnLoginButton() {
		
		Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)
	}

	@Then("User (.*) is logged in successfully")
	def verifyLoggedInUser(String user) {
		
		Mobile.verifyElementText(findTestObject('Login/android.widget.TextView - testusertestmail.com'), user)
	}
	
}
