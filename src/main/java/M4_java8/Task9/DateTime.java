package M4_java8.Task9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTime {
    public static void main(String[] args) {

//1. Write a predicate to check if the given date is yesterday date.
        Date date1 = new Date();
        System.out.println(date1);  //today date
        Date date = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24));
        System.out.println(date);   //yesterday date
        LocalDate expectedLocalDate = LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());

        LocalDate actualLocalDate = LocalDate.now().minusDays(1);
        boolean isEqualToYesterday = expectedLocalDate.equals(actualLocalDate);
      System.out.println("Expected: " + expectedLocalDate);
      System.out.println("Actual: " + actualLocalDate);
      System.out.println("isEqualToYesterday: " + isEqualToYesterday);

        Predicate<LocalDate> p = g-> {
            if (g.equals(actualLocalDate)){
                return true;
            }
            return false;
        };
        boolean test = p.test(expectedLocalDate);
        System.out.println("Test: " + test);


//        2. Write a Supplier to get Date for next Thursday.
        System.out.println("Write a Supplier to get Date for next Thursday. ");

//        LocalDate today = LocalDate.now();
//        LocalDate nextThursday = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
//        System.out.println(today+"  "+nextThursday);

        Supplier<LocalDate> supplier = () -> {
            LocalDate today = LocalDate.now();
            LocalDate nextThursday = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
            return nextThursday;
        };
        LocalDate theNextThursday = supplier.get();
        System.out.println(theNextThursday);


//        3. Write a Supplier to get CurrentTime in EST timezone
        Supplier<String> sup =()->{
            ZoneId estZone = ZoneId.of("America/New_York");    //est time zone
            ZonedDateTime now = ZonedDateTime.now(estZone);     //current time in est
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String format = formatter.format(now);
            return format;
        };
        System.out.println("Supplier to get CurrentTime in EST timezone: "+sup.get());

//        4. Write a Function to calculate the age of a person given date of birth.
        System.out.println("4. Write a Function to calculate the age of a person given date of birth.");
        String birth = "1995-11-03";

        Function<String,Period> f = dob->{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthdate = LocalDate.parse(dob, formatter);
            LocalDate now = LocalDate.now();
            Period age = Period.between(birthdate, now);
            return age;
        };
        Period apply = f.apply(birth);
        System.out.println(apply.getYears()+" years "+apply.getMonths()+" months "+apply.getDays()+" days old");


    }
}
