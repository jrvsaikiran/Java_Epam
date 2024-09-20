package M7_DesignPatterns.Task1_Singelton;

import lombok.Data;

@Data
public class CandyMaker {

    private static volatile CandyMaker instance;
    private boolean empty;
    private boolean boiled;


    public CandyMaker() {
        empty = false;
        boiled = false;
    }

    public static CandyMaker getInstance(){
        if(instance == null){
            synchronized(CandyMaker.class){
                if(instance == null){
                    instance = new CandyMaker();

                }
            }
        }
        return instance;
    }



}
