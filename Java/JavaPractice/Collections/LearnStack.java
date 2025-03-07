package Java.JavaPractice.Collections;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();

        // push
        bookStack.push("Physics");
        bookStack.push("Chemistry");
        bookStack.push("Algebra");
        bookStack.push("Geometry");

        System.out.println(bookStack);

        // pop()

        bookStack.pop();
        System.out.println("after pop stack = " + bookStack);

        // isEmpty()
        System.out.println("isEmpty() = " + bookStack.isEmpty());

        System.out.println("peek() = " + bookStack.peek());

        bookStack.size();

        System.out.println("size() = " + bookStack.size());

        // search return index value from top to bottom count approach
        System.out.println("search('Chemistry') = " + bookStack.search("Chemistry"));

        for (String i : bookStack) {
            System.out.println(i);
        }

    }

}
