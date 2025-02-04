package Java.JavaPractice.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * why to use java collection 
 * 
 * 
 * collection -> it is group of Homogeneuous type of data 
 *            -> Grouping same kind of data in single unit
 * 
 * 
 * collection framework 
 *    --> collection interface 
 *    --> Map
 *    --> HashMap
 * 
 * 
 * 
 * collection has category of interface
 * 1] List
 *    --> ArrayList
 *    --> LinkedinList
 *    --> Stack
 *    --> Vector (optional)
 * 
 * 2] Set (unique value)
 *    --> EnumSet (optional)
 *    --> HashSet
 *    --> LinkedHashSet
 *    --> TreeSet
 * 
 * 3] Queue (priority based data fetching and allocation)
 *    --> ArrayQueue
 *    --> LinkedList/ LinkedQueue
 *    --> PriorityQueue
 * 
 * 
 * Map 
 *    --> HashMap
 *    --> TreeMap
 *    --> EnumMap (optional)
 *    --> LinkedHashMap
 *    --> WeakHashMap (optional)
 * 
 * 
 * Iterator
 *    --> ListIterator
 * 
 * 
 * 
 */

/*
 * 
 * Diff Between Array and ArrayList
 * 
 * in Java array is of fixed size once it is declared if new element comes need to redefine its size
 * 
 * Array List is of variable size 
 * 
 */

public class LearnArrayList {
    public static void main(String[] args) {

        // java array
        // String[] studentName = new String[3];
        // studentName[0] = "Harry";
        // studentName[1] = "Ron";
        // studentName[2] = "Harmoine";

        // for (String i : studentName) {
        // System.out.println(i);
        // }

        // java ArrayList
        // note : we need to import util.Arraylist

        List<String> studentsName = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        // arraylist methods

        // add() and addAll()
        studentsName.add("Aman");
        studentsName.add("Roy");
        studentsName.add("Sagar");
        studentsName.add("Rohit");
        studentsName.add(2, "Malfoy");

        System.out.println("add() = " + studentsName);

        studentsName.set(1, "Peter");

        // set directly update the index value data
        System.out.println("set() = " + studentsName);

        // addAll()
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Shyam");
        newList.add("Divya");

        studentsName.addAll(newList);

        System.out.println(studentsName);

        // remove()
        studentsName.remove("Malfoy"); // it is case sensitive
        studentsName.remove(0);

        // if u want to remove integer value syntax is different

        ArrayList<Integer> id = new ArrayList<>();
        id.add(10);
        id.add(20);
        id.add(30);
        id.add(40);
        id.add(50);

        System.out.println(id);

        id.remove(Integer.valueOf(30));

        System.out.println(id);

        System.out.println(studentsName);

        // contains()

        String check1 = "Harry";
        String check2 = "Shyam";

        System.out.println("contains() check harry = " + studentsName.contains(check1) + "  contains() check Shyam = "
                + studentsName.contains(check2));

        // isEmpty() and length : size()
        System.out.println("isEmpty() : " + studentsName.isEmpty() + " | size() : " + studentsName.size());

        // get()
        System.out.println(" get(3) = " + studentsName.get(3));

        System.out.println("indexOf('shyam') = " + studentsName.indexOf("Shyam"));

        ArrayList<String> shallowCopy = new ArrayList<>();

        // shallowCopy.clone(studentsName);

        // System.out.println(studentsName.lastIndexOf());

        // loop traverse
        System.out.println("Loop Traverse ");
        for (String i : studentsName) {
            System.out.println(i);
        }

        // clear()

        studentsName.clear();
        System.out.println("clear() = " + studentsName);

        // iterator

        // note iterator only work for integer elements

        System.out.println("Iterator ");
        Iterator<Integer> it = id.iterator();

        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // cloning

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("ab");
        list1.add("cd");
        list1.add("ef");

        ArrayList<String> list3 = (ArrayList<String>) list1.clone();

        System.out.println("clone() = " + list3);
    }
}
