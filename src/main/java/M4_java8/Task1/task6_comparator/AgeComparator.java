package M4_java8.Task1.task6_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Construtor c1 = (Construtor) o1;
        Construtor c2 = (Construtor) o2;

        return c1.getAge()-c2.getAge();
    }


}
