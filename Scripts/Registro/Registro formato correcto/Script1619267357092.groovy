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

WebUI.click(findTestObject('Object Repository/Registro_mitele/span_Aceptar'))

WebUI.click(findTestObject('Object Repository/Registro_mitele/button_Hazte PLUS_header__userCircle_icon-q_be0f2f'))

WebUI.click(findTestObject('Object Repository/Registro_mitele/a_regstrate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_username'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_email'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_password'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_passwordRetype'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_profile.firstName'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Regstrate en Mediaset_profile.lastName'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/select_SexoHombreMujer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/select_Da1234567891011121314151617181920212_ca72f8'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro_mitele/select_MesEneroFebreroMarzoAbrilMayoJunioJu_5634e8'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/select_Ao2011201020092008200720062005200420_84cf6c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Registro_mitele/input_Aviso Legal_preferences.privacy.polit_35c33d'))

WebUI.verifyElementVisible(findTestObject('Registro_mitele/input_registrarme'))

