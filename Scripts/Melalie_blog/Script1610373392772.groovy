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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

'Open the selected/default browser'
WebUI.maximizeWindow()

'Navigate to melalie blog page'
WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if the picture of \'Stuck in Bali during Pandemic\' article is clickable and related'
WebUI.verifyElementClickable(findTestObject('Page_Melalie Blog/div_Nov 1, 2020_image-wrapper'))

//BLOG Menu
'Verify if user will be directed to the corresponding article page'
WebUI.click(findTestObject('Page_Melalie Blog/div_Stuck in Bali during Pandemic'))

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if the picture of \'How to use Go-Mart to order your groceries\' article is clickable and related'
WebUI.verifyElementClickable(findTestObject('Page_Melalie Blog/div_Apr 14, 2020_image-wrapper'))

'Verify if user will be directed to the corresponding article page'
WebUI.click(findTestObject('Page_Melalie Blog/span_How to use Go-Mart to order your groceries'))

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if user will go to Facebook page and directed to the profile of Ayu Melalie'
WebUI.click(findTestObject('Page_Melalie Blog/ayu_melalie'))

WebUI.delay(2)

'Switch back to Melalie Blog page'
WebUI.switchToWindowIndex('0')

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if the picture of \'6 Steps you can take to prevent coronavirus\' article is clickable and related'
WebUI.verifyElementClickable(findTestObject('Page_Melalie Blog/div_Mar 19, 2020_image-wrapper'))

'Verify if user will be directed to the corresponding article page'
WebUI.click(findTestObject('Page_Melalie Blog/div_6 Steps you can take to prevent coronavirus'))

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if the picture of \'Best Time to Visit Bali\' article is clickable and related'
WebUI.verifyElementClickable(findTestObject('Page_Melalie Blog/div_Best time to visit Bali'))

'Verify if user will be directed to the corresponding article page'
WebUI.click(findTestObject('Page_Melalie Blog/span_Best time to visit Bali'))

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if user will go to Facebook page and directed to the profile of Ayu Melalie to find travel tips'
WebUI.click(findTestObject('Page_Melalie Blog/img_Do you want to get first hand bali travel tips from an expert'))

WebUI.delay(2)

'Switch back to Melalie Blog page'
WebUI.switchToWindowIndex('0')

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify if the picture of \'Where to go surfing Bali\' article is clickable and related'
WebUI.verifyElementClickable(findTestObject('Page_Melalie Blog/h3_Where to go surfing in Bali'))

'Verify if user will be directed to the corresponding article page'
WebUI.click(findTestObject('Page_Melalie Blog/span_Where to go surfing in Bali'))

WebUI.navigateToUrl('https://www.melalie.com/blog')

'Verify that Load button works and expand more articles to be seen by user'
WebUI.click(findTestObject('Page_Melalie Blog/button_Load More'))

WebUI.closeBrowser()

