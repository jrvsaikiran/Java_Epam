package M4_java8.Task4_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test4 {
    public static void main() throws IOException {

        Logger logger = Logger.getLogger("M4_java8");

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("pen",3450,"non eletronic","A"));
        productList.add(new Product("cell",25,"eletronic","B"));
        productList.add(new Product("battery",255,"eletronic","C"));
        productList.add(new Product("scale",2555,"non eletronic","D"));

//        1. Given a product write a consumer to print the product to appropriate medium depending on the print parameter. If the print parameter is set to file, consumer shall log the product to file, if not print on the console.

        FileHandler fh = new FileHandler("C:/Users/rajavenkatasaikiran_/IdeaProjects/JAVA_EPAM/src/main/resources/consumer.logs");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);

        Consumer<Product> con = c->System.out.println("Based on file print "+c);

        String print = "file";
        String print2 = "SOP";
        for (Product p : productList) {
            if(print=="file"){
                logger.info(p.toString());
            }
            else if(print2=="SOP"){
               con.accept(p);
            }
        }


//        2. Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-. Given the product list, update the grade for each product and print all of the products.
        Consumer<Product> co = c->System.out.println("product as 'Premium' if the price is > 1000/-."+c);

        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getPrice()>1000){
                productList.get(i).setGrade(productList.get(i).getGrade()+" premium");
                co.accept(productList.get(i));
            }
        }

//        3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-. Given the product list, update the name for each product and print all of the products.
        Consumer<Product> cons = (p)->System.out.println("product to be suffixed with '*' if the price of product is > 3000/-"+p);

        for(Product li :productList){
            if(li.getPrice()>3000){
                li.setName(li.getName()+" *");
                cons.accept(li);
            }
        }


        //4. Print all the Premium grade products with name suffixed with '*'.
        Consumer<Product> consu = p->System.out.println("Premium grade products with name suffixed with '*'."+p);
        for(Product li :productList){
            if(li.getGrade().contains("premium") && li.getName().contains("*")){
                consu.accept(li);
            }
        }


//        1. Write a supplier to produce a random product.
        List<Product> productList1 = new ArrayList<>();
        productList1.add(new Product("pen",3450,"non eletronic","A"));
        productList1.add(new Product("cell",25,"eletronic","B"));
        productList1.add(new Product("battery",255,"eletronic","C"));
        productList1.add(new Product("scale",2555,"non eletronic","D"));

        for(int i=0;i<productList1.size();i++){
            int j = i;
            Supplier<Boolean> supplier = ()->productList1.get(j).getPrice()>2000;
            if(supplier.get()){
                System.out.println("a supplier to produce a random product. "+ productList1.get(i));
            }

        }

//        2. Write a supplier to produce a random OTP.

        Supplier<Integer> sup = ()-> (int) (Math.random()*9000)+100000;
        System.out.println("supplier to produce a random OTP. "+sup.get());








    }

}
