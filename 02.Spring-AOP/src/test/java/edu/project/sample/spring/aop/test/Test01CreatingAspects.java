package edu.project.sample.spring.aop.test;

import edu.project.sample.spring.aop.annotations.AnnotationClassA;
import edu.project.sample.spring.aop.xml.ClassA;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01CreatingAspects {
    private static ApplicationContext context;

    @BeforeClass
    public static void startTest(){
        System.out.println("***************************Тест 01 - Создание аспектов***************************");
        context = new ClassPathXmlApplicationContext("01.how-to-create-aspect.xml");
    }

    @Test
    public void createAspectXML(){
        System.out.println("=====Создание аспекта через xml=====");
        ClassA classA=(ClassA) context.getBean("classA");
        classA.method01ClassA();
    }

    @Test
    public void createAspectAnnotation(){
        System.out.println("=====Создание аспекта через аннотации=====");
        AnnotationClassA annotationClassA=(AnnotationClassA) context.getBean("annotationClassA");
        annotationClassA.method01ClassA();

    }
}
