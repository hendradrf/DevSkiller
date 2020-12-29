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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/')

WebUI.click(findTestObject('Object Repository/Page_Index/button_Skip Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7_1'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Register/textarea_Address_form-control ng-untouched _b1abf7'), 'Yogyakarta')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email address_form-control ng-untouch_b58296'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), '085877654332')

WebUI.click(findTestObject('Object Repository/Page_Register/input_Male_radiooptions'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/Page_Register/div_Languages_msdd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Select Skills                       _fcf818'), 
    'Programming', true)

WebUI.click(findTestObject('Object Repository/Page_Register/div_Languages_msdd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Select Country                      _cc64b6'), 
    'Indonesia', true)

WebUI.click(findTestObject('Object Repository/Page_Register/span_Select Country _select2-selection sele_4ca78e'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_concat(, ,  2016, , , , All Rights Re_603754'), '')

WebUI.click(findTestObject('Object Repository/Page_Register/div_(adsbygoogle  window.adsbygoogle  ).pus_639123'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_year                             191_0e56cb'), 
    '1925', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Month                               _920c21'), 
    'July', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Day                                 _6d848d'), 
    '13', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_firstpassword'), 'QJblfja5Cso=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Confirm Password_secondpassword'), 'QJblfja5Cso=')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), '-')

