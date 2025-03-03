class RectPattern{

    // note : this is non-static methods which required object to get execute 
    public void hollowRectangle(int totalRows, int totalColumn){
        /*
         *       ********
         *       *      *
         *       *      *
         *       ********  
         */
         System.out.println();

         System.out.println("Hollow Rectangle");
         System.out.println();
         

        for(int i = 1;  i <= totalRows ; i++){
            for(int j = 1; j <= totalColumn ; j++){

                if(i == 1 || i == totalRows || j == 1 || j == totalColumn){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();

    }

    // note : this is non static methods which directly executed using class
    public static void invertedRotatedHalfPyramid(int starLine){

        System.out.print("-----------------------------------------------------");

        System.out.println("\n");

        System.out.println("Inverted Rotated Half Pyramid");
        System.out.println();

        /*   
         *        *
         *       **   
         *      ***
         *     ****
         *    *****
         */

         for(int i=1 ; i <= starLine ; i++){
            for(int j=0 ; j<= starLine; j++){
                
                if(j <= starLine-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
               
            }
            System.out.println();
         }

    }


    public static void invertedHalfNumberPyramid(int length){
        System.out.print("-----------------------------------------------------");

        System.out.println("\n");

        System.out.println("Inverted Half Number Pyramid");
        System.out.println();


        /*     
         *     12345
         *     1234 
         *     123
         *     12
         *     1
         */

         for(int i=length; i > 0; i--){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
         }

    }

    public static void floydTriangle(int length){
        System.out.print("-----------------------------------------------------");

        System.out.println("\n");

        System.out.println("Floyd's Traingle");
        System.out.println();


        /*     
         *     01
         *     02 03 
         *     04 05 06
         *     07 08 09 10
         *     11 12 13 14 15
         */

         int l = 1;
         for(int i= 1; i <= length; i++){
            for(int j = 1 ; j <= i ; j++){
                
                System.out.print(l);
                l++;
            }
            System.out.println("");
         }


    }

    public static void binaryTriangle(int length){
        System.out.print("-----------------------------------------------------");

        System.out.println("\n");

        System.out.println("Binary Traingle");
        System.out.println();


        /*     1
         *     0 1
         *     1 0 1
         *     0 1 0 1
         *     1 0 1 0 1
         *     0 1 0 1 0 1
         */

         int binaryCounter = 1;
         for(int i=1 ; i<= length; i++){
            for(int j=1 ; j <= i; j++){
                   

                // System.out.print(binaryCounter); 

                // if(binaryCounter == 1 ){
                //     binaryCounter = 0;
                // }else{
                //     binaryCounter = 1;                   
                // }


                // other Approach is of Even and odd
                if( (i+j) % 2 == 0  ){
                    System.out.print("1"); 
                }else{
                    System.out.print("0"); 

                }

               
            }
            System.out.println("");
         }
       


    }

    public static void butterflyPattern(int length){
        System.out.print("-----------------------------------------------------");

        System.out.println("\n");

        System.out.println("Butterfly Pattern");
        System.out.println();


        /*   
         *   *      *
         *   **    **
         *   ***  ***
         *   ********
         *   ********
         *   ***  ***
         *   **    **
         *   *      *
         *   
         * 
         * first half 
         * row : 4
         * column : 8 (4*2)
         * 
         * 
         */


         // ist half
   
         for(int i = 1; i <= length ; i++){
            
            // star print
            for(int j=1 ; j<= i; j++){
                System.out.print("*");
            }

            // gap print
            for(int j=1 ; j <= 2*(length-i) ; j++){
                System.out.print(" ");
            }

            // star print
            for(int j=1 ; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(""); 
         }


         // 2nd half
       
         for(int i = length; i > 0 ; i--){
            for(int j=1 ; j<= i; j++){
                System.out.print("*");
            }
            for(int j=1 ; j <= 2*(length-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(""); 
         }



    }


    public static void main(String[] args ){

            // non static methods calling
            RectPattern rp = new RectPattern();
            rp.hollowRectangle(4,5);

            // static methods calling
            invertedRotatedHalfPyramid(5);

            invertedHalfNumberPyramid(5);

            floydTriangle(5);

            binaryTriangle(8);

            butterflyPattern(4);

    }
}