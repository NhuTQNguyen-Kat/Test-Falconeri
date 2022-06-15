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

String locale = 'uk'

String brand = 'CLZ'

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

WebUI.navigateToUrl('https://storefront:may2019@test.calzedonia.com/uk/')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/span_Donna'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/span_'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/a_ACQUISTA E-GIFT CARD'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/input_E-Gift Card_typeAmount'), 
    '200')

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/input_concat(Seleziona l, , importo)_giftca_c4c302'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/input_concat(Seleziona l, , importo)_giftca_313951'), 
    randomSurname)

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/input_concat(Seleziona l, , importo)_giftca_4448fd'), 
    email)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Electronic Giftcard - calzedonia_ww - _409864/button_Aggiungi alla bag'))

WebUI.click(findTestObject('CLZ/cart'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Shopping Bag/button_Procedi'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/input_E-mail_dwfrm_shipping_shippingAddress_8175dc'), 
    email)

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/input_Telefono_dwfrm_shipping_shippingAddre_62d755'), 
    RN + '42')

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/input_Nome_dwfrm_shipping_shippingAddress_a_e65a55'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/input_Cognome_dwfrm_shipping_shippingAddres_f38247'), 
    randomSurname)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/button_Procedi'))

WebUI.click(findTestObject('CLZ/AT/ppxpathselectCLZat'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Pagamento - Calzedonia/span_PayPal_checkbox-input'))

WebUI.click(findTestObject('CLZ/clzPPpayit'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/a_Modifica'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/html_Accedi al tuo conto PayPal Special int_0258f2'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/input_Indirizzo email_login_email'), 
    'calzedonia.test@calzedonia.it')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/button_Avanti'))

WebUI.setEncryptedText(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/input_Password_login_password'), 
    'AU+Smzpyo2b/LHvCK8DWTg==')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Accedi al tuo conto PayPal/button_Accedi'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_PayPal Checkout/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_PayPal Checkout/button_Continue'))

WebUI.switchToWindowIndex(0)

String result = WebUI.getText(findTestObject('Object Repository/CLZ/Page_Ordine Completato - Calzedonia/h2_Grazie per il tuo ordine 21052606')).replaceAll(
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

