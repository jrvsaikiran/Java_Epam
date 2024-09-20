package M3_collections;

import java.util.*;
import java.util.stream.Stream;

public class SetCollections {

    public static void main(String[] args) {
        //    Types of set
        Set<String> setA = new HashSet<>();
        Set setB = new LinkedHashSet();
        Set setC = new TreeSet();

//        unmodifiable (immutable) Set instances
        Set<String> set3 = Set.of("val1", "val2", "val3");
        System.out.println(set3);

//Iterate Set Using Iterator
        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");
        Iterator<String> iterator = setA.iterator();
        //while iterator
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("while iteratot "+ element);
        }

        //for-each loop iterator
        for(String sc :setA){
            System.out.println("for-each loop iterator "+sc);
        }

//        Iterate Set Using the Java Stream API
        Stream<String> stream = setA.stream();
        stream.forEach(System.out::println);

        //remove
        setA.remove("element 1");
        System.out.println("remove "+setA);
        setA.clear();
        System.out.println("clear "+setA);


//        Add All Elements From Another Collection
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");

        Set<String> set2 = new HashSet<>();
        set2.add("five");
        set2.addAll(set);
        System.out.println(set+"add "+set2);

//        Remove All Elements From Another Collection
        set2.removeAll(set); //A - B formula
        System.out.println(set2+"remove "+set); // elements will removed from set and not in set2


//        Retain All Elements Present in Another Collection
        set2.retainAll(set); //A union B
        System.out.println(set2+"retain all "+set);

        int size = set.size();
        boolean isEmpty = set.isEmpty();
        boolean contains123 = set.contains("123");

//        Convert Java Set to List
        Set<String> set4 = new HashSet<>();
        set4.add("123");
        set4.add("456");
        List<String> list5 = new ArrayList<>();
        list5.addAll(set4);
        System.out.println(set4+" Convert Set to List "+list5);







    }

}
