
 
/*
 * 
 * enum is just like a classs it can have variable and methods
 * but note it cannot be inherited in other class inheritance is not supported in enum
 * 
 * 
 */

enum ApiStatus{
    Running, Failed, Pending, Success
}


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



    }

    public void arrayType(){


        // 2 format syntax

        // collection of similar types of data is called array
        // type 1
        int[] array = {1,5,8,6,8,9,6};

        // type 2
        // note new help to store data in heap memory
        int[] array2 = new int[5];
        array2[2] = 5;
        array2[3] = 9;
        array2[1] = 44;

        // for(int num : array){
        //     System.out.println(num);
        // }

        // 2 dimensional Array

        int[][] squareMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for(int i =0; i< squareMatrix.length; i++){
            for(int j =0; j< squareMatrix.length ; j++){
                System.out.print(squareMatrix[i][j]);
                // System.out.print( "i = "+i+" J = "+j+" "+matrix[i][j]);
            }
            System.out.println();
        }


        // jagged array : Array of different row and column

        // type 1
        int[][] jaggedArray = new int[3][];

        int[][] jagArray = {
            {1,2},
        {3,4},
        {5,6},
        {7,8}
        };

        System.out.println("Jagged Array Data Traverse");

        for(int i = 0 ; i < jagArray.length; i++){
            for(int j =0; j< jagArray[i].length; j++){
                System.out.print(jagArray[i][j]);
            }
            System.out.println();
        }

        // enhance for loop

        System.out.println("Enhance for loop");

        for(int[] i : jagArray){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }


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


        // array

        m.arrayType();


        // enum -> eumeration

        // collection of constant 

        ApiStatus api = ApiStatus.Success;

        System.out.println(api);

        ApiStatus[] apiArrayVal = ApiStatus.values();
    
        for( ApiStatus s : apiArrayVal ){
            System.out.println(s+" : "+s.ordinal());
        }

    }



    

}