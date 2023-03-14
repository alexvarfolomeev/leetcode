package ru.company.leetcode_medium;

import java.util.*;

public class TopKFrequentWords {

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        System.out.println(new TopKFrequentWords().topKFrequent(words, 2));
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        TreeSet<Map.Entry<String, Integer>> treeSet = new TreeSet<>(
                (e1, e2) -> {
                    if(e1.getValue() != e2.getValue()){
                        return e2.getValue() - e1.getValue();
                    } else {
                        return e1.getKey().compareToIgnoreCase(e2.getKey());
                    }
                }
        );
        treeSet.addAll(map.entrySet());
        List<String> result = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>>iterator = treeSet.iterator();
        while (iterator.hasNext() && k-- > 0) {
            result.add(iterator.next().getKey());
        }

        return result;
    }

    //Задача недоделана
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;
        int[]result = new int[k];
        TreeMap<Integer, Integer>map = new TreeMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(map.get(i), 0) + 1);
        }
        SortedSet<Integer>sortedSet = new TreeSet<>(map.values());
        return nums;
    }
}
