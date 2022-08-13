/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thnp.service.impl;

import com.thnp.pojo.Product;
import com.thnp.repository.ProductRepository;
import com.thnp.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nhatp
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts(String kw, int page) {
        return this.productRepository.getProducts(kw, page);
    }

    @Override
    public Product getProductById(int proId) {
        return this.productRepository.getProductById(proId);
    }

    @Override
    public long coutProduct() {
        return this.productRepository.coutProduct();
    }

    @Override
    public boolean addOrUpdate(Product product) {
        return false;
        //return this.productRepository.addOrUpdate(product);
    }
    
}
