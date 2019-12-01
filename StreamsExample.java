import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamsExample
 */
public class StreamsExample {

    public static void main(String args[])
    {
        List<String> items=new ArrayList<>();
        items.add("abc");
        items.add("Madhukar");
        items.add("Mamatha");
        items.add("sudha");
        items.add("vanaja");
        items.add("suseelamma");
        items.add("venkatramana");

        System.out.println(items);
        //Object collectors;
		List<String> modifiedList = items.stream().filter(e ->!e.toLowerCase().startsWith("m")).collect(Collectors.toList());
        System.out.println("modified List is::"+modifiedList);
    }
}