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

String locale = 'fr'

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

WebUI.navigateToUrl('https://storefront:may2019@test.calzedonia.com/fr/')

WebUI.click(findTestObject('CLZ/geoblockX'))

WebUI.click(findTestObject('CLZ/donnaImage'))

WebUI.click(findTestObject('CLZ/accountIcon'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/a_Iscriviti ora'))

WebUI.click(findTestObject('CLZ/newsletterXfr'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Il tuo account - Area riservata  Calzedonia/input_E-mail_dwfrm_profile_customer_email'), 
    email)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Il tuo account - Area riservata  Calzedonia/button_REGISTRATI'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/input_Telefono_dwfrm_profile_customer_phone'), 
    ('7' + RN) + '1')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/button_Prosegui'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/span_Sig_radio-input'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/input_Nome_dwfrm_profile_customer_firstname'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/input_Cognome_dwfrm_profile_customer_lastname'), 
    randomSurname)

WebUI.setEncryptedText(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/input_Password_dwfrm_profile_login_password'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.setEncryptedText(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/input_Confirm Password_dwfrm_profile_login__1ac445'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/span_Desidero ricevere novit e promozioni_r_b6889d'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/span_S_radio-input'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/button_Registrati ora'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/button_Registrati ora'))

WebUI.delay(3)

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.click(findTestObject('Object Repository/CLZ/Page_YOPmail - Disposable Email Address/button_Accept Recommended Cookies  Continue'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    email)

WebUI.click(findTestObject('Object Repository/CLZ/Page_YOPmail - Disposable Email Address/i_'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Inbox/button_'))

WebUI.switchToWindowTitle('Inbox')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Inbox/a_VERIFICA E-MAIL'))

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

