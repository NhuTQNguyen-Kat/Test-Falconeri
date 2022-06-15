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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/uk/women/')

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/svg__no-margin'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Damenunterwsche Alle Produkte entdecke_54ef66/a_Jetzt anmelden'))

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_MY Intimissimi/input_Email_dwfrm_profile_customer_email'), email)

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_MY Intimissimi/button_Registrieren'))

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/input_Phone_dwfrm_profile_customer_phone'), 
    RN + '73')

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/button_Fortfahren'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/span_Registrieren_radio-input'))

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/input_Vorname_dwfrm_profile_customer_firstname'), 
    randomFirstname)

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/input_Nachname_dwfrm_profile_customer_lastname'), 
    randomSurname)

WebUI.setEncryptedText(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/input_Password_dwfrm_profile_login_password'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.setEncryptedText(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/input_Confirm Password_dwfrm_profile_login__1ac445'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/span_Ich mchte Neuigkeiten und Angebote erh_bba9f0'))

WebUI.enhancedClick(findTestObject('INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/spanGibNewsletter'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/button_'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/button_Registrieren'))

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Die Intimissimi-Welt steht Ihnen 24 St_bff845/button_Registrieren'))

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_YOPmail - Disposable Email Address/button_Allow Necessary Cookies  Continue'))

WebUI.setText(findTestObject('Object Repository/INT/DE/Page_YOPmail - Disposable Email Address/input_Type the Email name of your choice_login'), 
    email)

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_YOPmail - Disposable Email Address/i_'))

checker = WebUI.verifyElementPresent(findTestObject('Object Repository/INT/DE/Page_Inbox/a_E-MAIL BESTTIGEN'), 5, FailureHandling.OPTIONAL)

if (!(checker)) {
    WebUI.enhancedClick(findTestObject('INT/DE/Page_YOPmail - Disposable Email Address/Page_Inbox/button_'))
}

WebUI.enhancedClick(findTestObject('Object Repository/INT/DE/Page_Inbox/a_E-MAIL BESTTIGEN'))

WebUI.delay(5)

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date() //Use today’s date
    )

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

