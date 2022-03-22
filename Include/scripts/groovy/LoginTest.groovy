import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW


















public class LoginTest {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}
	
	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
		WebUI.click(findTestObject('Object Repository/Login_OR1/Page_OrangeHRM/span_Username'))
		
		WebUI.setText(findTestObject('Object Repository/Login_OR1/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Login_OR1/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/Login_OR1/Page_OrangeHRM/input_Password_Submit'))
	}
	
	@Then("user will navigate to the home page")
	public void user_will_navigate_to_the_home_page() {
		WebUI.verifyElementText(findTestObject('Object Repository/Login_OR1/Page_OrangeHRM/h1_Dashboard'), 'Dashboard')
	}
}
