/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nqk.repository;

import com.nqk.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kiet
 */
public interface ProductRepository {
     public List<Product> getProducts(Map<String, String> params);
   
}
