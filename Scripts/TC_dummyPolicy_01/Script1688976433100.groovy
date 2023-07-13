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

WebUI.navigateToUrl('https://app.dev.spendit.kr/feeds')

WebUI.setText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/input__email'), 'ceo@star.com')

WebUI.setEncryptedText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/input__password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/button_'))

WebUI.verifyElementText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/div_'), '이메일과 비밀번호를 확인해 주세요.')

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/button_OK'))

WebUI.setEncryptedText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/input__password'), 'zHA5Sxe5X1lhZN9e3YzwmA==')

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/button_'))

WebUI.verifyElementText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/a_'), '피드')

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/a__1'))

for (def index : (0..10)) {
    WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/span_'))

    WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/a__1'))
}

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/img__sc-dwcupg iXwwWk sc-jtHLbV dJbnRe sc-k_8cd130'))

WebUI.click(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/a__1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/createPolicy/Page_,    - (Spendit)/p_'), '스팬딧에 오신 것을 환영합니다!')

WebUI.closeBrowser()

