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

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/pt/product/camisola_em_modal_caxemira_ultralight_gola_alta-CLD28T.html?dwvar_CLD28T_Z_COL_INTD=545I&bigcup=true')

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Camisola em Modal Caxemira Ultralight _d5d4ba/div_S'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Camisola em Modal Caxemira Ultralight _d5d4ba/button_'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Camisola em Modal Caxemira Ultralight _d5d4ba/button_'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Camisola em Modal Caxemira Ultralight _d5d4ba/button_Adicionar ao carrinho'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Camisola em Modal Caxemira Ultralight _d5d4ba/a_V ao seu carrinho de compras'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/svg_em todas as encomendas_small no-margin'))

WebUI.click(findTestObject('INT/PT/removeSKU'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/button_Eliminar do carrinho'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/svg_em todas as encomendas_no-margin_1'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/button_ATUALIZAR'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/button_'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/button_'))

WebUI.click(findTestObject('Object Repository/INT/PT/Page_Shopping Bag/button_ATUALIZAR'))

