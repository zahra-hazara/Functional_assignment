import java.util.Arrays;
import java.util.List;

public class FunctionalTasks {

    public static void main(String[] args) {
        // Task 1: Calculate the mean of an array
        int[] numbers = {1, 2, 3, 4, 5};

        if (numbers.length == 0) {
            System.out.println("The array is empty. Cannot calculate mean.");
        } else {
            double mean = Arrays.stream(numbers) // Convert array to stream
                    .average()       // Calculate the average
                    .orElse(0);      // Handle empty array case
            System.out.println("Mean: " + mean);
        }

        // Task 2: Filtering and transforming a list of numbers
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = numbersList.stream()        // Convert list to stream
                .filter(n -> n % 2 != 0) // Filter out even numbers
                .mapToInt(n -> n * 2)    // Double each remaining number
                .sum();                  // Sum the resulting numbers

        System.out.println("Result: " + result);
    }
}