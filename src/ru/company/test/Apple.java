package ru.company.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static ru.company.test.AppleColor.GREEN;

public class Apple {
    private int weight;
    private AppleColor appleColor;

    public Apple(int weight, AppleColor appleColor) {
        this.weight = weight;
        this.appleColor = appleColor;
    }

    public Apple() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public AppleColor getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(AppleColor appleColor) {
        this.appleColor = appleColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && appleColor == apple.appleColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, appleColor);
    }

    public static boolean isGreenApple(Apple apple) {
        return GREEN.equals(apple.getAppleColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static void prettyPrintApple(List<Apple>apples, ApplePattern applePattern) {
        for (Apple a : apples) {
            String output = applePattern.apply(a);
            System.out.println(output);
        }
    }

    public static List<Apple> filterApples(List<Apple>list, Predicate<Apple> predicate) {
        List<Apple>result = new ArrayList<>();
        for (Apple apple : list) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public class AppleFancyFormatter implements ApplePattern {
        @Override
        public String apply(Apple apple) {
            String appleWeight = apple.weight > 150 ? "heavy" : "light";
            return "A " + appleWeight + " " + apple.getAppleColor() + " apple";
        }
    }

    public class AppleSimpleFormatter implements ApplePattern {
        @Override
        public String apply(Apple apple) {
            return "An apple of " + apple.getWeight() + " g";
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", appleColor=" + appleColor +
                '}';
    }
}
