package main.java.learn.theme.treedemo.demo3;

import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        int[] values = {5, 3, 8, 2, 4, 7, 10, 1, 6, 9, 12, 15, 11, 13, 14};
        int[] arr1 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 11, 13, 15, 12, 14};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.buildTree(arr1);
//        List<Integer> list = binarySearchTree.inorderTraversal(binarySearchTree.getRoot());
//        for (int i : list) {
//            System.out.print(i + " ");
//        }

    }
}
