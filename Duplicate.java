import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P3 {
	
	/*How to find duplicate elements in a given integers list in java using Stream functions?*/
	
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 1, 10);

        // Use the Stream API to filter the Duplicate numbers
        
        Set<Integer> Duplicate = numbers.stream().filter(e->Collections.frequency(numbers, e)>1).collect(Collectors.toSet());
        

        // Print the result
        System.out.println("Original list: " + numbers);
        System.out.println("Numbers starting with 1: " + Duplicate);
    }
}
