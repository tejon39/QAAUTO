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
import com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords as WaitForAngularKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mitele.es')

WebUI.click(findTestObject('Home_Mitele/span_Aceptar'))

WebUI.click(findTestObject('Home_Mitele/button_Hazte PLUS_header'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/a'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/a_regstrate'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/div_Conctate'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/a_He olvidado mi contrasea'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/div_Inicia sesin con tu cuenta de                                                                Inicia sesin con tu cuenta de MediasetRecurdameHe olvidado mi contrasea'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/div_Inicia sesin con tu cuenta de_gigya-layout-cell responsive with-divider'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/h2_Inicia sesin con tu cuenta de'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/h2_Inicia sesin con tu cuenta de Mediaset'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Entrar'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Password'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/input_Inicia sesin con tu cuenta de Mediaset_remember'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/Email'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Recurdame'))

WebUI.verifyElementVisible(findTestObject('Iniciar sesion/span_Si no ests registrado en Mediaset,'))

WebUI.closeBrowser()

