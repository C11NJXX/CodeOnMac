package main.java.learn.theme.treedemo.demo3;

import main.java.learn.theme.treedemo.demo1.TreeNode;
//查找
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        BinarySearchTree tree = new BinarySearchTree();
        tree.buildTree(arr);
        TreeNode root = tree.getRoot();
        TreeNode resTreeNode = search(root, 7);
    }

    public static TreeNode search(TreeNode root, int num) {
        int count = 1;
        if (root != null) {
            while (true) {
                if (root.getValue() == num) {
                    System.out.println("find num " + root.getValue() + " in level " + count);
                    return root;
                } else if (root.getValue() < num) {
                    root = root.getRight();
                    count++;
                } else {
                    root = root.getLeft();
                    count++;
                }
            }
        } else {
            System.out.println("Root is null");
            return null;
        }
    }
}
