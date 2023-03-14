package ru.company.leetcode_easy;

public class Main {

    public static void main(String[] args) {
        //Palindrome palindrome = new Palindrome();
        //System.out.println(palindrome.isPalindromeLine("Молебен о коне белом"));
        //System.out.println(palindrome.isPalindromeLine("Молебен о коне сером"));
//        String par = "(){}(){}()";
//
//        System.out.println(Valid.isValid(par));
//
//        System.out.println(Sqrt.getSqrt(10));
//
//        int [] array = {9, 8, 7, 6, 5,4,3,2,1,0};
//        int [] array2 = {8};

//        System.out.println(Arrays.toString(PlusOne.plusOne(array)));
//
//        System.out.println(987654321L * 10);
//
//        System.out.println(new DuplicatesInArray().removeDuplicates(new int[]{1,1,2}));

        TreeNode treeNode =
                new TreeNode(3,
                        new TreeNode(9, null, null),
                        new TreeNode(20,
                                new TreeNode(15, null, null),
                                        new TreeNode(7, null, null)));

        TreeNode treeNode1 =
                new TreeNode(2, null,
                        new TreeNode(3, null,
                                new TreeNode(4, null,
                                        new TreeNode(5, null,
                                                new TreeNode(6)))));


        //System.out.println(new MinDepth().minDepth1(treeNode1));

        System.out.println(new MinDepth().minLeftDepth(treeNode));
        System.out.println(new MinDepth().minLeftDepth(treeNode1));


        //System.out.println(new Test1().returnDuplicates("happy"));

        String s1 = "oracle";
        String s2 = new String("oracle");
        String s3 = s1;

        s3 = null;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        System.out.println(Baseball.calPoints(new String[]{"5", "2", "C", "D", "+"}));

        System.out.println(new Main().solution("8459761203", "5439"));

    }

    public static class Palindrome {
        public boolean isPalindromeLine(String str) {
            str = str.toLowerCase();
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < sb.length() ;i++){
                if(Character.isWhitespace(sb.charAt(i))){
                    sb.deleteCharAt(i);
                }
            }
            StringBuilder sb2 = new StringBuilder(sb);
            //sb2.reverse().toString();
            return sb.toString().equals(sb2.reverse().toString());
        }
    }

    public int solution(String digits, String num) {
        int result = 0;
        char[] chars = digits.toCharArray();
        char[] nums = num.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            char current_number = nums[i];
        }
        return nums.length;
    }

}
