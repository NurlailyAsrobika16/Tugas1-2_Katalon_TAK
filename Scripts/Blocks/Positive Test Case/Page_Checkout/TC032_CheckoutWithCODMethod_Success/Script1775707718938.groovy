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

WebUI.setText(findTestObject('Page_Checkout/textField_FirstName'), 'Nurlaily')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_LastName'), 'Asrobika')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_CompanyName'), 'Sixty Nine Service')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_BillingEmail'), 'asrobika01@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_BillingPhone'), '085338331744')

WebUI.executeJavaScript('jQuery(\'#billing_country\').val(\'ID\').trigger(\'change\');', [])

WebUI.setText(findTestObject('Page_Checkout/textField_BillingAddres1'), 'BTN puncang hijau, Kel. Sandik, Kec.Batulayar, Kab.Lombok Barat')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_BillingAddress2'), 'Jl.Akasia B-01')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_city'), 'Mataram')

WebUI.executeJavaScript('jQuery(\'#billing_state\').val(\'NB\').trigger(\'change\');', [])

WebUI.setText(findTestObject('Object Repository/Page_Checkout/textField_BillingPostcode'), '83355')

WebUI.click(findTestObject('Page_Checkout/radio_CODMethod'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/btn_CheckoutPlaceOrder'))

WebUI.verifyElementVisible(findTestObject('Page_Checkout/text_PayWithCashUponDelivery'))

