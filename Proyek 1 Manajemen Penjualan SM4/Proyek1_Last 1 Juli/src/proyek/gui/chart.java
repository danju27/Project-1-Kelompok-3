/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author M. Dena Adryan
 */
public class chart {

    public static ChartPanel createChartPanel() {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        java.util.List<data> daftar = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            data e = new data();
            e.setInfo(10);
            e.setTitle("Item " + i);
            daftar.add(i, e);
        }

        for (int i = 0; i < daftar.size(); i++) {
            pieDataset.setValue(daftar.get(i).getTitle(), daftar.get(i).getInfo());
        }
        JFreeChart chart = ChartFactory.createPieChart3D("", pieDataset, true, true, true);
//        chart.setBackgroundPaint(Color.BLUE);
//        chart.setBorderPaint(Color.BLUE);

        return new ChartPanel(chart);
    }

    public static ChartPanel createChartPanelDashboard() {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        java.util.List<data> daftar = new ArrayList<>();

        data e = new data();
        e.setInfo(30);
        e.setTitle("ROKOK" );
        daftar.add(0, e);
        e = new data();
        e.setInfo(25);
        e.setTitle("KONSINYASI" );
        daftar.add(1, e);
        e = new data();
        e = new data();
        e.setInfo(20);
        e.setTitle("AIR MINERAL KEMASAN" );
        daftar.add(2, e);
        e = new data();
        e.setInfo(15);
        e.setTitle("MIE INSTANT" );
        daftar.add(3, e);
        e = new data();
        e.setInfo(10);
        e.setTitle("KACANG" );
        daftar.add(4, e);
       
        

        for (int i = 0; i < daftar.size(); i++) {
            pieDataset.setValue(daftar.get(i).getTitle(), daftar.get(i).getInfo());
        }
        JFreeChart chart = ChartFactory.createPieChart3D("", pieDataset, true, true, true);
//        chart.setBackgroundPaint(Color.BLUE);
//        chart.setBorderPaint(Color.BLUE);

        return new ChartPanel(chart);
    }
}
