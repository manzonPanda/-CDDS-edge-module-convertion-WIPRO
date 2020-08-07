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
System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
System.setProperty("webdriver.chrome.driver", "C:\\Users\\x1047437\\Desktop\\Katalon_Studio_Windows_64-7.5.0\\configuration\\resources\\drivers\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("debuggerAddress", "localhost:9222")
WebDriver driver = new ChromeDriver(options);
DriverFactory.changeWebDriver(driver)

//'Login'
//WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Login_SupportRole'), [:], FailureHandling.STOP_ON_FAILURE)
//
//'Delay for few sec'
//WebUI.delay(GlobalVariable.Short_Wait)
//
//'Navigate to MyDesk tab'
//WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Navigate_to_MyDesk_Tab'), [:], FailureHandling.STOP_ON_FAILURE)
//
//'Click DOCM MainMenu and Folders SubMenu'
//WebUI.callTestCase(findTestCase('CDDS/Generic_TestCases/Navigate _MainModule_By_Id_to_Sub_Module_By_Text'), [('MainMenu') : 'UMCMyDesk'
//		, ('SubMenu') : 'Groups'], FailureHandling.STOP_ON_FAILURE)
//
//'Switch to listFilter frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 0)
//
//'Wait for Actions button element to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/Generic_Objects/Common_Objects/Actions_Btn_Obj'), 10)
//
//'Click on  Actions button '
//WebUI.click(findTestObject('CDDS/Generic_Objects/Common_Objects/Actions_Btn_Obj'), FailureHandling.STOP_ON_FAILURE)
//
//'Wait for Create Group element to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/EDGE_Module_Objects/DocM_ManageGroupMembers/Create_Group_Obj'), 10)
//
//'Click on Create Group button '
//WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/DocM_ManageGroupMembers/Create_Group_Obj'), FailureHandling.STOP_ON_FAILURE)
//
//'Switch to Company Search window'
//WebUI.switchToWindowIndex(1)
//WebUI.maximizeWindow()
//WebUI.delay(3)
//
//'Switch to content frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Pagecontent_Iframe_Obj'), 0)
//
//'Wait for Group Name element to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/GroupName_Obj'), 10)
//
//'Set a Group Name'
//WebUI.setText(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/GroupName_Obj'), findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue(
//		'GroupName', 1))
//
//'Select a Company name'
//WebUI.selectOptionByLabel(findTestObject('CDDS/EDGE_Module_Objects/DocM_ManageGroupMembers/CompanySelect_Obj'), findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue(
//		'CompanyName', 1), false)
//
//'Set a Description'
//WebUI.setText(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/Description_Obj'), findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue(
//		'Description', 1))
//
//'Switch to default'
//WebUI.switchToDefaultContent()
//
//'Click on  Done btn '
//WebUI.click(findTestObject('CDDS/EDGE_Module_Objects/DocM_ManageGroupMembers/Done_Btn_Obj'), FailureHandling.STOP_ON_FAILURE)
//
//'Delay for a while'
//WebUI.delay(15)
//
//'Switch to content frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 30)
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/List_Filtr_Iframe_Obj'), 30)
//
//'Wait for Group Name element to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/GroupName_Obj'), 10)
//
//'Set a Group Name'
//WebUI.setText(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/GroupName_Obj'), findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue(
//		'GroupName', 1))
//
//'Click on  Find btn '
//WebUI.click(findTestObject('CDDS/Generic_Objects/Common_Objects/Find_Button'), FailureHandling.STOP_ON_FAILURE)
//
//'Switch to content frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 30)
//
//'Wait for Loading Icon to finish'
//WebUI.waitForElementNotVisible(findTestObject('CDDS/Generic_Objects/Common_Objects/Loading_Obj'), GlobalVariable.Element_Timeout)
//
//'Switch to content frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 30)
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/List_Display_Iframe_Obj'), 30)
//
//'Verify Group created or not'
//try{
////	'Initialize driver'
////	WebDriver driver = DriverFactory.getWebDriver()
//	
//	List <WebElement> tableRows = driver.findElements(By.xpath('//table[@id="UMCGroup"]/tbody/tr'))
//	/* Column name
//	 * 0-checkbox
//	 * 1-Group Name
//	 * 2-Company
//	 * 3-Owner
//	 * 4-Description
//	 */
//	boolean errorFound = false
//	for (int i=1; i<=tableRows.size()-1; i++){
//		WebElement groupName = tableRows[i].findElements(By.tagName("td"))[1]
//		WebElement company = tableRows[i].findElements(By.tagName("td"))[2]
//		WebElement description = tableRows[i].findElements(By.tagName("td"))[4]
//		if( groupName.getAttribute("innerText").contains(findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue('GroupName', 1))
//			&& company.getAttribute("innerText").contains(findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue('CompanyName', 1))
//			&& description.getAttribute("innerText").contains(findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue('Description', 1))
//		){
//			KeywordUtil.markPassed("VERIFIED: Group ${groupName.getAttribute("innerText")} created.")
//			errorFound = false
//			break;
//		}else{
//			errorFound=true
//		}
//	}
//	
//	//Click on the Link Group if created
//	'Click Group Link'
//	(errorFound) ?  KeywordUtil.markFailedAndStop("FAILED: Group not created."):driver.findElement(By.xpath("//a[contains(text(),'${findTestData('CDDS/Edge_Module_TestData/DocM_ManageGroupMembers/Data').getValue('GroupName', 1)}')]")).click()
//	
//}catch(Exception e){
//	KeywordUtil.markFailedAndStop("FAILED: Group ${findTestData('CDDS/Edge_Module_TestData/Edge_UserBUPropertiesSettings/Data').getValue('GroupName', 1)} does not created.")
//}
//
//'Switch to content frame'
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/Content_Iframe_Obj'), 30)
//WebUI.switchToFrame(findTestObject('CDDS/Generic_Objects/Frames_Objects/DetailsDisplay_Iframe_Obj'), 30)
//
//'Wait for Actions button element to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/Generic_Objects/Common_Objects/Actions_Btn_Obj'), 10)
//
//'Click on  Actions button'
//WebUI.click(findTestObject('CDDS/Generic_Objects/Common_Objects/Actions_Btn_Obj'), FailureHandling.STOP_ON_FAILURE)
//
//'Wait for Add Members button to be visible'
//WebUI.waitForElementVisible(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/AddMembers_Obj'), 10)
//
//'Click on Add Members button '
//WebUI.click(findTestObject('CDDS/Edge_Module_Objects/DocM_ManageGroupMembers/AddMembers_Obj'), FailureHandling.STOP_ON_FAILURE)
//
//'Switch to Company Search window'
//WebUI.switchToWindowIndex(1)
//WebUI.maximizeWindow()
//WebUI.delay(3)










