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

WebUI.navigateToUrl('https://test.falconeri.com/uk/product/ultralight_cashmere_buttoned_cardigan-DML261G.html?dwvar_DML261G_Z_COL_FALCD=9107')

WebUI.click(findTestObject('Object Repository/FLC/UK/Page_Ultralight Cashmere Buttoned Cardigan _7f3450/div_XS'))

WebUI.click(findTestObject('Object Repository/FLC/UK/Page_Ultralight Cashmere Buttoned Cardigan _7f3450/button_Add to shopping bag'))

WebUI.click(findTestObject('FLC/UK/closeCartPop'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLC/UK/Page_Ultralight Cashmere Buttoned Cardigan _7f3450/span_Add to shopping bag'))

WebUI.click(findTestObject('FLC/UK/closeCartPop'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FLC/UK/Page_Ultralight Cashmere Buttoned Cardigan _7f3450/span_Add to shopping bag'))

WebUI.click(findTestObject('Object Repository/FLC/UK/Page_Ultralight Cashmere Buttoned Cardigan _7f3450/a_View shopping bag'))

WebUI.click(findTestObject('FLC/IT/moveToWishlist'))

WebUI.click(findTestObject('FLC/IT/confirmWishlist'))

WebUI.click(findTestObject('FLC/IT/removeFromCartFirst'))

WebUI.click(findTestObject('FLC/IT/confirmRemove'))

