package edu.project.sample.spring.ioc.xml;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClassD implements InitializingBean, DisposableBean {
    private boolean propertyBool;
    private int propertyInt;
    private String propertyString;

    public void destroy() throws Exception {
        System.out.println("ClassD implements DisposableBean - destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("ClassD implements InitializingBean - afterPropertiesSet()");
    }

    public void initMethod() {
        System.out.println("ClassD - initMethod()");
    }

    public void destroyMethod() {
        System.out.println("ClassD - destroyMethod()");
    }

    public void defaultInitMethod() {
        System.out.println("ClassD - defaultInitMethod()");
    }

    public void defaultDestroyMethod() {
        System.out.println("ClassD - defaultDestroyMethod()");
    }

    @Override
    public String toString() {
        return "ClassD propertyBool=" + propertyBool + ", propertyInt=" + propertyInt + ", propertyString='" + propertyString;
    }

    public ClassD() {
        System.out.println("Конструтор ClassD");
    }

    public ClassD(boolean propertyBool, int propertyInt, String propertyString) {
        this.propertyBool = propertyBool;
        this.propertyInt = propertyInt;
        this.propertyString = propertyString;
        System.out.println("ClassD - конструктор");
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
