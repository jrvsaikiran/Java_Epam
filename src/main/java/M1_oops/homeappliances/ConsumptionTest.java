package M1_oops.homeappliances;

import java.util.Scanner;

public class ConsumptionTest  {


    public static void main(String[] arg) {
        int i,sum=0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Switch on by entering(fan,tv,light)");
            String app = in.next();
            Usages us = new Usages();
             i = us.applianceName(app);
             sum=sum+i;
        }
        while (i>0);
        System.out.println("The sum of powere consumption is :- "+sum+"$");


    }

}
