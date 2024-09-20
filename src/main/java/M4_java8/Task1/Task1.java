package M4_java8.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

//      1.  Check if a given string is a palindrome
        String s = new String("sas");
        String emp = new String(" ");
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            emp += charArray[i];
        }
        if (s.equalsIgnoreCase(emp)) {
            System.out.println("Given String is palindrom:- " + emp);
        } else {
            System.out.println("Given String is not palindrom:- " + emp);
        }


//        2. Find the 2nd biggest number in the given list of numbers
        Integer ary[] = {5, 7, 5, 8, 2, 4, 7};
        Arrays.sort(ary);
        System.out.println(ary.length - 2);
        System.out.println("Sort array" + Arrays.toString(ary));
        Arrays.sort(ary, Collections.reverseOrder());
        System.out.println("Sort by reverse order " + Arrays.toString(ary));

        int second = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < ary.length; i++) {
            largest = Math.max(ary[i], largest);
        }
        System.out.println("First largest element " + largest);
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] != largest) {
                second = Math.max(second, ary[i]);
            }
        }
        System.out.println("Second largest element " + second);


//        3. write a program to check if two strings are rotations of each other.
        String s1 = new String("AACD");
        String s2 = new String("ACDA");
        if ((s1 + s2).indexOf(s2) != -1 && s1.length() == s2.length()) {
            System.out.println("strings are rotations of each other");
        } else {
            System.out.println("strings are not rotations of each other");
        }

//        4. Use Runnable interface to start a new thread and print numbers from
        Runnable run = new Run();
        Thread t1 = new Thread(run);
        t1.start();
        t1.sleep(100);
        System.out.println("Thread 1 started");

//        5. Use Comparator inerface to sort given list of numbers in reverse order
        List<Integer> list = Arrays.asList(4, 55, 1, 2, 0, 2, 5, 3, 78, 8, 6, 7);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        list.sort(Collections.reverseOrder());
        System.out.println("list " + list);

        List<Integer> list1 = Arrays.asList(4, 55, 1, 2, 0, 2, 5, 3, 78, 8, 6, 7);
        list1.sort(Comparator.reverseOrder());
        System.out.println("list1 " + list1);

//        6. Use Comparator inerface to sort given list of Employees in the alphabetic order of their name
//            comparator package

//        7. Create a TreeSet that sorts the given set of numbers in reverse order
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(74);
        set.add(55);
        set.add(53);
        set.add(51);
        System.out.println(set);
        Iterator<Integer> integerIterator = set.descendingIterator();
        while (integerIterator.hasNext()) {
            Integer next = integerIterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

//        8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("ddd");
        treeSet.add("gggg");
        treeSet.add("aaaa");
        treeSet.add("rrrr");
        System.out.println(treeSet);

//        9. Create a TreeMap that sorts the given set of values in decending order
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "ddd");
        treeMap.put(2, "gggg");
        treeMap.put(3, "aaaa");
        treeMap.put(4, "rrrr");
        NavigableMap<Integer, String> integerStringNavigableMap = treeMap.descendingMap();
        System.out.println(integerStringNavigableMap);


//        10. Create a TreeMap that sorts the given set of employees in decending order of their name
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("b", 1);
        map.put("y", 2);
        map.put("a", 3);
        map.put("n", 4);
        NavigableMap<String, Integer> stringIntegerNavigableMap = map.descendingMap();
        System.out.println("Map "+stringIntegerNavigableMap);

//        11. Use Collections.Sort to sort the given list of Employees in decending order of their name
        List l = new ArrayList();
        l.add("a");
        l.add("v");
        l.add("f");
        l.add("d");
//        Collections.sort(l);
//        l.sort(Comparator.reverseOrder());
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);

    }
}
