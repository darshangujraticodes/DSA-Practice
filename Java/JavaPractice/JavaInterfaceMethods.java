// package Java.JavaPractice;

/*
 * 
 * 
 * uptill 1.7 only public abstract methdods was allowed but after java 1.8 
 * 
 * 
 * default and static methods was also allowed
 * 
 * 
 * note functional interface has only one anstract methods therefore it is also call (SAM - single abstract methods) but it o or more than 1 default or static methods
 * 
 * default methods can be override in child class but static methods cannot be override in child class 
 * 
 */

@FunctionalInterface
interface Parent {

    void sayVanakam();

    default void sayNamaste() {
        System.out.println("Parent Default Method Namaste Comment !");
    }

    static void sayHello() {
        System.out.println("Parent static Methods Hello Comment ! ");
    }

}

class Child implements Parent {

    // default methods can be override in child class
    @Override
    public void sayNamaste() {
        System.out.println("Child Default Method Namaste Comment !");
    }

    // static methods cannot be override in child class

    public void sayVanakam() {
        System.out.println("Interface Abstract Method Vanakam Comment");
    }

}

public class JavaInterfaceMethods {

    public static void main(String[] args) {

        Child cd = new Child();
        cd.sayNamaste();
        cd.sayVanakam();
        Parent.sayHello();

    }
}
