/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.organize;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author C-70
 */
public class Products {

    private String productName;
    private String productCategory;
    private String productCode;
    private int salePrice;
    private int buyItemPrice;
    private int productStock;

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * @param productCategory the productCategory to set
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCode(String productCategory, Catalog catalog) {
        Map<String, String> listCategory = new HashMap<String, String>();
        for (int indeks = 0; indeks < catalog.size(); indeks++) {
            int iterator = 0;
            String value = "";
            String key = catalog.getProducts().get(indeks).getProductCategory();
            while (iterator < catalog.size()) {
                if (key == catalog.getProducts().get(iterator).getProductCategory()) {
                    String code = catalog.getProducts().get(iterator).getProductCode();
                    value = new String(code.substring(7));
                }
                iterator++;
            }
            listCategory.put(key, value);
        }
        int codeProducts = new Integer((catalog.getProducts().get(catalog.size() - 1).getProductCode()).substring(3, 7)) + 1;
        if (listCategory.containsKey(productCategory)) {
            int codeCategory = (new Integer(listCategory.get(productCategory)) + 1);
            if (catalog.size() < 1000) {
                this.productCode = "8880" + codeProducts + codeCategory;
            } else {
                this.productCode = "888" + codeProducts + codeCategory;
            }
        } else {
            String code = catalog.getProducts().get(catalog.size() - 1).getProductCode();
            if (catalog.size() < 1000) {
                this.productCode = "8880" + codeProducts + (new Integer(code.substring(7, 9)) + 1) + "0001";
            } else {
                this.productCode = "888" + codeProducts + (new Integer(code.substring(7, 9)) + 1) + "0001";
            }
        }
    }

    /**
     * @return the salePrice
     */
    public int getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the buyItemPrice
     */
    public int getBuyItemPrice() {
        return buyItemPrice;
    }

    /**
     * @param buyItemPrice the buyItemPrice to set
     */
    public void setBuyItemPrice(int buyItemPrice) {
        this.buyItemPrice = buyItemPrice;
    }

    /**
     * @return the productStock
     */
    public int getProductStock() {
        return productStock;
    }

    /**
     * @param productStock the productStock to set
     */
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

}
