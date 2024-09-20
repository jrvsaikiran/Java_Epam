package M2_corejava.hometask;



public class Task8 {

    public static void main(String[] args) {

//        --> Generate the Pyramid with while loop
//        --> Generate the Pyramid with do.. while loop
//        --> Generate the Pyramid with for loop

        whileloop();
        forLoop();
        doWhileLoop();


    }

    private static void doWhileLoop() {
        System.out.println("doWhileLoop");
        int i = 1,j=1,k=0,row=5;
        do {
            while (j <= i) {
                System.out.print(3*k+" ");
                k++;
                j++;
            }
            j = 1;
            System.out.println();
            i++;
        } while(i<=row);

    }

    private static void forLoop(){
       System.out.println("forLoop");
        int rows = 5,k=0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*k+" ");
                k++;
            }
            System.out.println();
        }

    }
    private static void whileloop() {
        System.out.println("whileloop");
        int rows = 5, i = 1, j = 1,k=0;
        while (i <= rows) {
            while (j <= i) {
                System.out.print(1*k+" ");
                k++;
                j++;
            }
            j = 1;
            System.out.println();
            i++;
        }
    }
}
