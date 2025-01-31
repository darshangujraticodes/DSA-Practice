
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

    public void stringMethods(){
        
        // string declare in 2 form 

        // type 1
        String str1 = new String("Hello World");  // this will allocate new memory each time when it call

        String str2 = new String("Hello World");  // this will allocate new memory each time when it call


        // type 2 
        // this string vlue is storein in string pool so if aman sharma is declare again will not or allocate new memory it will string pool address to save memory
        String str3 = "Aman Sharma";

        String str4 = "     Aman Sharma   ";

        // reference variable memory data check is equal or not

        System.out.println((str1 == str2)+" "+(str3 == str4)+" "+ str1.length()+" equal Ignore case "+str3.equalsIgnoreCase(str4)+" "+str3.trim().toLowerCase());



        // charachter or letter ASCII value

        System.out.println('a'+0);
        System.out.println('A'+0);



        // methods
        /*
         * 
         *  contains()
         * substring()
         * compare
         * 
         * characjter
         * 
         */

        // value data equal check 



    }


    // static methods

    static void add(int a, int b ){
            System.out.println("Sum ="+(a+b));
    }

    
    public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        
        Methods m = new Methods();       
        System.out.println(m.sum(5, 15));

        m.datatype();


        // static method does not require object to call directly can be call through name

        // we created a static method, which means that it can be accessed without creating an object of the class, 

        Methods.add(5,8);


        // string Methods

        m.stringMethods();


    }

    

}