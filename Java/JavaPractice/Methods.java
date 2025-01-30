
package Java.JavaPractice;

public class Methods {


    // primitive data type
    // byte, int, long(4546l), float(0.255f), double, boolean, char(single letter = r)  String
    

    // non primitive data type

    public void datatype(){
        int n1 = 45465;
        float n2 = 0.55f;
        long n3 = 546546l;
        double n4 = 5.5646465;
        char letter = 'D';
        String name = "Darshan";

        System.out.print(n1);
        System.out.println(n2);
        System.out.printf("Sum of %d and %d is %d ",n1,n3,n3+n1);

        System.out.printf("Value Interger Value Max Length = %d and Min Length = %d " ,Integer.MIN_VALUE, Long.MIN_VALUE);


    }

    
    public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        
        Methods m = new Methods();       
        System.out.println(m.sum(5, 15));

        m.datatype();
    }

    

}