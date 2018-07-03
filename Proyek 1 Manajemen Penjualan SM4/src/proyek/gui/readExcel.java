/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.EncryptedDocumentException;

/**
 *
 * @author M. Dena Adryan
 */
public class readExcel {

    LinkedHashMap<String, Integer> datamap = new LinkedHashMap<String, Integer>();
    List<data> daftar = new ArrayList<>();

    /**
     * @return the dataset
     */
    /**
     * @param range
     * @param category
     * @throws java.io.IOException
     */
    
    public void getData(String range, String category) throws IOException {
        //readExcel r = new readExcel();
        String LOG_FILE = "logtest.xlsx";

        data data = new data();
        int valueTemp;

        try {
            DataFormatter dataFormatter = new DataFormatter();
            Workbook workbook = WorkbookFactory.create(new File(LOG_FILE));
            Sheet sheet = workbook.getSheetAt(0);
            int row = sheet.getLastRowNum();
            int cat;
            if (category == "Most wanted categories") {
                cat = 4;
            } else {
                cat = 3;
            }
            Iterator<Row> rowIterator = sheet.rowIterator();
            Date today = new Date();
            Cell cell;
            int thisDay = today.getDate();
            int thisMonth = today.getMonth();
            int thisYear = today.getYear();
            this.datamap.clear();
            while (rowIterator.hasNext()) {
                Row rowI = rowIterator.next();
                cell = rowI.getCell(0);
                Date date = cell.getDateCellValue();
                int cellDate = date.getDate();
                int cellMonth = date.getMonth();
                int cellYear = date.getYear();
                Cell cellValue;

                if (range == "Today" && thisDay == cellDate && thisMonth == cellMonth) {
                    cellValue = rowI.getCell(cat);
                    String title = cellValue.getStringCellValue();
                    data.setTitle(title);
                    cellValue = rowI.getCell(5);
                    data.setInfo((int) cellValue.getNumericCellValue());

                    if (this.datamap.containsKey(title)) {
                        valueTemp = this.datamap.get(title);
                        valueTemp = valueTemp + data.getInfo();
                        this.datamap.put(title, valueTemp);
                    } else {
                        this.datamap.put(title, data.getInfo());
                    }
                } else if (range == "This Month" && thisMonth == cellMonth) {
                    cellValue = rowI.getCell(cat);
                    String title = cellValue.getStringCellValue();
                    data.setTitle(title);
                    cellValue = rowI.getCell(5);
                    data.setInfo((int) cellValue.getNumericCellValue());

                    if (this.datamap.containsKey(title)) {
                        valueTemp = this.datamap.get(title);
                        valueTemp = valueTemp + data.getInfo();
                        this.datamap.put(title, valueTemp);
                    } else {
                        this.datamap.put(title, data.getInfo());
                    }

                } else if (range == "This Year" && thisYear == cellYear) {
                    cellValue = rowI.getCell(cat);
                    String title = cellValue.getStringCellValue();
                    data.setTitle(title);
                    cellValue = rowI.getCell(5);
                    data.setInfo((int) cellValue.getNumericCellValue());

                    if (this.datamap.containsKey(title)) {
                        valueTemp = this.datamap.get(title);
                        valueTemp = valueTemp + data.getInfo();
                        this.datamap.put(title, valueTemp);
                    } else {
                        this.datamap.put(title, data.getInfo());
                    }
                }
            }

        } catch (InvalidFormatException | EncryptedDocumentException ex) {
            Logger.getLogger(readExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortAndPutToList(HashMap<String, Integer> passedMap) {
        List<String> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.reverse(mapValues);
        Collections.sort(mapKeys);
        Collections.reverse(mapKeys);

        Iterator<Integer> valueIt = mapValues.iterator();
        Integer idx = 0;
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<String> keyIt = mapKeys.iterator();

            while (keyIt.hasNext() && idx < 10) {
                String key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    data e = new data();
                    keyIt.remove();
                    e.setTitle(key);
                    e.setInfo(val);

                    this.daftar.add(idx, e);
                    idx = idx + 1;
                    break;
                }
            }
        }
    }

    public void getDataRevenue() throws IOException {
        String LOG_FILE = "logtest.xlsx";

        data data = new data();
        int valueTemp;

        try {
            Workbook workbook = WorkbookFactory.create(new File(LOG_FILE));
            Sheet sheet = workbook.getSheetAt(0);
            int row = sheet.getLastRowNum();

            Iterator<Row> rowIterator = sheet.rowIterator();
            Date today = new Date();
            Cell cell;

            int thisMonth = today.getMonth();
            int thisYear = today.getYear();
            this.datamap.clear();
            while (rowIterator.hasNext()) {
                Row rowI = rowIterator.next();
                cell = rowI.getCell(0);
                Date date = cell.getDateCellValue();
                int cellMonth = date.getMonth();
                int cellYear = date.getYear();
                if (cellYear == thisYear) {
                    String title = "" + cellMonth + 1;
                    Cell cellValue = rowI.getCell(6);
                    data.setInfo((int) cellValue.getNumericCellValue());

                    if (this.datamap.containsKey(title)) {
                        valueTemp = this.datamap.get(title);
                        valueTemp = valueTemp + data.getInfo();
                        this.datamap.put(title, valueTemp);
                    } else {
                        this.datamap.put(title, data.getInfo());
                    }
                }
            }

        } catch (InvalidFormatException | EncryptedDocumentException ex) {
            Logger.getLogger(readExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the datamap
     */
    public HashMap<String, Integer> getDatamap() {
        return datamap;
    }

    /**
     * @param datamap the datamap to set
     */
    public void setDatamap(LinkedHashMap<String, Integer> datamap) {
        this.datamap = datamap;
    }

}
