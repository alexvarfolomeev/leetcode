package ru.company.yandex_contest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecuredStack {

    static final String input = "C:\\Users\\79639\\IdeaProjects\\leet_code\\src\\ru\\company\\leetcode_easy\\input.txt";
    //static final String output = "output.txt";
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        SecuredStack stack = new SecuredStack();
        br = new BufferedReader(new FileReader(input));
        String command = br.readLine();
//        switch (command)
    }

    Integer[] elements;
    int initialCapacity = 10;
    static int elementsCount = 0;

    public SecuredStack() {
        elements = new Integer[initialCapacity];
    }

    public String push(int element){
        if(elementsCount > 0) {
            Integer[]updatedElements;
            if (elements.length == elementsCount){
                updatedElements = new Integer[elementsCount + 1];
                System.arraycopy(elements, 0, updatedElements, 0, elementsCount);
                updatedElements[elementsCount] = element;
                elements = updatedElements;
            } else {
                elements[elementsCount] = element;
            }
        } else {
            elements[elementsCount] = element;
        }
        elementsCount++;
        return "ok";
    }

    public String pop(){
        int lastElement = elements[elementsCount - 1];
        elements[elementsCount - 1] = null;
        elementsCount--;
        return String.valueOf(lastElement);
    }

    public String size(){
        return String.valueOf(elementsCount);
    }

    public String back(){
        return String.valueOf(elements[elementsCount - 1]);
    }

    public String clear(){
        for(int i = elementsCount - 1; i >= 0; i--){
            elements[i] = null;
        }
        elementsCount = 0;
        return "ok";
    }

    public String exit(){
        return "bye";
    }
}
