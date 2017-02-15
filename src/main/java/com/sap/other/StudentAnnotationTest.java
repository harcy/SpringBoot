package com.sap.other;

import org.springframework.web.bind.MethodArgumentNotValidException;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * Created by I337300 on 1/25/2017.
 */

@Student(Name = "Lucy",Email = {"@sap.com","@gmail.com"})
public class StudentAnnotationTest {

    @Student(Email = {"@qq.com","@sap.com","@gmail.com"})
    public String[] getEmails(String name) {
        return null;
    }

    public static void main(String[] args) {
        StudentAnnotationTest sat = new StudentAnnotationTest();
        Class clazz = sat.getClass();
        /*Student annotation = (Student) clazz.getAnnotation(Student.class);
        System.out.println(
                annotation.Age()+"------"+"\n"+
                annotation.Name()+"------"+"\n");
        String[] emails = annotation.Email();
        for (String str:emails
             ) {
            System.out.println(str);
        }*/

        try {
            Method method = clazz.getMethod("getEmails", String.class);
            Student methodAnnotation = method.getAnnotation(Student.class);
            System.out.println(methodAnnotation.Age());
            System.out.println(methodAnnotation.Name());
            String[] methodEmails = methodAnnotation.Email();
            for (String str: methodEmails
                 ) {
                System.out.println(str);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
