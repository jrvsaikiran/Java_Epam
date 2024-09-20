package M1_oops.pizaorder;

import java.util.Scanner;

public class PizaTest {

    public static void main(String[] args) {
        OrderPiza pz = new OrderPiza();
        Scanner top = new Scanner(System.in);
        System.out.println("Enter the piza: toppings");
        String next = top.next();
        pz.topping(next);
    }
}
