/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thnp.repository.impl;

import com.thnp.repository.StatsRepository;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nhatp
 */
@Repository
@Transactional
public class StatsRepositoryImpl implements StatsRepository {
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

//    @Override
//    public List<Object[]> cateStats() {
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//        CriteriaBuilder b = session.getCriteriaBuilder();
//        CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
//        
//        
//    }
    
}
