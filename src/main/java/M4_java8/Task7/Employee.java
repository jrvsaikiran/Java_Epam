package M4_java8.Task7;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Employee {

    String name;
    int account;
    int salary;

    public Employee(String name, int account, int salary){

        this.name = name;
        this.account = account;
        this.salary = salary;

    }



    public static void main(){

        Faker fk = new Faker();
        List<Employee> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(new Employee(fk.name().firstName().toString(), fk.random().nextInt(400000000,600000000), fk.random().nextInt(1000,70000)));

        }
        for(Employee ele : list){
            System.out.println(ele);
        }

    }
}
