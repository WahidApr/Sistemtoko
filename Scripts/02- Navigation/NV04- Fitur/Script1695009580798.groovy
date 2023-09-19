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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/button_No, Thx'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Toggle navigation_navbar-brand'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Fitur'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_1. Website'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Web Toko Online'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Web Toko Online                        _9fac21'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Fitur'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_2. Sistem Informasi'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/h2_Sistem Informasi Berbasis Website'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Fitur'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_3. ChatBot'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Chat Bot.Beta                          _40ff7e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Chat Bot.Beta'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Fitur'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_4. Android store'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Android.Beta'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Fitur'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_5. Aplikasi Kasir'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Kasir Offline.Beta'))

WebUI.closeBrowser()

