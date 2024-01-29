package task5a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftDistribution {
    public static void main(String[] args) {
        // Use List interface to store student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Anna", "Alex", "David", "Amanda", "Charlie", "Andrew", "Eva", "Amy");

        // Use lambda expression and Stream API to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original student names: " + studentNames);
        System.out.println("Students with names starting with 'A': " + studentsWithA);
    }
}
