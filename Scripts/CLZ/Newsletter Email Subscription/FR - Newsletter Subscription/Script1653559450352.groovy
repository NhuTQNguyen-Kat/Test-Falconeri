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

WebUI.authenticate('https://test.calzedonia.com/cz/', 'storefront', 'may2019', 0)

WebUI.enhancedClick(findTestObject('CLZ/damenImage'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Strmpfe, Strumpfhosen, Le_33c540/span_'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/button_ANMELDEN'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/span_Bitte whle eine Anrede aus_radio-input'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/input_Frau_newsletterEmail'), 
    'ovdjeidemail@yopmail.com')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/span_Gib in jedem Feld eine gltige Anzahl e_aa200c'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/span_Ja_checkbox-input'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Damen Socken, Strumpfhosen, Beachwear _7cd3fb/button_Anmelden (1)'))

