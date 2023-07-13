/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqk.controllers;

import com.nqk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kiet
 */
@Controller
public class IndexController {
    @Autowired
    private ProductService productService;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("products", this.productService.getProducts(null));
        
        return "index";
    }
}