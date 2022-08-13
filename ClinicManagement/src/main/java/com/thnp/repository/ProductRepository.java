/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.thnp.repository;

import com.thnp.pojo.Product;
import java.util.List;

/**
 *
 * @author nhatp
 */
public interface ProductRepository {
    List<Product> getProducts(String kw, int page);
    Product getProductById(int proId);
    long coutProduct();
    boolean addOrUpdate(Product product);
}
