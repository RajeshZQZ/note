package com.uiStudy.testPro;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readxlsx {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		File xlsxfile = new File("F:\\UI_test_dev\\test2.xlsx");
		FileInputStream in = new FileInputStream(xlsxfile);
		XSSFWorkbook workbook =new XSSFWorkbook(in);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell c1 = row.getCell(0);
		Cell c2 = row.getCell(1);
		Cell c3 = row.getCell(2);
		System.out.println(c1.getStringCellValue());
		System.out.println((int)c2.getNumericCellValue());
		System.out.println(c3.getStringCellValue());
		
	}

}
