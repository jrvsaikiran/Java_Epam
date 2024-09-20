package M3_collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main() throws IOException {


        System.out.println("Enter the number of records: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        while (n > 0) {
            int phone = 0;
            System.out.println("Enter the name ");
            String name = sc.next();
            try {
                System.out.println("Enter the phone number ");
                phone = sc.nextInt();
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Invalid ---> phone number --->" + e.getLocalizedMessage());
            }
            map.put(name, phone);
            n--;

        }

        System.out.println("Enter the name of record to search");
        String s = sc.next();

        while (s != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }

        sc.close();
    }
}
