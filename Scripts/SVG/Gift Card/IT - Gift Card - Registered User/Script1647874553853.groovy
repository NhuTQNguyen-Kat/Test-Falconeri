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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.maximizeWindow()

String locale = 'it'

String brand = 'SVG'

WebUI.navigateToUrl('https://storefront:may2019@test.signorvino.com/it/')

WebUI.waitForElementPresent(findTestObject('SVG/Universal/smallNewsletterX'), 0)

WebUI.enhancedClick(findTestObject('SVG/Universal/smallNewsletterX'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SVG/Universal/userIconGuest'))

WebUI.setText(findTestObject('SVG/Universal/emailInput'), email)

WebUI.setEncryptedText(findTestObject('SVG/Universal/passwordInput'), 'p4y+y39Ir5PEPmX20UxFKw==')

//WebUI.click(findTestObject('SVG/Universal/savePassword'))
WebUI.enhancedClick(findTestObject('SVG/Universal/logIn'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('SVG/IT/CloseNewsletter'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SVG/Universal/giftcardButton'))

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Signorvino Gift Card Elettronica/a_ACQUISTA E-GIFT CARD'))

WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Gift Card - - Signorvino/input_concat(Seleziona l, , importo)_typeAmount'), 
    '200')

WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Gift Card - - Signorvino/input_concat(Seleziona l, , importo)_giftca_c4c302'), 
    'testName')

WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Gift Card - - Signorvino/input_concat(Seleziona l, , importo)_giftca_313951'), 
    'testRecieve')

WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Gift Card - - Signorvino/input_concat(Seleziona l, , importo)_giftca_4448fd'), 
    email)

WebUI.enhancedClick(findTestObject('SVG/Universal/addToCart'))

WebUI.navigateToUrl('https://test.signorvino.com/it/cart/')

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Shopping Bag/button_Acquista ora'))

//WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Pagamento - Signorvino/input_Nome_dwfrm_shipping_shippingAddress_a_e65a55'), 
//    randomFirstname)
//WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Pagamento - Signorvino/input_Cognome_dwfrm_shipping_shippingAddres_f38247'), 
//    randomSurname)
WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Pagamento - Signorvino/button_Procedi'))

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Pagamento - Signorvino/span_Invia ordine_radio-input'))

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Pagamento - Signorvino/span_PayPal_checkbox-input'))

WebUI.enhancedClick(findTestObject('SVG/IT/PagaconPP'))

WebUI.switchToWindowIndex(1)

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Accedi al tuo conto PayPal/a_Modifica'))

WebUI.setText(findTestObject('Object Repository/SVG/IT/Page_Accedi al tuo conto PayPal/input_Indirizzo email_login_email'), 
    'calzedonia.test@calzedonia.it')

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Accedi al tuo conto PayPal/button_Avanti'))

WebUI.setEncryptedText(findTestObject('Object Repository/SVG/IT/Page_Accedi al tuo conto PayPal/input_Password_login_password'), 
    'AU+Smzpyo2b/LHvCK8DWTg==')

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_Accedi al tuo conto PayPal/button_Accedi'))

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_PayPal Checkout/button_Accept Cookies'))

WebUI.enhancedClick(findTestObject('Object Repository/SVG/IT/Page_PayPal Checkout/button_Continue'))

WebUI.switchToWindowIndex(0)

WebUI.waitForElementPresent(findTestObject('SVG/Universal/thankYouRegistered'), 30)

String result = WebUI.getText(findTestObject('SVG/Universal/thankYouRegistered')).replaceAll('[^0-9]', '')

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

String currentDate = sdf.format(c.getTime())

LocalDateTime now = LocalDateTime.now()

DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME

String currentTime = formatter.format(now)

String timeDate = (currentDate + ' | ') + currentTime

CustomKeywords.'testingWritingRadnomVariables_K.WriteDownOrderSurnameMail.writeGiftCardinE'(result, randomSurname, email, 
    brand, locale, timeDate)

