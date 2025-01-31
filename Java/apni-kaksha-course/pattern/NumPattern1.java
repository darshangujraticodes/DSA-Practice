
public class NumPattern1 {
    

    public void numPatternVal(int count){

        /*
         1
         12
         123
         1234
         12345 
         */

        for(int i =1 ; i <= count; i++ ){
            for(int j =1 ; j < i; j++){
                System.out.print(j);
            }
           System.out.println();
        }   
     
    }

    public static void main(String[] args) {
        NumPattern1 n1 = new NumPattern1();
        n1.numPatternVal(5);
    }

}
