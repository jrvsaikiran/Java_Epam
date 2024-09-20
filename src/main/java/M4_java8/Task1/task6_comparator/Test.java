package M4_java8.Task1.task6_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Construtor> list = new ArrayList<>();
        list.add(new Construtor("ttt",44));
        list.add(new Construtor("fff",5));
        list.add(new Construtor("ddd",64));
        list.add(new Construtor("bbb",7));
        list.add(new Construtor("qqq",8));
        list.add(new Construtor(" ",92));

        for (Construtor construtor : list) {
            System.out.println(construtor.getName()+" === "+construtor.getAge());
        }

        System.out.println("Name comparator "+list.size());
        Collections.sort(list,new NameComparator());
        for (Construtor construtor : list) {
            System.out.println(construtor);
//            System.out.println(construtor.getName()+" === "+construtor.getAge());
        }

        System.out.println("Age comparator "+list.size());
        Collections.sort(list,new AgeComparator());
        for (Construtor construtor : list) {
            System.out.println(construtor);
        }


    }
}
