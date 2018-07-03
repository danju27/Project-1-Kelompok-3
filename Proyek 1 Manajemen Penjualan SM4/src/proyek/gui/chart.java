/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author M. Dena Adryan
 */
public class chart {

    private static String range;
    private static String category;

    /**
     *
     * @return
     */
    public static JPanel createChartPanel() {
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();

        readExcel r = new readExcel();

        try {
            r.getData(range, category);
        } catch (IOException ex) {
            Logger.getLogger(chart.class.getName()).log(Level.SEVERE, null, ex);
        }

        r.sortAndPutToList(r.datamap);

        for (int i = 0; i < r.daftar.size(); i++) {
            barDataset.setValue(r.daftar.get(i).getInfo(), "Sold", r.daftar.get(i).getTitle());
        }
        JFreeChart chart = ChartFactory.createBarChart3D(category, "Product", "Quantity", barDataset);
        return new ChartPanel(chart);
    }

    public static ChartPanel createRevenueChartPanel() {
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();

        readExcel r = new readExcel();

        try {
            r.getDataRevenue();
        } catch (IOException ex) {
            Logger.getLogger(chart.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 12; i++) {
            String month = "";
            if (r.datamap.containsKey("" + i + 1)) {
                switch (i) {
                    case 0:
                        month = "January";
                        break;
                    case 1:
                        month = "February";
                        break;
                    case 2:
                        month = "March";
                        break;
                    case 3:
                        month = "April";
                        break;
                    case 4:
                        month = "May";
                        break;
                    case 5:
                        month = "June";
                        break;
                    case 6:
                        month = "July";
                        break;
                    case 7:
                        month = "August";
                        break;
                    case 8:
                        month = "September";
                        break;
                    case 9:
                        month = "October";
                        break;
                    case 10:
                        month = "November";
                        break;
                    case 11:
                        month = "Desember";
                        break;
                }
                barDataset.setValue(r.datamap.get("" + i + 1), "Revenue", month);
            }
        }
        JFreeChart chart = ChartFactory.createLineChart3D("Monthly Revenue", "Month", "Income", barDataset);

        return new ChartPanel(chart);

    }

    /**
     * @return the range
     */
    public String getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * @return the category
     */
    public static String getCategory() {
        return category;
    }

    /**
     * @param aCategory the category to set
     */
    public static void setCategory(String aCategory) {
        category = aCategory;
    }

}
