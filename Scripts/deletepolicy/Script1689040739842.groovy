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

def num=0

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.dev.spendit.kr/feeds')

WebUI.setText(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/input__email'), 'ceo@star.com')

WebUI.setEncryptedText(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/input__password'), 'zHA5Sxe5X1lhZN9e3YzwmA==')

WebUI.sendKeys(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/a_'))

while(num < 30)
{
	num++
	WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/div_Corporate_icon-trash-gray'))
	
	WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/input_,_sc-fbNZge eicyGS sc-bXDkGd sc-fBvXI_f12085'))
	
	WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/button_'))
	
	WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/button__1'))
	WebUI.delay(5)
}



WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/img__sc-dwcupg iXwwWk sc-jtHLbV dJbnRe sc-k_8cd130'))

WebUI.click(findTestObject('Object Repository/deletepolicy/Page_,    - (Spendit)/a__1'))

WebUI.closeBrowser()

