/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thnp.controller;

import com.thnp.pojo.Category;
import com.thnp.service.CategoryService;
import com.thnp.service.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nhatp
 */
@Controller
@ControllerAdvice
public class HomeController {
    
//    @Autowired
//    private CategoryService categoryService;
//    @Autowired
//    private ProductService productService;
    
//    @ModelAttribute
//    public void commonAttrs(Model model) {
//        model.addAttribute("categories", this.categoryService.getCategories());
//    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
