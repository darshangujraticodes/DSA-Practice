package Java.JavaPractice;

/*
 * Class : it is like a blueprint
 * properties and behviour are define inside class
 *
 * variable are the properties and methods are the behaviour
 *  
 * 4 Pillar of OOPS
 * Encapsulation -> bundling of data and methods into single unit and hiding them and preventing them to edit or update from external source
 *                  it can only fetch and update using getter & setter methods  
 * Polymorphism  -> 
 * Abstraction   -> hiding implementation details
 * inheritance   -> 
 * 
 */

public class Car {

    // properties
    private String carColor;
    private String carModel;
    private String carCompany;
    private String carType;
    private String carNumber;

    String carOwnerInfo(String ownerName) {
        return ownerName;
    }

    int carSpeed(int speed) {
        return speed;
    }

    static void carInfo() {
        System.out.println();
    }

    // self executing starter method

    // public static void main(String[] args) {

    // Car c = new Car();
    // c.carColor = "Indigo";
    // c.carModel = "Nexon";
    // c.carNumber = "MHO4AD878";
    // c.carCompany = "Tata";

    // }

}
