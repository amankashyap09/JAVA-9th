package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // CREATE
        Student s1 = new Student("Aman", "Delhi");
        session.save(s1);

        // READ
        Student s2 = session.get(Student.class, s1.getId());
        System.out.println("Fetched: " + s2);

        // UPDATE
        s2.setCity("Mumbai");
        session.update(s2);

        // DELETE
        session.delete(s2);

        tx.commit();
        session.close();
    }
}
