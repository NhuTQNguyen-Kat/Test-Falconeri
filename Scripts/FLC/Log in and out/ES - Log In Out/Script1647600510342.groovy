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

WebUI.navigateToUrl('https://storefront:may2019@test.falconeri.com/es/')

WebUI.enhancedClick(findTestObject('FLC/ES/saveLangXpath'))

WebUI.enhancedClick(findTestObject('FLC/Universal/LogIn'))

WebUI.setText(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/input_Ihre E-Mail_loginEmail'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/input_Ihre E-Mail_loginPassword'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.enhancedClick(findTestObject('FLC/Universal/rememberPasswordSlider'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/button_Login'))

WebUI.enhancedClick(findTestObject('Object Repository/FLC/AT/Page_Abbigliamento e Maglieria in Cashmere _dd2202/button_Login'))

WebUI.enhancedClick(findTestObject('FLC/Universal/newsletterX'), FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('FLC/Universal/myProfile'))

WebUI.enhancedClick(findTestObject('FLC/Universal/logOut'))

