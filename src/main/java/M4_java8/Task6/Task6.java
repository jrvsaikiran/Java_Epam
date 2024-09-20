package M4_java8.Task6;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class Task6 {
    public static void main(String[] args) {

//       1 . Write an IntPredicate to verify if the given number is a primenumber

        IntPredicate pr = (num)->{
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println("Given number is Prime number "+pr.test(12));


//        2. Write an IntConsumer to print square of the given number
        IntConsumer consumer = (num)->{
            int i = num * num;
            System.out.println("IntConsumer to print square of the given number "+i);
        };
        consumer.accept(3);
        
//        3. Write a IntSupplier to give random int below 5000. 
        IntSupplier supplier = ()->{
            int v = (int) (Math.random() * 90);
            return  v;
        };
        System.out.println("IntSupplier to give random int below 5000.  "+supplier.getAsInt());











    }
}