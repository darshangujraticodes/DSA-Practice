package Java.JavaPractice.Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        /*
         * Hashset works on hashing principle
         * 
         * 
         * Hashset and Linkedset is same btu queue ifnseffernecet
         * 
         * 
         * 
         * Hashset complexity is = O(1)
         * 
         * 
         * 
         */

        HashSet<Integer> marks = new HashSet<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(50);
        marks.add(50);
        marks.add(50);

        System.out.println(marks + " | size() = " + marks.size() + " | empty() = " + marks.isEmpty());

        marks.remove(40);

        HashSet<Integer> marks2 = (HashSet<Integer>) marks.clone();

        System.out.println(marks2 + " | size() = " + marks2.size() + " | empty() = " + marks2.isEmpty());

        marks2.clear();

        System.out.println(marks2 + " | size() = " + marks2.size() + " | empty() = " + marks2.isEmpty());

        for (Integer i : marks) {
            System.out.println(i);
        }

        // Tree Set
        /*
         * 
         * It is also similar to set but it store data in sorted format
         * 
         * Treeset complexity is = O(log(n)) due to Binary search tree
         * 
         * 
         */

        System.out.println("TreeSet()");

        TreeSet<Integer> mark3 = new TreeSet<>();

        mark3.add(85);
        mark3.add(95);
        mark3.add(25);
        mark3.add(125);
        mark3.add(45);

        System.out.println(mark3 + " | " + mark3.size());

        System.out.println("contains = " + mark3.contains(45));

    }

}
