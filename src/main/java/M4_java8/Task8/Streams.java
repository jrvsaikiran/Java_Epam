package M4_java8.Task8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

       /* Different Operations On Streams
        There are two types of Operations in Streams:

        1.Intermediate Operations
        2.Terminate Operations


        Benefit of Java Stream
        There are some benefits because of which we use Stream in Java as mentioned below:

        No Storage
        Pipeline of Functions
        Laziness
        Can be infinite
        Can be parallelized
        Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.
        */

//         1.Intermediate Operations - map()
        System.out.println(" 1.Intermediate Operations - map()");
        List<Integer> list = Arrays.asList(3, 4, 56, 6);
        List<Integer> collect = list.stream().map(x -> x * 3).collect(Collectors.toList());
        System.out.println(collect);



        //   1.Intermediate Operations - . filter()
        System.out.println("2.Intermediate Operations - . filter()");
        List<String> list1 = Arrays.asList("sai", "kiran");
        list1.stream().filter(s->s.contains("k")).forEach(System.out::println);
        List<String> i = list1.stream().filter(s -> s.contains("i")).collect(Collectors.toList());
        System.out.println(i);

        //   1.Intermediate Operations - . sorted()
        System.out.println(" 1.Intermediate Operations - . sorted()");
        List<String> list2 = Arrays.asList("sai", "kiran","s","a");
        List<String> collect1 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

//         2.Terminate Operations   -- collect()
        System.out.println("2.Terminate Operations   -- collect()");
        List<Integer> list3 = Arrays.asList(2,4,5,6,7);
        Set<Integer> collect2 = list3.stream().map(x -> x * 3).collect(Collectors.toSet());
        System.out.println(collect2);

        //         2.Terminate Operations   -- forEach()
        System.out.println("2.Terminate Operations   -- forEach()");
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list4.forEach(t->System.out.print(t+" "));


    }
}
