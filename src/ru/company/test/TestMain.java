package ru.company.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestMain {
    public static void main(String[] args) {
        List<Apple>apples = Arrays.asList(
                new Apple(120, AppleColor.GREEN),
                new Apple(160, AppleColor.YELLOW),
                new Apple(180, AppleColor.RED),
                new Apple(100, AppleColor.GREEN));

        Apple.filterApples(apples, Apple::isHeavyApple)
                .forEach(System.out::println);

        Apple apple = new Apple();
        Apple.AppleFancyFormatter appleFancyFormatter = apple.new AppleFancyFormatter();

        Apple.AppleSimpleFormatter appleSimpleFormatter = apple.new AppleSimpleFormatter();

        Apple.prettyPrintApple(apples, appleFancyFormatter);
        System.out.println();
        Apple.prettyPrintApple(apples, appleSimpleFormatter);
    }
}
