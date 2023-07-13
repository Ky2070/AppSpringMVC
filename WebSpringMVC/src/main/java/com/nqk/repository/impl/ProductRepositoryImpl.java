/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqk.repository.impl;

import com.nqk.pojo.Product;
import com.nqk.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 *
 * @author Kiet
 */
public class ProductRepositoryImpl implements ProductRepository{
    
     @Autowired
     private LocalSessionFactoryBean factory;
     
     @Override
     public List<Product> getProducts(Map<String, String> params) {
            Session session = this.factory.getObject().getCurrentSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root root = query.from(Product.class);
            query.select(root);

            if (params != null) {
                List<Predicate> predicates = new ArrayList<>();

                String kw = params.get("kw");
                if (kw != null && !kw.isEmpty()) {
                    predicates.add(builder.like(root.get("name"), String.format("%%%s%%", kw)));
                }

                String fromPrice = params.get("fromPrice");
                if (fromPrice != null && !fromPrice.isEmpty()) {
                    predicates.add(builder.greaterThanOrEqualTo(root.get("price"), Double.parseDouble(fromPrice)));
                }

                String toPrice = params.get("toPrice");
                if (toPrice != null && !toPrice.isEmpty()) {
                    predicates.add(builder.lessThanOrEqualTo(root.get("price"), Double.parseDouble(toPrice)));
                }

                String cateId = params.get("cateId");
                if (cateId != null && !cateId.isEmpty()) {
                    predicates.add(builder.lessThanOrEqualTo(root.get("categoryId"), Integer.parseInt(cateId)));
                }

                query.where(predicates.toArray(Predicate[]::new));
            }
            query.orderBy(builder.desc(root.get("id")));
            
            
            Query q = session.createQuery(query);
            return q.getResultList();
        
       
    }
}
