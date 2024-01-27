import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P2 {
	
	/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
	
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(123, 45, 189, 102, 176, 15, 198, 1001);

        // Use the Stream API to filter numbers starting with 1
        List<Integer> numbersStartingWithOne = numbers.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original list: " + numbers);
        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
    }
}
