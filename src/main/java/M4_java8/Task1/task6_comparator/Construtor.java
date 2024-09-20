package M4_java8.Task1.task6_comparator;

import lombok.Data;

@Data
public class Construtor {
    String name;
    Integer age;

    public Construtor(String name, int age){
        this.name = name;
        this.age = age;

    }
}
