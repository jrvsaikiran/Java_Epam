package M1_oops.pizaorder;

public class OrderPiza implements Piza{
    @Override
    public  void base() {
        System.out.println("Pizza base is selected");
    }


    @Override
    public  void topping(String s1) {
        base();
        System.out.println("Cost of pizza with " +s1+ " topping is :- 10.2$ ");

    }
}
