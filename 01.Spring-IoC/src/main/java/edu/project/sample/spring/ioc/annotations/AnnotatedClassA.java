package edu.project.sample.spring.ioc.annotations;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotatedClassA {

    private boolean propertyBool;
    private int     propertyInt;
    private String  propertyString;

    @PostConstruct
    public void initMethod(){System.out.println("ClassA - initMethod()");}

    @PreDestroy
    public void destroyMethod(){System.out.println("ClassA - destroyMethod()");}

    public void defaultInitMethod(){System.out.println("ClassA - defaultInitMethod()");}

    public void defaultDestroyMethod(){System.out.println("ClassA - defaultDestroyMethod()");}

    @Override
    public String toString() {
        return "AnnotatedClassA propertyBool="+propertyBool+", propertyInt="+propertyInt+", propertyString="+propertyString;
    }

    public AnnotatedClassA() {System.out.println("ClassA - конструтор ");}

    public AnnotatedClassA(boolean propertyBool, int propertyInt, String propertyString) {
        this.propertyBool   = propertyBool;
        this.propertyInt    = propertyInt;
        this.propertyString = propertyString;
        System.out.println("ClassA - конструктор");
    }

    public boolean isPropertyBool() {return propertyBool;}
    public void    setPropertyBool(boolean propertyBool) {this.propertyBool = propertyBool;}
    public int     getPropertyInt() {return propertyInt;}
    public void    setPropertyInt(int propertyInt) {this.propertyInt = propertyInt;}
    public String  getPropertyString() {return propertyString;}
    public void    setPropertyString(String propertyString) {this.propertyString = propertyString;}
}
