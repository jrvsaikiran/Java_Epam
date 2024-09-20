package M3_collections.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Player[] play = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            play[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();
        Arrays.sort(play, checker);
        for(int i = 0; i < play.length; i++){
            System.out.printf("%s %s\n", play[i].name, play[i].scores);
        }
        String string = Arrays.toString(play);
        System.out.println("Arrays to string "+string);


    }
}
