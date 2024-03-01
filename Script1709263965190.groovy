import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cor2.usecology.com/')

WebUI.setText(findTestObject('Object Repository/Page_COR2/input_Login_user (2)'), 'manand84')

WebUI.click(findTestObject('Object Repository/Page_COR2/div_Password (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_COR2/input_User name_passwrd (2)'), 'txM1IAQ7a9rroEXdTRY3IQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_COR2/input_User name_passwrd (2)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_COR2/span_Add New Profile'))

WebUI.click(findTestObject('Object Repository/Page_COR2/span_'))

WebUI.click(findTestObject('Object Repository/Page_COR2/a_Section B'))

WebUI.click(findTestObject('Object Repository/Page_COR2/a_Section C'))

WebUI.click(findTestObject('Object Repository/Page_COR2/a_Section D'))

