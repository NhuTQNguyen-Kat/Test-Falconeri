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

WebUI.navigateToUrl('https://storefront:may2019@test.calzedonia.com/uk/')

WebUI.click(findTestObject('CLZ/donnaImage'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/span_'))

WebUI.click(findTestObject('CLZ/accountIcon'))

WebUI.setText(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/input_Inserire email_loginEmail'), 
    'testMail9079996@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/input_Password_loginPassword'), 
    'p4y+y39Ir5PEPmX20UxFKw==')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/span_Password_switch slider round'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Collant, calze, beachwear e costumi ma_c61bd1/button_Accedi'))

WebUI.click(findTestObject('CLZ/accountIcon'))

WebUI.click(findTestObject('CLZ/signOutUK'))

//WebUI.click(findTestObject('Object Repository/CLZ/Page_Calzedonia - Calze, Collant, Leggings _aa9d2e/h3_Esci'))

