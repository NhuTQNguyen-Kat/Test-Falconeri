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

int RN = ((Math.random() * 10000000 //This gives a random number between 0 and 10000
    ) as int)

String locale = 'de'

String brand = 'FLC'

String email = ('testMail' + RN) + '@yopmail.com'

String alphabet = 'QWERTZUIOPLKJHGFDSAYXCVBNM'

Random r = new Random()

String randomPartUpperChars = ''

for (int j = 0; j < 3; j++) {
    randomPartUpperChars += alphabet.charAt(r.nextInt(alphabet.length()))
}

String randomFirstname = 'name' + randomPartUpperChars

String randomPartChars = ''

for (int j = 0; j < 3; j++) {
    randomPartChars += alphabet.charAt(r.nextInt(alphabet.length()))
}

String randomSurname = 'surname' + randomPartChars

WebUI.authenticate('https://test.falconeri.com/de/damen/', 'storefront', 'may2019', 0)

WebUI.scrollToElement(findTestObject('FLC/IT/CustomOR_IT/GCIcon'), 0)

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/GCIcon'))

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/BuyGiftButton'))

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/InputAmount'), '200')

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/nameGC'), 'testName')

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/nameReciever'), 'testReciever')

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/emailGC'), email)

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/addtocardGC'))

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/Cart'))

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/Proceedtopayment'))

WebUI.refresh()

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/emailPayment'), email)

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/telephonePayment'), RN + '01')

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/namePayment'), randomFirstname)

WebUI.setText(findTestObject('FLC/IT/CustomOR_IT/lastPayment'), randomSurname)

WebUI.enhancedClick(findTestObject('FLC/IT/CustomOR_IT/proceedPayment'))

WebUI.enhancedClick(findTestObject('INT/DE/selectPPMay'))

WebUI.enhancedClick(findTestObject('INT/DE/sellSoulPPMay'))

WebUI.enhancedClick(findTestObject('INT/DE/payPPMay'))

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

WebUI.waitForElementPresent(findTestObject('Object Repository/FLC/IT/Page_Ordine Completato  Falconeri/h2_Il tuo ordine N 21051239  confermato'), 
    0)

WebUI.delay(5)

String result = WebUI.getText(findTestObject('Object Repository/FLC/IT/Page_Ordine Completato  Falconeri/h2_Il tuo ordine N 21051239  confermato')).replaceAll(
    '[^0-9]', '')

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

