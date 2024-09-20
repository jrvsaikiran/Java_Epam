package M3_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task2 {
    public static void main() throws Exception {
        Logger logger = Logger.getLogger("M3_collections");
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> a = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            logger.info("Enter the string: s");
            String s = sc.nextLine();
            a.add(i, new ArrayList<>(Arrays.asList(s.split("\\s"))));
        }
        logger.info(STR."array: \{a}");
        logger.info("Enter the  m for iterations");
        int m = 0;
        try {
            m = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Error----> Entered m is not an integer :- "+e.getLocalizedMessage());
        }
        for (int i = 0; i < m; i++) {
            logger.info(STR."Enter list index <=\{a.size()}");
            int x = sc.nextInt();
            logger.info("Enter element index: y");
            int y = sc.nextInt();
            try {
                if (x <= a.size() && y < a.get(x - 1).size() && y >= 0) {
                    logger.info(a.get(x - 1).get(y));
                } else {
                    logger.info("ERROR!" + a.get(x - 1).get(y));
                }
            } catch (IndexOutOfBoundsException e) {
                throw new IndexOutOfBoundsException("ERROR! --> " + e.getLocalizedMessage());
            } catch (Exception e) {
                throw new Exception("Error---> " + e.getLocalizedMessage());
            }

        }
    }
}
