/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import proyek.organize.Catalog;
import proyek.organize.Products;

/**
 *
 * @author Reyhan
 */
public class OrganizeItemsPanel extends javax.swing.JPanel {

    private static final String FILE_PRODUCTS = "src\\proyek\\notes\\products.xlsx";
    private static final String FILE_LOG = "src\\proyek\\notes\\log.xlsx";
    private PopUpAddNewItem popUpAdd = new PopUpAddNewItem();
    private PopUpOIPanel popUpEdit = new PopUpOIPanel();
    private Catalog catalogProducts = new Catalog();
    private Products lastItem;
    private char choice;
    private int lastIndeks;

    /**
     * Creates new form OTPanel
     */
    public OrganizeItemsPanel() {
        initComponents();
//        lastIndeks = catalogProducts.size();
    }

    @SuppressWarnings("null")
    public void ShowProducts() {
        DefaultTableModel tableProducts = new DefaultTableModel(0, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableItemLists.setAutoCreateRowSorter(true);
        Object[] headerTable = {"Code", "Name", "Category", "Sale Price (Rp)", "Stock", "Buy Price (Rp)"};
        tableProducts.setColumnIdentifiers(headerTable);

        for (int indeksList = 0; indeksList < catalogProducts.getProducts().size(); indeksList++) {
            Object[] products = new Object[]{
                catalogProducts.getProducts().get(indeksList).getProductCode(),
                catalogProducts.getProducts().get(indeksList).getProductName(),
                catalogProducts.getProducts().get(indeksList).getProductCategory(),
                catalogProducts.getProducts().get(indeksList).getSalePrice(),
                catalogProducts.getProducts().get(indeksList).getProductStock(),
                catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
            };
            tableProducts.addRow(products);
        }
        jLabelTotal.setText(String.valueOf(catalogProducts.getProducts().size()));
        jTableItemLists.setModel(tableProducts);
    }

    private void AddItemInTable(Products newProducts) {
        Object[] newRow = new Object[]{
            newProducts.getProductCode(),
            newProducts.getProductName(),
            newProducts.getProductCategory(),
            newProducts.getSalePrice(),
            newProducts.getProductStock(),
            newProducts.getBuyItemPrice()
        };
        DefaultTableModel tableProducts = (DefaultTableModel) jTableItemLists.getModel();
        tableProducts.addRow(newRow);
        TableRowSorter<DefaultTableModel> tableSearch = new TableRowSorter<>(tableProducts);
        jTableItemLists.setRowSorter(tableSearch);
    }

    public void SearchProducts(String textToSearch) {
        DefaultTableModel tableProducts = new DefaultTableModel(0, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        int count = 0;
        jTableItemLists.setAutoCreateRowSorter(true);
        Object[] headerTable = {"Code", "Name", "Category", "Sale Price (Rp)", "Stock", "Buy Price (Rp)"};
        tableProducts.setColumnIdentifiers(headerTable);

        for (int indeksList = 0; indeksList < catalogProducts.getProducts().size(); indeksList++) {
            if (catalogProducts.getProducts().get(indeksList).getProductName().contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            } else if (catalogProducts.getProducts().get(indeksList).getProductCode().contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            } else if (catalogProducts.getProducts().get(indeksList).getProductCategory().contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            } else if (String.valueOf(catalogProducts.getProducts().get(indeksList).getProductStock()).contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            } else if (String.valueOf(catalogProducts.getProducts().get(indeksList).getSalePrice()).contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            } else if (String.valueOf(catalogProducts.getProducts().get(indeksList).getBuyItemPrice()).contains(textToSearch)) {
                Object[] products = new Object[]{
                    catalogProducts.getProducts().get(indeksList).getProductCode(),
                    catalogProducts.getProducts().get(indeksList).getProductName(),
                    catalogProducts.getProducts().get(indeksList).getProductCategory(),
                    catalogProducts.getProducts().get(indeksList).getSalePrice(),
                    catalogProducts.getProducts().get(indeksList).getProductStock(),
                    catalogProducts.getProducts().get(indeksList).getBuyItemPrice()
                };
                tableProducts.addRow(products);
                count++;
            }
        }
        jLabelTotal.setText(String.valueOf(count));
        jTableItemLists.setModel(tableProducts);
    }

    public int SearchProducts(Products newProduct) {
        int indeks = 0;
        while (indeks < catalogProducts.getProducts().size()) {
            if (catalogProducts.getProducts().get(indeks).getProductCode().equals(newProduct.getProductCode())) {
                return indeks;
            } else if (catalogProducts.getProducts().get(indeks).getProductName().equals(newProduct.getProductName())) {
                return indeks;
            }
            indeks++;
        }
        return -1;
    }

    private boolean FoundInCatalog(Products newProduct) {
        int last = jTableItemLists.getRowCount();
        int row = 0;
        int lastStock = 0;
        while (row != last) {
            if (((String) jTableItemLists.getValueAt(row, 0)) == (newProduct.getProductCode()) || (((String) jTableItemLists.getValueAt(row, 1)) == (newProduct.getProductName()))) {
                return true;
            }
            row++;
        }
        return false;
    }

    public void writeExcel() {
        try {
            FileInputStream fileProducts = new FileInputStream(new File(FILE_LOG));
            XSSFWorkbook workbook = new XSSFWorkbook(fileProducts);
            XSSFSheet sheet = workbook.getSheetAt(1);
            int row = sheet.getLastRowNum() + 1;
            String text = "Last Deleted";;

            sheet.createRow(row).createCell(0).setCellValue((String) getLastItem().getProductCode());
            sheet.getRow(row).createCell(1).setCellValue((String) getLastItem().getProductName());
            sheet.getRow(row).createCell(2).setCellValue((String) getLastItem().getProductCategory());
            sheet.getRow(row).createCell(3).setCellValue((int) getLastItem().getSalePrice());
            sheet.getRow(row).createCell(4).setCellValue((int) getLastItem().getProductStock());
            sheet.getRow(row).createCell(5).setCellValue((int) getLastItem().getBuyItemPrice());
            sheet.getRow(row).createCell(6).setCellValue((String) text);

            try (FileOutputStream updatefileProducts = new FileOutputStream(new File(FILE_LOG))) {
                workbook.write(updatefileProducts);
                updatefileProducts.close();
            }
            fileProducts.close();
        } catch (IOException ex) {
            Logger.getLogger(TransactionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeProducts() {
        try {
            FileInputStream fis = new FileInputStream(new File(FILE_PRODUCTS));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow removingRow = null;
            int lastRow = sheet.getLastRowNum();
            int row = 0;

            for (int indeks = 0; indeks < lastRow; indeks++) {
                row++;
                if (indeks < catalogProducts.size()) {
                    sheet.createRow(row).createCell(0).setCellValue((String) catalogProducts.getProducts().get(indeks).getProductCode());
                    sheet.getRow(row).createCell(1).setCellValue((String) catalogProducts.getProducts().get(indeks).getProductName());
                    sheet.getRow(row).createCell(2).setCellValue((String) catalogProducts.getProducts().get(indeks).getProductCategory());
                    sheet.getRow(row).createCell(3).setCellValue((int) catalogProducts.getProducts().get(indeks).getSalePrice());
                    sheet.getRow(row).createCell(4).setCellValue((int) catalogProducts.getProducts().get(indeks).getProductStock());
                    sheet.getRow(row).createCell(5).setCellValue((int) catalogProducts.getProducts().get(indeks).getBuyItemPrice());
                } else {
                    removingRow = sheet.getRow(row);
                    sheet.removeRow(removingRow);
                }
            }
            try (FileOutputStream fos = new FileOutputStream(new File(FILE_PRODUCTS))) {
                workbook.write(fos);
                fos.close();
            }
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(TransactionPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPaneOI = new javax.swing.JScrollPane();
        jTableItemLists = new javax.swing.JTable();
        jLabelItemList = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAddNewItem = new javax.swing.JButton();
        jLabelTotalProduct = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(676, 0));

        jTableItemLists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Category", "SalePrice", "Stock", "BuyPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableItemLists.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableItemLists.setInheritsPopupMenu(true);
        jTableItemLists.setName(""); // NOI18N
        jScrollPaneOI.setViewportView(jTableItemLists);

        jLabelItemList.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelItemList.setText("Item Lists");

        jLabelSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelSearch.setText("Search");

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jButtonAdd.setText("Add / Edit");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonAddNewItem.setText("Add New Item");
        jButtonAddNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewItemActionPerformed(evt);
            }
        });

        jLabelTotalProduct.setText("Total Product : ");

        jLabelTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneOI)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelItemList)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSearch)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 482, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTotalProduct)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelItemList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelSearch)
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButtonAddNewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTotalProduct)
                        .addComponent(jLabelTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneOI, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
        String textToSearch = jTextFieldSearch.getText();
        SearchProducts(textToSearch.toUpperCase());
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    @SuppressWarnings("UnnecessaryContinue")
    private void jButtonAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewItemActionPerformed
        // TODO add your handling code here:
        java.awt.Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);
        try {
            popUpAdd.setPopUp(catalogProducts, jTableItemLists);
            popUpAdd.setVisible(true);
            popUpAdd.pack();
            popUpAdd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            char added = '3';
            setChoice(added);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Add New Failed !!");
        }
    }//GEN-LAST:event_jButtonAddNewItemActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:

        Products lastDelete = new Products();
        int indeksInTable = jTableItemLists.getSelectedRow();
        DefaultTableModel tableProducts = (DefaultTableModel) jTableItemLists.getModel();
        lastDelete.setProductCode((String) jTableItemLists.getValueAt(indeksInTable, 0));
        lastDelete.setProductName((String) jTableItemLists.getValueAt(indeksInTable, 1));
        lastDelete.setProductCategory((String) jTableItemLists.getValueAt(indeksInTable, 2));
        lastDelete.setSalePrice(new Integer(String.valueOf(jTableItemLists.getValueAt(indeksInTable, 3))));
        lastDelete.setProductStock(new Integer(String.valueOf(jTableItemLists.getValueAt(indeksInTable, 4))));
        lastDelete.setBuyItemPrice(new Integer(String.valueOf(jTableItemLists.getValueAt(indeksInTable, 5))));
        int option = JOptionPane.showConfirmDialog(null, "Are you sure want to delete " + lastDelete.getProductName() + "?", "Delete", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            int indeks = 0;
            boolean found = false;
            while (indeks < catalogProducts.getProducts().size() && !found) {
                if (catalogProducts.getProducts().get(indeks).getProductName().equals(lastDelete.getProductName())) {
                    found = true;
                } else {
                    indeks++;
                }
            }
            lastItem = lastDelete;
            catalogProducts.getProducts().remove(indeks);
            setCatalogProducts(catalogProducts);
            char deleted = '2';
            setChoice(deleted);
            try {
                writeExcel();
                writeProducts();
                JOptionPane.showMessageDialog(null, "Save Success !!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Save Failed !!");
            }
            ShowProducts();
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        try {
            popUpEdit = new PopUpOIPanel();
            int indeksInTable = jTableItemLists.getSelectedRow();
            Object codeProduct = jTableItemLists.getValueAt(indeksInTable, 0);
            Object nameProduct = jTableItemLists.getValueAt(indeksInTable, 1);
            Object categoryProduct = jTableItemLists.getValueAt(indeksInTable, 2);
            String salePriceProduct = String.valueOf(jTableItemLists.getValueAt(indeksInTable, 3));
            String stockProduct = String.valueOf(jTableItemLists.getValueAt(indeksInTable, 4));
            String buyPriceProduct = String.valueOf(jTableItemLists.getValueAt(indeksInTable, 5));

            popUpEdit.setVisible(true);
            popUpEdit.pack();
            popUpEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            popUpEdit.jLabelTextCode.setText((String) codeProduct);
            popUpEdit.jLabelTextName.setText((String) nameProduct);
            popUpEdit.jLabelTextCategory.setText((String) categoryProduct);
            popUpEdit.jTextFieldSalePrice.setText(salePriceProduct);
            popUpEdit.jTextFieldStock.setText(stockProduct);
            popUpEdit.jTextFieldBuyPrice.setText(buyPriceProduct);
            popUpEdit.setEdit(jTableItemLists, indeksInTable, catalogProducts);
            jTableItemLists = popUpEdit.getTableList();
            char added = '1';
            setChoice(added);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Select Row !!");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddNewItem;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabelItemList;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelTotalProduct;
    private javax.swing.JScrollPane jScrollPaneOI;
    public javax.swing.JTable jTableItemLists;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the catalogProducts
     */
    public Catalog getCatalogProducts() {
        return catalogProducts;
    }

    /**
     * @param catalogProducts the catalogProducts to set
     */
    public void setCatalogProducts(Catalog catalogProducts) {
        this.catalogProducts = catalogProducts;
    }

    /**
     * @return the choice
     */
    public char getChoice() {
        return choice;
    }

    /**
     * @param choice the choice to set
     */
    public void setChoice(char choice) {
        this.choice = choice;
    }

    /**
     * @return the popUpAdd
     */
    public PopUpAddNewItem getPopUpAdd() {
        return popUpAdd;
    }

    /**
     * @param popUpAdd the popUpAdd to set
     */
    public void setPopUpAdd(PopUpAddNewItem popUpAdd) {
        this.popUpAdd = popUpAdd;
    }

    /**
     * @return the popUpEdit
     */
    public PopUpOIPanel getPopUpEdit() {
        return popUpEdit;
    }

    /**
     * @param popUpEdit the popUpEdit to set
     */
    public void setPopUpEdit(PopUpOIPanel popUpEdit) {
        this.popUpEdit = popUpEdit;
    }

    /**
     * @return the lastItem
     */
    public Products getLastItem() {
        return lastItem;
    }
}
