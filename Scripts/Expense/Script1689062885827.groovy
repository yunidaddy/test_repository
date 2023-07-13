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

WebUI.setText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input__email'), 'ceo@star.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input__password'), 'zHA5Sxe5X1lhZN9e3YzwmA==')

WebUI.sendKeys(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input__password'), Keys.chord(Keys.ENTER))

//폴리시 버튼 클릭   
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/a_'))

//폴리시 선택
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/div_'))

//지출 클
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/a__1'))

//거리-가솔린 금액 입력 
WebUI.setText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input_Km_fuel0'), price)

//거리-디젤  금액 입력 
WebUI.setText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input_Km_fuel1'), price)

//거리-LPG 금액 입력 
WebUI.setText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input_Km_fuel2'), price)

//거리-전기 금액 입력 
WebUI.setText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/input_Km_fuel3'), price)

//저장버튼 클릭 
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/button_'))

// 팝업창 안내 문구 Check 
//WebUI.verifyElementText(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/div_( -      .)'), '본 설정이 \'승인 완료 이전 상태\' 지출들에 즉시 적용됩니다.(미적용 - \'제출 전 상태\' 지출에만 즉시 적용됩니다.)')
// 팝업창 적용 버튼 클
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/button__1'))

//폴리시선택 창에서 저장버튼 클릭  
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/button__1_2'))

//로그 아웃  
WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/img__sc-dwcupg iXwwWk sc-jtHLbV dJbnRe sc-k_8cd130'))

WebUI.click(findTestObject('Object Repository/Expense_distance/Page_,    - (Spendit)/a__1_2'))

WebUI.closeBrowser()

