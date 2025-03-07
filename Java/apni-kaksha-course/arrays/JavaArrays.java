
import java.util.*;

public class JavaArrays{

    public static void main(String[] args){

        // it is used to take input
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Your Array Length = ");
        int arrLength = sc.nextInt();

        int marks[] = new int[arrLength];

        for(int i =0; i < arrLength; i++){
            System.out.print("Enter Array Position "+i+" Value = ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Display Array Data = ");

        for(int i =0; i < arrLength; i++){
            System.out.println(marks[i]);
        }
      

    }
}