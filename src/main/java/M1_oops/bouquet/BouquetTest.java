package M1_oops.bouquet;

import java.util.Scanner;

public class BouquetTest  {

    public static void main(String[] args) {
       Bouquet bouquet = new Bouquet();
        int i = 0,sum=0;
        String filename;
        String[] split;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter bouquet names like ( 1 lily or 3 jasmine or 2 rose): ");
             filename = sc.nextLine();
             split = filename.split(" ");
             if(split[1].equals("lily") ||split[1].equals("jasmine") ||split[1].equals("rose")){
                 i = bouquet.selectFlower(filename);
             }else {
                 break;
             }
           
            System.out.println("The bouquet names like " + filename + " cost: " + i + "$");
            sum=sum+i;
        }
        while (i>0); ;
        System.out.println("The sum of bouquets is " + sum + "$");

    }
}
