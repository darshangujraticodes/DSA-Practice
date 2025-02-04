package Java.JavaPractice.Collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        Queue<String> apiUserRequest = new LinkedList();

        apiUserRequest.offer("Shyam");
        apiUserRequest.offer("Rohit");
        apiUserRequest.offer("Sagar");

        System.out.println(apiUserRequest);

        apiUserRequest.poll();
        System.out.println(apiUserRequest);

        System.out.println(apiUserRequest.peek());

        // by default undehood it implement it use minHeap method

        PriorityQueue<Integer> userMarks = new PriorityQueue<>(); // it will work as minHeap format

        userMarks.offer(45);
        userMarks.offer(36);
        userMarks.offer(41);
        userMarks.offer(22);
        userMarks.offer(2);
        userMarks.offer(78);

        userMarks.add(64); // throws exception which can crash if failed to insert data
        userMarks.remove(); //

        PriorityQueue<Integer> userMarks2 = new PriorityQueue<>(Comparator.reverseOrder()); // it will work as maxHeap
                                                                                            // format

        userMarks2.offer(45);
        userMarks2.offer(36);
        userMarks2.offer(41);
        userMarks2.offer(22);
        userMarks2.offer(2);
        userMarks2.offer(78);

        System.out.println(userMarks + " | " + userMarks2);

        System.out.println("peek() = " + userMarks.peek() + " | " + userMarks2.peek());

        userMarks.poll();
        userMarks2.poll();

        System.out.println(userMarks + " | " + userMarks2);
        System.out.println(userMarks.size() + " | " + userMarks2.size());

        for (Integer i : userMarks2) {
            System.out.println(i);
        }

    }

}
