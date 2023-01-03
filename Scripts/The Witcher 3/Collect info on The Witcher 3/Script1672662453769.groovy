import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static org.assertj.core.api.Assertions.*
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
import groovy.json.JsonSlurper


def slurper = new groovy.json.JsonSlurper()

WS.comment('Finding The Witcher 3\'s game id...')
def page = 1
println GlobalVariable.witcherId
while (GlobalVariable.witcherId < 0) {
	def request = WS.sendRequest(findTestObject('RAWG/GET a list of games', [('page') : page]))
	def response = slurper.parseText(request.getResponseBodyContent()).results
	if (!response.findAll{it.slug == 'the-witcher-3-wild-hunt'}.empty) {
		GlobalVariable.witcherId = response.findAll{it.slug == 'the-witcher-3-wild-hunt'}['id'][0]
	}
	else page++
}

WS.comment('Get info on the most iconic RPG to date: The Witcher 3.')

WS.sendRequest(findTestObject('RAWG/GET game details', [('gameId') : GlobalVariable.witcherId]))

WS.comment('Collect data on possible achievements.')

WS.sendRequest(findTestObject('RAWG/GET achievement details', [('gameId') : GlobalVariable.witcherId]))

WS.comment('Find out if the game has any additions.')

WS.sendRequest(findTestObject('RAWG/GET game addition details', [('gameId') : GlobalVariable.witcherId]))

WS.comment('Get screenshots from the game.')

WS.sendRequest(findTestObject('RAWG/GET screenshot', [('gameId') : GlobalVariable.witcherId]))

WS.comment('Obtain the subreddit url of The Witcher 3.')

WS.sendRequest(findTestObject('RAWG/GET subreddit', [('gameId') : GlobalVariable.witcherId]))

WS.comment('Get trailers of the game.')

WS.sendRequest(findTestObject('RAWG/GET trailers', [('gameId') : GlobalVariable.witcherId]))