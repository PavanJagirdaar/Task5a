package task5a;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConverter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aBC", "d", "ef");

        // Using map() to convert each string to uppercase
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original list: " + names);
        System.out.println("Uppercase list: " + uppercaseNames);
    }
}

