package M7_DesignPatterns.Task5_BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder(setterPrefix = "set")
@AllArgsConstructor
public class BuildPatern {
    String gears;
    String doubleStands;
    String doubleSeats;
    String carrier;

}
