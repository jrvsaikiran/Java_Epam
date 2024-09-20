package M1_oops.bouquet;

public class Bouquet implements Flowers{


//(lily,jasmine,rose):
    public  int selectFlower(String flowerName) {
        String[] split = flowerName.split(" ");
        String s = split[0];
        int i = Integer.parseInt(s);
        String lily ="lily";
        String jasmine = "jasmine";
        String rose = "rose";
        if (lily.equals(split[1])) {
            return 1*i;
        } else if (jasmine.equals(split[1])) {
            return 2*i;
        } else if (rose.equals(split[1])) {
            return 3*i;
        } else {
           System.out.println(flowerName + " is not a bouquet");
            return 0;
        }

    }
}
