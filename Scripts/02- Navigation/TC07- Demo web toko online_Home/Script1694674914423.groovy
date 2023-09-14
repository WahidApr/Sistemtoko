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

WebUI.navigateToUrl('https://sistemtoko.com/')

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/button_No, Thx'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/h1_Kami Men-Digitalisasi Usaha Anda dengan _d3b857'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Daftar GRATIS Sekarang_col-md-12 text-center'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Aplikasi untuk merapikan  memudahkan pe_b3c50b'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Aplikasi untuk merapikan  memudahkan pe_c9075e'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Dapat digunakan untuk berbagai jenis usaha'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/div_Web Toko Online                        _9fac21'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/html_sistemtoko.com, Aplikasi Termudah untu_fe0015'))

WebUI.click(findTestObject('Object Repository/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/a_Demo  Klik'))

WebUI.switchToWindowTitle('Home - demo.sistemtoko.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Home - demo.sistemtoko.com/div_Sample sistemtoko.com                  _55f46f'))

WebUI.closeBrowser()

