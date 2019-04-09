package LinkedHashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // accessOrder 为 true LRU策略
        LinkedHashMap<String, String> map = new LinkedHashMap<>(16, 0.75f, true);

        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");
        System.out.println(map);
        map.get("two");
        System.out.println(map);
        map.put("four", "four");
        System.out.println(map);
        /**
         * {one=one, two=two, three=three} 
         * {one=one, three=three, two=two} 
         * {one=one,three=three, two=two, four=four}
         * 
         */

        LinkedHashMap<String, String> map2 = new LinkedHashMap<>(16, 0.75f, false);

        map2.put("one", "one");
        map2.put("two", "two");
        map2.put("three", "three");
        System.out.println(map2);
        map2.get("two");
        System.out.println(map2);
        map2.put("four", "four");
        System.out.println(map2);

        /**
         * {one=one, two=two, three=three} 
         * {one=one, two=two, three=three} 
         * {one=one, two=two, three=three, four=four}
         */

    }

}