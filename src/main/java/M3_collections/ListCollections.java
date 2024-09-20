package M3_collections;

import java.util.*;
import java.util.stream.Stream;

public class ListCollections {
    public static void main(String[] args) {
        List listA = new ArrayList();
        List listB = new LinkedList();
        List listC = new Vector();
        List listD = new Stack();

//        Insert Elements at Specific Index
        listA.add(0, "element 4");

//        Insert All Elements From One List Into Another
        List<String> listSource = new ArrayList<>();
        listSource.add("123");
        listSource.add("456");
        listSource.add("123");
        listSource.add("5677");
        List<String> listDest   = new ArrayList<>();
        listDest.addAll(listSource);
        System.out.println(listSource+" source to destination "+listDest);

//        Find Elements in a List
        int index1 = listDest.indexOf("456");
        System.out.println("Find Elements in a List "+index1);

//        Find Last Occurrence of Element in a List
        int lastIndex = listDest.lastIndexOf("456");
        System.out.println("Find Last Occurrence of Element in a List "+lastIndex);

//        Checking if List Contains Element
        boolean containsElement = listDest.contains("123");
        System.out.println("Contains Element "+containsElement);

//        Retain All Elements From One List in Another
        boolean b = listDest.retainAll(listSource); //union of two list
        System.out.println("List after retaining elements "+b);

//        Convert List to Set
        List<String> list5      = new ArrayList<>();
        list5.add("element 1");
        list5.add("element 2");
        list5.add("element 3");
        list5.add("element 3");
        Set<String> set1 = new HashSet<>();
        set1.addAll(list5);
        System.out.println("Convert List to Set "+set1);

//        Convert List to Array
        List<String> list      = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 3");

        Object[] objects = list.toArray(); //type1
        System.out.println("list "+list);
        System.out.println("Convert List to Array "+Arrays.toString(objects));

        String[] objects1 = list.toArray(new String[0]); //type2
        System.out.println("Convert List to Array "+Arrays.toString(objects1));

//        Convert Array to List
//        int [] intArray = {1,2,3,4,5};
        String[] values = { "one", "two", "three" };
        List<String> list1 = Arrays.asList(values);
        System.out.println("Convert Array to List "+list1);

//        Sort List of Comparable Objects
        List<String> list2 = new ArrayList<>();
        list2.add("c");
        list2.add("b");
        list2.add("a");
        Collections.sort(list2);
        System.out.println(" Sort List of Comparable Objects "+list2);

        /*Iterate List
        You can iterate a Java List in several different ways. The three most common ways are:     */

        //Using an Iterator
        List<String> list3 = new ArrayList<>();
        list3.add("first");
        list3.add("second");
        list3.add("third");
        Iterator<String> iterator = list3.iterator();
        while(iterator.hasNext()){
            String obj = iterator.next();
            System.out.println(obj);
        }

//        Using a for-each loop
        for(String element : list3) {
            System.out.println(element);
        }

//        Using a for loop
        for(int i=0; i < list3.size(); i++) {
            String element = list3.get(i);
            System.out.println(element);
        }

//        Using the Java Stream API
        System.out.println("Streams");
        Stream<String> stream = list3.stream();
        stream.forEach(System.out::println);




    }
}
