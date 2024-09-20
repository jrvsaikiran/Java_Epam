package M4_java8.Task8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class Test {

    String name;
    Integer price;
    String category;
    String grade;

    public Test(String name, Integer price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }


    public static void main(String[] args) {

        List<Test> tests = new ArrayList<Test>();
        tests.add(new Test("pen", 10, "no electronic", "A"));
        tests.add(new Test("mouse", 10000, "Electronic", "B"));
        tests.add(new Test("charger", 1660, "Electronic", "C"));
        tests.add(new Test("cell", 10000, "Electronic", "D"));
        tests.add(new Test("scale", 100, "no electronic", "E"));

        //    1. From the given list of the products get all the products with price > 1000/-
       tests.stream().filter(t ->t.getPrice()>100).forEach(d->System.out.println("list of the products get all the products with price > 1000/- "+d));


//       2. From the given list of the products get all the products from electronics category.
        tests.stream().filter(t->t.getCategory()=="Electronic").forEach(s->System.out.println("all the products from electronics category. "+s));

//        3. From the given list of the products get all the products with price> 1000/- and from electronics category. Change the name of the result list into CAP letters before printing
       System.out.println("get all the products with price> 1000/- and from electronics category.");
        List<Test> collect = tests.stream().filter(t -> t.getPrice() > 1000 && t.getCategory() == "Electronic").collect(Collectors.toList());

        for(int i=0; i<collect.size(); i++) {
            collect.set(i,new Test(collect.get(i).getName().toUpperCase(), collect.get(i).getPrice(), collect.get(i).getCategory().toUpperCase(), collect.get(i).getGrade().toUpperCase()));
            System.out.println(collect.get(i));
        }

//        4. Calculate the count of all electronic products in the given list of products.

        final int[] sum1 = {0};
        List<Test> collect1 = tests.stream().filter(l -> l.getCategory() == "Electronic").collect(Collectors.toList());
        collect1.stream().forEach(l->{
            Integer price1 = l.getPrice();
            sum1[0] = sum1[0] +price1;
            System.out.println(sum1[0]);
        });

    }

}
