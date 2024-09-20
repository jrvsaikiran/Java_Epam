package M4_java8.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("pen", 5, "non electronic", "A"));
        products.add(new Product("mouse", 500, "electronic", "B"));
        products.add(new Product("cell", 5000, "electronic", "A"));
        products.add(new Product("apple", 45, "non electronic", "F"));
        products.add(new Product("charger", 200, "electronic", "C"));
        products.add(new Product("banana", 53, "non electronic", "T"));

//        1. Write a function to calculate the cost of all products in a given list of products.

        Predicate<Integer> pre =(i)->i>0;

        Function<Product, Integer> fn = p -> {
            if (pre.test(p.getPrice())) {

                return p.getPrice();
            }
            return 0;
        };
        int sum = 0;
        for (Product p : products) {
            int apply = fn.apply(p);
            sum = sum + apply;
        }
        System.out.println("cost of all products whose prices " + sum);


//        2. Write a function to calculate the cost of all products whose prices is > 1000/- in the given list of products.

        Function<Product, Boolean> f = p -> {
            if (p.getPrice() > 1000) {
                return true;
            }
            return false;
        };

        for (Product p : products) {
            Boolean apply = f.apply(p);
            if (apply == true) {
                System.out.println(p);
            }
        }

//3. Write a function to calculate the cost of all electronic products in the given list of products.

        Function<Product, Boolean> f2 = p -> {
            if(p.getCategory()=="electronic" ) {
                return true;
            }
            return false;
        };

        int total = 0;
        for (Product p : products) {
            Boolean apply = f2.apply(p);
            if (apply == true) {
                int price = p.getPrice();
                total= total+price;
            }
        }System.out.println("cost of all electronic products" + total);


//        4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category.
        Function<Product,Boolean> find = p -> {
            if(p.getCategory()=="electronic" && p.getPrice()>1000) {
                return true;
            }
            return false;
        };

        for (Product p : products) {
            Boolean apply = find.apply(p);
            if (apply == true) {
                System.out.println("products whose price is > 1000/- and belongs to electronic category :-"+p);
            }
        }


    }
}
