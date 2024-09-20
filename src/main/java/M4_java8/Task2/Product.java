package M4_java8.Task2;

import lombok.Data;

@Data
public class Product {
    String name;
    Integer price;
    String grade;
    String category;


    public Product(String name, Integer price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }


}
