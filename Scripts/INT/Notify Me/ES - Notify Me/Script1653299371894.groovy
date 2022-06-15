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

int RN = ((Math.random() * 10000000 //This gives a random number between 0 and 10000
    ) as int)

String locale = 'es'

String brand = 'FLC'

String email = ('testMail' + RN) + '@yopmail.com'

WebUI.navigateToUrl('https://storefront:may2019@test.intimissimi.com/es/product/reggiseno_a_balconcino_elena_in_pizzo-RID91L.html?dwvar_RID91L_Z_COL_INTD=1473')

WebUI.enhancedClick(findTestObject('INT/Universal/saveLang'))

WebUI.enhancedClick(findTestObject('INT/Universal/size0C'))

WebUI.waitForElementVisible(findTestObject('INT/Universal/emailForNotify'), 10)

WebUI.setText(findTestObject('INT/Universal/emailForNotify'), email)

WebUI.enhancedClick(findTestObject('INT/Universal/notifyMeButton'))

