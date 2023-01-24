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

Mobile.startApplication('D:\\fiók\\asztal\\balintovics\\apk\\universal.apk', true)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('YogaMagic_login/android.widget.EditText - E-mail'), 'otven1@gmail.com')

Mobile.setEncryptedText(findTestObject('YogaMagic_login/android.widget.EditText - Jelsz'), 'l8nIxjPZvqU=', 0)

Mobile.tap(findTestObject('YogaMagic_login/android.widget.TextView - Bejelentkezs'), 0)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('YogaMagic_login/android.widget.TextView - Bejelentkezs'), 0)

Mobile.closeApplication()

