package com.mavenproject.SampleMavenProj;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoExcelByIndex {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
		FileOutputStream fos=null;
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("login");
		XSSFRow row=sheet.getRow(4);
		XSSFCell cell1=row.getCell(4);
		
     	XSSFFont font=workbook.createFont();
		XSSFCellStyle style=workbook.createCellStyle();
		
		
		//row=sheet.getRow(4);
		//cell=row.getCell(4);
		
		
		font.setFontName("Aharoni");
		font.setFontHeight(10.8);
		font.setBold(true);
		
		style.setFont(font);
		cell1.setCellStyle(style);
		
		cell1.setCellValue("ViijiLakshmi");
		
		fos=new FileOutputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
		workbook.write(fos);
		System.out.println("Data wrote");
		fos.close();
	}

}
