package com.example;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    public Student getStudent(int id) {
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }
}
