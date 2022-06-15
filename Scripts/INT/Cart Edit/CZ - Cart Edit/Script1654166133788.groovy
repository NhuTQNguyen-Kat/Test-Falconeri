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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/cz/product/mikromodalovy_top_pretty_flowers-LT1294M.html?dwvar_LT1294M_Z_COL_INTD=735I&bigcup=true')

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Mikromodalov Top Pretty Flowers  Intimissimi/div_S'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Mikromodalov Top Pretty Flowers  Intimissimi/button_'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Mikromodalov Top Pretty Flowers  Intimissimi/button_'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Mikromodalov Top Pretty Flowers  Intimissimi/button_Pidat do nkupnho koku'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Mikromodalov Top Pretty Flowers  Intimissimi/a_Pejt do koku'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/svg_dopravu a vrcen zdarma_small no-margin'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/svg_dopravu a vrcen zdarma_small no-margin_1'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/button_Odebrat zkoku'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/svg_dopravu a vrcen zdarma_no-margin'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/button_AKTUALIZOVAT'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/button_'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/button_'))

WebUI.click(findTestObject('Object Repository/INT/CZ/Page_Nkupn kok Intimissimi/button_AKTUALIZOVAT'))

