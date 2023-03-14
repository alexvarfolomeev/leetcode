package ru.company.leetcode_easy;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        String c = "1010";
        var bbb = new StringBuilder();
        System.out.println(bbb.append(c).reverse());
        String d = "1011";
        int sb = 0;
        sb += a.charAt(1) - '0';
        System.out.println(sb);
        System.out.println(c.substring(c.length() - 1));
        System.out.println(d.substring(d.length() - 1));
        //System.out.println(new AddBinary().addBinary(c, d));
        System.out.println(new AddBinary().addBinary(a, b));
    }
    public String addBinary(String a, String b) {
        var builder = new StringBuilder();
        int j = a.length() - 1;
        int k = b.length() - 1;
        int carry = 0;
        while(j >= 0 || k >= 0){
            int sum = carry;
            if (j >= 0) sum += a.charAt(j) - '0';
            if (k >= 0) sum += b.charAt(k) - '0';
            builder.append(sum % 2);
            carry = sum / 2;

            k--;
            j--;
        }
        if (carry != 0) builder.append(carry);
        return builder.reverse().toString();
    }
}
