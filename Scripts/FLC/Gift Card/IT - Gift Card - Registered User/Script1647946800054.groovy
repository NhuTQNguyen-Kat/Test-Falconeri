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
import java.util.Random as Random
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

WebUI.openBrowser('')

WebUI.maximizeWindow()

String locale = 'it'

String brand = 'FLC'

WebUI.navigateToUrl('https://storefront:may2019@test.falconeri.com/it/')

WebUI.enhancedClick(findTestObject('FLC/Universal/LogIn'))

WebUI.setText(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/input_Ihre E-Mail_loginEmail'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/input_Ihre E-Mail_loginPassword'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.enhancedClick(findTestObject('FLC/Universal/rememberPasswordSlider'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/button_Login'))

//WebUI.authenticate('https://test.falconeri.com/it/donna/', 'storefront', 'may2019', 0)
WebUI.scrollToElement(findTestObject('FLC/Universal/registeredGCIcon'), 0)

WebUI.enhancedClick(findTestObject('FLC/Universal/registeredGCIcon'))

WebUI.enhancedClick(findTestObject('FLC/Universal/registeredBuyGC'))

WebUI.setText(findTestObject('FLC/Universal/inputAmount'), '200')

WebUI.setText(findTestObject('FLC/Universal/registeredGCName'), 'testName')

WebUI.setText(findTestObject('FLC/Universal/registeredGCReciever'), 'testReciever')

WebUI.setText(findTestObject('FLC/Universal/registeredGCEmail'), email)

WebUI.enhancedClick(findTestObject('FLC/Universal/addToCart'))

WebUI.enhancedClick(findTestObject('FLC/Universal/cart'))

WebUI.enhancedClick(findTestObject('FLC/Universal/proccedToPayment'))

WebUI.refresh()

//WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/namePayment'), randomFirstname)
//WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/lastPayment'), randomSurname)
WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/proceedPayment'))

WebUI.enhancedClick(findTestObject('FLC/IT/Page_Checkout  Falconeri/span_Invia ordine_radio-input'))

WebUI.enhancedClick(findTestObject('FLC/IT/Page_Checkout  Falconeri/span_PayPal_checkbox-input'))

WebUI.enhancedClick(findTestObject('FLC/Universal/PPapril'))

WebUI.switchToWindowIndex(1)

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/a_Modifica'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/button_Accetta i cookie'))

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/input_Indirizzo email_login_email'), 
    'calzedonia.test@calzedonia.it')

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/button_Avanti'))

WebUI.setEncryptedText(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/input_Password_login_password'), 
    'AU+Smzpyo2b/LHvCK8DWTg==')

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Accedi al tuo conto PayPal/button_Accedi'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_PayPal Checkout/button_Continue'))

WebUI.switchToWindowIndex(0)

WebUI.waitForElementPresent(findTestObject('FLC/Universal/thankYouMessgRegistered'), 0)

String result = WebUI.getText(findTestObject('FLC/Universal/thankYouMessgRegistered')).replaceAll('[^0-9]', '')

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

