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

WebUI.openBrowser('')

WebUI.maximizeWindow()

int RN = ((Math.random() * 10000000 //This gives a random number between 0 and 10000
) as int)

String locale = 'fr'

String brand = 'CLZ'

String email = ('testMail' + RN) + '@yopmail.com'

WebUI.authenticate('https://test.calzedonia.com/fr/', 'storefront', 'may2019', 0)

WebUI.enhancedClick(findTestObject('CLZ/damenImage'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/input_ANMELDEN  REGISTRIEREN_q'), 
    'IC00065')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/a_Badeanzug Paola'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/img'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/span_- label.pdp.coming.soon'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/input_S_emailNotify'), 
    email)

WebUI.click(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/span_'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/button_Benachrichtigt mich'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Badeanzug Paola - Einteilige Badeanzge_f2c69c/svg_Close_close-icon'))

