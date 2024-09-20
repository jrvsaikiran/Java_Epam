package M3_collections.task3;

import java.util.Comparator;

public class Checker implements Comparator {
    public int compare(Object o1, Object o2) {

        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        if(p1.scores-p2.scores==0){
                return p1.name.compareTo(p2.name);
        }

        return p2.scores-p1.scores;
    }
}
