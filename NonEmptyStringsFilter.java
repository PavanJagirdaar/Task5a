package task5a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringsFilter {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Using filter() to get non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original list: " + listStrings);
        System.out.println("List with non-empty strings: " + nonEmptyStrings);
    }
}
