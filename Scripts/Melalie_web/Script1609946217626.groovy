import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Open the selected/default browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.melalie.com/')

'Start order bike by clicking Order a Bike menu'
WebUI.click(findTestObject('Page_Melalie - Motorbike  Scooter Rentals/a_Order a Bike'))

WebUI.click(findTestObject('Page_Melalie - Motorbike  Scooter Rentals/Select Dropdown (Deliver Bike to)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_Airport Ngurah Rai (Deliver Bike to)'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Select Dropdown (Pickup Bike At)'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_Villa  Hotel  Accomodation (Pickup Bike At)'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/button_06 Jan 202107 Jan 2021'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/td_13'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/td_14'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/a_Save'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_Select Delivery Time'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_1000'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_Select Pickup Time'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/div_1500'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Melalie - Motorbike  Scooter Rentals/a_Longterm DiscountHonda Vario 125Start from IDR 84,000   4.92 per day'))

WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Honda Vario 125'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Verify that the price for selected motorbike is correct'
WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/p_IDR 84,000   4.87 per day'), 
    0, FailureHandling.STOP_ON_FAILURE)

'Verify that the start of booking period is correct'
WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/p_13 Jan 2021'), 
    0)

'Verify that the end of booking period is correct'
WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/p_14 Jan 2021'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Airport Ngurah Rai'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Delivery Time1000'), 
    0)

//WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/input Flight Number'))
WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/input Flight Number'), 
    'GA 9117', FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Pickup Bike atVilla  Hotel  Accomodation'), 
    0)

//WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/input Location'))
WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/input Location'), 
    'Jl. Gajah Mada No.92, Kec. Denpasar Utara, Kota Denpasar, Bali 80231, Indonesia')

'Input the location of delivery'
WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Jl. Gajah Mada No.92, Kec. Denpasar Utara, Kota Denpasar, Bali 80231, Indonesia'))

WebUI.sendKeys(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/input Location'), 
    Keys.chord(Keys.ENTER))

'Verify that pickup time is as selected before'
WebUI.verifyElementPresent(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Pickup Time1500'), 
    0)

'Adding notes for the delivery of motorbike'
WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/div_Notes'), 
    'In front of the market', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Page_Honda Vario 125 - Melalie - Motorbike  Scooter Rentals/button_Book'))

WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/input Full name'), 'Faris Harun Ahmad')

WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/input Email Address'), 'farisharunahmad@rocketmail.com')

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/div_Country Code_box'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/div_(62) Indonesia'))

WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/input Whatsapp Number'), '81271175271')

WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/input Password'), 'reconstruct001')

'Verify unmasking feature'
WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/i_icon-eye'), FailureHandling.OPTIONAL)

'Verify masking feature'
WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/i_icon-eye'), FailureHandling.OPTIONAL)

'Upload the passport file to finish the step 2'
CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/div_Click or drop here to upload a file'), 
    'C:\\Users\\faris\\Pictures\\passport_faris1.jpg')

WebUI.delay(4)

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/div_Country (Home Address)'))

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/div_Indonesia'))

WebUI.setText(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/textarea Home Address'), 'Jl. Kikim II', 
    FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/textarea Home Address'), Keys.chord(
        Keys.ENTER))

Thread.sleep(2000)

WebUI.click(findTestObject('Page_Melalie - Order a Motorbike/Step 2 - Your Information/button_Continue'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()

