package com.samiu.structure;

/**
 * @author Samiu 2020/7/7
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public boolean hasLeftChild() {
        return left != null;
    }

    public boolean hasRightChild() {
        return right != null;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    /**
     * 创建测试数据
     *
     * @param data [XX,XX,null,xx]
     * @return {@link TreeNode}
     */
    public static TreeNode createTestData(String data) {
        if (data.equals("[]")) return null;
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = len = split.length;
        TreeNode[] treeNodes = new TreeNode[len];
        data = data.substring(1, data.length() - 1);
        for (int i = 0; i < len; i++) {
            if (!split[i].equals("null")) {
                treeNodes[i] = new TreeNode(Integer.parseInt(split[i]));
            }
        }
        for (int i = 0; i < len; i++) {
            if (treeNodes[i] != null) {
                int leftIndex = i * 2 + 1;
                if (leftIndex < len) {
                    treeNodes[i].left = treeNodes[leftIndex];
                }
                int rightIndex = leftIndex + 1;
                if (rightIndex < len) {
                    treeNodes[i].right = treeNodes[rightIndex];
                }
            }
        }
        return treeNodes[0];
    }

    private static final String space = "      ";

    /**
     * 竖向打印二叉树
     *
     * @param root 二叉树根节点
     */
    public static void print(TreeNode root) {
        print(root, 0);
    }

    private static void print(TreeNode node, int deep) {
        if (node == null) {
            printSpace(deep);
            System.out.println("#");
            return;
        }
        print(node.right, deep + 1);
        printSpace(deep);
        printNode(node.val);
        print(node.left, deep + 1);
    }

    private static void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(space);
        }
    }

    private static void printNode(int val) {
//        StringBuilder res = new StringBuilder(val + "<");
//        int spaceNum = space.length() - res.length();
//        res.append(" ".repeat(Math.max(0, spaceNum)));
//        System.out.println(res);
    }
}
