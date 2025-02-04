package Java.JavaPractice.Collections;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
 * Collection framework different typesof interface 
 * 
 * map is also of the interface of collection framework 
 * 
 * 1] It provide the functionality of the map data structure
 * 2] It store data in key value pairs
 * 
 * 
 * Map 
 *  --> HashMap
 *  --> TreeMap
 *  --> EnumMap
 *  --> LinkedinHashMap
 * 
 * 
 */

public class LearnMap {

    public static void main(String[] args) {

        HashMap<String, String> countryCode = new HashMap<>();

        countryCode.put("us", "United States");
        countryCode.put("in", "India");
        countryCode.put("nz", "New Zealand");
        countryCode.put("au", "Australia");
        countryCode.put("uk", "United Kingdom");
        countryCode.put("uae", "United Arab Emirates");

        System.out.println(countryCode + " | " + countryCode.size());

        System.out.println(countryCode.get("us"));

        System.out.println("containsKey('my') = " + countryCode.containsKey("my") + " | containsKey('us') = "
                + countryCode.containsKey("us"));

        System.out.println("  containsValue(\"United States\") =  " + countryCode.containsValue("United States"));

        countryCode.remove("uk");

        System.out.println();

        // this enhance for loop or for each methods help to fetch both key and values
        for (Map.Entry<String, String> code : countryCode.entrySet()) {

            System.out
                    .println("Complete Value = " + code + " key = " + code.getKey() + " | Value = " + code.getValue());

        }

        System.out.println(countryCode + " | " + countryCode.size());

        // if u want only keys
        System.out.println();

        System.out.println("Only keys");

        for (String s : countryCode.keySet()) {
            System.out.println(s + " | " + countryCode.get(s));
        }

        // if u want only values
        System.out.println();

        System.out.println("Only values");

        for (String s : countryCode.values()) {
            System.out.println(s);
        }

        /*
         * 
         * 
         * HashMap -> store in the format which is inserted
         * 
         * 
         * TreeMap -> store the data sorted format it sort the data on the basis of key
         * 
         * 
         */

    }

}
