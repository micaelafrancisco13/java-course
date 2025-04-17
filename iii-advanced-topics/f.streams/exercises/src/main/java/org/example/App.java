package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("Average: " + calculateAverage(List.of(1, 2, 3, 4, 5)));

        System.out.println("Convert to case " + convertToCase(List.of("a", "b", "c"), "upper case"));
        System.out.println("Convert to case " + convertToCase(List.of("a", "b", "c"), "lower case"));
        System.out.println("Convert to case " + convertToCase(List.of("a", "B", "c"), "normal case"));

        System.out.println("Sum of even and odd numbers " + sumOfEvenAndOddNumbers(List.of(3, 6, 9, 12, 15)));

        System.out.println("Remove duplicates " + removeDuplicates(List.of(2, 2, 3, 4, 5)));
        System.out.println("Remove duplicates " + removeDuplicates(List.of("a", "b", "c", "b")));

        System.out.println("Count list size " + countListSize(List.of("Avocado", "Apricot", "Strawberry", "Pineapple", "Blueberry"), 'A'));
        System.out.println("Count list size " + countListSize(List.of("Avocado", "Apricot", "Strawberry", "Pineapple", "Blueberry"), 'Q'));

        System.out.println("Sorted list " + sort(List.of("Mango", "Apple", "Banana", "Avocado", "Peach"), "descending"));
        System.out.println("Sorted list " + sort(List.of("Mango", "Apple", "Banana", "Avocado", "Peach"), "ascending"));

        System.out.println("Calculate the max and min " + calculateMaxAndMin(List.of(10, 20, 5, 12, 35, 7, 50, 3)));

        System.out.println("Calculate the second max and second min " + calculateSecondMaxAndSecondMin(List.of(1, 17, 54, 14, 14, 33, 45, -11)));
    }

    private static double calculateAverage(List<Integer> numbers) {
        // Write a Java program to calculate the average of a list of integers using streams.
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    private static List<String> convertToCase(List<String> strings, String form) {
        // Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        return strings.stream()
                .map(form.contains("upper") ? String::toUpperCase : form.contains("lower") ? String::toLowerCase : s -> s)
                .collect(Collectors.toList());
    }

    private static HashMap<String, Integer> sumOfEvenAndOddNumbers(List<Integer> numbers) {
        // Write a Java program to calculate the sum of all even and odd numbers in a list using streams.
        var resultOfEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(0, Integer::sum);
        var resultOfOdd = numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum);

        var result = new HashMap<String, Integer>();
        result.put("even", resultOfEven);
        result.put("odd", resultOfOdd);

        return result;
    }

    private static <T> List<T> removeDuplicates(List<T> list) {
        // Write a Java program to remove all duplicate elements from a list using streams.
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static int countListSize(List<String> strings, Character letter) {
        // Write a Java program to count the number of strings in a list that starts with a specific letter using streams.
        return Math.toIntExact(strings.stream()
                .filter(s -> s.charAt(0) == letter)
                .count());
    }

    private static List<String> sort(List<String> strings, String order) {
        // Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        return strings.stream()
                .sorted(order.contains("asc") ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private static HashMap<String, Integer> calculateMaxAndMin(List<Integer> numbers) {
        // Write a Java program to find the maximum and minimum values in a list of integers using streams.
        var resultOfMax = numbers.stream()
                .max(Comparator.comparing(Integer::intValue))
                .orElse(0);
        var resultOfMin = numbers.stream()
                .min(Comparator.comparing(Integer::intValue))
                .orElse(0);

        var result = new HashMap<String, Integer>();
        result.put("max", resultOfMax);
        result.put("min", resultOfMin);

        return result;
    }

    private static HashMap<String, Integer> calculateSecondMaxAndSecondMin(List<Integer> numbers) {
        // Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        var resultOfSecondMin = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        var resultOfSecondMax = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        var result = new HashMap<String, Integer>();
        result.put("secondMax", resultOfSecondMax);
        result.put("secondMin", resultOfSecondMin);

        return result;
    }
}
