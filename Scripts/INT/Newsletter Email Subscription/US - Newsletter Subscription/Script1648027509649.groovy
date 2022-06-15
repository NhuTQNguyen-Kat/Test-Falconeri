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

int RN = ((Math.random() * 10000000 //This gives a random number between 0 and 10000
    ) as int)

String email = ('testMail' + RN) + '@yopmail.com'

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/us/')

WebUI.enhancedClick(findTestObject('INT/saveLang2'))

WebUI.setText(findTestObject('Object Repository/INT/AT/Page_Intimissimi online shop - Dessous und _da99b5/input_Omnichannel-Services_email'), 
    email)

WebUI.scrollToElement(findTestObject('FLC/Universal/submitNewsletter'), 0)

WebUI.enhancedClick(findTestObject('INT/Universal/submitNewsletter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/INT/AT/Page_Intimissimi online shop - Dessous und _da99b5/select_LandAaland-InselnAfghanistanAlbanien_c8fa8e'), 
    'US', true)

WebUI.enhancedClick(findTestObject('INT/Universal/mister'))

WebUI.enhancedClick(findTestObject('INT/Universal/checkboxJa1'))

WebUI.enhancedClick(findTestObject('INT/Universal/checkboxJa2'))

WebUI.enhancedClick(findTestObject('INT/Universal/registerNewsletter'))

