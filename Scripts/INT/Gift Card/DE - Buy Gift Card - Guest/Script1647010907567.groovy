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

String brand = 'INT'

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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/de/buygiftcard/?type=W&pid=EGC0001%20%20IT%20%2050_EUR')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Scegli l, , importo che prefer_ce9281'), 
    '100')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_c4c302'), 
    'testName')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_313951'), 
    'testReciever')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_4448fd'), 
    email)

WebUI.enhancedClick(findTestObject('INT/IT/Page_E-gift card  Intimissimi/removeChangeLang'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/button_Aggiungi alla bag'))

WebUI.enhancedClick(findTestObject('INT/AT/Page_E-gift card  Intimissimi/svgBasketv2'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Shopping Bag/button_Procedi'))

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_E-mail_dwfrm_shipping_shippingAddress_8175dc'), 
    email)

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_Telefono_dwfrm_shipping_shippingAddre_62d755'), 
    RN + '56')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_Nome_dwfrm_shipping_shippingAddress_a_e65a55'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_Cognome_dwfrm_shipping_shippingAddres_f38247'), 
    randomSurname)

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/button_Procedi'))

WebUI.enhancedClick(findTestObject('INT/DE/paypalmay2select'))

WebUI.enhancedClick(findTestObject('INT/DE/paypalmay2tandc'))

WebUI.enhancedClick(findTestObject('INT/DE/paypal2pay'))

WebUI.switchToWindowIndex(1)

WebUI.enhancedClick(findTestObject('INT/IT/Page_Accedi al tuo conto PayPal/Modificaxpath'))

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Accedi al tuo conto PayPal/input_Indirizzo email_login_email'), 
    'calzedonia.test@calzedonia.it')

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Accedi al tuo conto PayPal/button_Avanti'))

WebUI.setEncryptedText(findTestObject('Object Repository/INT/IT/Page_Accedi al tuo conto PayPal/input_Password_login_password'), 
    'AU+Smzpyo2b/LHvCK8DWTg==')

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Accedi al tuo conto PayPal/button_Accedi'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Accedi al tuo conto PayPal/button_Accetta i cookie'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_PayPal Checkout/button_Continue'))

WebUI.switchToWindowIndex(0)

WebUI.waitForElementVisible(findTestObject('INT/IT/Thankyouguest'), 30)

String result = WebUI.getText(findTestObject('INT/IT/Thankyouguest')).replaceAll('[^0-9]', '')

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

