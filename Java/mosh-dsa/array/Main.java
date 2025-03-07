
/*
 *  Java has 2 array implementation 
 *  1. static : Array - it is not resizable 
 *  2. dynamic : ArrayList it is resizable , arraylist is asynchonized which is multithreaded operation
 * 
 *   
 *  Worst case Time Complexity
 *  1] Lookup by index - O(1)
 *  2] Lookup by value : O(n)
 *  3] insert : O(n)  
 *  4] delete : O(n)
 * 
 * 
 * 
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Array number = new Array(5);

        number.insert(45);
        number.insert(56);
        number.insert(63);
        number.insert(85);
        number.insert(85);
        number.insert(96);
        number.insert(78);
        number.insert(22);
        number.insert(41);

        number.removeAt(5);

        number.pop();

        number.print();

        number.length();

        System.out.println("does Array has 22 ? = " + number.includes(22));

        System.out.println("what is index postion of 22 in array = " + number.indexOf(22));

        System.out.println("does Array has value 125 = " + number.indexOf(125));

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list1.remove(2);

        list1.size();

        list1.toArray();

        // synchornized : single thread
        // asynchronized ; multi thread

        System.out.println(list1);

    }

}
