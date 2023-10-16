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

WebUI.openBrowser('btn.co.id')

WebUI.setViewPortSize(1440, 900)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/new btn/Page_Bank BTN Sahabat Keluarga Indonesia/button_tai'))

WebUI.click(findTestObject('Object Repository/new btn/Page_Bank BTN Sahabat Keluarga Indonesia/a_e-kurs konverter kalkulator'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('new btn/Page_E-Konverter Hitungan Kurs/text scroll'), 0)

WebUI.setText(findTestObject('Object Repository/new btn/Page_E-Konverter Hitungan Kurs/input_E-Konverter Hitungan Kurs_SourceNumber'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/new btn/Page_E-Konverter Hitungan Kurs/select_USDJPYGBPAUDHKDSGDEURIDRMYRSARCNY'), 
    'HKD', true)

WebUI.click(findTestObject('Object Repository/new btn/Page_E-Konverter Hitungan Kurs/input_Transaksi_btn btn-secondary'))

WebUI.getText(findTestObject('new btn/Page_E-Konverter Hitungan Kurs/verify_object'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

