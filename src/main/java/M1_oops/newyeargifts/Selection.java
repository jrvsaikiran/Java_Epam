package M1_oops.newyeargifts;

import lombok.Data;

@Data
public class Selection implements gifts, Weight {
        int weight1 = 200;
        int weight2 = 250;
        int weight3 = 300;

    @Override
    public int weightOfChildrenGifts( String gift) {
        if (gift.equalsIgnoreCase("gift1")){
            return weight1;
        } else if (gift.equalsIgnoreCase("gift2")) {
            return weight2;
        }else if (gift.equalsIgnoreCase("gift3")) {
            return weight3;
        }else {
            System.out.println("Not a gift");
            return 0;
        }

    }

    @Override
    public void candies(String gift) {
        if (gift.equalsIgnoreCase("gift1")){
            System.out.println("Caramel candy is in gift");
        } else if (gift.equalsIgnoreCase("gift2")) {
            System.out.println("Blop candy is in gift");
        }else if (gift.equalsIgnoreCase("gift3")) {
            System.out.println("Gummies candy is in gift");
        }else {
            System.out.println("Not a gift");

        }
    }


    @Override
    public void sweets(String gift) {
        switch(gift){
            case "gift1":
                System.out.println("Halwa sweet is in gift");
                break;
            case "gift2" :
                System.out.println("Kaju sweet is in gift");
                break;
            case "gift3":
                System.out.println("Laddu sweet is in gift");
                break;
            default:
                System.out.println("Not a gift");
                    break;
        }

    }

    @Override
    public void chocklets(String gift) {
        switch(gift){
            case "gift1":
                System.out.println("5 Star chocklets is in gift");
                break;
            case "gift2" :
                System.out.println("Dairy Milk chocklets is in gift");
                break;
            case "gift3":
                System.out.println("KitKat chocklets is in gift");
                break;
            default:
                System.out.println("Not a gift");
                break;

        }


    }
}


