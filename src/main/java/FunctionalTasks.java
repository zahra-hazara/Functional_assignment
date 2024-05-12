import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FunctionalTasks {

    public static void main(String[] args) {
        // Task 1: Calculate mean of an array
        int[] numbersArray = {10, 20, 30, 40, 50};
        OptionalDouble mean = calculateMean(numbersArray);
        mean.ifPresent(System.out::println); // Print the mean if present

        // Task 2: Filtering and Transforming a List of Numbers
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int resultSum = filterTransformAndSum(numbersList);
        System.out.println(resultSum);
    }

    public static OptionalDouble calculateMean(int[] numbers) {
        return Arrays.stream(numbers)
                .average(); // Calculates the average
    }

    public static int filterTransformAndSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)  // Filter out even numbers
                .mapToInt(n -> n * 2)     // Double each remaining number
                .sum();                   // Sum the transformed numbers
    }
}
