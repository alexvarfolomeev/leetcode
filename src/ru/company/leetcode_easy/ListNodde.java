package ru.company.leetcode_easy;

public class ListNodde {
    int val;
    ListNodde next;

    ListNodde() {
    }

    ListNodde(int val) {
        this.val = val;
    }

    ListNodde(int val, ListNodde next) {
        this.val = val;
        this.next = next;
    }

    public static ListNodde mergeTwoLists(ListNodde listNodde1, ListNodde listNodde2){
        if(listNodde1 == null) return listNodde2;
        if(listNodde2 == null) return listNodde1;
        if (listNodde1.val < listNodde2.val) {
            listNodde1.next = mergeTwoLists(listNodde1.next, listNodde2);
            return listNodde1;
        } else {
            listNodde2.next = mergeTwoLists(listNodde1, listNodde2.next);
            return listNodde2;
        }
    }

    public static int removeElement(int[] nums, int val) {
            int next = 0;
            for(int i = 0;i < nums.length;i++){
                if(nums[i] != val){
                    nums[next] = nums[i];
                    next++;
                }
            }
            return next;
    }

    public static void main(String[] args) {
        ListNodde listNodde1 =
                new ListNodde(1, new ListNodde(2, new ListNodde(4)));
        ListNodde listNodde2 =
                new ListNodde(1, new ListNodde(3, new ListNodde(4)));
        var n = mergeTwoLists(listNodde1, listNodde2);
        System.out.println(n.val);
        System.out.println(n.next.val);
        System.out.println(n.next.next.val);
        System.out.println(n.next.next.next.val);
        System.out.println(n.next.next.next.next.val);

        int[]arr = new int[]{3, 2, 2, 3};
        int[]arr1 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(arr1, 2);

    }
}
