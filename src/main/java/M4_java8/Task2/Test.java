package M4_java8.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main() {

        List<Product> listProducts = new ArrayList<Product>();
        listProducts.add(new Product("tv",1000,"electronic","a"));
        listProducts.add(new Product("sofa",2000,"non electronic","b"));
        listProducts.add(new Product("chair",23300,"non electronic","c"));
        listProducts.add(new Product("car",500,"non electronic","d"));
        listProducts.add(new Product("lock",20,"electronic","e"));


//        1. Define a predicate to check if the price of given product is greaterthan 1000/-. Print all the products from the given list of the products if the price is greaterthan 1000/-.
        Predicate<Product> price = product -> product.getPrice() > 1000;

        for (Product product : listProducts) {
            if (price.test(product)) {
                System.out.println("Price more than 1000$ :- "+product);
            }
        }

//        2. Define a predicate to check if the product is of electronics category. Print all the products from the given list of the products if the product is of electronics category.
        Predicate<Product> ele = product -> product.getCategory() == "electronic";
        for (Product product : listProducts) {
            if(ele.test(product)) {
                System.out.println("Electronic products :- "+product);
            }
        }

//        3. Print all the products from the given list of product if the product price is greaterthan 100/- which are in electronics category.
        Predicate<Product> p1 = product -> product.getPrice() > 100;
        for (Product product : listProducts) {
            if(p1.test(product)) {
                System.out.println(" products price more than 100$:- :- "+product);
            }
        }

//        4. Print all the products from the given list of product if the product price is greaterthan 100/- or product is in electronics category.
        Predicate<Product> p2 = product -> product.getCategory() == "electronic" || product.getPrice()>100;
        for (Product product : listProducts) {
            if(p2.test(product)) {
                System.out.println(" products price more than 100$ or electronic:- :- "+product);
            }
        }

//        5. Print all the products from the given list of product if the product price is lessthan 100/- and product is in electronics category.
        Predicate<Product> p3 = product -> product.getCategory() == "electronic" && product.getPrice()>100;
        for (Product product : listProducts) {
            if(p3.test(product)) {
                System.out.println(" products price more than 100$ and electronic:- :- "+product);
            }
        }

//        6. Define a predicate to check if the status code is 400. Print all the responses with status code 400 from the given list of responses.
        List<Response> response =  new ArrayList<>();
        response.add(new Response("plain",200,"json"));
        response.add(new Response("chair",400,"xml"));
        response.add(new Response("car",400,"json"));
        response.add(new Response("lock",200,"xml"));
        response.add(new Response("lock",500,"json"));
        response.add(new Response("car",400,"xml"));

        Predicate<Response> p4 = p -> p.getStatusCode()==400;
        for (Response r1 : response) {
            if(p4.test(r1)) {
                System.out.println(" Response is 400 :- "+r1);
            }
        }

//        7. Define a predicate to check if the response type JSON. Print all the responses the response type JSON from the given list of responses.
        Predicate<Response> p5 = p -> p.getResponseType()=="json";
        for (Response r2 : response) {
            if(p5.test(r2)) {
                System.out.println(" Response is json :- "+r2);
            }
        }


//        8. Print all the responses with status code 400 and response type JSON
        Predicate<Response> p6 = p -> p.getResponseType()=="json" && p.getStatusCode()==400;
        for (Response r3 : response) {
            if(p6.test(r3)) {
                System.out.println(" Response is json and code 400:- "+r3);
            }
        }

//        9. Print all the responses with status code 400 or response type JSON

        Predicate<Response> p7 = p -> p.getResponseType()=="json" || p.getStatusCode()==400;
        for (Response r4 : response) {
            if(p7.test(r4)) {
                System.out.println(" Response is json or code 400:- "+r4);
            }
        }

//        10. Print all the responses with status code is not 400 and response type JSON
        Predicate<Response> p8 = p -> p.getResponseType()!="json" && p.getStatusCode()!=400;
        for (Response r5 : response) {
            if(p8.test(r5)) {
                System.out.println(" Response which is not json and code 400:- "+r5);
            }
        }
    }
}
