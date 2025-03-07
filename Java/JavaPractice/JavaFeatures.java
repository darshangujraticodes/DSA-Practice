
/*
 * 
 * 
 * Why Java 8 Feature was developed and released ?   
 * 
 * it has 3 core prupose
 * 
 * 1] Consise and minimal code
 * 2] Functional Programming Benefits was missing in OOP's java is OOPs laguage
 * 3] To Enable parallel Programming 
 *
 * 
 * 
 * Features of JAVA 
 * 
 * 1] Lamda Expression (Anonymous Function)    : (x,y) -> x+y 
 * 2] Stream API =  to perform operation on collection like list , array
 * 3] Date and Time 
 * 4] BASE64 Encode and Decode  java.util.Base64
 * 5] Methods Ref and constructor Ref   =   :: Operator
 * 6] default methods in Interface 
 * 7] static methods
 * 8] functional Interface  (SAM - Single Abstract Methods) only one abstract methods inside interface is called SAM
 * 9] @functionalInterface Annotation  
 * 10] Optional Class
 * 
 * 
 * 
 *  Lambda Expression
 *  1] It is an anonymous function
 *  2] It does not have modifier , return type and nam.* 
 *     
 * 
 *  Benefits of Lambda Expression
 *  1] To Enable functional Programming 
 *  2] Reduce jar code file size
 *  3] make code more readable  a, maintainalbl and consise
 *  4] Reduce java verbose nature 
 *
 * 
 * 
 *  default methods are methods who has body statment 
 * 
 * 
 */

// package Java.JavaPractice;

/*
 * 
 * Note functional interface has only one  abstract methods but it can any number if default or static methods inside interface
 */

// package Java.JavaPractice;

@FunctionalInterface
interface JavaInterfaceFeatures {

    void sayHii(); // Functional Interface (Only One Abstract Method)

    static void getUser() { // Static Method
        System.out.println("User Name is Shyam.");
    }
}

public class JavaFeatures {
    public static void main(String[] args) {
        // Lambda Expression implementing the functional interface
        JavaInterfaceFeatures obj = () -> System.out.println("Hello, Lambda!");

        // Calling the method using lambda
        obj.sayHii();

        // Calling the static method from the interface
        JavaInterfaceFeatures.getUser();
    }
}