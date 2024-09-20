package M2_corejava.hometask;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ::");
        String name = sc.next();
        System.out.println("Hello! "+name);
        arthamaticOperations();
    }


    public static void arthamaticOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int a = sc.nextInt();

        System.out.println("Enter value of 2nd number ::");
        int b = sc.nextInt();

        System.out.println("Select operation");
        System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: Percentage-p: Remainder-r");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a' :
                System.out.println("Sum of the given two numbers: "+(a+b));
                break;
            case 's' :
                System.out.println("Difference between the two numbers: "+(a-b));
                break;
            case 'm' :
                System.out.println("Product of the two numbers: "+(a*b));
            case 'd' :
                System.out.println("Result of the division: "+(a/b));
                break;
            case 'p':
                System.out.println("Percentage of the two numbers: "+(a%b));
                break;
            case 'r':
                System.out.println("Remainder of the two numbers: "+(a/b));
                break;
            default :
                System.out.println("Invalid grade");
                break;
        }
    }

}
