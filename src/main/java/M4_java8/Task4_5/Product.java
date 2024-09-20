package M4_java8.Task4_5;


import lombok.Data;

@Data
public class Product {
    String name;
    Integer price;
    String category;
    String grade;

   Product(String name, Integer price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;

    }


}
