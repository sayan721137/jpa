package com.sayan.first.dao;


import com.sayan.first.entity.student;
import jakarta.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAPimp implements StudentDAO{

    //Define Field for Entity manager
    private EntityManager entityManager;

    //inject Entity Manager using constructor injection and autowired annotation
    @Autowired
    public StudentDAPimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //Define Save Method
    @Override
    @Transactional
    public void save(student theStudent) {
        entityManager.persist((theStudent));
    }
}
