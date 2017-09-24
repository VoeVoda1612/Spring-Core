package edu.project.sample.spring.ioc.test;

import edu.project.sample.spring.ioc.annotations.AnnotatedClassA;
import edu.project.sample.spring.ioc.annotations.AnnotatedClassB;
import edu.project.sample.spring.ioc.annotations.AnnotatedClassC;
import edu.project.sample.spring.ioc.xml.ClassA;
import edu.project.sample.spring.ioc.xml.ClassB;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01CreatingBeans {

    private static ApplicationContext context;

    @BeforeClass
    public static void startTest(){
        System.out.println("***************************Тест 01 - Создание бинов***************************");
        context = new ClassPathXmlApplicationContext("01.how-to-create-beans.xml");
    }

    @Test
    public void testConstructorArgXml(){
        System.out.println("=====Создание через конструктор (xml)=====");
        ClassA classA = (ClassA)context.getBean("classA-1");
        ClassB classB = (ClassB)context.getBean("classB-1");
        System.out.println(classA);
        System.out.println(classB);
    }

    @Test
    public void testConstructorArgAnnotations(){
        System.out.println("=====Создание через конструктор (аннотации)=====");
        AnnotatedClassA annotatedClassA = (AnnotatedClassA)context.getBean("annotatedClassA01configurationClass");
        AnnotatedClassB annotatedClassB = (AnnotatedClassB)context.getBean("annotatedClassB01configurationClass");
        AnnotatedClassC annotatedClassC = (AnnotatedClassC)context.getBean("annotatedClassC");
        System.out.println(annotatedClassA);
        System.out.println(annotatedClassB);
        System.out.println(annotatedClassC);

    }


}
