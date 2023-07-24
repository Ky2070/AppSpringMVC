/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqk.repository.impl;

import com.nqk.pojo.Category;
import com.nqk.repository.CategoryRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiet
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{
    
    @Autowired
    private LocalSessionFactoryBean factory;
    @Override
    public List<Category> getCates() {
        Session session = this.factory.getObject().getCurrentSession();
        Query q = session.createNamedQuery("Category.findAll");
        
        return q.getResultList();
        
    }
    
}
