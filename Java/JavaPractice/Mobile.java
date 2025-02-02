package Java.JavaPractice;

public class Mobile {

    String brand;
    String model;
    String price;
    static String type;


    public void mobileInfo(){
        System.out.println(brand+" "+model+" "+price+" "+type);
    }


    // note non static varaible can't be accessed by static method
    public static void showInfo(){
        // System.out.println(brand+" "+model+" "+price+" "+type);
    }

    public static void main(String[] args) {
        
        Mobile m = new Mobile();
        m.brand = "Samsung";
        m.model = "Galaxy";
        m.price = "10000";
        // static variable can be accessed by class name
        // Mobile.type = "Smartphone";
        type = "Smartphone";

        m.mobileInfo();



    }
    
}
