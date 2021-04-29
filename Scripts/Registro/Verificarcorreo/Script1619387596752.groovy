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

WebUI.navigateToUrl('https://www.msn.com/es-es/?redirfallthru=https%3a%2f%2fwww.msn.es%2f%3f')

WebUI.click(findTestObject('Object Repository/Registro_mitele/button_Acepto'))

WebUI.click(findTestObject('Object Repository/Registro_mitele/span_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/Registro_mitele/input_Iniciar sesin_loginfmt'), Email)

WebUI.click(findTestObject('Object Repository/Registro_mitele/input_Cree una._idSIButton9'))

WebUI.setText(findTestObject('Object Repository/Registro_mitele/input_Escribir contrasea_passwd'), Password)

WebUI.click(findTestObject('Object Repository/Registro_mitele/input_Cree una._idSIButton9'))

WebUI.click(findTestObject('Object Repository/Registro_mitele/h3_Outlook.com'))

WebUI.switchToWindowTitle('Correo: alejandro canosa - Outlook')

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/div_Confirma tu alta de usuario en Mediaset Espaa'))

WebUI.click(findTestObject('Object Repository/Registro_mitele/a_pincha aqu'))

WebUI.switchToWindowTitle('Series, Películas y Programas TV a la carta, online - Mitele')

WebUI.click(findTestObject('Object Repository/Registro_mitele/span_Aceptar'))

