package main.java.learn.theme.treedemo.demo3;

import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private TreeNode root;
    List<Integer> list = new ArrayList<>();

    public BinarySearchTree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    private TreeNode insertNode(TreeNode root, int value) {
        //如果二叉树没有生成，传入的第一个值作为根值
        if (root == null) {
            return new TreeNode(value);
        }
        if (root.getValue() < value) {
            //如果传入的值大于根值，需要进入右节点,递归插入
            root.setRight(insertNode(root.getRight(), value));
        } else if (root.getValue() > value) {
            //同理，递归插入左节点
            root.setLeft(insertNode(root.getLeft(), value));
        }
        return root;
    }

    public void buildTree(int[] nums) {
        for (int val : nums) {
            root = insertNode(root, val);
        }
    }

    //中序遍历法
    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return null;
        } else {
            inorderTraversal(root.getLeft());
            list.add(root.getValue());
            inorderTraversal(root.getRight());
        }
        return list;
    }

    //一键构造
    public static TreeNode getBuiltTree() {
        int[] arr = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        BinarySearchTree tree = new BinarySearchTree();
        tree.buildTree(arr);
        TreeNode root = tree.getRoot();
        return root;
    }

}
