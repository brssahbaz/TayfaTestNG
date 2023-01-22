package com.tayfa.excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadExcel {

    @Test

    public void test() throws IOException {
        String dosyaYolu = "C:\\Users\\SHBZ_Win\\IdeaProjects\\TayfaTestNG\\src\\test\\resources\\TestData.xlsx";
        FileInputStream file = new FileInputStream(dosyaYolu);
        Workbook excel = WorkbookFactory.create(file);
        Sheet sheet = excel.getSheetAt(0);
        //Row birinciSatir=sheet.getRow(2);

        List<String> excelData = new ArrayList<String>();
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String isim = row.getCell(0).toString();
            // System.out.println(isim);
            excelData.add(isim);
        }
        System.out.println((excelData));
        excel.close();
        file.close();
    }




}
