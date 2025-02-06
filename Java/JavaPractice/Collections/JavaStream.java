package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * What is Stream ?
 * Stream is used to perform operation on collection interface 
 *   
 * collection -> stream -> declarative functions (map, filter, reduce)
 * 
 * 
 * 
 * 
 */

public class JavaStream {

    public static void main(String[] args) {

        int[] fiveMultiple = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        System.out.println("Array  = " + Arrays.toString(fiveMultiple));

        int[] fiveMultipleMap = Arrays.stream(fiveMultiple).map(n -> n * 2).toArray();

        int[] fiveMultipleFilter = Arrays.stream(fiveMultiple).filter(n -> n > 25).toArray();

        int fiveMultipleReduce = Arrays.stream(fiveMultiple).reduce(0, (a, b) -> a + b);

        System.out.println("Map = " + Arrays.toString(fiveMultipleMap));
        System.out.println("Filter = " + Arrays.toString(fiveMultipleFilter));
        System.out.println("Reduce = " + fiveMultipleReduce);

        System.out.println();
        ArrayList<Integer> tenMultiple = new ArrayList<>();

        tenMultiple.add(10);
        tenMultiple.add(20);
        tenMultiple.add(30);
        tenMultiple.add(40);
        tenMultiple.add(50);
        tenMultiple.add(60);
        tenMultiple.add(70);
        tenMultiple.add(80);
        tenMultiple.add(80);
        tenMultiple.add(100);

        System.out.println("List = " + tenMultiple);

        ArrayList<Integer> tenMultipleMap = (ArrayList<Integer>) tenMultiple.stream().map(n -> n * 2)
                .collect(Collectors.toList());

        ArrayList<Integer> tenMultipleFilter = (ArrayList<Integer>) tenMultiple.stream().filter(n -> n > 60)
                .collect(Collectors.toList());

        int tenMultipleReduce = tenMultiple.stream().reduce(0, (a, b) -> a + b);

        System.out.println("ArrayList map = " + tenMultipleMap);

        System.out.println("ArrayList filter = " + tenMultipleFilter);

        System.out.println("ArrayList reduce = " + tenMultipleReduce);

    }

}
