package M4_java8.Task3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Fun {
    void test();
}

public class Test {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("pen", 5, "non electronic", "A"));
        products.add(new Product("mouse", 500, "electronic", "B"));
        products.add(new Product("cell", 5000, "electronic", "A"));
        products.add(new Product("apple", 45, "non electronic", "F"));
        products.add(new Product("charger", 200, "electronic", "C"));
        products.add(new Product("banana", 53, "non electronic", "T"));

//        1. Write a function to calculate the cost of all products in a given list of products.
        Fun totalPrice = getTotalPrise(products);
        totalPrice.test();

//        2. Write a function to calculate the cost of all products whose prices is > 1000/- in the given list of products.

        Fun priceMoreThan1000 = getPriceMoreThan1000(products);
        priceMoreThan1000.test();

//        3. Write a function to calculate the cost of all electronic products in the given list of products.
        Fun costOfAllElectroincProducts = getCostOfAllElectroincProducts(products);
        costOfAllElectroincProducts.test();

//        4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category.
        Fun eleMorethan1000 = getEleMorethan1000(products);
        eleMorethan1000.test();


    }

    private static Fun getEleMorethan1000(List<Product> products) {
        Fun eleMorethan1000 = () -> {
            for (Product p : products) {
                if (p.getPrice() > 1000 && p.getCategory() == "electronic") {
                    System.out.println("getEleMorethan1000 " + p);
                }
            }
        };
        return eleMorethan1000;
    }

    private static Fun getCostOfAllElectroincProducts(List<Product> products) {
        Fun costOfEle = () -> {
            for (Product p : products) {
                if (p.getCategory().equalsIgnoreCase("electronic")) {
                    System.out.println("getCostOfAllElectroincProducts " + p);
                }
            }
        };
        return costOfEle;
    }

    private static Fun getPriceMoreThan1000(List<Product> products) {
        Fun more = () -> {
            for (Product p : products) {
                if (p.getPrice() > 1000) {
                    System.out.println("getPriceMoreThan1000 " + p);
                }
            }
        };
        return more;
    }

    private static Fun getTotalPrise(List<Product> products) {
        final int[] sum = {0};
        Fun totalPrice = () -> {
            for (Product p : products) {
                int price = p.getPrice();
                sum[0] = price + sum[0];
            }
            System.out.println("Total price of all products:- " + sum[0]);
        };
        return totalPrice;
    }
}
