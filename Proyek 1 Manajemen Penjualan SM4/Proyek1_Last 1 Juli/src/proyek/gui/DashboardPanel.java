/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import proyek.organize.Products;
import proyek.gui.chart;

/**
 *
 * @author Reyhan
 */
public class DashboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashboardPanel
     */
    private Products lastItemAdded;
    private Products lastItemDeleted;

    public DashboardPanel() {
        initComponents();
    }

    public void setLastItemAdded() {
        try {
            jLabelTextCodeAdd.setText(lastItemAdded.getProductCode());
            jLabelTextNameAdd.setText(lastItemAdded.getProductName());
            jLabelTextCategoryAdd.setText(lastItemAdded.getProductCategory());
            jLabelTextSalePriceAdd.setText(String.valueOf(lastItemAdded.getSalePrice()));
            jLabelTextStockAdd.setText(String.valueOf(lastItemAdded.getProductStock()));
            jLabelTextBuyPriceAdd.setText(String.valueOf(lastItemAdded.getBuyItemPrice()));
        } catch (Exception e) {

        }
    }

    public void setLastItemDeleted() {
        try {
            jLabelTextCodeDelete.setText(lastItemDeleted.getProductCode());
            jLabelTextNameDelete.setText(lastItemDeleted.getProductName());
            jLabelTextCategoryDelete.setText(lastItemDeleted.getProductCategory());
            jLabelTextSalePriceDelete.setText(String.valueOf(lastItemDeleted.getSalePrice()));
            jLabelTextStockDelete.setText(String.valueOf(lastItemDeleted.getProductStock()));
            jLabelTextBuyPriceDelete.setText(String.valueOf(lastItemDeleted.getBuyItemPrice()));
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDashTransaction = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDashOTAdd = new javax.swing.JPanel();
        jLabelCodeAdd = new javax.swing.JLabel();
        jLabelNameAdd = new javax.swing.JLabel();
        jLabelCategoryAdd = new javax.swing.JLabel();
        jLabelSalePriceAdd = new javax.swing.JLabel();
        jLabelStockAdd = new javax.swing.JLabel();
        jLabelBuyPriceAdd = new javax.swing.JLabel();
        jLabelTextCodeAdd = new javax.swing.JLabel();
        jLabelTextNameAdd = new javax.swing.JLabel();
        jLabelTextCategoryAdd = new javax.swing.JLabel();
        jLabelTextSalePriceAdd = new javax.swing.JLabel();
        jLabelTextStockAdd = new javax.swing.JLabel();
        jLabelTextBuyPriceAdd = new javax.swing.JLabel();
        jPanelHeaderAdd = new javax.swing.JPanel();
        jLabelHeaderAdd = new javax.swing.JLabel();
        jPanelDashStatistics = chart.createChartPanelDashboard();
        jLabel2 = new javax.swing.JLabel();
        jPanelDashOTDelete = new javax.swing.JPanel();
        jPanelHeaderDelete = new javax.swing.JPanel();
        jLabelHeaderDelete = new javax.swing.JLabel();
        jLabelCodeDelete = new javax.swing.JLabel();
        jLabelTextCodeDelete = new javax.swing.JLabel();
        jLabelNameDelete = new javax.swing.JLabel();
        jLabelTextNameDelete = new javax.swing.JLabel();
        jLabelCategoryDelete = new javax.swing.JLabel();
        jLabelTextCategoryDelete = new javax.swing.JLabel();
        jLabelSalePriceDelete = new javax.swing.JLabel();
        jLabelTextSalePriceDelete = new javax.swing.JLabel();
        jLabelStockDelete = new javax.swing.JLabel();
        jLabelTextStockDelete = new javax.swing.JLabel();
        jLabelBuyPriceDelete = new javax.swing.JLabel();
        jLabelTextBuyPriceDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(676, 0));

        jPanelDashTransaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setText("Last Transaction");
        jPanelDashTransaction.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanelDashOTAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodeAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCodeAdd.setText("Item Code         :");

        jLabelNameAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameAdd.setText("Item Name       :");

        jLabelCategoryAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCategoryAdd.setText("Item Category :");

        jLabelSalePriceAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSalePriceAdd.setText("Item Sale Price :");

        jLabelStockAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStockAdd.setText("Item Stock         :");

        jLabelBuyPriceAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBuyPriceAdd.setText("Item Buy Price  :");

        jLabelHeaderAdd.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabelHeaderAdd.setText("Last Item Added");

        javax.swing.GroupLayout jPanelHeaderAddLayout = new javax.swing.GroupLayout(jPanelHeaderAdd);
        jPanelHeaderAdd.setLayout(jPanelHeaderAddLayout);
        jPanelHeaderAddLayout.setHorizontalGroup(
            jPanelHeaderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderAddLayout.setVerticalGroup(
            jPanelHeaderAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDashOTAddLayout = new javax.swing.GroupLayout(jPanelDashOTAdd);
        jPanelDashOTAdd.setLayout(jPanelDashOTAddLayout);
        jPanelDashOTAddLayout.setHorizontalGroup(
            jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                        .addComponent(jLabelBuyPriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextBuyPriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                            .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCategoryAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNameAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCodeAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelTextCodeAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTextCategoryAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTextNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDashOTAddLayout.createSequentialGroup()
                            .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelStockAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSalePriceAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTextSalePriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTextStockAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jPanelHeaderAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDashOTAddLayout.setVerticalGroup(
            jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                .addComponent(jPanelHeaderAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextCodeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                        .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                                .addComponent(jLabelNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextCategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSalePriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextSalePriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDashOTAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextStockAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStockAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelTextNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBuyPriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDashOTAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTextBuyPriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setText("Most Wanted Category");

        javax.swing.GroupLayout jPanelDashStatisticsLayout = new javax.swing.GroupLayout(jPanelDashStatistics);
        jPanelDashStatistics.setLayout(jPanelDashStatisticsLayout);
        jPanelDashStatisticsLayout.setHorizontalGroup(
            jPanelDashStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanelDashStatisticsLayout.setVerticalGroup(
            jPanelDashStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDashOTDelete.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHeaderDelete.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabelHeaderDelete.setText("Last Item Deleted");

        javax.swing.GroupLayout jPanelHeaderDeleteLayout = new javax.swing.GroupLayout(jPanelHeaderDelete);
        jPanelHeaderDelete.setLayout(jPanelHeaderDeleteLayout);
        jPanelHeaderDeleteLayout.setHorizontalGroup(
            jPanelHeaderDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderDelete)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanelHeaderDeleteLayout.setVerticalGroup(
            jPanelHeaderDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCodeDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCodeDelete.setText("Item Code         :");

        jLabelNameDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNameDelete.setText("Item Name       :");

        jLabelCategoryDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCategoryDelete.setText("Item Category :");

        jLabelSalePriceDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSalePriceDelete.setText("Item Sale Price :");

        jLabelStockDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStockDelete.setText("Item Stock         :");

        jLabelBuyPriceDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBuyPriceDelete.setText("Item Buy Price  :");

        javax.swing.GroupLayout jPanelDashOTDeleteLayout = new javax.swing.GroupLayout(jPanelDashOTDelete);
        jPanelDashOTDelete.setLayout(jPanelDashOTDeleteLayout);
        jPanelDashOTDeleteLayout.setHorizontalGroup(
            jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeaderDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                        .addComponent(jLabelBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                            .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCategoryDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNameDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCodeDelete))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelTextCodeDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTextCategoryDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTextNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDashOTDeleteLayout.createSequentialGroup()
                            .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelStockDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSalePriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTextSalePriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTextStockDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDashOTDeleteLayout.setVerticalGroup(
            jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                .addComponent(jPanelHeaderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextCodeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                        .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                                .addComponent(jLabelNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSalePriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTextSalePriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextStockDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStockDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelTextNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTextBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDashTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDashOTDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDashOTAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDashStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDashTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDashOTAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDashOTDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelDashStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBuyPriceAdd;
    private javax.swing.JLabel jLabelBuyPriceDelete;
    private javax.swing.JLabel jLabelCategoryAdd;
    private javax.swing.JLabel jLabelCategoryDelete;
    private javax.swing.JLabel jLabelCodeAdd;
    private javax.swing.JLabel jLabelCodeDelete;
    private javax.swing.JLabel jLabelHeaderAdd;
    private javax.swing.JLabel jLabelHeaderDelete;
    private javax.swing.JLabel jLabelNameAdd;
    private javax.swing.JLabel jLabelNameDelete;
    private javax.swing.JLabel jLabelSalePriceAdd;
    private javax.swing.JLabel jLabelSalePriceDelete;
    private javax.swing.JLabel jLabelStockAdd;
    private javax.swing.JLabel jLabelStockDelete;
    public javax.swing.JLabel jLabelTextBuyPriceAdd;
    public javax.swing.JLabel jLabelTextBuyPriceDelete;
    public javax.swing.JLabel jLabelTextCategoryAdd;
    public javax.swing.JLabel jLabelTextCategoryDelete;
    public javax.swing.JLabel jLabelTextCodeAdd;
    public javax.swing.JLabel jLabelTextCodeDelete;
    public javax.swing.JLabel jLabelTextNameAdd;
    public javax.swing.JLabel jLabelTextNameDelete;
    public javax.swing.JLabel jLabelTextSalePriceAdd;
    public javax.swing.JLabel jLabelTextSalePriceDelete;
    public javax.swing.JLabel jLabelTextStockAdd;
    public javax.swing.JLabel jLabelTextStockDelete;
    private javax.swing.JPanel jPanelDashOTAdd;
    private javax.swing.JPanel jPanelDashOTDelete;
    private javax.swing.JPanel jPanelDashStatistics;
    private javax.swing.JPanel jPanelDashTransaction;
    private javax.swing.JPanel jPanelHeaderAdd;
    private javax.swing.JPanel jPanelHeaderDelete;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lastItemAdded
     */
    public Products getLastItemAdded() {
        return lastItemAdded;
    }

    /**
     * @param lastItemAdded the lastItemAdded to set
     */
    public void setLastItemAdded(Products lastItemAdded) {
        this.lastItemAdded = lastItemAdded;
    }

    /**
     * @return the lastItemDeleted
     */
    public Products getLastItemDeleted() {
        return lastItemDeleted;
    }

    /**
     * @param lastItemDeleted the lastItemDeleted to set
     */
    public void setLastItemDeleted(Products lastItemDeleted) {
        this.lastItemDeleted = lastItemDeleted;
    }
}