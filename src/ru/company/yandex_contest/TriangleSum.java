package ru.company.yandex_contest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TriangleSum {

    static final String input = "C:\\Users\\79639\\IdeaProjects\\leet_code\\src\\ru\\company\\leetcode_easy\\input.txt";
    static BufferedReader br;

    /*
     В первой строке находится числа N, M размеры матрицы (1 ≤ N, M ≤ 1000) и K — количество запросов (1 ≤ K ≤ 100000).
     Каждая из следующих N строк содержит по M чисел`— элементы соответствующей строки матрицы (по модулю не превосходят 1000).
     Последующие K строк содержат по 4 целых числа,
     разделенных пробелом x1 y1 x2 y2 — запрос на сумму элементов матрице в прямоугольнике (1 ≤ x1 ≤ x2 ≤ N, 1 ≤ y1 ≤ y2 ≤ M)
     */

    /*
    3 3 2                   28
    1 2 3                   21
    4 5 6
    7 8 9
    2 2 3 3
    1 1 2 3
    */

    public static void main(String[] args) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(input));

    }
}
