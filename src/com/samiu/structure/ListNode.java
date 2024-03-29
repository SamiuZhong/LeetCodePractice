package com.samiu.structure;

/**
 * @author Samiu 2020/7/1
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 创建测试数据
     *
     * @param data [XX,XX,XX]
     * @return {@link ListNode}
     */
    public static ListNode createTestData(String data) {
        if (data.equals("[]")) return null;
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = split.length;
        ListNode[] listNode = new ListNode[len + 1];
        listNode[0] = new ListNode(Integer.parseInt(split[0]));
        for (int i = 1; i < len; i++) {
            listNode[i] = new ListNode(Integer.parseInt(split[i]));
            listNode[i - 1].next = listNode[i];
        }
        return listNode[0];
    }

    public static void print(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        StringBuilder str = new StringBuilder("[" + listNode.val);
        ListNode p = listNode.next;
        while (p != null) {
            str.append(",").append(p.val);
            p = p.next;
        }
        System.out.println(str.append("]"));
    }
}
