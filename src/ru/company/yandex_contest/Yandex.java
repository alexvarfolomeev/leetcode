package ru.company.yandex_contest;

import java.io.*;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class Yandex {
    static final String input = "C:\\Users\\79639\\IdeaProjects\\leet_code\\src\\ru\\company\\leetcode_easy\\input.txt";
    static final String output = "output.txt";
    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new FileReader(input));
        bw = new BufferedWriter(new FileWriter(output));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            stringBuilder.append(line);
        }
        String str = stringBuilder.toString();
        if (str.length() > 0) {
            SortedMap<Character, Integer> map = new TreeMap<>();
            var strings = str.split(" ");
            for (String s : strings) {
                char[] chars = s.toCharArray();
                for (char c : chars) {
                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) + 1);
                    }
                }
            }
            int max = map.values().stream().max(Comparator.naturalOrder()).get();
            for (int i = max; i > 0; i--) {
                for (int j : map.values()) {
                    if (j > i || j == i) {
                        //System.out.print("#");
                        bw.write("#");
                        bw.flush();
                    } else {
                        //System.out.print(" ");
                        bw.write(" ");
                    }
                }
                bw.write("\n");
            }
            for (char ch : map.keySet()) {
                bw.write(ch);
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
