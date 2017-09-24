package edu.project.sample.spring.ioc.xml;

public class ClassB {

    private String propertyString;
    private ClassA classA;

    public void initMethod() {
        System.out.println("ClassB - initMethod()");
    }

    public void destroyMethod() {
        System.out.println("ClassB - destroyMethod()");
    }

    public void defaultInitMethod() {
        System.out.println("ClassB - defaultInitMethod()");
    }

    public void defaultDestroyMethod() {
        System.out.println("ClassB - defaultDestroyMethod()");
    }

    @Override
    public String toString() {
        return "ClassB propertyString=" + propertyString + ", classA=(" + classA + ")";
    }

    public ClassB() {
        System.out.println("ClassB - конструктор");
    }

    public ClassB(String propertyString) {
        this.propertyString = propertyString;
        System.out.println("ClassB - конструктор");
    }

    public ClassB(String propertyString, ClassA classA) {
        this.propertyString = propertyString;
        this.classA = classA;
        System.out.println("ClassB - конструктор");
    }

    public String getPropertyString() {
        return propertyString;
    }

    public void setPropertyString(String propertyString) {
        this.propertyString = propertyString;
    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
