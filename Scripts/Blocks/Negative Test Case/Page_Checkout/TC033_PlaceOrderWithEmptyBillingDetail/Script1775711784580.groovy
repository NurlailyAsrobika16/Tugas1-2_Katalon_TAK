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

WebUI.click(findTestObject('Page_ViewBasket/btn_ProceedToCheckout'))

WebUI.clearText(findTestObject('Page_Checkout/textField_FirstName'))

WebUI.clearText(findTestObject('Page_Checkout/textField_LastName'))

WebUI.clearText(findTestObject('Page_Checkout/textField_CompanyName'))

WebUI.clearText(findTestObject('Page_Checkout/textField_BillingEmail'))

WebUI.clearText(findTestObject('Page_Checkout/textField_BillingPhone'))

WebUI.executeJavaScript('jQuery(\'#billing_country\').val(\'ID\').trigger(\'change\');', [])

WebUI.clearText(findTestObject('Page_Checkout/textField_BillingAddres1'))

WebUI.clearText(findTestObject('Page_Checkout/textField_BillingAddress2'))

WebUI.clearText(findTestObject('Page_Checkout/textField_city'))

WebUI.executeJavaScript('jQuery(\'#billing_state\').val(\'NB\').trigger(\'change\');', [])

WebUI.clearText(findTestObject('Page_Checkout/textField_BillingPostcode'))

WebUI.click(findTestObject('Page_Checkout/btn_CheckoutPlaceOrder'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingFirstNameRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingLastNameRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_Billing Email AddressRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingPhoneRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingAddressRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingTownCityRequired'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_BillingPostcode ZIPRequired'))

