package com.cybertek.tests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {
    private Object FileInputStream;

    /**in this method we will learn how to read from excel file step by step */
    @Test
    public void read_from_excel_file() throws IOException, InvalidFormatException {
String path= "SampleData.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        //how to create a workbook
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
        //we need to get that specific sheet from currently opened workbook
        XSSFSheet sheet= workbook.getSheet("Employees");
        //select row and cell
        //print out steven's cell and index starts at 0
        System.out.println("first cell "+sheet.getRow(1).getCell(0));
        //return the count of used cells only if there are cells not used, they will not be counted
        //it starts counting from 1
        int usedRows= sheet.getPhysicalNumberOfRows();

        //returns the number from top cell to bottom cell
        //TODO 1. crate a logic to print eyerus's name dynamically
        for (int rowNum= 0; rowNum < usedRows ;rowNum++){
           if(sheet.getRow(rowNum).getCell(0).toString().equals("eyerus")){
               System.out.println("SDT name = "+sheet.getRow(rowNum).getCell(0));
           }
        }
        //TODO create a logic to print steven kinds job id

        for (int rowNum= 0; rowNum<usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Steven")){
                System.out.println("steven's job_id ="+sheet.getRow(rowNum).getCell(2));
            }
        }

    }
}
