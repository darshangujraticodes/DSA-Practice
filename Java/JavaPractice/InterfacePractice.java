
/* 
 *  abstract class  -> interface
 *  extends -> implements
 * 
 * 
 * 
 *  in abstract class we create abstract methods
 * 
 * in interface we do no explicitly mention abstract methods it is predefine treated as abstract methods in interface
 * 
 * By default every methods inside interface is public and abstract
 * 
 * 
 *  By default every variable inside interface are static and final  
 * 
 * static -> which means does not need object to acces candi rectly be access through class or interface
 * 
 * final -> it will constant be and it cannot be change
 * 
 * 
 * 
 * inherit rules
 * 
 * class -> class : extends
 * class -> intereface : implements
 * interface -> interfaace : extends
 * 
 * 
 */

interface Computer {

    // by default
    String brandName = "HP";
    String brandModel = "i5 - HP15-96G";

    // in absr
    void workTool();
}

// interface inherit other interface property and methods
interface AcerLaptop extends Computer {

    String brandName = "ACER";
    String brandModel = "i5 - A315-53G";

    void pcInfo();
}

interface Mobile {
    void communicationTool();
}

class Desktop implements Computer, Mobile {
    public void workTool() {
        System.out.println("Alloted Work Tool : Desktop");
    }

    public void communicationTool() {
        System.out.println("Alloted Communication Tool : Mobile");
    }
}

class Laptop implements AcerLaptop {
    public void workTool() {
        System.out.println("Alloted Work Tool : Laptop");

    }

    public void pcInfo() {
        System.out.println("LPINFO = ACER : i5 - A315-53G");
    }
}

class Developer {
    public void devApp(Computer obj) {
        obj.workTool();
    }
}

public class InterfacePractice {
    public static void main(String[] args) {

        Computer desk = new Desktop();
        Laptop lap = new Laptop();

        Developer ron = new Developer();

        Developer harry = new Developer();

        ron.devApp(lap);
        harry.devApp(desk);

        lap.pcInfo();

        System.out.println(Computer.brandName + " " + Computer.brandModel);

    }
}
