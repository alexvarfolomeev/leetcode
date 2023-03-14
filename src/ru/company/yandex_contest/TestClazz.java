package ru.company.yandex_contest;

public class TestClazz {

    public static void main(String[] args) {
        SecuredStack stack = new SecuredStack();
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.back());

        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        System.out.println(stack.push(5));
        System.out.println(stack.push(6));
        System.out.println(stack.push(7));
        System.out.println(stack.push(8));
        System.out.println(stack.push(9));
        System.out.println(stack.push(10));
        System.out.println(stack.push(11));

        System.out.println(stack.size());

        System.out.println(stack.push(12));
        System.out.println(stack.push(13));
        System.out.println(stack.push(14));

        System.out.println(stack.back());

        System.out.println(stack.clear());
        System.out.println(stack.size());

    }
}
