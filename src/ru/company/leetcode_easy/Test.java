package ru.company.leetcode_easy;

import java.util.*;

public class Test    implements Runnable {
    @Override
    public void run() {
        System.out.printf("TURING ");
    }

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add((int)3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));
        System.out.println(set);
        List<String> list1 = new ArrayList<>();
        list1.add("foo");

        List<String> list2 = list1;
        List<String> list3 = new ArrayList<>(list2);

        list1.clear();
        list2.add("bar");
        list3.add("baz");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        Integer myArray[] = {2, 3, 1};
        List<Integer> list = Arrays.asList(myArray);
        list.stream().forEach(Integer::byteValue);
        list.sort(new Sorting());
        System.out.println(list);



    }


    static class Sorting implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
