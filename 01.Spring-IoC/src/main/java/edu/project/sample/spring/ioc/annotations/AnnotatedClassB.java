package edu.project.sample.spring.ioc.annotations;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotatedClassB {

    private String  propertyString;
    private AnnotatedClassA annotatedClassA;

    @PostConstruct
    public void initMethod(){System.out.println("ClassB - initMethod()");}

    @PreDestroy
    public void destroyMethod(){System.out.println("ClassB - destroyMethod()");}

    public void defaultInitMethod(){System.out.println("ClassB - defaultInitMethod()");}

    public void defaultDestroyMethod(){System.out.println("ClassB - defaultDestroyMethod()");}

    @Override
    public String toString() {
        return "AnnotatedClassB propertyString="+propertyString+", classA=("+ annotatedClassA +")";
    }

    public AnnotatedClassB() {System.out.println("ClassB - конструктор");}

    public AnnotatedClassB(String propertyString) {
        this.propertyString = propertyString;
        System.out.println("ClassB - конструктор");
    }

    public AnnotatedClassB(String propertyString, AnnotatedClassA annotatedClassA) {
        this.propertyString = propertyString;
        this.annotatedClassA = annotatedClassA;
        System.out.println("ClassB - конструктор");
    }

    public String getPropertyString() {return propertyString;}
    public void setPropertyString(String propertyString) {this.propertyString = propertyString;}
    public AnnotatedClassA getAnnotatedClassA() {return annotatedClassA;}
    @Autowired(required = false)
    public void setAnnotatedClassA(AnnotatedClassA annotatedClassA) {this.annotatedClassA = annotatedClassA;}
}
