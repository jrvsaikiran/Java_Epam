package M3_collections.task3;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class ComparableTask  implements Comparable<ComparableTask> {
    String name;
    int id;
    public ComparableTask(String name, int id) {
        this.name = name;
        this.id = id;

    }

    @Override
    public int compareTo(ComparableTask o) {
        if (this.id > o.id)
            return 1;
        else if (this.id < o.id)
            return -1;
        else
            return 0;

    }

    public static void main(String[] args) {

        List<ComparableTask> list = new ArrayList<ComparableTask>();
        list.add(new ComparableTask("A", 1));
        list.add(new ComparableTask("B", 33));
        list.add(new ComparableTask("C", 3));
        list.add(new ComparableTask("D", 23));
        list.add(new ComparableTask("E", 331));
        list.add(new ComparableTask("F", 2112));
        list.add(new ComparableTask("G", 1));


        for (ComparableTask task : list) {
            System.out.println(task.id);
        }

        System.out.println("-------------");
        Collections.sort(list);
        for (ComparableTask task : list) {
            System.out.println(task.id);
        }



    }


}
