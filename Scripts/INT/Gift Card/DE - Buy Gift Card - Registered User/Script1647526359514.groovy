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

WebUI.callTestCase(findTestCase('INT/User Registration/DE - User Registration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.maximizeWindow()

int RN = ((Math.random() * 10000000 //This gives a random number between 0 and 10000
    ) as int)

String locale = 'de'

String brand = 'INT'

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/de/damen/')

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/svg__no-margin'))

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/input_Geben Sie die E-Mail-Adresse ein_loginEmail'), 
    GlobalVariable.randomMail)

WebUI.setEncryptedText(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/input_Passwort_loginPassword'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.enhancedClick(findTestObject('INT/Universal/savePasswordSlider'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/button_Einloggen'))

//WebUI.click(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/svg__no-margin'))
WebUI.delay(5)

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/de/buygiftcard/?type=W&pid=EGC0001%20%20IT%20%2050_EUR')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Scegli l, , importo che prefer_ce9281'), 
    '100')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_c4c302'), 
    'testName')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_313951'), 
    'testReciever')

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_E-gift card  Intimissimi/input_concat(Seleziona l, , importo)_giftca_4448fd'), 
    GlobalVariable.randomMail)

WebUI.enhancedClick(findTestObject('INT/IT/Page_E-gift card  Intimissimi/removeChangeLang'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('INT/AT/Add to cart global GC'))

WebUI.enhancedClick(findTestObject('INT/UK/UniversalBasket'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/INT/IT/Page_Shopping Bag/button_Procedi'))

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_Nome_dwfrm_shipping_shippingAddress_a_e65a55'), 
    GlobalVariable.randomFirst)

WebUI.setText(findTestObject('Object Repository/INT/IT/Page_Pagamento - Intimissimi/input_Cognome_dwfrm_shipping_shippingAddres_f38247'), 
    GlobalVariable.randomSurname)

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

