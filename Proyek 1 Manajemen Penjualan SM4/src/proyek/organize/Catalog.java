/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.organize;

import java.util.List;

/**
 *
 * @author C-70
 */
public class Catalog {

    private List<Products> products;

    /**
     * @return the products
     */
    public List<Products> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Products> products) {
        this.products = products;
    }
    
    public int size() {
        return products.size();
    }
}
