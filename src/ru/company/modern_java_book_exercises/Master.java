package ru.company.modern_java_book_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Master {
    public static void main(String[] args) {
        List<Integer>nums = List.of(1, 2, 3, 4, 5);
        nums.stream()
                .map(n -> Math.pow(n, 2))
                .collect(toList())
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> result = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        result.forEach(r -> Arrays.stream(r).forEach(System.out::println));

        Stream.iterate(new int[]{0, 1}, n -> new int[] {n[1], (n[0] + n[1])})
                        .limit(20)
                        .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

    }
}
