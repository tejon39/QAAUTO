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

WebUI.navigateToUrl('https://correotemporal.org/')

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/a_Recuperar un email temporal'))

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/input_Recuperar email temporal_ne_ne'))

WebUI.setText(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/input_Recuperar email temporal_ne_ne'), 
    EmailTemporal)

//randal57e_x871m
WebUI.setText(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/input__form-control d-inline-block text-cen_f47296'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/button_Recuperar email'))

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/button_Abrir'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/h5_Confirma tu alta de usuario en Mediaset Espaa'))

WebUI.switchToWindowTitle('Correo temporal - Email temporal - Enviar email anónimo')

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/a_pincha aqu'))

WebUI.switchToWindowTitle('Correo temporal - Email temporal - Enviar email anónimo')

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/span_'))

