package main.java.learn.theme.treedemo.demo2;

import com.sun.source.tree.Tree;
import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    static List<Integer> list3 = new ArrayList<>();

    public static void main(String[] args) {
        //创建二叉树
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(treeNode5);
        treeNode3.setLeft(treeNode6);
        treeNode3.setRight(treeNode7);
        //前序遍历法
        method1(treeNode1);
        System.out.println("前序遍历法");
        printList(list1);
        System.out.println("\n");
        //中序遍历法
        method2(treeNode1);
        System.out.println("中序遍历法");
        printList(list2);
        System.out.println("\n");
        //中序遍历法
        method3(treeNode1);
        System.out.println("后序遍历法");
        printList(list3);
        System.out.println("\n");

    }

    private static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + "->");
        }
        System.out.print("End");
    }

    private static void method1(TreeNode root) {
        if (root == null) {
            return;
        } else {
            list1.add(root.getValue());
            method1(root.getLeft());
            method1(root.getRight());
        }
    }

    private static void method2(TreeNode root) {
        if (root == null) {
            return;
        } else {
            method2(root.getLeft());
            list2.add(root.getValue());
            method2(root.getRight());
        }
    }
    private static void method3(TreeNode root) {
        if (root == null) {
            return;
        } else {
            method3(root.getLeft());
            method3(root.getRight());
            list3.add(root.getValue());
        }
    }
}
