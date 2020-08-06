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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil

//continue with already opened browser port 9222
//System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\x1047437\\Desktop\\Katalon_Studio_Windows_64-7.5.0\\configuration\\resources\\drivers\\chromedriver.exe");
//ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("debuggerAddress", "localhost:9222")
//WebDriver driver = new ChromeDriver(options);
//DriverFactory.changeWebDriver(driver)


'Login'
WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Login_SupportRole'), [:], FailureHandling.STOP_ON_FAILURE)

'Delay for few sec'
WebUI.delay(GlobalVariable.Short_Wait)

'Navigate to MyDesk tab'
WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Navigate_to_MyDesk_Tab'), [:], FailureHandling.STOP_ON_FAILURE)

'Click DOCM MainMenu and Folders SubMenu'
WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Navigate _MainModule_By_Id_to_Sub_Module_By_Text'), [('MainMenu') : 'UMCMyDesk'
		, ('SubMenu') : 'Companies'], FailureHandling.STOP_ON_FAILURE)

'Switch to frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), GlobalVariable.Element_Timeout)

'Wait for Loading Icon to finish'
WebUI.waitForElementNotVisible(findTestObject('CDDS/Generic_Objects/Common_Objects/Loading_Obj'), GlobalVariable.Element_Timeout)

'Switch to listFilter frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 0)
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/List_Filtr_Iframe_Obj'), 0)

'Wait for Company Name element to be visible'
WebUI.waitForElementVisible(findTestObject('CDDS/Edge_Module_Objects/BCM_State_Validation_Edge_ToolbarSettings_Objects/CompanyName_Obj'), 10)

'Set a Company Name'
WebUI.setText(findTestObject('CDDS/Edge_Module_Objects/BCM_State_Validation_Edge_ToolbarSettings_Objects/CompanyName_Obj'), findTestData('CDDS/Edge_Module_TestData/Edge_ToolbarSettings/Data').getValue(
		'CompanyName', 1))

'Click on  Find btn '
WebUI.click(findTestObject('CDDS/Generic_Objects/Common_Objects/Find_Button'), FailureHandling.STOP_ON_FAILURE)

'Switch to content frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 0)

'Wait for Loading Icon to finish'
WebUI.waitForElementNotVisible(findTestObject('CDDS/Generic_Objects/Common_Objects/Loading_Obj'), GlobalVariable.Element_Timeout)

'Switch to content frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 0)
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/List_Display_Iframe_Obj'), 0)

'Wait for the searched company to be visible'
WebUI.waitForElementVisible(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Select_Radio_Obj'), 10)

'Click on searched company radio button'
WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Select_Radio_Obj'), FailureHandling.STOP_ON_FAILURE)

'Switch to content frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 0)

'Click on  Actions button '
WebUI.click(findTestObject('CDDS/Generic_Objects/Common_Objects/Actions_Btn_Obj'), FailureHandling.STOP_ON_FAILURE)

'Wait for few seconds'
WebUI.delay(2)

'Wait for Edit  element to be visible'
WebUI.waitForElementVisible(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Edit_Obj'), GlobalVariable.Element_Timeout)

'Click on Edit'
WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Edit_Obj'), FailureHandling.STOP_ON_FAILURE)

'Switch to Company Search window'
WebUI.switchToWindowIndex(1)
WebUI.maximizeWindow()
WebUI.delay(3)

'Switch to content frame'
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Pagecontent_Iframe_Obj'), 0)

try{
	'Select a Role from the listbox'
	WebUI.selectOptionByLabel(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Roles_Available_Obj'), findTestData('CDDS/Edge_Module_TestData/Edge_ToolbarSettings/Data').getValue(
			'RoleAvailable', 1), false)
	
	'Click on Next button'
	WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/NextButton_Obj'), FailureHandling.STOP_ON_FAILURE)

}catch(Exception e){
	KeywordUtil.markFailedAndStop("FAILED: ${findTestData('CDDS/Edge_Module_TestData/Edge_ToolbarSettings/Data').getValue('RoleAvailable', 1)} does not found in Available Roles.")
}

'Switch to default'
WebUI.switchToDefaultContent()

'Wait for Done btn to be visible'
WebUI.waitForElementVisible(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Done_Btn_Obj'), GlobalVariable.Element_Timeout)

'Click on  Done btn '
WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/Edge_ToolbarSettings_Objects/Done_Btn_Obj'), FailureHandling.STOP_ON_FAILURE)

'Delay for a while'
WebUI.delay(15)

'Close Browser'
WebUI.closeWindowIndex(0)








