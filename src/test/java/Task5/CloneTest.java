package Task5;

import lombok.Data;
import org.testng.annotations.Test;

@Data
public class CloneTest implements Cloneable{
    int x;
    int y;
    public CloneTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Test
    public static void DeepClone() {
        CloneTest clone1 = new CloneTest(100, 10);
        System.out.println("clone1 "+clone1+clone1.hashCode());

        CloneTest clone2 = new CloneTest(10, 100);
        System.out.println("clone2 "+clone2+clone2.hashCode());
    }

    @Test
    public static void ShallowClone() {
        CloneTest clone1 = new CloneTest(100, 10);
        System.out.println("clone1 "+clone1);
        CloneTest clone2 = clone1;
        clone2.x=2;
        clone2.y=3;
        System.out.println("clone2 "+clone2+clone2.hashCode());
        System.out.println("clone1 "+clone1+clone1.hashCode());
    }

    @Test
    public static void ObjectClone() throws CloneNotSupportedException {
        CloneTest clone1 = new CloneTest(100, 10);
        System.out.println("clone1 "+clone1);
        CloneTest clone2 = (CloneTest) clone1.clone();
        clone2.x=3;
        clone2.y=4;
        System.out.println("clone2 "+clone2+clone2.hashCode());
        System.out.println("clone1 "+clone1+clone1.hashCode());
    }
}
