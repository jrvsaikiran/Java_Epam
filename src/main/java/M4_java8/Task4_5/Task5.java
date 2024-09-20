package M4_java8.Task4_5;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Task5 {

    private static List<Product> productList1;

    public static void main() {

//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("pen",3450,"non eletronic","A"));
//        productList.add(new Product("cell",25,"eletronic","B"));
//        productList.add(new Product("battery",255,"eletronic","C"));
//        productList.add(new Product("scale",2555,"non eletronic","D"));

//        1. Given the name and price of the product, write a Bifunction to create a product.

        Faker faker = new Faker();
        BiFunction<String, String, String> function = (s, a) -> {
            String s1 = s + " " + a;
            return s1;
        };

        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String str = function.apply(faker.name().firstName(), faker.name().lastName());
            String str1 = function.apply(faker.name().firstName(), faker.name().lastName());
            String str2 = function.apply(faker.name().firstName(), faker.name().lastName());

            productList.add(new Product(str, faker.number().numberBetween(10, 1000), str2, str1));
        }
        for (Product p : productList) {
            System.out.println(p);
        }

//        2. Given the Product and quantity of the products, write a BiFunction to calculate the cost of products. A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.

        List<Product> productList1 = new ArrayList<>();
        productList1.add(new Product("pen", 3450, "non eletronic", "A"));
        productList1.add(new Product("cell", 25, "eletronic", "B"));
        productList1.add(new Product("battery", 255, "eletronic", "C"));
        productList1.add(new Product("scale", 2555, "non eletronic", "D"));

        BiFunction<Product,Integer,Boolean> bi = (g, h) -> {
            if(h>200 && g.getName()!=null){
                return true;
            }
            return false;
        };

        int sum=0;
        for (Product p : productList1) {
            if(bi.apply(p,p.getPrice())==true){
                int price = p.getPrice();
                sum= sum+price;
                System.out.println("calculate the cost of the cart. "+p);
            }
        }System.out.println(sum);

    }
}
