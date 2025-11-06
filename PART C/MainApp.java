package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDAO dao = ctx.getBean(StudentDAO.class);
        Student s = new Student("Aman", "Delhi");

        dao.saveStudent(s);
        System.out.println("Student saved: " + dao.getStudent(s.getId()));

        ctx.close();
    }
}
