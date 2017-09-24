package edu.project.sample.spring.ioc.annotations;

import edu.project.sample.spring.ioc.xml.ClassA;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class AnnotatedClassC {

    public List<ClassA>       listClassA;
    public Set<ClassA>        setClassA;
    public Map<String,ClassA> mapClassA;
    public Map<String,String> mapString;

    public ClassA createClassA(){
        return new ClassA();
    }

    public ClassA createClassA(boolean propertyBool,int propertyInt, String propertyString){
        return new ClassA(propertyBool,propertyInt,propertyString);
    }

    @Override
    public String toString() {
        return "AnnotatedClassC";
    }

    public void initMethod(){System.out.println("ClassC - initMethod()");}
    public void destroyMethod(){System.out.println("ClassC - destroyMethod()");}
    public void defaultInitMethod(){System.out.println("ClassC - defaultInitMethod()");}
    public void defaultDestroyMethod(){System.out.println("ClassC - defaultDestroyMethod()");}

    public AnnotatedClassC() {System.out.println("ClassC - конструктор");}

    public AnnotatedClassC(List<ClassA> listClassA, Set<ClassA> setClassA, Map<String, ClassA> mapClassA, Map<String, String> mapString) {
        this.listClassA = listClassA;
        this.setClassA = setClassA;
        this.mapClassA = mapClassA;
        this.mapString = mapString;
        System.out.println("ClassC - конструктор");
    }

    public List<ClassA> getListClassA() {return listClassA;}
    public void setListClassA(List<ClassA> listClassA) {this.listClassA = listClassA;}
    public Set<ClassA> getSetClassA() {return setClassA;}
    public void setSetClassA(Set<ClassA> setClassA) {this.setClassA = setClassA;}
    public Map<String, ClassA> getMapClassA() {return mapClassA;}
    public void setMapClassA(Map<String, ClassA> mapClassA) {this.mapClassA = mapClassA;}
    public Map<String, String> getMapString() {return mapString;}
    public void setMapString(Map<String, String> mapString) {this.mapString = mapString;}
}
