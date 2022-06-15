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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/uk/product/modal_ultralight_cashmere_blend_top_with_lace-LTD28Q.html?dwvar_LTD28Q_Z_COL_INTD=231I&bigcup=true')

WebUI.click(findTestObject('Object Repository/INT/US/Page_Modal Ultralight Cashmere Blend Top wi_64639b/div_S'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_Modal Ultralight Cashmere Blend Top wi_64639b/button_'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_Modal Ultralight Cashmere Blend Top wi_64639b/button_'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_Modal Ultralight Cashmere Blend Top wi_64639b/button_Add to the bag'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_Modal Ultralight Cashmere Blend Top wi_64639b/a_Go to your bag'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/svg_movetowishlist'))

WebUI.click(findTestObject('INT/UK/removeSKUuk'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/button_Remove from the bag'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/svg_editproduct'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/button_UPDATE'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/button_'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/button_'))

WebUI.click(findTestObject('Object Repository/INT/US/Page_default.title/button_UPDATE'))

