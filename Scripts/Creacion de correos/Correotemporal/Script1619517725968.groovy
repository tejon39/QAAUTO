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

int i = 0

WebUI.openBrowser('')

WebUI.navigateToUrl('https://correotemporal.org/')

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/a_Crear un email temporal'))

WebUI.selectOptionByIndex(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/select_bylup.comfuluj.comhexud.comdeypo.comcikuh.comklepf.comjuzab.comludxc.comxedmi.compudxe.commecip.net'), 
    '0', FailureHandling.OPTIONAL)

WebUI.check(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/input_Generar email temporal_ne_ne'))

String email = WebUI.getText(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/input_Generar email temporal_ne_ne'))

WebUI.click(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/button_Crear email'))

WebUI.waitForElementClickable(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_Tu email temporal_input-group-text ico_2aa8f7'), 
    3)

WebUI.click(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_Tu email temporal_input-group-text ico_2aa8f7'))

WebUI.setText(findTestObject('Object Repository/Page_Correo temporal - Email temporal - Env_96b3ac/input_Contrasea_email-password'), 
    '123456')

WebUI.waitForElementClickable(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_Contrasea_update-password-btn'), 
    3)

WebUI.click(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_Contrasea_update-password-btn'))

WebUI.waitForElementClickable(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_'), 3)

WebUI.click(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/span_'))

WebUI.waitForElementClickable(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/a_Enviar un mensaje annimo'), 
    3)

WebUI.click(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/a_Enviar un mensaje annimo'))

email = WebUI.getText(findTestObject('Page_Correo temporal - Email temporal - Env_96b3ac/input_Responder a_send_reply_to'))

CustomKeywords.'mypack.WriteExcel.GuardarEmail'(email)

WebUI.closeBrowser()

