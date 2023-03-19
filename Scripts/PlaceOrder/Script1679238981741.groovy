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

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/div_SHOP NOW'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/div_SHOP NOW'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_pink drop shoulder oversized t shirt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an optionPink'), 
    'pink', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an option363738'), 
    '3', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/i_QTY_icon_plus'))

WebUI.waitForElementPresent(findTestObject('Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'), 5)

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'anne')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'fi')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'juara coding')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'jalan flamboyan3 nomor 16')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'delhi')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '110001')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0923445673')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'annefad25@gmail.com')

WebUI.scrollToElement(findTestObject('Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'), 5)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.waitForElementPresent(findTestObject('Page_Checkout  ToolsQA Demo Site/button_Place order'), 5)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

