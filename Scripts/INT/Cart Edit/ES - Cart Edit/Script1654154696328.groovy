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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/ch/product/top_aus_modal_ultralight_mit_cashmere_und_spitze-LTD28Q.html?dwvar_LTD28Q_Z_COL_INTD=231I&bigcup=true')

WebUI.click(findTestObject('INT/ES/saveLanguageES'))

WebUI.click(findTestObject('INT/Universal/geoblockClose'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Top aus Modal Ultralight mit Cashmere _1497a2/div_S'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Top aus Modal Ultralight mit Cashmere _1497a2/button_'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Top aus Modal Ultralight mit Cashmere _1497a2/button_'))

WebUI.click(findTestObject('INT/Universal/addToCartJune'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Top aus Modal Ultralight mit Cashmere _1497a2/a_Zum Warenkorb'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/svg_beim Treueprogramm My Intimissimi an_sm_6b4e4b'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/svg_beim Treueprogramm My Intimissimi an_sm_6b4e4b_1'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/button_Aus dem Warenkorb entfernen'))

WebUI.click(findTestObject('INT/AT/editSKU'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/button_AKTUALISIEREN'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/button_'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/button_'))

WebUI.click(findTestObject('Object Repository/INT/AT/Page_Warenkorb/button_AKTUALISIEREN'))

