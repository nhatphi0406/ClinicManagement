/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thnp.controller;

import com.thnp.pojo.Category;
import com.thnp.pojo.Product;
import com.thnp.service.CategoryService;
import com.thnp.service.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nhatp
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public String product(Model model, @RequestParam(required = false) Map<String, String> params) {
        model.addAttribute("categories", this.categoryService.getCategories());
        String kw = params.getOrDefault("kw", null);
        int page = Integer.parseInt(params.getOrDefault("page", "1"));
        String cateId = params.get("CateId");
        if (cateId == null){
            model.addAttribute("products", this.productService.getProducts(kw, page));
        } else {
            Category c = this.categoryService.getCategoryById(Integer.parseInt(cateId));
            model.addAttribute("products", c.getProductCollection());
        }
        model.addAttribute("productCounter", this.productService.coutProduct());
        
        return "product";
    }
    
    @GetMapping("/products/product-detail/{productId}")
    public String detail(@PathVariable(value = "productId") int productId, Model model) {
        
        model.addAttribute("product", this.productService.getProductById(productId));
        
        return "product-detail";
    }
    
    @GetMapping("/category-stats")
    public String cateStats() {
        
        return "category-stats";
    }
    
    @GetMapping("/admin/add-product")
    public String list(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }
}
