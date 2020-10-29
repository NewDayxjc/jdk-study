package com.xjc.traing.likou;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/10/20 11:12
 * @name ListNode
 * 234:回文链表
 * 请判断一个链表是否为回文链表。
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void add(ListNode listNode) {
        listNode.next = this.next;
        this.next = listNode;
    }


}
