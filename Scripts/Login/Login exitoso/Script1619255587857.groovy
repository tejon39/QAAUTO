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

WebUI.navigateToUrl('https://www.mitele.es/')

WebUI.click(findTestObject('Object Repository/Iniciar sesion/span_Aceptar'))

WebUI.click(findTestObject('Object Repository/Iniciar sesion/button_Hazte PLUS_header__userCircle_icon-q_be0f2f'))

WebUI.setText(findTestObject('Iniciar sesion/Email'), Email)

WebUI.setText(findTestObject('Iniciar sesion/Password'), Password)

WebUI.click(findTestObject('Iniciar sesion/Entrar'))

WebUI.click(findTestObject('Iniciar sesion/button_Hazte PLUS_header__userCircle_icon-q_be0f2f'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Mis contenidos'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Control parental'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Mis suscripciones'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Mis alquileres'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Ayuda'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Cerrar sesin'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/h3_Mi perfil'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Icono_mi_perfil'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Icono_mis_alquileres'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Icono_mis_contenidos'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Icono_mis_suscripciones'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Icono_controlparental'))

WebUI.click(findTestObject('Iniciar sesion/span_Cerrar sesin'))

