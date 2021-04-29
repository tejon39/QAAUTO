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

WebUI.navigateToUrl('https://outlook.live.com/owa/')

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/span_Crear cuenta gratuita'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Crear cuenta_MemberName'))

WebUI.setText(findTestObject('Object Repository/Creacioncorremicrosoft/input_Crear cuenta_MemberName'), Usuario)

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Crear cuenta_iSignupAction'))

WebUI.setText(findTestObject('Creacioncorremicrosoft/input_La tecla Bloq Mays est habilitada._Password'), Password)

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Declaracin de privacidad y cookies._i_f5c944'))

WebUI.setText(findTestObject('Object Repository/Creacioncorremicrosoft/input_Necesitamos un poco ms de informacin _f6a544'), 
    Nombre)

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Necesitamos un poco ms de informacin _45949e'))

WebUI.setText(findTestObject('Object Repository/Creacioncorremicrosoft/input_Esta informacin es obligatoria._LastName'), 
    Apellidos)

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Necesitamos un poco ms de informacin _45949e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Creacioncorremicrosoft/select_AfganistnAlbaniaAlemaniaAndorraAngol_c86fc3'), 
    'España', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Creacioncorremicrosoft/select_Da1234567891011121314151617181920212_ca72f8'), 
    Mes, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Creacioncorremicrosoft/select_Mesenerofebreromarzoabrilmayojunioju_f52a1c'), 
    Mes, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Creacioncorremicrosoft/select_Da1234567891011121314151617181920212_ca72f8_1'), 
    Dia, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Creacioncorremicrosoft/select_Mesenerofebreromarzoabrilmayojunioju_f52a1c_1'), 
    Mes, true)

WebUI.setText(findTestObject('Object Repository/Creacioncorremicrosoft/input_La fecha de nacimiento indicada no es_41edb4'), 
    Ano)

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/input_Fecha de nacimiento_iSignupAction'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/canvas_Loading'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/span_De acuerdo y continuar con el sitio'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/img'))

WebUI.click(findTestObject('Object Repository/Creacioncorremicrosoft/a_Cerrar sesin'))

