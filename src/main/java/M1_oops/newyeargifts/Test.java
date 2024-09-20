package M1_oops.newyeargifts;

import java.util.Scanner;

public class Test extends Selection{

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the gift number like:(gift1,gift2,gift3) ");
        String gift = in.next();

        Selection sc = new Selection();
        sc.chocklets(gift);
        sc.sweets(gift);
        sc.candies(gift);
        int i = sc.weightOfChildrenGifts(gift);
        System.out.println("The weight of children gift is " + i+" grams");

    }
}
