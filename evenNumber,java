import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
	 
	/*Given a list of integers, find out all the even numbers exist in the list using Stream functions?*/

	
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the Stream API to filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }

}
