/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import proyek.organize.Products;

class lastTransPopUp extends JFrame implements ActionListener {
    private JTable table;
    private DefaultTableModel dtm;
    private JPopupMenu popupMenu;
    private JMenuItem menuItemAdd;
    private JMenuItem menuItemRemove;
    private JMenuItem menuItemRemoveAll;
    private static final String FILE_LASTLOG = "src\\proyek\\notes\\lastlog.xlsx";
    
    public lastTransPopUp(){
        super("Last transaksi");
        String[] columnNames = new String[] {"Code", "Name", "Category", "Quantity", "Price"};
        dtm = new DefaultTableModel(0, 0);
        dtm.setColumnIdentifiers(columnNames);
        table = new JTable(dtm);
        
        try {
            FileInputStream fis = new FileInputStream(new File(FILE_LASTLOG));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator < Row >  rowIterator = sheet.iterator();
            XSSFRow row = (XSSFRow)rowIterator.next();
            table.setModel(dtm);
            Object[] data = new Object[6];
            DataFormatter formatter = new DataFormatter();
            
            int tes = 0;
            int last = sheet.getLastRowNum();

            String curDate = sheet.getRow(last).getCell(0).getStringCellValue();
            String curTime = sheet.getRow(last).getCell(0).getStringCellValue();

            while(rowIterator.hasNext()) {
                row = (XSSFRow) rowIterator.next();
                for (int i = 0 ; i < 5 ; i++) {
                    data[i] = formatter.formatCellValue(row.getCell(i));
                }
                dtm.addRow(data);
            }
        }
        catch (IOException ex) {
        }
        add(new JScrollPane(table));
        setSize(640, 150);
        setLocationRelativeTo(null);
         
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JMenuItem menu = (JMenuItem) event.getSource();
    }
}

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

    public void setLastLogText() {
        try {
            FileInputStream fis = new FileInputStream(new File("src\\proyek\\notes\\lastlog.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            String tgl = sheet.getRow(0).getCell(0).getStringCellValue();
            String ttime = sheet.getRow(0).getCell(1).getStringCellValue();
            String txt = tgl + ", " + ttime;
            jButtonShowPopUpTable.setText(txt);
        }
        catch (IOException ex) {
        }
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
        jButtonShowPopUpTable = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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
        jPanelDashStatistics = chart.createRevenueChartPanel();
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setText("Last Transaction");

        jButtonShowPopUpTable.setText("click to see details..");
        jButtonShowPopUpTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPopUpTableActionPerformed(evt);
            }
        });

        jLabel3.setText("Click to see last transaction on");

        javax.swing.GroupLayout jPanelDashTransactionLayout = new javax.swing.GroupLayout(jPanelDashTransaction);
        jPanelDashTransaction.setLayout(jPanelDashTransactionLayout);
        jPanelDashTransactionLayout.setHorizontalGroup(
            jPanelDashTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashTransactionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButtonShowPopUpTable, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDashTransactionLayout.setVerticalGroup(
            jPanelDashTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashTransactionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelDashTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonShowPopUpTable)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanelDashStatisticsLayout = new javax.swing.GroupLayout(jPanelDashStatistics);
        jPanelDashStatistics.setLayout(jPanelDashStatisticsLayout);
        jPanelDashStatisticsLayout.setHorizontalGroup(
            jPanelDashStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        jPanelDashStatisticsLayout.setVerticalGroup(
            jPanelDashStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                        .addComponent(jLabelTextBuyPriceDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDashOTDeleteLayout.createSequentialGroup()
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
                                    .addComponent(jLabelTextStockDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDashOTDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTextBuyPriceDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanelDashTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDashOTAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDashOTDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDashStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowPopUpTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPopUpTableActionPerformed
        new lastTransPopUp().setVisible(true);
    }//GEN-LAST:event_jButtonShowPopUpTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonShowPopUpTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
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
