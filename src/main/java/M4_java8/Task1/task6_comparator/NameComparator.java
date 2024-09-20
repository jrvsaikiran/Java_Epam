package M4_java8.Task1.task6_comparator;


public class NameComparator implements java.util.Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Construtor c1 = (Construtor) o1;
        Construtor c2 = (Construtor) o2;
//        int nameCompare = c1.getName().compareTo(c2.getName());
//        int ageCompare = c1.getAge().compareTo(c2.getAge());
//
//        return (nameCompare == 0) ? ageCompare : nameCompare;
        return c1.getName().compareTo(c2.getName());
    }
}
