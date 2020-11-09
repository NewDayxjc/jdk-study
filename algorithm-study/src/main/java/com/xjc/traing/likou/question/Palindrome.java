package com.xjc.traing.likou.question;

import com.xjc.traing.likou.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/10/29 17:28
 * @name Palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        // 1-->2-->2-->1
        ListNode l2 = new ListNode(1);
        l2.add(new ListNode(1));
        l2.add(new ListNode(2));
        l2.add(new ListNode(2));
        System.out.println(isPalindrome(l2));
    }

    public static boolean isPalindrome(ListNode node) {
        List<Integer> list = new ArrayList<>();

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int first = 0;
        int last = list.size() - 1;
        while (first < last) {
            if (!list.get(first).equals(list.get(last))) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
