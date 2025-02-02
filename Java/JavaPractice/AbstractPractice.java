// Note Java abstract class should not be there inside any package or folder 
/*
 * 
 * if abstract class inside any package will show up error class not found 
 * Error: Could not find or load main class AbstractPractice
 * 
 */

// Note in one Java file 2 public class is not allowed 


// abstract is feature in java in this when you we define the method of class but the logic is unknown which will be added afterwards


// 2 types of class - abstract class and concrete class
// abstract methods can only be declared inside abstract class

abstract class Car {

    // here we have define the method but the inside logic is declared
    public abstract void drive();

    // normal methods
    public void playMusic(){
        System.out.println("Car has good music deck");
    }

}

class Nexon extends Car{

    public void drive() {
        System.out.println("Car Drive Logic Feature Implemented: Driving ... ");
    }
    
}




// this is concrete class
public class AbstractPractice {

    public static void main(String[] args) {
        

        // you cannot create object of abstract class

        Car obj = new Nexon();
        obj.drive();
        obj.playMusic();
       
    }
    
}
