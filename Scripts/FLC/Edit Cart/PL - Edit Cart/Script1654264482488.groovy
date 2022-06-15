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

WebUI.navigateToUrl('https://storefront:may2019@test.falconeri.com/pl/product/jacke_aus_cashmere_ultralight-DML261G.html?dwvar_DML261G_Z_COL_FALCD=9107')

WebUI.click(findTestObject('Object Repository/FLC/IT/Page_Smanicato Corto - Piumini  Falconeri/div_XS'))

WebUI.click(findTestObject('FLC/Universal/addToCartSKU'))

WebUI.delay(1)

WebUI.click(findTestObject('FLC/IT/closeCart'))

WebUI.click(findTestObject('FLC/Universal/addToCartSKU'))

WebUI.delay(1)

WebUI.click(findTestObject('FLC/IT/closeCart'))

WebUI.click(findTestObject('FLC/Universal/addToCartSKU'))

WebUI.delay(1)

WebUI.click(findTestObject('FLC/IT/goToCart'))

WebUI.click(findTestObject('FLC/IT/moveToWishlist'))

WebUI.click(findTestObject('FLC/IT/confirmWishlist'))

WebUI.click(findTestObject('FLC/DE/removeFromCartFirst'))

WebUI.click(findTestObject('FLC/DE/confirmRemoveFromCart'))

