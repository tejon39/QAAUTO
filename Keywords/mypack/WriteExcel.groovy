package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	private static final Logger LOGGER = Logger.getLogger("mx.com.hash.newexcel.ExcelOOXML");
	
	@Keyword
	public void GuardarEmail(String email) throws IOException {

		String archivo = "E:\\EmailsTemporales.xlsx"
		FileInputStream fis = new FileInputStream(archivo)
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet hoja = workbook.getSheet("Hoja 1")
		int rowCount = hoja.getLastRowNum()-hoja.getFirstRowNum()
		Row fila = hoja.createRow(rowCount+1)
	    Cell celda = fila.createCell(0)
		celda.setCellValue(email)
		
		try {
		
			FileOutputStream salida = new FileOutputStream(archivo);
			workbook.write(salida);
			workbook.close();

		} catch (FileNotFoundException ex) {
			LOGGER.log(Level.SEVERE, "Archivo no localizable en sistema de archivos");
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, "Error de entrada/salida");
		}
	}


}
