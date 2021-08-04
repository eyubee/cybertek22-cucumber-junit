package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    @Test
    public void excel_writing_test() throws IOException {
        String path= "SampleData.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        //how to create a workbook
         workbook= new XSSFWorkbook(fileInputStream);
         //get the sheet
        sheet = workbook.getSheet("Employees");
        //king's row
        row = sheet.getRow(1);
        //kings cell
        cell = row.getCell(1);
        //create and store adamsCell
        XSSFCell adamsCell= sheet.getRow(2).getCell(0);
        System.out.println("before: "+adamsCell);
        //this method will override existing cell
        adamsCell.setCellValue("adam");
        System.out.println("after ="+adamsCell);

        //TODO change steven's name to tom
        for (int rowNum= 0; rowNum< sheet.getLastRowNum(); rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
                sheet.getRow(rowNum).getCell(0).setCellValue("Tom");
            }
        }
        //use fileOutputStream to puch changes load the file to fileoutputstream
        FileOutputStream fileOutputStream= new FileOutputStream(path);

        //write to file using fileoutput
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }

}
