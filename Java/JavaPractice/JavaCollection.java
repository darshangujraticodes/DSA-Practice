// package Java.JavaPractice;

/*
 * 
 * why to use java collection 
 * 
 * 
 * collection -> it is group of Homogeneuous kind of data 
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

// class LearnArrayList {

//     public void show() {
//         System.out.println("Collection Api Array List");
//     }

// }

public class JavaCollection {
    public static void main(String[] args) {

        // LearnArrayList lc = new LearnArrayList();
        // lc.show();

        String[] studentArray = new String[3];
        studentArray[0] = "Harry";
        studentArray[1] = "Ron";
        studentArray[2] = "Malfoy";

        for (String i : studentArray) {
            System.out.println(i);
        }

    }
}
