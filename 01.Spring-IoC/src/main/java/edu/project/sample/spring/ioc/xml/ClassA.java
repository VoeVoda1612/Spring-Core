package edu.project.sample.spring.ioc.xml;


public class ClassA {

    private boolean propertyBool;
    private int propertyInt;
    private String propertyString;

    public void initMethod() {
        System.out.println("ClassA - initMethod()");
    }

    public void destroyMethod() {
        System.out.println("ClassA - destroyMethod()");
    }

    public void defaultInitMethod() {
        System.out.println("ClassA - defaultInitMethod()");
    }

    public void defaultDestroyMethod() {
        System.out.println("ClassA - defaultDestroyMethod()");
    }

    @Override
    public String toString() {
        return "ClassA propertyBool=" + propertyBool + ", propertyInt=" + propertyInt + ", propertyString=" + propertyString;
    }

    public ClassA() {
        System.out.println("ClassA - конструтор ");
    }

    public ClassA(boolean propertyBool, int propertyInt, String propertyString) {
        this.propertyBool = propertyBool;
        this.propertyInt = propertyInt;
        this.propertyString = propertyString;
        System.out.println("ClassA - конструктор");
    }

    public boolean isPropertyBool() {
        return propertyBool;
    }

    public void setPropertyBool(boolean propertyBool) {
        this.propertyBool = propertyBool;
    }

    public int getPropertyInt() {
        return propertyInt;
    }

    public void setPropertyInt(int propertyInt) {
        this.propertyInt = propertyInt;
    }

    public String getPropertyString() {
        return propertyString;
    }

    public void setPropertyString(String propertyString) {
        this.propertyString = propertyString;
    }
}
