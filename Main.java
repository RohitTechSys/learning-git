import java.util.*;
import java.util.stream.Collectors;

public class Main{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Set<Integer> set = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(set);





    }

}
