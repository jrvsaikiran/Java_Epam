package practice;

import lombok.Data;
import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Consumer;

@Data
public class Practicesing implements Comparable<Practicesing> {

    private String firstName;
    private String lastName;
    Practicesing(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static void main(String[] args) {

        String s1 = "sai";
        String s2 = "sai2";
        int i = s1.compareTo(s2);
        System.out.println(i);
        ArrayList<Practicesing> list = new ArrayList<>();
        list.add(new Practicesing("sai3", "kiran"));
        list.add(new Practicesing("sai4", "kiran3"));
        list.add(new Practicesing("sai1", "kiran4"));
        list.add(new Practicesing("sai2", "kiran2"));

        HashMap map = new HashMap();
        Consumer<Practicesing> practicesingConsumer = p -> map.put(p.getFirstName(), p.getLastName());

        for(Practicesing p : list) {
            practicesingConsumer.accept(p);
        }


        Collections.sort(list);
//        Collections.sort(list);
        for(Practicesing p : list) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }




    }




    @Override
    public int compareTo(Practicesing o) {
        if(this.firstName.compareTo(o.getFirstName()) != 0) {

            int i = this.firstName.compareTo(o.getFirstName());
            System.out.println(i);
            return o.getFirstName().compareTo(this.firstName);
//            return this.firstName.compareTo(o.getFirstName());
        }
        return 0;
    }
}
