package interviewprep;

import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");

        // Handle exceptions using Java 8 stream and lambda expression
        strings.stream()
               .map(s -> {
                   try {
                       return Integer.parseInt(s);
                   } catch (NumberFormatException e) {
                       System.err.println("NumberFormatException occurred for input: " + s);
                       return null; // or any other default value
                   }
               })
               .filter(number -> number != null) // Remove null values
               .forEach(System.out::println);
    }
}

