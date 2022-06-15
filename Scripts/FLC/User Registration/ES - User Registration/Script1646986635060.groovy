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

String locale = 'es'

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

WebUI.navigateToUrl('https://storefront:may2019@test.falconeri.com/es/mujer/')

WebUI.enhancedClick(findTestObject('FLC/ES/AcceptLang'))

WebUI.enhancedClick(findTestObject('FLC/Universal/LogIn'))

WebUI.enhancedClick(findTestObject('FLC/Universal/register'))

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_LoginRegistrazione  Falconeri/input_Registrati con la tua mail_dwfrm_prof_edb554'), 
    email)

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_LoginRegistrazione  Falconeri/button_Registrati'))

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/input_Telefono_dwfrm_profile_customer_phone'), 
    RN + '65')

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/button_Prosegui'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/span_Sig_radio-input'))

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/input_Sig.ra_dwfrm_profile_customer_firstname'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/input_Nome_dwfrm_profile_customer_lastname'), 
    randomSurname)

WebUI.setEncryptedText(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/input_Cognome_dwfrm_profile_login_password'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.setEncryptedText(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/input_i_dwfrm_profile_login_passwordconfirm'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/span_Desidero ricevere novit e promozioni_r_b6889d'))

WebUI.enhancedClick(findTestObject('FLC/IT/newsletterSpan'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/button_Registrami'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Visita il sito ufficiale Falconeri Mag_6f50cd/button_Registrami'))

WebUI.delay(5)

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_YOPmail - Disposable Email Address/button_Allow Necessary Cookies  Continue'))

WebUI.setText(findTestObject('Object Repository/FLC/IT/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    email)

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_YOPmail - Disposable Email Address/i_'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Inbox/button_'))

checker = WebUI.verifyElementPresent(findTestObject('Object Repository/FLC/IT/Page_Inbox/a_ATTIVA ACCOUNT'), 5, FailureHandling.OPTIONAL)

if (!(checker)) {
    WebUI.enhancedClick(findTestObject('INT/DE/Page_YOPmail - Disposable Email Address/Page_Inbox/button_'))
}

WebUI.enhancedClick(findTestObject('Object Repository/FLC/IT/Page_Inbox/a_ATTIVA ACCOUNT'))

WebUI.delay(5)

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

String currentDate = sdf.format(c.getTime())

LocalDateTime now = LocalDateTime.now()

DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME

String currentTime = formatter.format(now)

String timeDate = (currentDate + ' | ') + currentTime

GlobalVariable.locale = locale

GlobalVariable.randomMail = email

GlobalVariable.randomSurname = randomSurname

GlobalVariable.randomFirst = randomFirstname

CustomKeywords.'testingWritingRadnomVariables_K.WriteRadnomMailandNumber.writeRadnomData'(GlobalVariable.locale, GlobalVariable.randomSurname, 
    GlobalVariable.randomMail, brand, timeDate)

