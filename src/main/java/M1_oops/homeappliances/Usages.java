package M1_oops.homeappliances;

import lombok.Data;

@Data
public class Usages implements MultipleAppliances{
    int fan = 1;
    int light = 2;
    int tv = 3;


    @Override
    public  int applianceName(String applianceName) {
        if(applianceName.equals("fan")){
            return getFan();
        }else if(applianceName.equals("light")){
            return getLight();
        }else if(applianceName.equals("tv")){
            return getTv();
        }else {
            System.out.println("You entered invalid appliance name:- " + applianceName);
            return 0;
        }

    }
}
