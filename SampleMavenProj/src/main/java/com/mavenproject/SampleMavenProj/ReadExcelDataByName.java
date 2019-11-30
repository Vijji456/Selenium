package com.mavenproject.SampleMavenProj;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelDataByName {

	public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("login");
	XSSFRow row=sheet.getRow(0);
	XSSFCell cell=null;
	int columnNum=0;
	for(int i=0;i<row.getLastCellNum();i++) {
		if(row.getCell(i).getStringCellValue().trim().equals("Password"))
		columnNum=i;
		
		
	
	}
	row=sheet.getRow(1);
	cell=row.getCell(columnNum);
	
	String passWord = cell.getStringCellValue();
	System.out.println(passWord);
		
	
	workbook.close();
	fis.close();
	}

}
