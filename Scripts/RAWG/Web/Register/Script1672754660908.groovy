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

WebUI.navigateToUrl('https://rawg.io/')

WebUI.click(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/input_Sign up_input__field'), 
    'cica@cica.hu')

WebUI.setText(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/input_Sign up_input__field_1'), 
    'cicamica')

WebUI.click(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/div_Sign upThis password is not safe. Pleas_447561'))

WebUI.setEncryptedText(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/input_Sign up_input__field_1_2'), 
    'Iy5xAfUFsZtTlHLf+3eTAw==')

WebUI.click(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/button_Sign up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RAWG/Web/Page_The Biggest Video Game Database on RAW_362597_register/div_Log out'), 
    0)

