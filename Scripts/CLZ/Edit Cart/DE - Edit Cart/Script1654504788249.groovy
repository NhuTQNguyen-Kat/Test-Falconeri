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

WebUI.navigateToUrl('https://storefront:may2019@test.calzedonia.com/de/product/leggings_sportivi_performance-MIP064.html?dwvar_MIP064_Z_COL_COLLD=448C')

WebUI.click(findTestObject('Object Repository/CLZ/Page_Leggings Sportivi Performance - LEGGIN_51fe94/img'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Leggings Sportivi Performance - LEGGIN_51fe94/span_XS- label.pdp.coming.soon'))

WebUI.click(findTestObject('CLZ/IT/plusOneSKU'))

WebUI.click(findTestObject('CLZ/IT/plusOneSKU'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Leggings Sportivi Performance - LEGGIN_51fe94/button_Aggiungi alla bag'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Leggings Sportivi Performance - LEGGIN_51fe94/span_'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Leggings Sportivi Performance - LEGGIN_51fe94/a_Vai alla tua bag'))

WebUI.click(findTestObject('CLZ/DE/moveToWishlist'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Shopping Bag/svg_punti Calzedonia Lover_no-margin'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Shopping Bag/button_Elimina dalla bag'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Shopping Bag/svg_punti Calzedonia Lover_no-margin_1'))

WebUI.click(findTestObject('CLZ/IT/plusOneCart'))

WebUI.click(findTestObject('CLZ/IT/plusOneCart'))

WebUI.click(findTestObject('Object Repository/CLZ/Page_Shopping Bag/button_AGGIORNA'))

