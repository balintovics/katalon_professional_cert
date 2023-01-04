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

WebUI.callTestCase(findTestCase('RAWG/Web/The Witcher 3/Find The Witcher 3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_The Witcher 3 Wild Hunt - release date_9cd532/div_Save toCollection'))

WebUI.click(findTestObject('Object Repository/Page_The Witcher 3 Wild Hunt - release date_9cd532/a_Start a new collection'))

WebUI.setText(findTestObject('Object Repository/Page_Start a new collection  RAWG/input_Title_collection-form__input'), 
    'RPG')

WebUI.click(findTestObject('Object Repository/Page_Start a new collection  RAWG/div_Collection is visible only to me_checkb_75f71b'))

WebUI.setText(findTestObject('Object Repository/Page_Start a new collection  RAWG/textarea_My all-time favourite roleplaying titles'), 
    'My all-time favourite roleplaying titles')

WebUI.click(findTestObject('Object Repository/Page_Start a new collection  RAWG/button_Save changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_RPG - a list of games by cicamica on RAWG/h1_RPG'), 'RPG')

WebUI.verifyElementText(findTestObject('Object Repository/Page_RPG - a list of games by cicamica on RAWG/a_The Witcher 3 Wild Hunt'), 
    'The Witcher 3: Wild Hunt')

WebUI.takeScreenshotAsCheckpoint('RPG collection')
