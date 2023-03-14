package ru.company.leetcode_medium;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.Stack;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) throws IOException {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(arr));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit_2(arr));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\79639\\Desktop\\input.txt"));
        String line = bufferedReader.readLine();

        System.out.println(numSearch());
    }

    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

    public int maxProfit_2(int[] prices) {
        int low_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int current_sell = 0;
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < low_price){
                low_price = prices[i];
            }
            current_sell = prices[i] - low_price;
            if(max_profit < current_sell){
                max_profit = current_sell;
            }
        }
        return max_profit;
    }


    public static int numSearch() {
        int max = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\79639\\Desktop\\input.txt"))) {
            Stack<Integer>stack = new Stack<>();
            String line = br.readLine();
            while (line != null) {
                int current = Integer.parseInt(line);
                if(current == 1){
                    stack.push(current);
                    max = Math.max(max, stack.size());
                } else {
                    stack.removeAllElements();
                }
                line = br.readLine();
            }
            System.out.println(max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return max;
    }
}
