package M2_corejava.hometask;

public class Task6 {
     static int Daniel;
     static int Amber;

      Task6(int i, int j) {
        Daniel = i;
        Amber = j;
    }
    public static void main(String[] args) {
        new Task6(10, 30);
        int total = Daniel + Amber;
        System.out.println("Total apples with Daniel and Amber :- "+total);

    }
}
