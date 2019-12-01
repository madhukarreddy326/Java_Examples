import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * JavaStreams_Example
 */
public class JavaStreams_Example {

    public static void main(String args[])
    {
        List<Integer> number = Arrays.asList(1,4,5,2,8,7,9);
        List<Integer>square = number.stream().map(m->m*m).collect(Collectors.toList());
        System.out.println(square);
        List<String>names = Arrays.asList("madhukar","sample","java","world","mamatha");
        List<String>filerString = names.stream().filter(s->s.startsWith("m")).collect(Collectors.toList());
        System.out.println(filerString);
        List<String>sortedString = names.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedString is ::"+sortedString);
        List<Integer> numbers = Arrays.asList(1,2,3,4,2);
        Set<Integer> resSet = numbers.stream().map(m->m*m).collect(Collectors.toSet());
        System.out.println(resSet);
       // System.out.println(numbers);
       numbers.stream().forEach(y->System.out.println(y));

        
    }
}