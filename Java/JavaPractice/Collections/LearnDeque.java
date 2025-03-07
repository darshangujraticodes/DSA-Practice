package Java.JavaPractice.Collections;

import java.util.ArrayDeque;

public class LearnDeque {

    /*
     * Deque : Doubly ended Queue
     * 
     * 
     * 
     */

    public static void main(String[] args) {

        ArrayDeque<Integer> user = new ArrayDeque<>();

        // follow normal queue approach fifo (first in first out)
        user.offer(45);
        user.offer(78);
        user.offer(105);

        // add element from start point
        user.offerFirst(524);

        // add element from last point
        user.offerLast(1);

        System.out.println(user + " | " + user.size());

        System.out.println("peekfirst() = " + user.peekFirst() + " | peekLast() = " + user.peekLast());

        user.pollFirst();
        user.pollLast();

        System.out.println(user + " | Size =  " + user.size());

    }
}
