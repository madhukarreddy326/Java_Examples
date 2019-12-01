import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Java8DateTime
 */
public class Java8DateTime {

    public static void main(String args[])
    {
        System.out.println("LocalDate is :"+LocalDate.now());
        System.out.println("LocalTime is: "+LocalTime.now());
        System.out.println("LocalDateTime is: "+LocalDateTime.now());
    }
}