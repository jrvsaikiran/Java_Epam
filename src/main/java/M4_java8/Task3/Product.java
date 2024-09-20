package M4_java8.Task3;
import lombok.Data;
@Data
public class Product {

    String name;
    Integer price;
    String category;
    String grade;

    public Product(String name, Integer price, String category, String grade){
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;

    }
}
