import java.util.Arrays;
import java.util.List;

public class P4 {
	
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(5, 12, 8, 25, 3, 17, 10);

        // Use the Stream API to find the maximum value
        int maxValue = numbers.stream().max(Integer::compare).get();

        
       
            System.out.println(maxValue);
        }
    }
