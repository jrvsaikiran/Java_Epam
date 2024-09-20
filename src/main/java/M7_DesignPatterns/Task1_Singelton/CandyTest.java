package M7_DesignPatterns.Task1_Singelton;

public class CandyTest {

//    static CandyMaker empty;

    public static void main(String[] args) {

//        empty = CandyMaker.getInstance();
//
//        System.out.println(empty);
        boolean fill = fill();
        System.out.println("fill--"+fill);

        Boolean drain = drain();
        System.out.println("drain--"+drain);

        Boolean boil = boil();
        System.out.println("boil--"+boil);


    }

    public static boolean fill() {
        boolean empty = false;
        boolean boiled = false;

        if (CandyMaker.getInstance().isEmpty()) {
             empty = false;
             boiled = false;
            // fill the candyMaker with milk and choclate mix
        }
        return empty && boiled;
    }

    public static Boolean drain() {
        boolean empty = false;
        if (!CandyMaker.getInstance().isEmpty() && CandyMaker.getInstance().isBoiled()) {
            // drain the boiled milk and chocolate
             empty = true;
        }
        return empty;
    }

    public static Boolean boil() {
        boolean boiled = false;
        if (!CandyMaker.getInstance().isEmpty() && !CandyMaker.getInstance().isBoiled()) {
            // bring the content to boil
             boiled = true;
        }
        return boiled;
    }


}
